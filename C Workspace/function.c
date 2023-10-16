
#include<stdio.h>  
void                                       
{  
     int a,b,s;  
    printf("\nEnter two numbers");    
    scanf("%d %d",&a,&b);   
    printf("The sum is %d",a+b);  
}
 
void substraction()
{

    int a,b,sub;
printf(" enter two number for substraction\n");
scanf("%d%d",&a,&b);
sub=a-b;
printf("substraction of %d-%d=%d",a,b,sub);
}
void  multiplication()
{
    int a,b, mul;
printf(" enter two number for  multiplication\n");
scanf("%d%d",&a,&b);
mul=a*b;
printf(" multiplication of %d*%d=%d",a,b,mul);
}
 void division ()
{
    int a, b, div;
printf(" enter two number for  division\n");
scanf("%d%d",&a,&b);
div=a/b;
printf(" division of %d/%d=%d",a,b,div);
}

int main()  
{  
    int user_input;
    printf( "\nChose The below options \naddtion - 1 \nsubstraction - 2 \nMultiplication - 3 \nDivision - 4 \nenter your choice\n");  
    scanf("%d",&user_input);

    if (user_input == 1)
    {
        addition();
    }
    else if (user_input == 2){
        substraction();
    }
    else if (user_input == 3){
        multiplication();
    }
    else if (user_input == 4){
      division();
    } 
    
}  


