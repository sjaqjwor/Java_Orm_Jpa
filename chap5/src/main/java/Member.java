import javax.persistence.*;

@Entity

public class Member {
  @Id
  @Column(name = "member_id")
  private String id;

  private String username;

  @ManyToOne
  @JoinColumn(name = "team_id")
  private Team team;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Team getTeam() {
    return team;
  }

  public void setTeam(Team team) {
    this.team = team;
  }
  public Member(String id, String username){
    this.id=id;
    this.username=username;
  }
}
