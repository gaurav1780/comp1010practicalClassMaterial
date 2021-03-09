package lectureCodes.week04.classesObjects2.navigation;

class A {
   public B[] b;
   
   public A(B[] b) {
	   this.b = b;
   }
   
   public int m0() {
      int result = 0;
      for(int i=0; i < b.length; i++) {
    	  result+=b[i].m1()*b[i].c.m2();
      }
      return result;
   }
}

class B {
   public C c;
   
   public B(C c) {
	   this.c = c;
   }
   
   public int m1() {
      return c.m2() * c.m2();
   }
}
class C {
   public int d;
   
   public C(int d) {
	   this.d = d;
   }
   
   public int m2() {
      return d*d;
   }
}

public class Client {
   public static void main(String[] args) {
      B[] bSet = new B[10];
      for(int i=0; i < bSet.length; i++) {
    	  C objC = new C(i+1);
          bSet[i] = new B(objC);
      }
      
      A objA = new A(bSet);
      System.out.println(objA.m0());
      System.out.println(objA.b[1].m1());
      System.out.println(objA.b[4].m1());
      System.out.println(objA.b[8].c.m2());
   }
}
