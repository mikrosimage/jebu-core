package eu.mikrosimage.xdmat.ebucore_2015.helpers;

/**
 * 
 * @author Guillaume Maucomble <gma@mikrosimage.eu>
 * @version 1.0.10
 * @since 1.0.10
 */
public class AudioTrackFormatTypeHelper {
	
	private static final String AUDIO_TRACK_PREFIX = "AT_";

	private AudioTrackFormatTypeHelper(){}
	
	/**
	 * 
	 * @param audioTrackId
	 * @return program index
	 */
	public static final int getAudioTrackFormatIndexFromId(String audioTrackId) {
		return AudioProgrammeTypeHelper.getIndexFromId(AUDIO_TRACK_PREFIX+"0001", audioTrackId);
	}

	/**
	 * 
	 * @param audioTrackIndex
	 * @return audio pack id
	 */
	public static final String getAudioTrackFormatIdFromIndex(int audioTrackIndex) {
		return AudioProgrammeTypeHelper.getPrefixedAudioIdFromIndex(AUDIO_TRACK_PREFIX+"0001", audioTrackIndex, 4);
	}
	
}
