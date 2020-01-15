
public class CallbyReference {
public static void main(String[] args) {
	Hai3 h=new Hai3();
	Hello3 h1=new Hello3();
	System.out.println(h.a);
	h1.m1(h);
	System.out.println(h.a);
}
}
class Hello3{
	void m1(Hai3 h){
		System.out.println(h.a);
		h.a=h.a+11;
		System.out.println(h.a);
	}
}
class Hai3{
	int a;
}
