package employee;

public class emplynamedetail {
	String name;
	String lastname;
	int age;
	long phone;
	long year;
	public emplynamedetail(String name, String lastname, int age, long phone, long year) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.age = age;
		this.phone = phone;
		this.year = year;
	}
	public emplynamedetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "emplynamedetail [name=" + name + ", lastname=" + lastname + ", age=" + age + ", phone=" + phone
				+ ", year=" + year + "]";
	}


}
