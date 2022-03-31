package JFS.Productapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class NormalCCL {
	@Value("sai")
	public String val;
	
	@Autowired
	normalauto auto;
	@Autowired
	interimplclass inter;
	@Autowired
	@Qualifier("normalauto")
	NormalInterface norin;
	
	
	public void displaycallC() {
		int i =5;
		int j= 4;
		int res =i+j;
		System.out.println(res);
		auto.normalautoCC();
		auto.myinterbook();
		inter.myinterbook();
		norin.myinterbook();
	}

}
