 /*#include<stdio.h>
 #include<conio.h>
    int sum_of_dig(int x)
    {
        int s=0,digit;
        while(x>0)
        {
            digit=x%10;
        s=s+digit;
        x=x/10;
    }
    return s;
 }
 int main()
 {
    int n,sum,i;
    printf("enter the number\n");
    scanf("%d",&i);
    for(n=1;n<=i;n++)
    {
    sum=sum_of_dig(i);
    while(sum>0 && sum>9)
    {
        sum=sum_of_dig(sum);
    }
    if(sum==1)
    printf("the given number %d is magic number and sum value is ",sum);
    else
    printf("the given number %d is not a magic number and sum value is ",sum);
    return 0;
 }
 }
 */

 #include<stdio.h>
 #include<conio.h>
    int sum_of_dig(int x)
    {
        int s=0,digit;
        while(x>0)
        {
            digit=x%10;
        s=s+digit;
        x=x/10
         }
    return s;
 }
  int main()
 {
    int n,sum,i,j;
    printf("enter the number\n");
    scanf("%d",&n);
    for(n=1;n<=i;n++)
    {
    sum=sum_of_dig(n);
    while(sum>0 && sum>9)
    {
        sum=sum_of_dig(sum);
    }
    if(sum==1)
    printf("the given number %d is magic number and sum value is %d ",n,sum);
    else
    printf("the given number %d is not a magic number and sum value is %d ",n,sum);
    return 0;
  }
 }