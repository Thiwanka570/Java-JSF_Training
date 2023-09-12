
package entities;


public class Employee {
    private String empName;
    private String nicNumber;
    private String phone;
    private String mail;
    private String city;
    private String gender;
    private int salary;
    private boolean editMode;
    
    public Employee(String empName,String nicNumber,String phone,String mail,String city,String gender,int salary){
        this.empName=empName;
        this.nicNumber=nicNumber;
        this.phone=phone;
        this.mail=mail;
        this.city=city;
        this.gender=gender;
        this.salary=salary;
        this.editMode=false;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getNicNumber() {
        return nicNumber;
    }

    public void setNicNumber(String nicNumber) {
        this.nicNumber = nicNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isEditMode() {
        return editMode;
    }

    public void setEditMode(boolean editMode) {
        this.editMode = editMode;
    }
    
}
