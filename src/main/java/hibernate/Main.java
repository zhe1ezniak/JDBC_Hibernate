package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {
        ClientsDetails details = new ClientsDetails();

        details.setId(1);
        details.setName("Client");
        details.setAge(22);
        details.setPhone("0934556677");

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(details);
        session.getTransaction().commit();
        session.close();
    }
}
