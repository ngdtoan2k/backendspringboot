package tech.getarray.employeemanager.repo;

import org.apache.el.stream.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarray.employeemanager.model.Employee;

import javax.swing.text.html.Option;

public interface Employeerepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    Employee findEmployeeById(Long id);
}
