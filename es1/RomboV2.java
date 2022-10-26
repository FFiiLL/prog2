package es;

public class RomboV2 {
	static void stampaRombo(int n) {
		int h = 2*n+1;
		int spazi = h-1;
		int star = h-spazi;
		
		for (int i=1;i<=h;i++) {
			
			for(int j=0;j<spazi/2;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<star;j++) {
				System.out.print("*");
			}
			for(int j=0;j<spazi/2;j++) {
				System.out.print(" ");
			}
			
			if(i<=h/2) {
				spazi-=2;
				star+=2;
			}else {
				spazi+=2;
				star-=2;
			}
			System.out.println();
			
		}
	}
	
	public static void main(String[] args) {
		stampaRombo(10);
	}
}
