package minijava.minijava2piglet;

import java.util.*;

public class Main{
	public static void main(String args[]){
		//read the code and output the translation
		Scanner sc = new Scanner(System.in);
		String rawcode = "";
		while(sc.hasNext())
			rawcode += sc.nextLine() + '\n';
		rawcode = Minijava2Piglet.translate(rawcode);
		System.out.println(rawcode);
	}
}