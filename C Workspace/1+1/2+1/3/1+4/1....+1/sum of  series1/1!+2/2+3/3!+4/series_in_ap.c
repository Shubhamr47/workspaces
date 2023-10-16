#include<stdio.h>
#include<conio.h>
main()
{
    int a,input1,input2;
    printf("Enter two number to find comman difference\n");
    scanf("%d%d",input1,input2);
    for(a=input1;a<=input2;a=a+3)
    {
        printf("%d\t",a);
    }
    return(0);
}
