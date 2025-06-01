package Encryptor;
public class Encrypt
{
    public static String encryptMsg(String msg, int key)
    {
        char ch;
        String encrpyptedmsg="";
        int len = msg.length();
        for(int i=0;i<len;i++)
        {
            ch = msg.charAt(i);
            encrpyptedmsg = encrpyptedmsg + (char) (ch+key);
        }
        return encrpyptedmsg;
    }
}