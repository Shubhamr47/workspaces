#include<stdio.h>
#include<conio.h>
void main()
{
    int d,input;
    int i,j;
    printf("enter the size of array \n");
    scanf("%d",&input);
    int size=input-1;
     int array[size];
     printf("enter the number in array \n");
     for(i=0;i<=size;i++)
     {
     scanf("%d",&array[i]);
     }

     printf("say b ke which number you want to delete \n");
     scanf("%d",&array[size+1]);
     printf("result\n");
     for(i=0;i<=size+1;i++)
     printf("%d\n",array[i]);
     


}