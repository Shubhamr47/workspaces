#include<stdio.h>
#include<conio.h>
main(){
    int num,add,i,sum=0;
    printf("enter a number to know whether num is loda hai ya nahi \n");
    scanf("%d",&num);
    for(i=1;i<num;i++)
    {
        if(num%i==0)
        {
            add= add+i;
        }
    }
    if(sum==add){
        printf("the given number %d is per\n",num);
    }
    else{
        printf("the given number %d is not per\n",num,add);
    }
}