package tech.getarray.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarray.employeemanager.exception.UserNotFoundException;
import tech.getarray.employeemanager.model.Employee;
import tech.getarray.employeemanager.repo.Employeerepo;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    private final Employeerepo employeerepo;
    @Autowired
    public EmployeeService(Employeerepo employeerepo) {
        this.employeerepo = employeerepo;
    }
    public Employee addEmpolyee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeerepo.save(employee);
    }
    public List<Employee> findAllemployees(){
        return employeerepo.findAll();
    }
    public Employee updateEmployee(Employee employee){
        return employeerepo.save(employee);
    }
    public Employee findEmployeeById(Long id){
        return employeerepo.findEmployeeById(id);
    }
    public void deleteEmployee(Long id){
        employeerepo.deleteEmployeeById(id);
    }


}
