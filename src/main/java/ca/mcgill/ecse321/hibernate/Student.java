package ca.mcgill.ecse321.hibernate;
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table
public class Student {
     
    @Id
    private Integer studentId;
     
    private String givenName;
    private String familyName;
    private String major;

     
    /* Stub out the default constructor */
    public Student() {}
     
    public Student(Integer studentId, String givenName, String familyName, String major) {
        this.studentId = studentId;
        this.givenName = givenName;
        this.familyName = familyName;
        this.major = major;
    }

    /* Getters */
    public Integer getStudentId() { return studentId; }
    public String getGivenName() { return givenName; }
    public String getFamilyName() { return familyName; }
    public String getMajor() { return major; }

    /* Setters */
    public void setStudentId(Integer studentId) { this.studentId = studentId; }
    public void setGivenName(String givenName) { this.givenName = givenName; }
    public void setFamilyName(String familyName) { this.familyName = familyName; }
    public void setMajor(String major) { this.major = major; }
}
