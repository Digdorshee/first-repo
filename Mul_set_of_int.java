import java.lang.*;
import java.util.*;
class D
{
int val=1;
public void mul(int ...n)
{
for(int i:n)
{
val=val*i;
}
System.out.println("the mul value is:"+val);
}
}

class Mul_set_of_int
{
public static void main(String args[])
{
System.out.println("enter the  numbers for multiplication:");
D obj=new D();
obj.mul(2,3,4,5,6,7,8,9);
}
}