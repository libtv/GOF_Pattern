package scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class Scanner_IO {
	public static final Scanner_IO INSTANCE = new Scanner_IO();
	Scanner scanner;
	char[][] charlist = new char[7][256];
	
	private Scanner_IO() {
		if (scanner == null) {
			scanner = new Scanner(System.in);
		}
	}
	
	public Scanner f_Scan() {
		return scanner;
	}
	
	public String n_Scan() {
		return scanner.nextLine();
	}
	
	public void l_Scan() {
		scanner = null;
	}
	
	public void c_Char(String str, int x, int count) {
		for(int i=x; i<x+str.length(); i++) {
			charlist[count][i] = str.charAt(i-x);
		}
	}

	public void r_Char(int count) {
		String change = "";
		for(int i=0; i<charlist[count].length; i++) {
			change+= Character.toString(charlist[count][i]);
		}
		System.out.print("-->" + change.trim() + "<--");
		System.out.println("");
	}

	public void remove_Char(int count) {
		for(int i=0; i<256; i++) {
			charlist[count][i] = 0;
		}
		this.r_Char(count);
		// TODO Auto-generated method stub
		
	}

	public char cut_Char(int input, int x) {
		char save = charlist[input][x];
		charlist[input][x] = 0;
		this.r_Char(input);
		return save;
	}

	public void insert_Char(int input, int x, char save) {
		charlist[input][x] = save;
		this.r_Char(input);
		// TODO Auto-generated method stub
		
	}
}
