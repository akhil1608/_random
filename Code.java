import java.util.Scanner;
public class Code
{
    public static void main (String args[])
    {
        //System.out.println("");
        Scanner sc = new Scanner (System.in);
        String s;
        System.out.println("Enter the string");
        s = sc.nextLine();
        System.out.println("Enter the key");
        int k = sc.nextInt();
        System.out.println("Encrypt / Decrypt (e/d)");
        char ch = sc.next().charAt(0);
        if (ch=='d')
            k = k * -1;
        int code;
        int displacement;
        String newstr="";
        for (int i = 0; i < s.length(); i++)
        {
            code = s.charAt(i);
            if (code >= 65 && code <= 90)
            {
                code = code + k;
                if (code < 65)
                {
                    displacement = (65 - code)%26;
                    code = 90-displacement+1;
                    newstr = newstr + (char)code;
                }
                else
                if (code > 90)
                {
                    displacement = (code - 90)%26;
                    code = 65 + displacement - 1;
                    newstr = newstr + (char)code;
                }
                else
                {
                    newstr = newstr + (char)code;
                }
            }
            else 
            if (code >= 97 && code <= 122)
            {
                code = code + k;
                if (code < 97)
                {
                    displacement = (97 - code)%26;
                    code = 122-displacement+1;
                    newstr = newstr + (char)code;
                }
                else
                if (code > 122)
                {
                    displacement = (code - 122)%26;
                    code = 90 + displacement - 1;
                    newstr = newstr + (char)code;
                }
                else
                {
                    newstr = newstr + (char)code;
                }
            }
            else
            {
                newstr = newstr + (char)code;
            }
        }
        System.out.println("The string is " +newstr);
    }
}

            