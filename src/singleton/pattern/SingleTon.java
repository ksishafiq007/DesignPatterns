package singleton.pattern;

public class SingleTon {
 private static SingleTon singleTon=new SingleTon();
 private SingleTon() { }
 public static SingleTon getInstance() {
	 return singleTon;
 }
 protected static void demoMethod() {
		System.out.println("Demo method for Single ton check");
	}
}
