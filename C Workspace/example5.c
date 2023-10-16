#include<stdio.h>
#include<conio.h>
main()
{
    int a,b,i,j;
    printf("enter the number to see the number is prime or not");
    scanf("%d",&b);
    for(i=2;i<=b-1;i++)
    if(b%i==0)
    break;
    if(i==b)
    printf("%d is a prime number",b);
    else
    printf("%d is not a prime number",b);
}