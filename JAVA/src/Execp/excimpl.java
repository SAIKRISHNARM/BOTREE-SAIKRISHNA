package Execp;

public class excimpl {
	public static void main (String[] args) {
		logiclas lo = new logiclas();
		try {
			lo.number();
		}
		catch (myownexp m)
		{
			System.out.println(m);
		}

}
}