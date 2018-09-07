import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain2 {
  static EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpabook");

  public static void main(String[] args) {
    EntityManager em = emf.createEntityManager();
    EntityTransaction et = em.getTransaction();
    et.begin();

    Department department = new Department();
    department.setDepartmentname("소프트");
    em.persist(department);

    Student student = new Student();
    student.setUsername("이승기");
    student.setDepartment(department);
    department.getStudents().add(student);
    em.persist(student);


    Student student1 = new Student();
    student1.setUsername("이승기2");
    student1.setDepartment(department);
    department.getStudents().add(student1);
    em.persist(student1);

    Student student2 = new Student();
    student2.setUsername("이승기3");
    student2.setDepartment(department);
    department.getStudents().add(student2);
    em.persist(student2);


    et.commit();

    department.getStudents().forEach(s->System.out.println(s.getUsername()));
    }
}
