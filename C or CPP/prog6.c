#include <stdio.h>

int max(int a, int b)
{
    if(a>b)
    return a;
    else
    return b;
}
int main()
{
    int num1, num2;
    printf("Enter Number 1\n");
    scanf("%d", &num1);
    printf("Enter Number 2\n");
    scanf("%d", &num2);
    int big=max(num1, num2);
    printf("The Max Of the two numbers is %d\n", big);
    return 0;
}