package lab_Programs;
import java.util.*;

public class Ceaser_Cipher {
	// encryption
	String cipher ="";
	public String encrypt(String plain, int key) {
		int i=0,x,temp,z, l = plain.length();
		char y;
		System.out.println("debugg1");
		 while(i < l) {

			 x = plain.charAt(i);
			 temp = x + key;
			 if(temp < 'a') {
				 z = 'a'-temp;
				 temp = 'z' - z;
			 }else if(temp >'z') {
				 z = temp -'z' ;
				 temp = 'a' + z -1;
			 }
			 y = (char) temp;
			 cipher = cipher +  y; 
			 i++;
		 }
		
		return cipher; 
	}
	// decryption
	String message="";
	public String decrypt( int key) {
		int i=0,x,z,temp, l = cipher.length();
		char y;
		while(i < l) {

			 x = cipher.charAt(i);
			 temp = x - key;
			 if(temp < 'a') {
				 z = 'a'-temp;
				 temp = 'z' - z;
			 }else if(temp >'z') {
				 z = temp -'z' ;
				 temp = 'a' + z -1;
			 }
			 y = (char) temp;
			 message = message +  y; 
			 i++;
		 }
		
		return message; 
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Plain Text: ");
		String plain = sc.nextLine();
		System.out.println("Key number: ");
		int key = sc.nextInt();
		Ceaser_Cipher obj = new Ceaser_Cipher();
		System.out.println( "Encripted text is: "+obj.encrypt(plain, key));
		System.out.println("Decrypted text is: "+obj.decrypt( key));

	}
}





