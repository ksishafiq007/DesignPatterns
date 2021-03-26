package singleton.pattern;

public class App {
 private static App app;
 private App() {}
 public static App getInstance() {
	 if(null==app) {
		 app=new App();	 
	 }
	 return app;
 }
 
 protected static void demoMethodCheck() {
		System.out.println("Check purpose");
	}
 
}
