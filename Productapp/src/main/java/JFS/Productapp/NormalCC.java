package JFS.Productapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NormalCC {
	@Value("#{20+1}")
	private int x;
	@Value("#{'sai'+'krishna'}")
	private String va;
//	@Value("#{NormalCCL.val?.toUpperCase()}")
//	public String last;
	
	
	public void displaycall() {
		System.out.println(x);
		System.out.println(va);
		//System.out.println(last);
	}

	public void displaycallo() {
		System.out.println("Normal 1 class for display");
	}

	public void displaycalls() {
		System.out.println("Normal 2 class for display");
	}
}
