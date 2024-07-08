package accessModifier1;
public class A{
int x=10;//default or package private
private int y=15;
public int z=20;
protected int w=25;
 public static void main(String[] args){
      A obj = new A();
      System.out.println(obj.x);
      System.out.println(obj.y);
      System.out.println(obj.z);//public accessible everywhere the object is available.
      System.out.println(obj.w)//protected will not be accessible outside package in non-subclass.

}
}
public class B{
 public static void main(String[] args){
      A obj = new A();
      System.out.println(obj.x);//default is accessible in same package.
      System.out.println(obj.y);//private not accessible outside the class.
}
}
package accessModifier2;
import accessModifier1.A;
public class C extends A{
     public static void main(String[] args){
       A obj = new A();
       System.out.println(obj.x);//default is not accessible outside the package.
       System.out.println(obj.z);//public accessible everywhere the object is available.
       System.out.println(childobj.w);//protected will be visible in different package in subclass,using object of subclass only.
       System.out.println(childobj.x);//Not visible
       System.out.prinln(child.y);//Not visible
}
}
public class D{
     public static void main(String[] args){
       A obj = new A();
       System.out.println(obj.x);//default is not accessible outside the package.
       System.out.println(obj.y);//private not accessible outside the class.
       System.out.println(obj.z);//public accessible everywhere the object is available.
       System.out.println(childobj.w);//protected will be visible in different package in subclass,using object of subclass only.
       System.out.println(childobj.x);//Not visible
       System.out.prinln(child.y);//Not visible
       System.out.println(obj.w)//protected will not be accessible outside package in non-subclass.
      }
}
//Encapsulation
package encapsulation;
class Demo{
   private int a;
   private int b;
   private int c;
   private int d;
   public int getA(){
     System.out.println("value of A read");
     return this.a;
  }
  public int getB(){
    System.out.println("Value of B read");
    return this.b;
}
public int getC(){//only read
      return c;
}
public int getD(){
      return d;
}
public class EncapStudy{
   public static void main(String[] args){
   //System.out.println(d.a);//not visible because private.
   public void setA(int a){
    this.a=a;
/*
if(a>100){
this.a=a;
System.out.println("Value of A changed to"+a);
}else{
System.out.println("Cannot set value outside limits");
}*/
}
public void setB(int b){
  this.b=b;
}
public void setC(int c){
  this.c=c;
}
public void setD(int d){
  this.d=d;
}

System.out.println(d.getA());
  d.setA(100);
System.out.println(d.getA());
}
}
