/**
 * 
 */
package eu.mikrosimage.xdmat.ebucore.helpers;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

import ebu.metadata_schema.ebucore_2014.AudioProgrammeType;
import ebu.metadata_schema.ebucore_2014.ObjectFactory;

/**
 * @author gma
 *
 */
public final class AudioProgrammeTypeHelper {

	private AudioProgrammeTypeHelper() {}

	/**
	 * 
	 * @param programIndex
	 * @return program id
	 */
	public static final String getAudioProgrammeIdFromIndex(int programIndex) {
		return getPrefixedAudioIdFromIndex(AudioProgrammeType.PREFIX+'1', programIndex);
	}
	
	/**
	 * @param programIndex
	 * @return 0-padded index
	 */
	public static final String getAudioProgammePadding(int programIndex, int padding) {
		return Strings.padStart(String.valueOf(programIndex), padding, '0');
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
		Preconditions.checkNotNull(programIndex);
		Preconditions.checkArgument(programIndex>0);
		return prefix+getAudioProgammePadding(programIndex, padding);
	}
	
	/**
	 * 
	 * @param programId
	 * @return program index
	 */
	public static final int getAudioProgrammeIndexFromId(String programId) {
		return getIndexFromId(AudioProgrammeType.PREFIX, programId);
	}
	
	/**
	 * 
	 * @param programId
	 * @return program index
	 */
	public static final int getIndexFromId(String prefix, String programId) {
		Preconditions.checkNotNull(programId);
		Preconditions.checkArgument(programId.startsWith(prefix), "Id must start with " + prefix + " : " + programId);
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
	public static final AudioProgrammeType create(int programIndex, String audioProgramName, String language) {
		Preconditions.checkNotNull(programIndex);
		Preconditions.checkArgument(programIndex>0);
		Preconditions.checkNotNull(audioProgramName);
		Preconditions.checkNotNull(language);
		final ObjectFactory objectFactory = new ObjectFactory();
		final AudioProgrammeType audioProgramme = objectFactory.createAudioProgrammeType();
		
		audioProgramme.setAudioProgrammeID(getAudioProgrammeIdFromIndex(programIndex));
		audioProgramme.setAudioProgrammeName(audioProgramName);
		audioProgramme.setAudioProgrammeLanguage(language);
		
		return audioProgramme;
	}

}
