#include<stdio.h>
main(){
    int n,m,sum=0,temp;
    printf("Enter the number=");
    scanf("%d",&n);
    temp=n;
    while(n>0) {
        m=n%10;
        sum=sum+(m*m*m);
        n=n/10;
    }
    if(temp==sum){
        printf("ishu gadhi hai ");
    }
    else{
        printf(" ishu gadhi nahi hai");
    }
   // return 0;
}

/*#include<stdio.h>  
 int main()    
{    
int n,r,sum=0,temp;    
printf("enter the number=");    
scanf("%d",&n);    
temp=n;    
while(n>0)    
{    
r=n%10;    
sum=sum+(r*r*r);    
n=n/10;    
}    
if(temp==sum)    
printf("armstrong  number ");    
else    
printf("not armstrong number");    
return 0;  
}   */