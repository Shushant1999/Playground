#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  int quot=a/100;
  int rem=a%10;
  int sum=quot+rem;
  printf("%d",sum);
  return 0;
}