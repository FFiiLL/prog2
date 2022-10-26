package es;

public class kaprekar {
	
	static String NumToString(int n) {
		return n+"";
	}
	
	static int[] StringToIntArray(String s) {
		
		int[] v = new int[s.length()];
		
		for(int i=0;i<s.length();i++) {
			
			v[i] = Integer.parseInt(s.charAt(i)+"");
			
		}
		
		return v;
	}
	
	static void swap(int[] v,int i1,int i2) {
		int temp;
		temp = v[i1];
		v[i1] = v[i2];
		v[i2]=temp;
	}
	
	static void sort(int[] v,boolean crescente) {
		
	
			
			for(int i=0;i<v.length-1;i++) {
				for(int j=i;j<v.length;j++) {
					if(crescente) {
						if(v[i]>v[j])
							swap(v,i,j);
					}else {
						if(v[i]<v[j])
							swap(v,i,j);
					}
				}
			}
			
		
		
		
		
		
	}
	
	static void printArr(int[]v) {
		
		for(int i=0;i<v.length;i++) {
			System.out.print(v[i]);
		}
		System.out.println();
	}
	
	static int ArrToInt(int[] v) {
		int res = 0;
		for(int i=0;i<v.length;i++) {
			res += v[i] * Math.pow(10, i);
		}
		
		return res;
		
	}
	static int NextKaprekar(int n) {
		
		String str = NumToString(n);
		int[] array = StringToIntArray(str);
		
		
		
		int[] arrCresc = array.clone();
		int[] arrDecre = array.clone();
		
		sort(arrCresc,true);
		sort(arrDecre,false);
		
		
		return ArrToInt(arrCresc)-ArrToInt(arrDecre);
		
	}
	
	static void printSeq(int n) {
		System.out.println("1->"+n);
		int cont = 2;
		while(n!=6174)	{
			n = NextKaprekar(n);
			System.out.println(cont+"->"+n);
			cont++;
		}
			
		
		
	
	}
		
	public static void main(String[] args) {
		printSeq(8517);
	}
}
	
