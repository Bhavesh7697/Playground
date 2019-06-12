#include<stdio.h>
int main()
{
  //Type your code here
  int a,b,c,d;
 // a=789;
  //b=13;
  scanf("%d",&a);
  scanf("%d",&b);
  scanf("%d",&c);
  scanf("%d",&d);
  b=a%10;
  c=a/100;
  d=b+c;
  printf("%d",d);
  return 0;
}