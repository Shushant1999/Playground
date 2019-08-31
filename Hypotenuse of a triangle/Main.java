#include<stdio.h>
#include<math.h>
int main()
{
  float a,b;
  scanf("%f%f",&a,&b);
  float hy=sqrt(a*a+b*b);
  printf("%0.2f",hy);
  return 0;
}