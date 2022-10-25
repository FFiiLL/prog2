package es;

public class v {
	static void printV(int n) {
		for(int i=0;i<n;i++) {
				
			for(int j=0;j<2*(n);j++) {
				
				
				
				if(j==i || (i!=n-1 && j == 2*n-i-2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
				
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		printV(30);
	}
	
	
}
