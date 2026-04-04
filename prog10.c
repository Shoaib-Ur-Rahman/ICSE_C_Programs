#include <stdio.h>

int main()
{
    int arr[5]={5,8,6,9,2};
    for(int i=1;i<=5;i++)
    printf("The value of array is %d \n",arr[i]);
    int sum=0;
    for(int j=1; j<=5; j++)
    sum=sum+arr[j];
    printf("The sum %d \n",sum);
    return 0;
}
