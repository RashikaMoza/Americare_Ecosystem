/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author deepankkhurana
 */
public class Employee {
    private String empName;
    private int id;
    private static int count = 1;
 
    
    public Employee()
    {
        id = count;
        count++;
    }


    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
    
    public int getId() {
        return id;
    }

    

    @Override
    public String toString() {
        return empName;
    }


}
