/**
 * 
 */
package eu.mikrosimage.xdmat.ebucore.helpers;

import ebu.metadata_schema.ebucore_2014.AudioObjectType;
import ebu.metadata_schema.ebucore_2014.AudioPackFormatType;
import ebu.metadata_schema.ebucore_2014.ObjectFactory;

/**
 * @author gma
 *
 */
public final class AudioPackFormatTypeHelper {

	private AudioPackFormatTypeHelper() {}
	
	
	/**
	 * 
	 * @param audioPackId
	 * @return program index
	 */
	public static final int getAudioPackFormatIndexFromId(String audioPackId) {
		return AudioProgrammeTypeHelper.getIndexFromId(AudioPackFormatType.PREFIX+"0001", audioPackId);
	}

	/**
	 * 
	 * @param audioPackIndex
	 * @return audio pack id
	 */
	public static final String getAudioPackFormatIdFromIndex(int audioPackIndex) {
		return AudioProgrammeTypeHelper.getPrefixedAudioIdFromIndex(AudioPackFormatType.PREFIX+"0001", audioPackIndex, 4);
	}

	/**
	 * Sets default values to a newly created audio pack.
	 * 
	 * @param audioPackIndex
	 * 	{@link AudioPackFormatType} index
	 * @param audioPackName
	 * 	Name of the pack
	 * @return Simple {@link AudioObjectType} 
	 */
	public static final AudioPackFormatType create(String audioPackName, int audioPackIndex) {
		final ObjectFactory objectFactory = new ObjectFactory();
		final AudioPackFormatType audioPack = objectFactory.createAudioPackFormatType();
		audioPack.setAudioPackFormatID(AudioPackFormatTypeHelper.getAudioPackFormatIdFromIndex(audioPackIndex));
		audioPack.setAudioPackFormatName(audioPackName);
		audioPack.setTypeLabel("0001");
		audioPack.setTypeDefinition("DirectSpeakers");		
		return audioPack;
	}

}
