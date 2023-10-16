/*#include<stdio.h>
//#include<conio.h>
int main()
{
    int min=0,max=0,i,size;
    printf("enter the size of array \n");
    scanf("%d",&size);
    int array[size];
printf("Enter the number to see the minimum and maxmum number \n");
//printf("enter the number ");
for(i=0;i<size;i++)
{
    scanf("%d",&size[i]);
}
max=a[0];
position=0;
for(i=0;i<size;i++)
{
    if(size[i]>max)
    {
        max=size[i];
    }
    if(size[i]<min)
    {
        min=size[i];
    }
}
printf("the largest number is %d\n",max);
printf("the smallest number is %d\n",min);
return 0;
}


#include<stdio.h>
main()
{
    int i,size,max,max2,position;
    printf("Enter size to find largest and smallest of given numbers\n");
    scanf("%d",&size);
    int a[size],temp[size-1];
    printf("Enter numbers in array\n");
    for(i=0;i<size;i++)
    {
        scanf("%d",&a[i]);
    }
    max=a[0];
    position=0;

    for(i=0;i<size;i++)//find first max number
    {
        if(a[i]>max)
        {
            max=a[i];
            position=i;
        }
    }
    for(i=0;i<size-1;i++)//deleting first maximum number in array
    {
        if(i<position)
        {
            temp[i]=a[i];
        }
        if(i>=position)
        {
         temp[i]=a[i+1];
        }

    }
    max2=temp[0];
    printf("\n");
    for(i=0;i<size-1;i++)//finding second max in the remaining elements
    {
        if(temp[i]>max2)
        {
            max2=temp[i];

        }
    }

    printf("The fisrt largest number is %d\n",max);
    printf("The second largest number is %d\n",max2);

}*/

#include<stdio.h>
main()
{
    int i,size,max=0,min=0;
    printf("Enter size to find largest and smallest of given numbers\n");
    scanf("%d",&size);
    int a[size];
    printf("Enter numbers in array\n");
    for(i=0;i<size;i++)
    {
        scanf("%d",&a[i]);
    }
    min=a[0];
    max=a[0];
    for(i=0;i<size;i++)
    {
        if(a[i]>max)
        {
          max=a[i];
        }
        if(a[i]<min)
        {
            min=a[i];
        }
    }
    printf("The largest number is %d\n",max);
    printf("The smallest number is %d\n",min);
}