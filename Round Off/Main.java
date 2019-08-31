#include<stdio.h>
int main()
{
  //fill your c
  float f;
  scanf("%f",&f);
  float g=floor(f);
  float k=ceil(f);
  printf("%.f\n%.1f\n%.1f",f,k,g);
}