package com.hackerrank_files;

import java.util.Scanner;

//"In computing, End Of File (commonly abbreviated EOF) is a condition in a computer operating system where no more data can be read from a data source.
public class Java_EOF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int i = 1;
		while(sc.hasNext()) {
			System.out.println(i+" "+ sc.nextLine());
			i++;
		}
		sc.close();
		
		
		/*
		for(int i = 1; sc.hasNext()==true ; i++)
        {
            System.out.println(i+" "+ sc.nextLine());
        }
        */

	}

}
