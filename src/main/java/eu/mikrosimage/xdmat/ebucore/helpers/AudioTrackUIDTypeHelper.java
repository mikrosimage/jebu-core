package eu.mikrosimage.xdmat.ebucore.helpers;

import java.util.HashSet;
import java.util.Set;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

import ebu.metadata_schema.ebucore_2015.AudioTrackUIDType;
import ebu.metadata_schema.ebucore_2015.ObjectFactory;

/**
 * Provides Helpers for creating and reversing uids of {@link AudioTrackUIDType}.
 * 
 * @author Guillaume Maucomble <gma@mikrosimage.eu>
 *
 */
public final class AudioTrackUIDTypeHelper {
	
	private static final String AUDIO_TRACK_UID_PREFIX = "ATU";

	private AudioTrackUIDTypeHelper() {}
	
	/**
	 * Returns  formated {@link AudioTrackUIDType} ID.
	 * 
	 * @param value
	 * 	Stream number
	 * @return formated {@link AudioTrackUIDType} ID.
	 * @throws NullPointerException
	 * 	if value is null
	 * @throws IllegalArgumentException
	 * 	if value < 0
	 */ 
	public static final String getAudioTrackUID(int value) {
		Preconditions.checkNotNull(value);
		Preconditions.checkArgument(value>0);
		return AUDIO_TRACK_UID_PREFIX+Strings.padStart(Integer.toHexString(value), 8, '0');
	}

	/**
	 * Returns the index of the track
	 * 
	 * @param uid
	 * @return
	 * 	The index of the track
	 * @throws NullPointerException
	 * 	Argument is null
	 * @throws NumberFormatException
	 * uid must be a valid integer
	 * @throws IllegalArgumentException
	 * 	uid parameter must start with {@value AudioTrackUIDType#PREFIX}
	 */ 
	public static final int getAudioTrackIndexFromUid(String uid) 
			throws NullPointerException, NumberFormatException, IllegalArgumentException {
		Preconditions.checkNotNull(uid);
		Preconditions.checkArgument(uid.startsWith(AUDIO_TRACK_UID_PREFIX), "AudioTrackUID must start with " + AUDIO_TRACK_UID_PREFIX + " : " + uid);
		String hex = uid.substring(AUDIO_TRACK_UID_PREFIX.length()+1);
		return Integer.parseInt(hex, 16);  
	}
	
	/**
	 * Returns a collection of {@link AudioTrackUIDType} for tracks inside [from:to] interval
	 * @param from
	 * 	start track
	 * @param to
	 * 	end track
	 * @return
	 * 	collection of {@link AudioTrackUIDType}
	 */
	public static final Set<AudioTrackUIDType> getAudioTrackUIDList(int from, int to) {
		Preconditions.checkArgument(from <= to);
		Preconditions.checkArgument(from > 0);
		final ObjectFactory objectFactory = new ObjectFactory();
		final Set<AudioTrackUIDType> collection = new HashSet<>();
		for(int i = from; i <= to ; ++i) {
			final AudioTrackUIDType audioTrackUIDType = objectFactory.createAudioTrackUIDType();
			audioTrackUIDType.setUID(AudioTrackUIDTypeHelper.getAudioTrackUID(i));
			collection.add(audioTrackUIDType);
		}
		return collection;
	}

}
