package day8;

public class loopsumofodd {
	public static void main (String[] args) {
		
		String a = args[0];
		int num = Integer.parseInt(a);
		
		for(int i=1;i<=num;i++) {
			
		
		 if(i%4==0) {
			 continue;
		 }
		 else {
			 System.out.println(i);
		 }
		
		
	}

	}
}
