package hw1;

import java.util.Arrays;

public class RichArray {

	private int[][] RichArray;
	private int length;

	public RichArray(int[][] array) {
		RichArray = array.clone();

	}

	public RichArray(int[] array) {
		int[][] illusionarray = new int[0][array.length];
		for (int i = 0; i < array.length; i++) {
			array[i] = illusionarray[0][i];
		}
		RichArray = illusionarray.clone();
	}

	public String toString() {
		return Arrays.toString(RichArray);
	}

	public RichArray reverse() {
		int length = RichArray[0].length;
		int[][] secondarray = new int[RichArray.length][length];
		int[][] secondarrayc = { { 5, 9, 3 }, { 6, 9, 0 }, { 7, 8, 9 } };
		for (int i=0; i<secondarrayc.length; i++) {
			for (int y=0; y<secondarrayc.length; y++) {	
				secondarray[i][y]=secondarrayc[i][y];
		}
		}
		System.out.println(Arrays.toString(secondarray));
		for (int row = 0; row < RichArray.length; row++) {
			for (int i = 0; i < length; i++) {
				RichArray[row][length - 1] = secondarray[row][i];
				length = length - 1;
			}
		}
		System.out.println(Arrays.toString(secondarray));

		RichArray richarray = new RichArray(secondarray);
		richarray.toString();
		return richarray;
	}

	public static void main(String[] args) {
		int[][] array1 = { { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 4, 3, 2, 1 } };
		RichArray array = new RichArray(array1);
		array.reverse();
		System.out.println(array.toString());

	}
}