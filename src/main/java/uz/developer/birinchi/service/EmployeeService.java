package uz.developer.birinchi.service;

import org.springframework.stereotype.Service;
import uz.developer.birinchi.domain.Employee;
import uz.developer.birinchi.repository.EmployeeRepository;

import java.util.List;

@Service
public class   EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee save(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> findall(){
        return employeeRepository.findAll();
    }

    public Employee findById(Long id){
        return employeeRepository.findById(id).get();
    }
    public List<Employee> findByName(String name){
        return employeeRepository.findByName(name);
    }

    public void delete(Long id){
        Employee employee = employeeRepository.getOne(id);
        employeeRepository.delete(employee);
    }
}
