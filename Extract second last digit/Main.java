#include<stdio.h>
int main()
{
  int num;
  scanf("%d",&num);
  int rem=num%100;
  int quo=rem/10;
  printf("%d",quo);
  return 0;
}