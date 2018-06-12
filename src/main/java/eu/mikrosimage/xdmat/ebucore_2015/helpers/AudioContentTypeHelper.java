/**
 * 
 */
package eu.mikrosimage.xdmat.ebucore_2015.helpers;

import java.util.Objects;

import ebu.metadata_schema.ebucore_2015.AudioContent;
import ebu.metadata_schema.ebucore_2015.ObjectFactory;

/**
 * @author gma
 *
 */
public final class AudioContentTypeHelper {
	
	private static final String AUDIO_CONTENT_PREFIX = "ACO_";

	private AudioContentTypeHelper() {}

	/**
	 * 
	 * @param programId
	 * @return program index
	 */
	public static final int getAudioContentIndexFromId(String programId) {
		return AudioProgrammeTypeHelper.getIndexFromId(AUDIO_CONTENT_PREFIX+"1", programId);
	}

	/**
	 * 
	 * @param programIndex
	 * @return program id
	 */
	public static final String getAudioContentIdFromIndex(int programIndex) {
		return AudioProgrammeTypeHelper.getPrefixedAudioIdFromIndex(AUDIO_CONTENT_PREFIX+"1", programIndex);
	}

	/**
	 * 
	 * @param programIndex
	 * 	Index of the audio Program
	 * @param audioProgramName
	 * 	Name of the audio content
	 * @param language
	 * 	Language of the content
	 * @return a {@link AudioContentType} object
	 * @throws NullPointerException
	 * 	One of the argument is null
	 * @throws IllegalArgumentException
	 * 	One of the argument is invalid
	 */
	public static final AudioContent create(int programIndex, String audioProgramName, String language) 
			throws NullPointerException, IllegalArgumentException{
		Objects.requireNonNull(programIndex);
		Objects.requireNonNull(audioProgramName);
		Objects.requireNonNull(language);
		final ObjectFactory objectFactory = new ObjectFactory();
		final AudioContent audioContent = objectFactory.createAudioContent();
		audioContent.setAudioContentID(AudioContentTypeHelper.getAudioContentIdFromIndex(programIndex));
		audioContent.setAudioContentLanguage(language);
		audioContent.setAudioContentName(audioProgramName);
		return audioContent;
	}

}
