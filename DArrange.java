import java.util.Scanner;
class DArrange
{
    public static void main()
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the 5 word string");
         String[] array =new String[5];
         for(int i=0;i<=array.length-1;i++)
         array[i]=(sc.next().toLowerCase());
         
         String temp;
         for(int i=0;i<=array.length-2;i++)
         {
             for(int j=0;j<=array.length-2;j++)
             {
                 if(array[j].compareTo(array[j+1])<0)
                 {
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
         System.out.println("The sentence in ascending order");
         for(int i=0;i<=array.length-1;i++)
         System.out.println(" "+array[i]);
        }
    }
