/**
 * 
 */
package eu.mikrosimage.xdmat.ebucore.helpers;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Guillaume Maucomble <gma@mikrosimage.eu>
 *
 */
public class AudioChannelFormatTypeHelpertest {

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
	 * Test method for {@link eu.mikrosimage.xdmat.ebucore.helpers.AudioChannelFormatTypeHelper#getAudioChannelPrefix(int)}.
	 */
	@Test
	public void testGetAudioChannelPrefix() {
		String getAudioChannelPrefix = AudioChannelFormatTypeHelper.getAudioChannelPrefix(4);
//		assertEquals("", getAudioChannelPrefix);
	}

	/**
	 * Test method for {@link eu.mikrosimage.xdmat.ebucore.helpers.AudioChannelFormatTypeHelper#getAudioChannelIdFromIndex(int)}.
	 */
	@Test
	public void testGetAudioChannelIdFromIndex() {
		String audioChannelIdFromIndex = AudioChannelFormatTypeHelper.getAudioChannelIdFromIndex(4);
//		assertEquals("", audioChannelIdFromIndex);
	}

	/**
	 * Test method for {@link eu.mikrosimage.xdmat.ebucore.helpers.AudioChannelFormatTypeHelper#getAudioChannelIndexFromId(java.lang.String)}.
	 */
	@Test
	public void testGetAudioChannelIndexFromId() {
//		int audioChannelIndexFromId = AudioChannelFormatTypeHelper.getAudioChannelIndexFromId("");
//		assertEquals(4, audioChannelIndexFromId);
	}

}
