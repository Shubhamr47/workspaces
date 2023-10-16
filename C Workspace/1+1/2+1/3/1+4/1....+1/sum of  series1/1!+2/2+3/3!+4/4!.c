#include<stdio.h>
#include<conio.h>
main()
{
    int i,n;
    float sum=0;
    printf("Enter the value of n\n");
    scanf("%d",&n);

    for(i=1;i<=n;i++)
    {
        sum+=(float)i/factorial(i);
    }
    printf("the value of\n");
    for(i=1;i<=n;i++);
    {
        if(i<n)
        {
            printf("%d/%d!+",i,i);
        }
        else
        {
            printf("%d/%d!=",i,i);
        }
    }
    printf("%f\n",sum);
}
int factorial (int num)
{
    int i,fact=1;
    for(i=1;i<=num;i++)
    {
        fact =fact *i;
    }
    return(fact );
}