#include<stdio.h>
#include<conio.h>

main()
{
    int a[10],i,sum=0;
    float avg;
    printf("Enter ten number \n");
    for(i=0;i<=9;i++)
    scanf("%d",&a[i]);

    for(i=0;i<=9;i++)
    sum=sum+a[i];

    avg=sum/10.0;
    printf(" sum of number is %d",sum);
    printf("average is %f",avg);
    getch();
    
}
/*
#include<stdio.h>
#include<conio.h>
#include<math.h>
main()
{
    int a[5],sum=0;
    printf("enter two number to add\n");
    scanf("%d%d",&a[0],&a[1]);
    a[3]=a[0]+a[1];
    printf(a[3]);
    getch();

}*/