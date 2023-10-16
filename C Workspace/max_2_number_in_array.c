#include<stdio.h>
int main()
{
    int min,max,max2,i;
    int location;
    int size;
    printf("enter the size of array \n");
    scanf("%d",&size);
    int array[size];
    
printf("Enter the number to see the minimum and maxmum number \n");
for(i=0;i<size;i++)
{
    scanf("%d",&array[i]);
}
max=array[0];
min=array[0];

for(i=0;i<size;i++)
{
    if(array[i]>max)
    {
        max=array[i];
    }
    if(array[i]<min)
    {
        min=array[i];

    }

}
int reference = max;
// int p = 0;
for ( int j=0; j< reference; j++)
{
    max=max-1;
    for (i=0 ; i < size; i++)
    {
        if (array[i]==max &&  array[i]>min && array[i]<reference)
        {
            max2=array[i];
            j=reference;
            // p =100;
            i=size;
            break;
        }
        // if else(p==100)
        // break;
    
        //  break;
    }

}

printf("\nthe largest number is %d\n",reference);
printf("the smallest number is %d\n",min);
printf("second last max no : %d\n",max2);
}