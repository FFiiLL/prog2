package es1;

import java.util.Scanner;

public class rombo {
	static void stampaRombo(int n) {
		int h = n * 2 + 1;
		int spazi = h-1;
		int star = h - spazi;
		
		for(int i=1 ; i<=h ; i++) {
			
				
			for(int k=1;k<=spazi/2;k++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("*");
			}
			for(int k=1;k<=spazi/2;k++) {
				System.out.print(" ");
			}
				
				
			if(i<=h/2) {
				spazi-=2;
				star +=2;
			}else {
				spazi+=2;
				star -=2;
			}
			
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		stampaRombo(in.nextInt());
	}
}
