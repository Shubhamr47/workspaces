#include<stdio.h>
#include<conio.h>
main()
{
    int b;
    int size,i,j;
    printf("enter the size of array \n");
    scanf("%d",&size);
     int array[size];//size = 5;
     printf("%d",array[2]);
     printf("enter the number in array \n");
     for(i=0;i<=size;i++)
     {                                                                
     scanf("%d",&array[i]);//50 :0, 88: 1, 54: 2,                    
     }
     printf("say b ke which number you want to delete \n");
     scanf("%d",&b);
     printf("result\n");
     for(i=0;i<=size;i++)
     if(b!=array[i])
     printf("%d\n",array[i]);
}





