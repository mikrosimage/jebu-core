/**
 * 
 */
package eu.mikrosimage.xdmat.ebucore_2015;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import eu.mikrosimage.xdmat.ebucore_2015.helpers.AudioContentTypeHelper;
import eu.mikrosimage.xdmat.ebucore_2015.helpers.AudioObjectTypeHelper;
import eu.mikrosimage.xdmat.ebucore_2015.helpers.AudioProgrammeTypeHelper;

/**
 * @author Guillaume Maucomble <gma@mikrosimage.eu>
 *
 */
public class AudioTypeHelperTest {

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
	 * Ensures that {@link AudioProgrammeType} are id-ed correctly
	 */
	@Test
	public void audioProgrammeIdReverseTest() {
		for(int i=4; i>0; i--) {
			String audioProgrammeUID = AudioProgrammeTypeHelper.getAudioProgrammeIdFromIndex(i);
			int audioProgrammeIndexFromId = AudioProgrammeTypeHelper.getAudioProgrammeIndexFromId(audioProgrammeUID);
			assertEquals(i, audioProgrammeIndexFromId);
		}
	}

	/**
	 * Ensures that {@link AudioObjectType} are id-ed correctly
	 */
	@Test
	public void audioObjectsIdReverseTest() {
		for(int i=4; i>0; i--) {
			String audioObjectUID = AudioObjectTypeHelper.getAudioObjectIdFromIndex(i);
			int audioObjectIndexFromId = AudioObjectTypeHelper.getAudioObjectIndexFromId(audioObjectUID);
			assertEquals(i, audioObjectIndexFromId);
		}
	}

	/**
	 * Ensures that {@link AudioContentType} are id-ed correctly
	 */
	@Test
	public void audioContentsIdReverseTest() {
		for(int i=4; i>0; i--) {
			String audioContentUID = AudioContentTypeHelper.getAudioContentIdFromIndex(i);
			int audioContentIndexFromId = AudioContentTypeHelper.getAudioContentIndexFromId(audioContentUID);
			assertEquals(i, audioContentIndexFromId);
		}
	}

}
