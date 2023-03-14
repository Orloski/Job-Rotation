import java.util.Scanner;

public class FraseInvertida {
	public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
		
		 	String palindrome = teclado.next();
		    int len = palindrome.length();
		    char[] tempCharArray = new char[len];
		    char[] charArray = new char[len];
		 
		    // coloque a string em uma matriz de caracteres
		    for (int i = 0; i < len; i++) {
		      tempCharArray[i] = palindrome.charAt(i);
		    }
		 
		    // matriz reversa de caracteres
		    for (int j = 0; j < len; j++) {
		      charArray[j] = tempCharArray[len - 1 - j];
		    }
		    
		    String reversePalindrome = new String(charArray);
		    System.out.println(reversePalindrome);
	}
}


