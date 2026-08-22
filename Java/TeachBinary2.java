import java.util.*;

public class TeachBinary2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a[] = {17, 31, 49, 55, 64, 78, 87};
        int key;
        int first = 0;
        int last = 6;
        int mid;
        boolean found = false;

        System.out.print("Enter number to search: ");
        key = sc.nextInt();

        while(first <= last)
        {
            mid = (first + last) / 2;

            if(a[mid] == key)
            {
                System.out.println("Number found at index " + mid);
                found = true;
                break;
            }
            else if(key > a[mid])
            {
                first = mid + 1;
            }
            else
            {
                last = mid - 1;
            }
        }

        if(found == false)
        {
            System.out.println("Number not found");
        }
    }
}