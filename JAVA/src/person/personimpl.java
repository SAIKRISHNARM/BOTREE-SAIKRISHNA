package person;

public class personimpl {
	public int age, dob;
	public  String name, lastname, emailid, address;
	

	public personimpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public personimpl(int age, int dob, String name, String lastname, String emailid, String address) {
		super();
		this.age = age;
		this.dob = dob;
		this.name = name;
		this.lastname = lastname;
		this.emailid = emailid;
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getDob() {
		return dob;
	}

	public void setDob(int dob) {
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "personimpl [age=" + age + ", dob=" + dob + ", name=" + name + ", lastname=" + lastname + ", emailid="
				+ emailid + ", address=" + address + "]";
	}

}
