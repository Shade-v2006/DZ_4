package DZ.DZ_4.controller;

import java.util.List;

import DZ.DZ_4.model.Teatcher;
import DZ.DZ_4.model.User;
import DZ.DZ_4.view.TeacherView;
import DZ.DZ_4.view.UserView;

public class TeacherController implements UserController {
    private UserView<Teatcher> views = new TeacherView();

    @Override
    public <T extends User> User create(T user) {
        return user;
    }

    public void sendOnConsole(List<Teatcher> teatchers) {
        views.sendOnConsole(teatchers);
    }
}
