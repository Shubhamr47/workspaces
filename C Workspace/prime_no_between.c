#include<stdio.h>
#include<conio.h>
main()
{
    int i,j,a,b,prime,l;
    printf("Enter two number");
    scanf("%d%d",&a,&b);
    for(i=a+1;i<=b-1;i++)
    {
      //  prime=0;
        for(j=2;j<i;j++)
        if(i%j==0)
        break;
        if(j==i)
      //  prime++;
      // printf("%d ",primr);
       // prime = i;
        printf("  %d",i);
       // printf("\n");
    }
}