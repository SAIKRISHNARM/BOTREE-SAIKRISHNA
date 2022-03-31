package corejava;

public interface privatepro {
	public abstract void abmethod();

	private static void privateone() {
		System.out.println(" private one inside iruku");

	}

	public default void defmetho() {
		privateone();

	}

	public static void statime() {
		privateone();
	}

}
