#include <stdio.h>

int main()
{
    int arr[5]={5,8,6,9,2};
    for(int i=0;i<=4;i++)
    printf("The value of array is %d \n",arr[i]);
    int sum=0;
    for(int j=0; j<=4; j++)
    sum=sum+arr[j];
    printf("The sum %d \n",sum);
    return 0;
}
