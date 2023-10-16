/*#include<stdio.h>
#include<conio.h>
main()
{
    int i,size,pos=0,neg=0;
    printf("Enter the size of array\n");
    scanf("%d",&size);
    int array[size];
    printf("Enter the number to see the positive and negative number \n");
    for(i=0;i<size;i++)
    {
        scanf("%d",&array[i]);
    }
    for(i=0;i<size;i++)
    {
        if(array[i]>0)
        pos+=array[i];
        if(array[i]<0)
        neg+=array[i];
    }
    printf("the sum of positive integers is %d\n",pos);
    printf("the sum of negative integers is %d\n",neg);

}*/
#include<stdio.h>
#include<conio.h>
main()
{
    int pos=0,neg=0,size,i;
    printf("Enter the size of array\n");
    scanf("%d",&size);
    int array[size];
    printf("enter the number to see the positive and negative number \n");
    for(i=0;i<size;i++)
    {
        scanf("%d",&array[i]);
    }
    for(i=0;i<size;i++)
    {

        if(array[i]>0)
        pos+=array[i];
        if(array[i]<0)
        neg+=array[i];
    }
    printf("the sum of positive integer is %d\n",pos);
    printf("the sum of negative integers is %d\n",neg);
}