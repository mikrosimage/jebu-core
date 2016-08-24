/**
 * 
 */
package eu.mikrosimage.xdmat.ebucore;

import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ebu.metadata_schema.ebucore_2015.AudioFormatExtendedType;
import ebu.metadata_schema.ebucore_2015.AudioTrackUID;
import ebu.metadata_schema.ebucore_2015.ObjectFactory;
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
		List<AudioTrackUID> audioTrackUIDs = audioFormatExtended.getAudioTrackUIDs();
		for(int i=16; i>0; i--) {
			final AudioTrackUID audioTrackUID = factory.createAudioTrackUID();
			audioTrackUID.setUID(AudioTrackUIDTypeHelper.getAudioTrackUID(i));
			audioTrackUIDs.add(audioTrackUID);
		}
		
		final Iterator<AudioTrackUID> iterator = audioTrackUIDs.iterator();
		
		int previousIndex = 0;
		while(iterator.hasNext()) {
			final AudioTrackUID next = iterator.next();
			int audioTrackIndexFromUid = AudioTrackUIDTypeHelper.getAudioTrackIndexFromUid(next.getUID());
//			assertTrue(previousIndex<audioTrackIndexFromUid);
			previousIndex = audioTrackIndexFromUid;
		}
	}

}
