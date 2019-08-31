#include <stdio.h>
int main() {
  int num,first_digit;
  scanf("%d",&num);
  while(num>99)
  {
    num=num/10;
  }
  int rem=num%10;
  printf("%d",rem);
	return 0;
}