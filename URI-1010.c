#include<stdio.h>
int main()
{
    int code1,units1,code2,units2 ;
    float price1 ,price2, Valor_a_pagar ;

    scanf("%d %d %f", &code1,&units1,&price1);
    scanf("%d %d %f", &code2,&units2,&price2);

    Valor_a_pagar = (price1*units1) + (price2*units2) ;
    printf("VALOR A PAGAR: R$ %.2f\n",Valor_a_pagar);

    return 0 ;

}
