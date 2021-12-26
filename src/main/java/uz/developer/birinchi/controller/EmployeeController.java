package uz.developer.birinchi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.developer.birinchi.domain.Employee;
import uz.developer.birinchi.service.EmployeeService;

import java.util.List;

@RestController@RequestMapping("/api")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/employes")
    public ResponseEntity create(@RequestBody Employee employee){
        Employee employee1 = employeeService.save(employee);
        return ResponseEntity.ok(employee1);
    }

    @GetMapping("/employes")
    public ResponseEntity getall(){
        List<Employee> employees = employeeService.findall();
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/employes/{name}")
    public ResponseEntity getAll(@PathVariable String name){
        List<Employee> employeeList = employeeService.findByName(name);
        return ResponseEntity.ok(employeeList);
    }

    @DeleteMapping("/employes/{id}")
    public ResponseEntity delete(@PathVariable Long id){
       employeeService.delete(id);
       return ResponseEntity.ok("qator o'chirildi...");

    }
}
