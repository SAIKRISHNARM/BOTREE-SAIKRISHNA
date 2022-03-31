package JFS.JHS_HIBERNATE;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Person {
	@Id
	private int id;
	private String name;
//	@OneToMany
//	private List<Laptop> laptop = new ArrayList<Laptop>();
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public List<Laptop> getLaptop() {
//		return laptop;
//	}
//	public void setLaptop(List<Laptop> laptop) {
//		this.laptop = laptop;
//	}
//	public Person() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Person(int id, String name, List<Laptop> laptop) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.laptop = laptop;
//	}
//	
//	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	

}
