#include<stdio.h>
int main()
{
    int  odd,even,input,i,size;
    printf("enter the size of array \n");
    scanf("%d",&size);
    int array[size];
    
printf("Enter the number to see the odd and even number \n");
for(i=0;i<size;i++)
{
    scanf("%d",&array[i]);
}
int k=0;
int l = 0;
int oddarray[l];
int evenarray[k];
for(i=0;i<size;i++)
{
     if(array[i]%2==0)
    {
        evenarray[k] = array[i];
        k=k+1;
    }
    else 
    {
        oddarray[l] = array[i];
        l=l+1;
    }
  
}   printf("odd no that you have entered:");
    for(int t=0; t<l; t++){
            printf(", %d",oddarray[t]);
    }
        printf("\neven no that you have entered:");
        for(int p=0; p<k; p++){
            printf(", %d",evenarray[p]);
    }
}
