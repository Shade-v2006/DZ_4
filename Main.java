//  Создать класс TeacherService и реализовать аналогично проедланному на
// семинаре
//  Создать класс TeacherView и реализовать аналогично проедланному на
// семинаре
//  Создать класс TeacherController и реализовать возможность создания,
// редактирования конкретного учителя и отображения списка учителей
// имеющихся в системе

package DZ.DZ_4;

import java.util.List;

import DZ.DZ_4.controller.StudentController;
import DZ.DZ_4.controller.TeacherController;
import DZ.DZ_4.model.Student;
import DZ.DZ_4.model.Teatcher;

public class Main {

    public static void main(String[] args) {

        new StudentController()
                .sendOnConsole(List.of(new Student(1, "Sasha", "Ivanov"),
                        new Student(1, "Ira", "Ivanova")));

        new TeacherController().sendOnConsole(List.of(new Teatcher(1, "Ivan", "Ivanov", "Ivanovich"),
                new Teatcher(1, "Petr", "Prosto", "Vasilevich")));
    }

    // private static List<Student> getStudents() {
    // Student s1 = new Student(1, "Sasha", "Ivanov");
    // Student s2 = new Student(1, "Ira", "Ivanova");
    // return List.of(s1, s2);
    // }
}