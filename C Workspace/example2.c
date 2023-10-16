#include<stdio.h>
#include<conio.h>
main()
{
    int a,i;
    printf("enter a number and see the ascending order");
    scanf("%d",&a);
    for(i=1;i<=a;i++)
    {
        printf("%d",i);
        printf("\n");
    }
    return 0;
    getch();
}