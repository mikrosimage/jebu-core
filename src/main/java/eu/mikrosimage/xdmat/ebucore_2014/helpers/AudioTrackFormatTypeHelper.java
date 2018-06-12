package eu.mikrosimage.xdmat.ebucore_2014.helpers;

import ebu.metadata_schema.ebucore_2014.AudioTrackFormatType;

/**
 * 
 * @author Guillaume Maucomble <gma@mikrosimage.eu>
 * @version 1.0.10
 * @since 1.0.10
 */
public class AudioTrackFormatTypeHelper {

	private AudioTrackFormatTypeHelper(){}
	
	/**
	 * 
	 * @param audioTrackId
	 * @return program index
	 */
	public static final int getAudioTrackFormatIndexFromId(String audioTrackId) {
		return AudioProgrammeTypeHelper.getIndexFromId(AudioTrackFormatType.PREFIX+"0001", audioTrackId);
	}

	/**
	 * 
	 * @param audioTrackIndex
	 * @return audio pack id
	 */
	public static final String getAudioTrackFormatIdFromIndex(int audioTrackIndex) {
		return AudioProgrammeTypeHelper.getPrefixedAudioIdFromIndex(AudioTrackFormatType.PREFIX+"0001", audioTrackIndex, 4);
	}
	
}
