#include <stdio.h>
int main()
{
  int i,n,mul=1,m;
  scanf("%d%d",&n,&m);
  if(m>=0)
  {
  for(i=1;i<=m;i++)
  {
    mul=mul*n;
  }
    printf("%d",mul);
  }
    else
    {
      printf("Wrong input");
    }
return 0;
}