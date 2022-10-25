package es;

public class chess {
	static void lineaMeno(int n) {
		
		for(int i=0;i<8;i++) {
			
			for(int j=0;j<n;j++) {
				if(i%2==0)
					System.out.print("-");
				else
					System.out.print("#");
			}	
			
		}
		System.out.println();
		
		
	}
	static void lineaHash(int n) {
			
		for(int i=0;i<8;i++) {
			
			for(int j=0;j<n;j++) {
				if(i%2==0)
					System.out.print("#");
				else
					System.out.print("-");
			}	
			
		}
		System.out.println();
			
			
		}
	
	static void printSca(int n) {
		
		for(int i=0;i<8;i++) {
			// j<n/2 per quadrati
			for(int j=0;j<n;j++) {
				if(i%2==0)
					lineaMeno(n);
				else
					lineaHash(n);
			}
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		lineaMeno(7);
		lineaHash(6);
		System.out.println("=========================");
		printSca(25);
		
	}
}
