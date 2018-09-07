import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
  static EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpabook");

  public static void main(String[] args) {
    testSave();
  }
  static void testSave(){
    EntityManager em = emf.createEntityManager();
    EntityTransaction et = em.getTransaction();
    et.begin();

    Team team1 = new Team("team1","팀1");
    em.persist(team1);

    String id = "member1";
    Member member = new Member(id,"회원");
    member.setTeam(team1);
    em.persist(member);

    Team t = em.find(Team.class,"team1");
    System.out.println(t.getMembers());
    et.commit();
  }
  static void testUpdate(){
    EntityManager em = emf.createEntityManager();
    EntityTransaction et = em.getTransaction();
    et.begin();

    Team team1 = new Team("team1","팀1");
    em.persist(team1);

    String id = "member1";
    Member member = new Member(id,"회원");
    member.setTeam(team1);
    em.persist(member);

    Team team2 = new Team("team2","팀2");
    em.persist(team2);

    member.setTeam(team2);
    et.commit();

  }
  static void testDelete(){
    EntityManager em = emf.createEntityManager();
    EntityTransaction et = em.getTransaction();
    et.begin();

    Team team1 = new Team("team1","팀1");
    em.persist(team1);

    String id = "member1";
    Member member = new Member(id,"회원");
    member.setTeam(team1);
    em.persist(member);

    member.setTeam(null);
    et.commit();

  }
  static void testDeleteError(){
    EntityManager em = emf.createEntityManager();
    EntityTransaction et = em.getTransaction();
    et.begin();

    Team team1 = new Team("team1","팀1");
    em.persist(team1);

    String id = "member1";
    Member member = new Member(id,"회원");
    member.setTeam(team1);
    em.persist(member);

    em.remove(team1);
    et.commit();

  }

}
