package DZ.DZ_4.controller;

import DZ.DZ_4.model.Student;
import DZ.DZ_4.service.StudentGroupService;

public class StudentGroupController {

    private StudentGroupService service;

    public StudentGroupController(StudentGroupService service) {
        this.service = service;
    }

    public void addStudent(Student student) {
        service.addStudent(student);
    }

}