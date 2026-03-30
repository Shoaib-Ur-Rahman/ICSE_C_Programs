#include <stdio.h>

int loop(int n)
{
    int s=0,d=0;
    while(n!=0)
    {
        d=n%10;
        s=s+d;
        n=n/10;
    }
    return s;
}
int main()
{
    int num;
    printf("Enter Number\n");
    scanf("%d", &num);
    int sum = loop(num);
    printf("The Sum Of Digits Is %d\n", sum);
    return 0;
}