/* Learner.java
   This is the model class
   Author: Zukhanye Anele Mene
   Date: 26 September 2022 */
package za.ac.mycput.libraryclient.domain;


public class Learner {
    
    private String learnerId;
    private String name;
    private String surname;
    private String grade;
    private String gender;

    public Learner() {
    }

    public Learner(String learnerId, String name, String surname, String grade, String gender) {
        this.learnerId = learnerId;
        this.name = name;
        this.surname = surname;
        this.grade = grade;
        this.gender = gender;
    }

    public String getLearnerId() {
        return learnerId;
    }

    public String getName() {
        return name;
    }

    public String getSruname() {
        return surname;
    }

    public String getGrade() {
        return grade;
    }

    public String getGender() {
        return gender;
    }

    public void setLearnerId(String learnerId) {
        this.learnerId = learnerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSruname(String sruname) {
        this.surname = sruname;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Learner{" + "learnerId=" + learnerId + ", name=" + name + ", sruname=" + surname + ", grade=" + grade + ", gender=" + gender + '}';
    }
    
    
    
}
