#include <stdio.h>

int findSum(int arr[], int n)
{
    arr[n];
    int sum=0;
    for (int i=0; i<5; i++)
    sum=sum+arr[i];
    return sum;
}
int findMax(int arr[], int n)
{
    arr[n];
    int max=arr[0];
    for (int i=1; i<5; i++)
    {
        if (max<arr[i])
        max=arr[i];
    }
    return max;
}
void printReverse(int arr[], int n)
{
    for (int i=--n; i>=0; i--)
    printf("%d \n", arr[i]);
}
int main()
{
    int n=5;
    int a[5]={5, 2, 8, 1, 9};
    int sum=findSum(a,n);
    printf("Sum %d \n", sum);
    int max=findMax(a,n);
    printf("Max %d \n", max);
    printReverse(a,n);
    return 0;
}