import java.io.*;
import java.util.*;
class complete
{
 public static void main(String args[])
 {
  int i,j,flag=0;
   String e="";
  Scanner s=new Scanner(System.in);
  char c[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
  String b=s.nextLine();
  String ss[]=b.split(" ");
  for(i=0;i<ss.length;i++)
     e=e.concat(ss[i]);
 if(e.length()>=26)
 {
  for(i=0;i<26;i++)
  {
    char r=c[i];
    for(j=0;j<e.length();j++)
    {
     if(r==e.charAt(j))
     {
      count=count+1;
      break;
     }
    }
  }
  if(flag==26)
   System.out.println("full string");
  else
    System.out.println("not full string");
 }  
 else
  System.out.println("not full string");
 }
}
