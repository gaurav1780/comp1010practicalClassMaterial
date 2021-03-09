package lectureCodes.week03.classesObjects1.navigation;

class A {
   public B b;
   public int m0() {
      return b.m1() * b.c.m2();
   }
}
class B {
   public C c;
   public int m1() {
      return c.m2() * c.m2();
   }
}
class C {
   public int d;
   public int m2() {
      return d*d;
   }
}
public class Client {
   public static void main(String[] args) {
      C objC = new C();
      objC.d = 5;
      B objB = new B();
      objB.c = objC;
      A objA = new A();
      objA.b = objB;
      System.out.println(objA.m0());
      System.out.println(objA.b.m1());
      System.out.println(objA.b.c.m2());
   }
}
