#include <stdio.h>

int main()
{
    int arr[5]={5, 2, 8, 1, 9};
    int sum=0;
    int max=arr[0];
    for (int i=0; i<=4; i++)
    {
        sum=sum+arr[i];
    }
    printf("The Sum Of the Arrar Is %d \n", sum);
    for (int i=1; i<=4; i++)
    {
        if(arr[i]>max)
        {
        max=arr[i];
        }
    }
    printf("The Max Of The Array Is %d \n", max);
    for (int i=4; i>=0; i--)
    {
    printf("%d\n",arr[i]);
    }
    return 0;
}