/**
 * 
 */
package eu.mikrosimage.xdmat.ebucore.helpers;

import ebu.metadata_schema.ebucore_2014.AudioObjectType;
import ebu.metadata_schema.ebucore_2014.AudioProgrammeType;
import ebu.metadata_schema.ebucore_2014.ObjectFactory;

/**
 * @author gma
 *
 */
public final class AudioObjectTypeHelper {

	private AudioObjectTypeHelper() {}
	
	
	/**
	 * 
	 * @param programId
	 * @return program index
	 */
	public static final int getAudioObjectIndexFromId(String programId) {
		return AudioProgrammeTypeHelper.getIndexFromId(AudioObjectType.PREFIX+"1", programId);
	}
	
	/**
	 * 
	 * @param programIndex
	 * @return program id
	 */
	public static final String getAudioObjectIdFromIndex(int programIndex) {
		return AudioProgrammeTypeHelper.getPrefixedAudioIdFromIndex(AudioObjectType.PREFIX+"1", programIndex);
	}
	
	/**
	 * 
	 * @param programIndex
	 * 	Container {@link AudioProgrammeType} index
	 * @param audioObjectName
	 * 	Name of the object
	 * @return Simple {@link AudioObjectType} 
	 */
	public static final AudioObjectType create(int programIndex, String audioObjectName) {
		final ObjectFactory objectFactory = new ObjectFactory();
		final AudioObjectType audioObject = objectFactory.createAudioObjectType();
		audioObject.setAudioObjectID(AudioObjectTypeHelper.getAudioObjectIdFromIndex(programIndex));
		audioObject.setAudioObjectName(audioObjectName);
		return audioObject;
	}

}
