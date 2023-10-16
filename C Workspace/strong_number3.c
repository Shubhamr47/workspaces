#include<stdio.h>
main()
{
    int num,sum=0,fact,rem,i,temp;
    printf("enter the number \n");
    scanf("%d",&num);
    temp=num;
    while(num>0){
     i=1;
     fact=1;
     rem=num%10;
     while(rem>=i){
         fact=fact*i;
         i++;
     }
     sum=sum+fact;
     num=num/10;
    }
     if(sum==temp){
         printf("strong number\n");
     }
     else{
         printf("not strong number\n");
     }
    
   return 0;
}