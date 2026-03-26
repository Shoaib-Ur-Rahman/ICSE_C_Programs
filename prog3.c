#include <stdio.h>

void sum(int a, int b)
{
    printf("The Sum Is %d\n", a+b);
}
int main()
{
    int num1;
    int num2;
    printf("Enter Number 1\n");
    scanf("%d", &num1);
    printf("Enter Number 2\n");
    scanf("%d", &num2);
    sum(num1, num2);
    return 0;
}