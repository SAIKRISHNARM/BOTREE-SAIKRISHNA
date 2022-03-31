package person;

public class arrimpl { 
	int age , year ;
	String name,lastname;
	public arrimpl(int age, int year) {
		this.age = age;
		this.year = year;
		//System.out.println("A ="+age +"Y ="+year);
	}
	

	public arrimpl(int age, int year, String name, String lastname) {

		this.age = age;
		this.year = year;
		this.name = name;
		this.lastname = lastname;
	}


	@Override
	public String toString() {
		return "arrimpl [age=" + age + ", year=" + year + ", name=" + name + ", lastname=" + lastname + "]";
	}
	


}
