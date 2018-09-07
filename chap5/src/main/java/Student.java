import javax.persistence.*;

@Entity
public class Student {

  @Id @GeneratedValue
  private Long id;

  private String username;

  @ManyToOne
  @JoinColumn(name="DEPARTMENT_ID")
  private Department department;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

}
