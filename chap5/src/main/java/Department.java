import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Department {

  @Id @GeneratedValue
  private Long id;

  private String departmentname;

  @OneToMany(mappedBy = "department")
  private List<Student> students =  new ArrayList<Student>();

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDepartmentname() {
    return departmentname;
  }

  public void setDepartmentname(String departmentname) {
    this.departmentname = departmentname;
  }


  public List<Student> getStudents() {
    return students;
  }

  public void setStudents(List<Student> students) {
    this.students = students;
  }

}
