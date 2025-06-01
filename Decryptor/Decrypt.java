package Decryptor;
public class Decrypt
{
    public static String decryptMsg(String msg, int key)
    {
        char ch;
        String decrpyptedmsg="";
        int len = msg.length();
        for(int i=0;i<len;i++)
        {
            ch = msg.charAt(i);
            decrpyptedmsg = decrpyptedmsg + (char) (ch-key);
        }
        return decrpyptedmsg;
    }
}