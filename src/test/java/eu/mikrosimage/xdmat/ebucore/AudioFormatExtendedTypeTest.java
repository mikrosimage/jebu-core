/**
 * 
 */
package eu.mikrosimage.xdmat.ebucore;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.Set;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ebu.metadata_schema.ebucore_2014.AudioFormatExtendedType;
import ebu.metadata_schema.ebucore_2014.AudioTrackUIDType;
import ebu.metadata_schema.ebucore_2014.ObjectFactory;
import eu.mikrosimage.xdmat.ebucore.helpers.AudioTrackUIDTypeHelper;

/**
 * @author gma
 *
 */
public class AudioFormatExtendedTypeTest {

	ObjectFactory factory;
	
	AudioFormatExtendedType audioFormatExtended;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		factory = new ObjectFactory();
		audioFormatExtended = factory.createAudioFormatExtendedType();
	}

	/**
	 * Ensures that tracks UIDs are always sorted by index
	 */
	@Test
	public void ensureSortedAudioTrackUids() {
		final Set<AudioTrackUIDType> audioTrackUIDs = audioFormatExtended.getAudioTrackUID();
		for(int i=16; i>0; i--) {
			final AudioTrackUIDType audioTrackUID = factory.createAudioTrackUIDType();
			audioTrackUID.setUID(AudioTrackUIDTypeHelper.getAudioTrackUID(i));
			audioTrackUIDs.add(audioTrackUID);
		}
		
		final Iterator<AudioTrackUIDType> iterator = audioTrackUIDs.iterator();
		
		int previousIndex = 0;
		while(iterator.hasNext()) {
			final AudioTrackUIDType next = iterator.next();
			int audioTrackIndexFromUid = AudioTrackUIDTypeHelper.getAudioTrackIndexFromUid(next.getUID());
			assertTrue(previousIndex<audioTrackIndexFromUid);
			previousIndex = audioTrackIndexFromUid;
		}
	}

}
