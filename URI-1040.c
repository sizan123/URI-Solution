#include <stdio.h>
int main() {
    float N1 ,N2 , N3 , N4 ,Media , extra ,final ;
    scanf("%f %f %f %f",&N1,&N2,&N3,&N4);
    
    Media=((N1*2)+(N2*3)+(N3*4)+(N4*1))/10;
    printf("Media: %.1f\n",Media);
    
    if (Media>7.0)
    {
        printf("Aluno aprovado.\n");
    }
    else if(Media<5.0)
    {
        printf("Aluno reprovado.\n");
    }
    else if(Media<6.9 && Media >= 5.0)
    {
        printf("Aluno em exame.\n");
        scanf("%f",&extra);
        printf("Nota do exame: %.1f\n",extra);
        final=(Media+extra)/2;
        if(final >= 5.0)
        {
            printf("Aluno aprovado.\n");
        }
        else if (final<=4.9)
        {
            printf("Aluno reprovado.\n");
        }
        printf("Media final: %.1f\n",final);
    }
    return 0;
}
