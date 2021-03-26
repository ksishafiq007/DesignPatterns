package singleton.pattern;

public class Main {

	public static void main(String[] args) {
	 App app=App.getInstance();
	 App app2=App.getInstance();
      app.demoMethodCheck();
	}
	
}
