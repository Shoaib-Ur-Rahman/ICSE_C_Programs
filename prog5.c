#include <stdio.h>

int multiply(int a, int b)
{
    return a * b;
}

int main()
{
    int num1, num2;
    printf("Enter Number 1\n");
    scanf("%d", &num1);
    printf("Enter Number 2\n");
    scanf("%d", &num2);

    int prod = multiply(num1, num2);
    printf("The Product Of The Numbers Is %d\n", prod);
    return 0;
}
