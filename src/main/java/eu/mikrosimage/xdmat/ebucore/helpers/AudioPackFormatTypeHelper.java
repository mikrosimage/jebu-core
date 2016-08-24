/**
 * 
 */
package eu.mikrosimage.xdmat.ebucore.helpers;

import ebu.metadata_schema.ebucore_2015.AudioPackFormat;
import ebu.metadata_schema.ebucore_2015.ObjectFactory;

/**
 *
 *
 */
public final class AudioPackFormatTypeHelper {
	
	private static final String AUDIO_PACK_PREFIX = "AP";

	private AudioPackFormatTypeHelper() {}
	
	
	/**
	 * 
	 * @param audioPackId
	 * @return program index
	 */
	public static final int getAudioPackFormatIndexFromId(String audioPackId) {
		return AudioProgrammeTypeHelper.getIndexFromId(AUDIO_PACK_PREFIX+"0001", audioPackId);
	}

	/**
	 * 
	 * @param audioPackIndex
	 * @return audio pack id
	 */
	public static final String getAudioPackFormatIdFromIndex(int audioPackIndex) {
		return AudioProgrammeTypeHelper.getPrefixedAudioIdFromIndex(AUDIO_PACK_PREFIX+"0001", audioPackIndex, 4);
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
	public static final AudioPackFormat create(String audioPackName, int audioPackIndex) {
		final ObjectFactory objectFactory = new ObjectFactory();
		final AudioPackFormat audioPack = objectFactory.createAudioPackFormat();
		audioPack.setAudioPackFormatID(AudioPackFormatTypeHelper.getAudioPackFormatIdFromIndex(audioPackIndex));
		audioPack.setAudioPackFormatName(audioPackName);
		audioPack.setTypeLabel("0001");
		audioPack.setTypeDefinition("DirectSpeakers");		
		return audioPack;
	}

}
