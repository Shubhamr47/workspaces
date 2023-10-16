#include<stdio.h>
#include<conio.h>
int main()
{
    int m1,m2,m3,m4,total,total_m,need_marks;
    int i=3;
    for (int j=0; j<=i; j++){
    printf("enter the subject number\n");
    if (j==0){
        scanf("%d",&m1);
    }
    else if(j==1){
        scanf("%d",&m2);
    }
    else if (j==2){
        scanf("%d",&m3);
    }
    else if (j==3){
        scanf("%d",&m4);
    }
    }
    // printf("enter the subject number");
    // scanf("%d",&m1);
    //  printf("enter the subject number");
    // scanf("%d",&m2);
    //  printf("enter the subject number");
    // scanf("%d",&m3);
    //  printf("enter the subject number");
    // scanf("%d",&m4);
    //  printf("enter the subject number");
    // scanf("%d",&m5);
    total_m=m1+m2+m3+m4;
    total=total_m*100/500;
    //for devision
    if(total>=60)
    {
        printf("1st devidion \n");
    }
    else if(total >45)
    {
        printf("second devision\n");
    }
    else if(total >30)
    {
        printf("third devision\n");
    }
    else
    need_marks=150-total_m;
    printf("fail\n");
    printf("need the marks for pass is %d",need_marks);


    //printf("%d+%d+%d+%d+%d=%d",total);
}