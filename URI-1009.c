#include<stdio.h>
int main()
{
    char ch ;
    double salary , sold,TOTAL ;
    scanf("%s",&ch);
    scanf("%lf",&salary);
    scanf("%lf",&sold);

    TOTAL = salary+((sold/100)*15) ;

    printf("TOTAL = R$ %.2lf\n",TOTAL);

    return 0 ;
}
