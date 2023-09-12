package beans;

import entities.Employee;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named(value = "employeeControl")
@SessionScoped
public class EmployeeControl implements Serializable {

    private List<Employee> employeList;
    private Employee emp = new Employee("", "", "", "", "", "", 0);

    public EmployeeControl() {
        employeList = new ArrayList<>();
        //emp=new Employee("","","","","","",0);
        
    }

    public void addemployee() {
        emp = new Employee(emp.getEmpName(), emp.getCity(), emp.getGender(), emp.getMail(), emp.getNicNumber(), emp.getPhone(), emp.getSalary());
        employeList.add(emp);
    }
    
    public void deleteEmployee(Employee emp){
        employeList.remove(emp);
    }
    
    public void edit(Employee emp){
        if(emp != null ){
            emp.setEditMode(!emp.isEditMode());
        }
    }
    
    public void updateEmployee(Employee emp){
        edit(emp);
    }

    public List<Employee> getEmployeList() {
        return employeList;
    }

    public void setEmployeList(List<Employee> employeList) {
        this.employeList = employeList;
    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

}
