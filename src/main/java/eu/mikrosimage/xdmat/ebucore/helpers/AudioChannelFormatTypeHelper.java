package eu.mikrosimage.xdmat.ebucore.helpers;

import com.google.common.base.Strings;

/**
 * 
 * @author Guillaume Maucomble <gma@mikrosimage.eu>
 * @version 1.0.10
 * @since 1.0.10
 */
public class AudioChannelFormatTypeHelper {
	
	private static final String AUDIO_CHANNEL_PREFIX = "AC";

	private AudioChannelFormatTypeHelper() {}
	
	/**
	 * @param index
	 * 	Channel id
	 * @return Prefix of AudioChannel matching channel parameter
	 */
	public static final String getAudioChannelPrefix(int index) {
		return "0001" + Strings.padStart(String.valueOf(index), 4, '0');
	}
	/**
	 * 
	 * @param index
	 * 	Channel id
	 * @return ID of AudioChannel matching channel parameter
	 */
	public static final String getAudioChannelIdFromIndex(int index) {
		return  AUDIO_CHANNEL_PREFIX + getAudioChannelPrefix(index) ;
	}

	/**
	 * 
	 * @param programId
	 * @return program index
	 */
	public static final int getAudioChannelIndexFromId(String programId) {
		return AudioProgrammeTypeHelper.getIndexFromId(AUDIO_CHANNEL_PREFIX + "0001", programId);
	}
	
}
