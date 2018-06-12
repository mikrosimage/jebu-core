package eu.mikrosimage.xdmat.ebucore_2014.helpers;

import com.google.common.base.Strings;

import ebu.metadata_schema.ebucore_2014.AudioChannelFormatType;

/**
 * 
 * @author Guillaume Maucomble <gma@mikrosimage.eu>
 * @version 1.0.10
 * @since 1.0.10
 */
public class AudioChannelFormatTypeHelper {

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
		return  AudioChannelFormatType.PREFIX + getAudioChannelPrefix(index) ;
	}

	/**
	 * 
	 * @param programId
	 * @return program index
	 */
	public static final int getAudioChannelIndexFromId(String programId) {
		return AudioProgrammeTypeHelper.getIndexFromId(AudioChannelFormatType.PREFIX + "0001", programId);
	}
	
	public static void main(String[] args) {
		
	}
	
}
