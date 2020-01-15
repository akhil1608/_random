import java.util.Scanner;
class Magic
{
    public static void main (String args[])
    {
        try 
        {
            int[][] m = new int[3][3];
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter the matrix values");
            m[0][0] = sc.nextInt();
            m[0][1] = sc.nextInt();
            m[0][2] = sc.nextInt();
            System.out.print("");
            m[1][0] = sc.nextInt();
            m[1][1] = sc.nextInt();
            m[1][2] = sc.nextInt();
            System.out.print("");
            m[2][0] = sc.nextInt();
            m[2][1] = sc.nextInt();
            m[2][2] = sc.nextInt();
            System.out.print("");
            //System.out.println("Checking...");
            int asum = 15;
            int sum;
            int error;

            for (int i = 0; i < 3; i++)
            {
                sum = 0;
                for (int j = 0; j < 3; j++)
                {
                    sum = sum + m[i][j];
                }
                if (sum != asum) 
                    error = 42/0;
            }

            sum = 0;    
            for (int i = 0; i < 3; i++)
            {
                sum = 0;
                for (int j = 0; j < 3; j++)
                {
                    sum = sum + m[j][i];
                }
                if (sum != asum) 
                    error = 42/0;
            }

            sum = 0;    
            for (int i = 0; i < 3; i++)
            {
                sum = sum + m[i][i];
            }
            if (sum != asum) 
                error = 42/0;

            sum = 0;
            for (int i = 0; i < 3; i++)
            {
                sum = sum + m[i][2-i];
            }
            if (sum != asum) 
                error = 42/0;
                
            System.out.println("The matrix is a magic square");
        }
        catch (Exception e)
        {
            System.out.println("The matrix is not a maqic square");
        }
    }
}