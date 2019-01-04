#include<stdio.h>
int main()
{
    int a,b,s,MaiorAB,MaiorAB1;
    scanf("%d%d%d",&a,&b,&s);

    MaiorAB=(a+b+abs(a-b))/2;
    MaiorAB1=(b+s+abs(b-s))/2;

    if(MaiorAB>MaiorAB1)
    {
        printf("%d eh o maior\n",MaiorAB);
    }
    else
    {
        printf("%d eh o maior\n",MaiorAB1);
    }

    return 0 ;

}
