import java.util.Scanner;
public class StringF
{
    String trimr (String os)
    {
        String ns = "";
        for (int i = 0; i < os.length(); i++)
        {
            if ((os.charAt(i) >= 'a' && os.charAt(i)<= 'z') || (os.charAt(i) >= 'A' && os.charAt(i)<= 'Z') || os.charAt(i) == ' ')
            {
                ns = ns + os.charAt(i);
            }
            else
            {
                ns = ns + " ";
            }
        }
        return ns;
    }

    public static void main (String args[])
    {
        //System.out.println("");
        Scanner sc = new Scanner (System.in);
        String word, sen;
        System.out.println("Enter the string");
        sen = sc.nextLine();
        sen = new StringF ().trimr(sen);
        System.out.println("Enter the word");
        word = sc.next();
        System.out.println("Consider / Ignore Case (i/c)");
        char ic = sc.next().charAt(0);
        sc = new Scanner (sen);
        String t;
        int count=0;
        if (ic == 'c')
        {
            while (sc.hasNext())
            {
                t = sc.next();
                if (t.equals(word))
                    count++;
            }
        }
        if (ic == 'i')
        {
            while (sc.hasNext())
            {
                t = sc.next();
                if (t.equalsIgnoreCase(word))
                    count++;
            }
        }
        System.out.println("The word '" +word +"' appears " +count +" times"); 
    }
}
