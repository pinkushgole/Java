//final method and class

package Final_Keyword;

final class A {
  final void show() {
    System.out.println("hello class A");
  }
}

class B extends A// error in this line
{
  void show() {
    System.out.println("hello class B");
  }
}

public class Final_Method_Class {
  A a1=new A();
  B b1=new B();
  b1.show();
  a1.show();
}
