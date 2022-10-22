package es;

import java.util.Iterator;

public class provaDel9 {
	
	static String numToString(int n) {
		return n + "";
	}
	
	static int stringToInt(String s) {
		return Integer.parseInt(s);
	}
	
	static int sommaCifre(int n) {
		return n%9;
	}
	
	static boolean prova(int f1, int f2,int prod) {
		if (sommaCifre(sommaCifre(f1)*sommaCifre(f2)) == sommaCifre(prod))
			return true;
		else
			return false;
	}
	
	static void stampaTerne(int n) {
		int cont = 0;

		for(int i=1;i<n;i++) {
			for(int j=1;j<n;j++) {
				for(int k=1;k<n;k++) {
					if (i*j!=k && prova(i,j,k)){
						cont +=1;
						System.out.print("terna: " + cont +"-");
						System.out.print(i + " ");
						System.out.print(j + " ");
						System.out.print(k);
						System.out.println();
					}
				}
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		
		stampaTerne(100);
	}
}
