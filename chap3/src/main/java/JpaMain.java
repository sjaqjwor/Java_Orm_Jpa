import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {

    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpabook");
    public static void main(String[] args) {

        Member member = createMember("memberA","g1");
        member.setUsername("변경");
        merge(member);
    }

    public static void logic(EntityManager em) {
        String id = "id3";
        Member member = new Member();
        member.setId(id);
        member.setUsername("지한");
        member.setAge(2);

        //등록
        em.persist(member);

        //수정
        member.setAge(20);


    }
    static Member createMember(String id,String username){
        EntityManager em1 = emf.createEntityManager();
        EntityTransaction et = em1.getTransaction();
        et.begin();
        Member member = new Member();
        member.setId(id);
        member.setUsername(username);

        em1.persist(member);
        et.commit();

        em1.close();

        return member;
    }

    static void merge(Member member){
        EntityManager em2 = emf.createEntityManager();
        EntityTransaction et2 = em2.getTransaction();
        et2.begin();
        Member merge = em2.merge(member);
        et2.commit();

        System.out.println("memeger= " + member.getUsername());

        System.out.println(merge.getUsername());
        System.out.println(em2.contains(member));
        System.out.println(em2.contains(member));

        em2.close();
    }
}
