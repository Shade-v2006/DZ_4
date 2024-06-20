package DZ.DZ_4.controller;

import java.util.List;

import DZ.DZ_4.model.Student;
import DZ.DZ_4.model.User;
import DZ.DZ_4.view.UserView;
import DZ.DZ_4.view.StudentView;

public class StudentController implements UserController {

    private UserView<Student> view = new StudentView();

    @Override
    public <T extends User> User create(T user) {
        return user;
    }

    public void sendOnConsole(List<Student> students) {
        view.sendOnConsole(students);
    }

}
