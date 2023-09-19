package day8;

public class loopconsonat {
public static void main (String []args) {
	String word =args[0];
	
//int	count =0;
int total =0;
	for (int i=0;i<word.length();i++) {
		char ch = word.charAt(i);
		if (ch =='a'||ch=='e'||ch =='i'||ch=='o'||ch=='u'){
			//count =count+ 1;
			
	}
		else {
			total =total+1;
			
		}
		}
	
	
	
	//System.out.println("Vowels present in the given string"+count);
	
	System.out.println("consonant present in the given string"+total);
	
}
}
