package uz.developer.birinchi.controller;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.developer.birinchi.model.Student;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @GetMapping("/student")
    public ResponseEntity getAll(){
        Student student =new Student(1,"javohir", "Azizov","3-kurs");
        Student student1 =new Student(2,"jahongir", "Akmalov","3-kurs");
        Student student2 =new Student(3,"Pahlavon", "Saidov","3-kurs");
        Student student3 =new Student(4,"Nizom", "Haydarov","3-kurs");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        return ResponseEntity.ok(studentList);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity getOne(@PathVariable int id){
        Student student = new Student(id,"Javohir", "Azizov", "3-kurs");
        return ResponseEntity.ok(student);
    }

    @GetMapping("/students")
    public ResponseEntity getOne(@RequestParam int id,
                                 @RequestParam String name,
                                 @RequestParam String lastname,
                                 @RequestParam String course){
        Student student = new Student(id, name,lastname,course);
        return ResponseEntity.ok(student);
    }

    @DeleteMapping("/student{id}")
    public ResponseEntity delete(@PathVariable int id){
        return ResponseEntity.ok("Ma\'lumot o'chirildi");
    }
    @PostMapping("/student")
    public ResponseEntity create(@RequestBody Student student){
        return ResponseEntity.ok(student);
    }

    @PutMapping("/student/{id}")
    public ResponseEntity update(@PathVariable int id,
                                 @RequestBody Student studentNew){
        Student student = new Student(1, "Javohir","Azizov","3-kurs");
        student.setId(id);
        student.setName(studentNew.getName());
        student.setLastname(studentNew.getLastname());
        return ResponseEntity.ok(student);
    }


}
