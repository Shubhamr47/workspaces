#include<stdio.h>
main(){
    int a,b,sum=0,temp;
    printf("enter the number ==   ");
    scanf("%d",&a);
    temp=a;
    while(a>0){
        b=a%10;
        sum=sum*10+b;
        a=a/10;
    }
    if(sum==temp){
        printf("ishu pagli hai ");
    }
        else{
        printf(" ishu pagali nahi hai");
        }
    
}