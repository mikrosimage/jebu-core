package eu.mikrosimage.xdmat.ebucore.helpers;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import ebu.metadata_schema.ebucore_2015.AudioTrackUID;
import ebu.metadata_schema.ebucore_2015.ObjectFactory;

/**
 * Provides Helpers for creating and reversing uids of {@link AudioTrackUIDType}.
 * 
 * @author Guillaume Maucomble <gma@mikrosimage.eu>
 *
 */
public final class AudioTrackUIDTypeHelper {
	
	private static final String AUDIO_TRACK_UID_PREFIX = "ATU_";

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
		Objects.requireNonNull(value);
		assert value > 0 : "Value (" + value + ") must be greater than 0";
		return AUDIO_TRACK_UID_PREFIX+IDHelper.createId(Integer.toHexString(value), 8);
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
		Objects.requireNonNull(uid);
		assert uid.startsWith(AUDIO_TRACK_UID_PREFIX) : "AudioTrackUID must start with " + AUDIO_TRACK_UID_PREFIX + " : " + uid;
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
	public static final Set<AudioTrackUID> getAudioTrackUIDList(int from, int to) {
		assert from > 0 && from <= to  : "from ("+from+") must be greater than 0 and smaller than to ("+to+")";
		
		final ObjectFactory objectFactory = new ObjectFactory();
		final Set<AudioTrackUID> collection = new TreeSet<>((a, b) ->
			getAudioTrackIndexFromUid(a.getUID()) - getAudioTrackIndexFromUid(b.getUID()));
		for(int i = from; i <= to ; ++i) {
			final AudioTrackUID audioTrackUIDType = objectFactory.createAudioTrackUID();
			audioTrackUIDType.setUID(AudioTrackUIDTypeHelper.getAudioTrackUID(i));
			collection.add(audioTrackUIDType);
		}
		return collection;
	}
	
	/**
	 * @see #getAudioTrackUIDList(int, int)
	 */
	public static final List<String> getAudioTrackUIDListAsString(int from, int to) {
		return getAudioTrackUIDList(from, to).stream()
				.map(AudioTrackUID::getUID)
				.collect(Collectors.toList());
	}

}
