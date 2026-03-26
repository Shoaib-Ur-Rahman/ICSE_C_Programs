#include <stdio.h>

int findSum(int arr[5])
{
    int sum=0;
    for (int i=0; i<5; i++)
    sum=sum+arr[i];
    return sum;
}
int findMax(int arr[5])
{
    int max=arr[0];
    for (int i=1; i<5; i++)
    {
        if (max<arr[i])
        max=arr[i];
    }
    return max;
}
void printReverse(int arr[])
{
    for (int i=4; i>=0; i--)
    printf("%d \n", arr[i]);
}
int main()
{
    int a[5]={5, 2, 8, 1, 9};
    int sum=findSum(a);
    printf("Sum %d \n", sum);
    int max=findMax(a);
    printf("Max %d \n", max);
    printReverse(a);
    return 0;
}