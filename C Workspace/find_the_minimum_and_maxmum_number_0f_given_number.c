#include<stdio.h>
#include<conio.h>
main()
{
    int min=0,max=0,i,size;
    printf("enter the size of array \n");
    scanf("%d",&size);
    int array[size];
printf("Enter the number to see the minimum and maxmum number \n");
for(i=0;i<size;i++)
{
    scanf("%d"&size[i]);
}
for(i=0;i<size;i++)
{
    if(size[i]>max)
    {
        max+=size[i];
    }
    if(size[i]<min)
    {
        min+=size[i];
    }
}
printf("the largest number is %d\n",max);
printf("the smallest number is %d\n",min);
}