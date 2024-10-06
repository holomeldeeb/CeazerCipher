import java.util.Scanner;
public class CeazerCipher{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the message to encrypt : ");
        String message = scn.nextLine();
        System.out.println("enter the shift value : ");
        int shift = scn.nextInt();
        String encryptedMessage = encrypt(message, shift);
        System.out.println("your encrypted message is ; "+ encryptedMessage);
        String decryptedMessage = decrypt(encryptedMessage, shift);
        System.out.println("Decrypted message is : "+ decryptedMessage);
    }
    public static String encrypt(String message , int shift){
        StringBuilder encryptedMessage = new StringBuilder();
        message = message.toLowerCase();
        for (int i = 0; i < message.length(); i++) {
           char c = message.charAt(i);
            if (Character.isLetter(c)){
                c = (char)((c - 'a' + shift + 26 )% 26 + 'a');
            }
            encryptedMessage.append(c);
        }
        return encryptedMessage.toString();
    }
    public static String decrypt(String message , int shift){
        StringBuilder decryptedMessage = new StringBuilder();
        message = message.toLowerCase();
        for (int i = 0; i < message.length(); i++) {
           char c = message.charAt(i);
            if (Character.isLetter(c)){
                c = (char)((c - 'a' - shift + 26 )% 26 + 'a');
            }
            decryptedMessage.append(c);
        }
        return decryptedMessage.toString();


}
}
