package eu.mikrosimage.xdmat.ebucore_2015.helpers;

import java.util.Arrays;
import java.util.Objects;

/**
 * Utilities for audio objects' ids.
 * 
 * @author Guillaume Maucomble <gma@mikrosimage.eu>
 * @version 1.6.2
 * @since 1.6.2
 */
public class IDHelper {

	/**
	 * 
	 */
	private static final char paddingCharacter = '0';
	
	/**
	 * Pads an id with zeroes to reach a maximum number of characters.
	 * 
	 * @param string
	 * @param length
	 * 	id length
	 * @return
	 */
	public static String createId(String string, int goalLength) {
		Objects.requireNonNull(string);
		if (string.length() >= goalLength) {
			return string;
		}
		char[] arrayOfZeroes = new char[goalLength-string.length()];
		Arrays.fill(arrayOfZeroes, paddingCharacter);
		final StringBuilder sb = new StringBuilder(goalLength);
		return sb.append(arrayOfZeroes).append(string).toString();
	}

}
