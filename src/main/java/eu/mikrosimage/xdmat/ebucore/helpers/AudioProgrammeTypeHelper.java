/**
 * 
 */
package eu.mikrosimage.xdmat.ebucore.helpers;

import java.util.Objects;

import ebu.metadata_schema.ebucore_2015.AudioProgramme;
import ebu.metadata_schema.ebucore_2015.ObjectFactory;

/**
 * @author gma
 *
 */
public final class AudioProgrammeTypeHelper {
	
	private static final String AUDIO_PROGRAMME_PREFIX = "APR";

	private AudioProgrammeTypeHelper() {}

	/**
	 * 
	 * @param programIndex
	 * @return program id
	 */
	public static final String getAudioProgrammeIdFromIndex(int programIndex) {
		return getPrefixedAudioIdFromIndex(AUDIO_PROGRAMME_PREFIX+'1', programIndex);
	}
	
	/**
	 * @param programIndex
	 * @return 0-padded index
	 */
	public static final String getAudioProgammePadding(int programIndex, int padding) {
		return IDHelper.createId(String.valueOf(programIndex), padding);
	}
	
	/**
	 * @param programIndex
	 * @return 0-padded index
	 */
	public static final String getAudioProgammePadding(int programIndex) {
		return getAudioProgammePadding(programIndex, 3);
	}

	/**
	 * @param prefix
	 * 	Prefix
	 * @param programIndex
	 *  Index
	 * @return 3-digits prefixed ID
	 */
	public static final String getPrefixedAudioIdFromIndex(String prefix, int programIndex) {
		return getPrefixedAudioIdFromIndex(prefix, programIndex, 3);
	}
	
	/**
	 * 
	 * @param prefix
	 * @param programIndex
	 * @return Normalized id
	 */
	public static final String getPrefixedAudioIdFromIndex(String prefix, int programIndex, int padding) {
		Objects.requireNonNull(programIndex);
		assert programIndex > 0: "programIndex ("+programIndex+") must be greater than 0";
		return prefix+getAudioProgammePadding(programIndex, padding);
	}
	
	/**
	 * 
	 * @param programId
	 * @return program index
	 */
	public static final int getAudioProgrammeIndexFromId(String programId) {
		return getIndexFromId(AUDIO_PROGRAMME_PREFIX, programId);
	}
	
	/**
	 * 
	 * @param programId
	 * @return program index
	 */
	public static final int getIndexFromId(String prefix, String programId) {
		Objects.requireNonNull(programId);
		assert programId.startsWith(prefix) : "programId ("+programId+") must start with "+prefix;
		
		String substring = programId.substring(prefix.length()+1);
		
		if(-1!=substring.indexOf("_")) {
			substring = substring.substring(0, substring.indexOf("_"));
		}
		
		return Integer.parseInt(substring);
	}
	
	/**
	 * @param programIndex
	 * 	Index
	 * @param audioProgramName
	 * 	Name
	 * @param language
	 * 	Language
	 * @return
	 * 	Audio program instance
	 */
	public static final AudioProgramme create(int programIndex, String audioProgramName, String language) {
		Objects.requireNonNull(programIndex);
		Objects.requireNonNull(audioProgramName);
		Objects.requireNonNull(language);
		final ObjectFactory objectFactory = new ObjectFactory();
		final AudioProgramme audioProgramme = objectFactory.createAudioProgramme();
		
		audioProgramme.setAudioProgrammeID(getAudioProgrammeIdFromIndex(programIndex));
		audioProgramme.setAudioProgrammeName(audioProgramName);
		audioProgramme.setAudioProgrammeLanguage(language);
		
		return audioProgramme;
	}

}
