#include <stdio.h>

int min(int a, int b)
{
    if (a>b)
    return b;
    else 
    return a;
}
int max(int c, int d)
{
    if (c>d)
    return c;
    else
    return d;
}
int main()
{
    int num1, num2, num3, num4;
    printf("Enter The 2 Numbers of which to Find Min\n");
    scanf("%d", &num1);
    scanf("%d", &num2);
    printf("Enter The 2 Numbers Of Which to find max\n");
    scanf("%d", &num3);
    scanf("%d", &num4);
    int minimum= min(num1, num2);
    int maximum= max(num3, num4);
    printf("Min:%d\n", minimum);
    printf("Max:%d\n",maximum);
    return 0;
}