import java.util.*;
class Bubble
{
    public static void main(String[] args)
    {
        Scanner Sc=new Scanner(System.in);
        int a[]=new int[5];
        int temp;
        System.out.println("Enter Array");
        for(int i=0; i<5; i++)
            a[i]=Sc.nextInt();
        for(int j=0;j<5; j++)
        {
            for(int k=0; k<5-j-1; k++)
                {
                    if(a[k]>a[k+1])
                    {
                        temp=a[k];;
                        a[k]=a[k+1];
                        a[k+1]=temp;
                    }
                }
        }
        System.out.println("Sorted Array");
        for(int i=0; i<5; i++)
            System.out.print(a[i]+" ");
    }
}