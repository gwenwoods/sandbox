package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(lengthOfLongestSubstring("abca"));

	}

	public static int lengthOfLongestSubstring(String s) {
		int strlen = s.length();
		int[][] lenMat = new int[strlen][strlen];

		int maxLen = 1;
		for (int i = 0; i < strlen; i++) {
			// i : substring starting from i
			lenMat[i][i] = 1;
			Set<String> charSet = new HashSet<String>();
			charSet.add(String.valueOf(s.charAt(i)));
			for (int j = i + 1; j < strlen; j++) {
				// find lenMat[i][j] from lenMat[i][j-1]
				String currChar = String.valueOf(s.charAt(j));
				if (charSet.contains(currChar)) {
					lenMat[i][j] = lenMat[i][j - 1];
					// no more longer substring starting from i
					break;
				} else {
					lenMat[i][j] = lenMat[i][j - 1] + 1;
					charSet.add(currChar);
					if (lenMat[i][j] > maxLen) {
						maxLen = lenMat[i][j];
					}
				}
			}
		}

		return maxLen;
	}
}
