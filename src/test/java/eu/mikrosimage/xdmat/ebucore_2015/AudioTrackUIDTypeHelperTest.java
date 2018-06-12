/**
 * 
 */
package eu.mikrosimage.xdmat.ebucore;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import eu.mikrosimage.xdmat.ebucore.helpers.AudioTrackUIDTypeHelper;

/**
 * @author gma
 *
 */
public class AudioTrackUIDTypeHelperTest {

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
	}

	/**
	 * Ensures that 
	 */
	@Test
	public void trackIndexReverseTest() {
		for(int i=16; i>0; i--) {
			String audioTrackUID = AudioTrackUIDTypeHelper.getAudioTrackUID(i);
			assertEquals(i, AudioTrackUIDTypeHelper.getAudioTrackIndexFromUid(audioTrackUID));
		}
		
	}

}
