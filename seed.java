import java.io.*;
import java.util.*;
class seed
{
 public static void main(String args[])
 {
  int j;
  Scanner s=new Scanner(System.in);
  String s1=s.next();
  String s2=s.next();
  int i=Integer.parseInt(s1);
  int a=i;
  System.out.println(n);
  for(j=0;j<s1.length();j++)
  {
   a=a*Character.getNumericValue(s1.charAt(i));
   System.out.println(a);
  }
  String e=String.valueOf(a);
  if(e.equals(s2))
    System.out.println("seed");
  else
   System.out.println(" not a seed");
 }
}
