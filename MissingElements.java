package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 4, 7, 6, 8 };
		Arrays.sort(array);
List<Integer> intlist = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {

			intlist.add(array[i]);
			
			if(intlist.get(i)!=(i+1)) {
				System.out.println("The missing elements are : "+(i+1));
				
	}
		}
	}
}

