import java.util.*;
class Conversion
{
public static void main(String[] args)
{
String str;
int d,n;
Scanner sc=new Scanner(System.in);
System.out.print("enter  decimal no =");
d=sc.nextInt();
System.out.println("1.Decimal to Binary\n2.Decimal to Octal\n3.Decimal to Hexa");
n=sc.nextInt();
switch (n)
{
case 1: str=Integer.toBinaryString(d);
              System.out.println("decimal to binary is"+str);
              break;
 case 2: str=Integer.toOctalString(d);
                System.out.println("decimal to octal is"+str);
                break;
case 3: str=Integer.toHexString(d);
                System.out.println("decimal to hexa is"+str);
                break;
default :
            System.out.println("enter correct choice");
}}}