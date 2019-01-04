#include<stdio.h>
int main()
{
    int NUMBER ,worked_hours ;
    float SALARY ,U$ ;
    scanf("%d",&NUMBER);
    scanf("%d",&worked_hours);
    scanf("%f",&U$);

    SALARY = worked_hours * U$ ;

    printf("NUMBER = %d\n",NUMBER);
    printf("SALARY = U$ %.2f\n",SALARY);

    return 0 ;
}
