/* Rail-fence Cipher 
*******************************/

// encryption:

import java.util.Scanner;
import java.*;

class railFence { // main start

	public String encrypt(String s , int key){
	// encrypt
	System.out.println("Encrypting" + " "+ s +" " +  key);
	return s;
	}

	public String decrypt(String s, int key){
	//decrypt
	System.out.println("Decrypting "+ " "+ s +" " +  key );
	return s;
	}
}


public class railFenceCipher {

	static String str;
	static int key;

	public static void main(String args[]){

	Scanner scan = new Scanner(System.in);

	System.out.println("Enter the string: ");
	str = scan.nextLine();
	System.out.println("Enter the key: ");
	key = scan.nextInt();
	railFence obj = new railFence();
	obj.encrypt(str,key);
	obj.decrypt(str,key);

}

//main close
}
