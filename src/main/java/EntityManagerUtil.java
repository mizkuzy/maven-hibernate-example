import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {
    private static EntityManagerFactory entityManagerFactory;

    static {
        try {
             } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static EntityManager getEntityManager() {
        entityManagerFactory = Persistence.createEntityManagerFactory("demo");
        return entityManagerFactory.createEntityManager();

    }

    public static void close(){
        entityManagerFactory.close();
    }
}
