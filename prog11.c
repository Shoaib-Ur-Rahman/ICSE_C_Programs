#include <stdio.h>

int main()
{
    int a[5];
    for(int  i=0; i<=4; i++)
    {
        printf("Enter value of array \n");
        scanf("%d",&a[i]);
    }
    int sum=0;
    for(int  i=0; i<=4; i++)
    {
        sum=sum+a[i];
    }
    printf("Sum %d \n", sum);
}