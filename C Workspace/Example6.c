#include<stdio.h>
#include<conio.h>
main(){
int num,num1,i,s;
for(num=i;num<=1000;num++)
{
    s=0;
    num1=num;
    while(num1>0)
    {
        i=num1%10;
        s=s+(i*i*i);
        num1=num1/10;
    }
    if(s==num)
    printf("%d",num);
}
getch();
}