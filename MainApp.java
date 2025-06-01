import java.util.Scanner;

import Decryptor.*;
import Encryptor.*;
class MainApp
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose:");
        System.out.println("Enter 1 to encrypt a message");
        System.out.println("Enter 2 to decrypt a message");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        String msg, fmsg;
        int key;
        switch (choice) 
        {
            case 1: System.out.print("Enter message to encrypt: ");
                    msg = sc.nextLine();
                    System.out.println("Enter no. of times to shift character: ");
                    key = sc.nextInt();
                    fmsg = Encrypt.encryptMsg(msg, key);
                    System.out.println("The encrypted message: "+fmsg);
                    break;
            case 2: System.out.print("Enter message to decrypt: ");
                    msg = sc.nextLine();
                    System.out.print("Enter no. of times to de-shift character: ");
                    key = sc.nextInt();
                    fmsg = Decrypt.decryptMsg(msg, key);
                    System.out.println("The decrypted message: "+fmsg);
                    break;
            default: System.out.println("Invalid input!");
                    break;
        }
        sc.close();
    }
}