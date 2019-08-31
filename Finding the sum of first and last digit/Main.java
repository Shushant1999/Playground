#include <stdio.h>
int main() {
  int num,first_digit;
  scanf("%d",&num);
  int rem=num%10;
  while(num>0)
  {
    first_digit=num%10;
    num=num/10;
  }
  int sum=rem+first_digit;
  printf("%d",sum);
	return 0;
}