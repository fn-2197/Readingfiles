package fileinout;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Readingfiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(new File("C:\\temp_Larry\\NerdData.txt"));
		String a[] = new String[5];
		int maxIndx = -1;
		while(scr.hasNext()) {
			maxIndx++;
			a[maxIndx] = scr.nextLine();
		}
		scr.close();
		for(int i = 0; i<a.length; i++){
			if(a[i].substring(0, 4).equals("The"))
				System.out.println(a[i]);
		}
		
	}

}
