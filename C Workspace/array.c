#include<stdio.h>
main()
{
    int i,j,sum=0,num;
    float avg;
    printf("Enter numbrer of student in class \n");
    scanf("%d",&num);
    int marks[num];
    printf("enter marks of all students\n");
    for(i=0;i<num;i++)
    {
        scanf("%d",&marks[i]);
        sum+=marks[i];
    } avg=(float)sum/num;
    printf("average of class is %f\n",avg);
}
/*.
#include<stdio.h>
// #include<conio.h>
void main()
{
//clrscr();
int num[3][3],i,j;

printf("enter the number to store in array\n");
for(i=0;i<3;i++)
{
    for(j=0;j<3;j++)

    scanf("%d",&num[i][j]);
}

      //  clrscr();
        printf(" number you have enterd are :-\n");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            printf(" %d  ",num[i][j]);
            
        }
        // getch();
    
}
*/