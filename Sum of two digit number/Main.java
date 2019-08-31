#include<stdio.h>
int main()
{
  int num;
  scanf("%d",&num);
  int quo=num/10;
  int rem=num%10;
  int sum=rem+quo;
  printf("%d",sum);
  return 0;
}