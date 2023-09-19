package day8;

public class loopprime {
	public static void main (String []args) {
		
		int num =13;
		boolean flag = true; //false
		
		for (int i=2;i<num;i++) {
			if (num%i==0) {
				flag = false;//true
			}
		}
		if(flag==true) {//false
			System.out.println(num+"is prime number");
			
		}
		else {
			System.out.println(num+"is not prime number");
		}
		
		
		
		
		
		
	}

}
