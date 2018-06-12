/**
 * 
 */
package eu.mikrosimage.xdmat.ebucore_2014.helpers;

import com.google.common.base.Preconditions;

import ebu.metadata_schema.ebucore_2014.AudioContentType;
import ebu.metadata_schema.ebucore_2014.ObjectFactory;

/**
 * @author gma
 *
 */
public final class AudioContentTypeHelper {

	private AudioContentTypeHelper() {}

	/**
	 * 
	 * @param programId
	 * @return program index
	 */
	public static final int getAudioContentIndexFromId(String programId) {
		return AudioProgrammeTypeHelper.getIndexFromId(AudioContentType.PREFIX+"1", programId);
	}

	/**
	 * 
	 * @param programIndex
	 * @return program id
	 */
	public static final String getAudioContentIdFromIndex(int programIndex) {
		return AudioProgrammeTypeHelper.getPrefixedAudioIdFromIndex(AudioContentType.PREFIX+"1", programIndex);
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
	public static final AudioContentType create(int programIndex, String audioProgramName, String language) 
			throws NullPointerException, IllegalArgumentException{
		Preconditions.checkNotNull(programIndex);
		Preconditions.checkArgument(programIndex>0);
		Preconditions.checkNotNull(audioProgramName);
		Preconditions.checkNotNull(language);
		final ObjectFactory objectFactory = new ObjectFactory();
		final AudioContentType audioContent = objectFactory.createAudioContentType();
		audioContent.setAudioContentID(AudioContentTypeHelper.getAudioContentIdFromIndex(programIndex));
		audioContent.setAudioContentLanguage(language);
		audioContent.setAudioContentName(audioProgramName);
		return audioContent;
	}

}
