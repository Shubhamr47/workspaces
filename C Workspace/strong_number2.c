#include<stdio.h>
#include<conio.h>
main(){
    int i,n,temp,sum=0,fact,rem,j;
    printf("Enter the number\n");
    scanf("%d",&n);
    temp=n;
    for(j=1;j<=n;j++){
    //temp=n;
while(j>0){
    i=1;
    fact =1;
    rem=j%10;
    while(i<=rem){
        fact=fact*i;
        i++;
    }
    sum=sum+fact;
    j=j/10;
}
    if(sum==temp){
        printf("%d\n",&sum);
    }
    else{
        printf("%d \n",&sum);
    }
    }
return 0;
}