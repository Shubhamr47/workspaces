#include<stdio.h>
#include<conio.h>
main()
{
    int marks;
    printf("Enter a number to find the result");
    scanf("%d",&marks);
    if(marks>=60)
    {
        printf("1st devision");
    }
    else
    {
        printf("pass");
    }
    getch();
    return 0;
}