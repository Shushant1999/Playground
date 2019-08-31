#include <stdio.h>
int main() {
	char char1;
  scanf("%c",&char1);
  int a=char1;
 if(a>=65 && a<97)
  {
    a=char1+32;
  }
  else
  {
    a=char1-32;
  }
  printf("%c",a);
	return 0;
}