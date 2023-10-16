
#include<stdio.h>
#include<conio.h>
main()
{
    int num,num1,total,add=10,super_total;
    printf("enter two number to and see total+10 \n");
    scanf("%d%d",&num,&num1);
    total=num+num1;
    super_total=total*10/100;
    printf("%d+%d=%d",num,num1,super_total);
    return 0;
    getch();
}