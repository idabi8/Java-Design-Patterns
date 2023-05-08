package designPatterns.singleton;

public class Singleton {

	private static Singleton instance = null;

	private Singleton() {
//		System.out.println("Singleton");
	}

	public static Singleton getInstance() {

		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null)
					instance = new Singleton();
			}
		}
		
		return instance;		
	}
}
