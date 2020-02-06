imort java.io.*;
class Fibo
{
 public static void main(String args[])
 {
  int a=0, b=1,c;
  Console c = System.in();
  int n = Integer.parseInt(c.readLine("Enter the number of series: "));
  for(int i=0; i<n; i++)
  {
   System.out.print(a+" ");
   c = a+b;
   a=b;
   b=c;
  }
 }
}
 

//Output: - 0 1 1 2 3 5 8 13
