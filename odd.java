package day8;

public class odd {
public static void main (String []args) {
	String a = args[0];
	int num = Integer.parseInt(a);
	
	int total =0;
	for(int i=0 ;i<=num;i++) {
		
		if (i%2==0) {
			continue;
		
		}
		total= total+i;
	}
	System.out.println(total);
	
	
	
	
	
	
	
	
	
	
	
	
}
}
