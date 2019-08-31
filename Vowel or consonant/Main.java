#include<stdio.h>
int main()
{
  char char1;
  scanf("%c",&char1);
  if(char1=='a' ||char1=='e' ||char1=='i' ||char1=='o' ||char1=='u' ||char1=='A' ||char1=='E' ||char1=='I' ||char1=='O' ||char1=='U')
    printf("Vowel");
  else
    printf("Consonant");
  return 0;
}