package day5;

import java.util.Arrays;

public class P205 {

	public static void main(String[] args) {
		
		String[] names;
		names = new String[5]; // �迭����
		System.out.println(Arrays.toString(names));
		
		for(int i=0;i<names.length;i++){
			names[i] = "Hello"+i;
		}
		System.out.println(Arrays.toString(names));
	}
}