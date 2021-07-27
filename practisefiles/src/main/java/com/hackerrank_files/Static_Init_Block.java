package com.hackerrank_files;

import java.util.Scanner;

public class Static_Init_Block {
	static Scanner s = new Scanner(System.in);
	static int H = s.nextInt();
	static int B = s.nextInt();
	static boolean flag = true;
	
	static {
		try {
		if(H <= 0 || B <= 0) {
			flag = false;
			
			throw new Exception("Height and Breadth must be positive");
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	

	public static void main(String[] args) {
		if(flag) {
			int area = B*H;
			System.out.println(area);
		}

	}

}
