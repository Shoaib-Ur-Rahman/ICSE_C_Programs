import java.util.*;
class Binary
{
    void main()
    {
       Scanner Sc=new Scanner(System.in); 
       int key, first, mid, last;
       boolean flag=false;
       int a[]=new int[7];
       System.out.println("Enter Values of the array in ascending order");
       for(int i=0; i<7; i++)
       {
        a[i]=Sc.nextInt();
       }
       System.out.println("Enter the searching element");
       key=Sc.nextInt();
       first=0;
       last=6;
       while(first<=last)
       {
        mid=(first+last)/2;
        if(a[mid]==key)
        {
            System.out.println("Value Found At Index "+mid);
            flag=true;
            break;
        }
        else if(a[mid]<key)
        {
            first=mid+1;
        }
        else if(a[mid]>key)
            last=mid-1;
        }
        if(flag==false)
            System.out.println("Number Not Found");
    }
}
