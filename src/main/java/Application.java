//import PersistenceManager;

import entity.Employee;

import javax.persistence.EntityManager;
import java.util.Date;

/**
 * @author lrudkova <Lyudmila.Rudkova@t-systems.com>
 */
public class Application {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setFirstName("Lucy");
        employee.setLastName("Ru");
        employee.setSalary(10000);

        EntityManager em = EntityManagerUtil.getEntityManager();
        em.getTransaction().begin();
        em.merge(employee);
        em.getTransaction().commit();
        em.close();
    }
}
