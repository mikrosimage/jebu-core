/**
 * 
 */
package eu.mikrosimage.xdmat.ebucore.helpers;

import ebu.metadata_schema.ebucore_2015.AudioObject;
import ebu.metadata_schema.ebucore_2015.ObjectFactory;

/**
 * @author gma
 *
 */
public final class AudioObjectTypeHelper {
	
	private static final String AUDIO_OBJECT_PREFIX = "AO_";

	private AudioObjectTypeHelper() {}
	
	
	/**
	 * 
	 * @param programId
	 * @return program index
	 */
	public static final int getAudioObjectIndexFromId(String programId) {
		return AudioProgrammeTypeHelper.getIndexFromId(AUDIO_OBJECT_PREFIX+"1", programId);
	}
	
	/**
	 * 
	 * @param programIndex
	 * @return program id
	 */
	public static final String getAudioObjectIdFromIndex(int programIndex) {
		return AudioProgrammeTypeHelper.getPrefixedAudioIdFromIndex(AUDIO_OBJECT_PREFIX+"1", programIndex);
	}
	
	/**
	 * 
	 * @param programIndex
	 * 	Container {@link AudioProgrammeType} index
	 * @param audioObjectName
	 * 	Name of the object
	 * @return Simple {@link AudioObjectType} 
	 */
	public static final AudioObject create(int programIndex, String audioObjectName) {
		final ObjectFactory objectFactory = new ObjectFactory();
		final AudioObject audioObject = objectFactory.createAudioObject();
		audioObject.setAudioObjectID(AudioObjectTypeHelper.getAudioObjectIdFromIndex(programIndex));
		audioObject.setAudioObjectName(audioObjectName);
		return audioObject;
	}

}
