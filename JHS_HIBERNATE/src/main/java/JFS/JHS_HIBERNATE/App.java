package JFS.JHS_HIBERNATE;





import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App {
	public static void main(String[] args) {
		Configuration config = new Configuration().configure().addAnnotatedClass(Laptop.class)
				.addAnnotatedClass(Person.class);
		ServiceRegistry servi = new ServiceRegistryBuilder().applySettings(config.getProperties())
				.buildServiceRegistry();
		SessionFactory sessionFactory = config.buildSessionFactory(servi);
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		//Laptop lap = new Laptop();
//		lap.setId(2);
//		lap.setName("DELL");
//		lap.setPrice(53000);
//		session.save(lap);
		Query q =session.createQuery("from Laptop");
		q.setFirstResult(2);
		q.setFetchSize(4);
		
		List<Laptop> l =q.list();
		for (Laptop i:l) {
			System.out.println(i);
		}
		
		Query q2 =session.createQuery("from Laptop where name='DELL'");
		System.out.println("without converting to var"+q2.uniqueResult());
		Laptop la =(Laptop)q2.uniqueResult();
		System.out.println("converted to var"+la);
		
		Query q3 =session.createQuery("update Laptop set name='mi' where id=6");
		int vu =q3.executeUpdate();
		System.out.println(vu);
		
		Query q4 =session.createQuery("delete Laptop where id=6");
		int vd =q4.executeUpdate();
		System.out.println(vd);
		
		Query q5 =session.createQuery("from Laptop l order by l.id desc");
		List<Laptop> l1 =q5.list();
		for (Laptop i:l1) {
			System.out.println(i);
		}
		Query q6 =session.createQuery("select sum(price) from Laptop");
		System.out.println("sum of the price = " +q6.uniqueResult());
		
		Query q7 =session.createQuery("select l from Laptop l inner join l.Person ");
		List l2 =q7.list();
		for(Object i:l2)
		{
			System.out.println(i);
		}		
		
		

		// session.delete(lap);
		//Person per = new Person();
//		per.setId(2);
//
//		per.setName("monala");
//		per.getLaptop().add(lap);
//		session.save(per);

		session.getTransaction().commit();
	}
}
