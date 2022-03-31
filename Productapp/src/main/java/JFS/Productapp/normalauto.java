package JFS.Productapp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class normalauto implements NormalInterface {
	public void normalautoCC() {
		System.out.println("auto");
	}

	public void myinterbook() {
		// TODO Auto-generated method stub
		System.out.println("implement inside auto");
		
	}

}
