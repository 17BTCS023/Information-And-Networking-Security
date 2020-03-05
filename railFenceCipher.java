package lab_Programs;

/* Rail-fence Cipher 
*******************************/


import java.util.Scanner;
import java.*;

class railFence { // main start
	String cipher = "", message = "";
	int i ,j=0 ;
	boolean check = false;
	
// encrypt
	public String encrypt(String s , int key, int len){
		char matrix[][] = new char[key][len];
		for(i=0; i< len  ; i++) { // creating the matrix in zig-zag form
			if(j==0 || j== key-1) {
				check = !check; // toggle
			}
			matrix[j%key][i] = s.charAt(i);
			
			if(check)
				{j++;
				}
			else {
				j--;
				}
		}
		
		for(i =0; i < key; i++ ) {
			for(j = 0; j < len; j++) {
				System.out.print(matrix[i][j] + " ");
				if(matrix[i][j] != '\u0000' ) {
					cipher += matrix[i][j];
				}
				System.out.print("\n");
			}
		}
	return cipher;
	}
	
//decrypt
	public String decrypt(String s, int key, int len){
		char matrix[][] = new char[key][len];
		for(i=0; i< len  ; i++) { // creating the matrix in zig-zag form
			if(j==0 || j== key-1) {
				check = !check; // toggle
			}
			matrix[j%key][i] = '*';  // storing * at the diagonal places
			
			if(check)
				{j++;
				}
			else {
				j--;
				}
		}
		for(i =0; i < key; i++ ) {  // replacing * with the characters
			for(j = 0; j < len; j++) {
				System.out.print(matrix[i][j] + " ");
				if(matrix[i][j] == '*' && i <j ) {
					matrix[i][j] = s.charAt(i);
				}
				System.out.print("\n");
			}
		}
		
		for(i =0; i < key; i++ ) {  // replacing * with the characters
			for(j = 0; j < len; j++) {
				System.out.print(matrix[i][j] + " ");
				if(matrix[i][j] == '*' && i <j ) {
					matrix[i][j] = s.charAt(i);
				}
				System.out.print("\n");
			}
		}
		
		
		
		
	return message;
	}
}

public class railFenceCipher {
	
	static String str;
	static int key, slen;

	public static void main(String args[]){

	Scanner scan = new Scanner(System.in);

	System.out.println("Enter the string: ");
	str = scan.nextLine();
	slen = str.length();
	System.out.println("Enter the key: ");
	key = scan.nextInt();
	railFence obj = new railFence();
	String h =obj.encrypt(str,key, slen);
	System.out.println(h);
	obj.decrypt(h,key, slen);

}
}