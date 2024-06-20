package DZ.DZ_4.view;

// import java.util.Collections;
import java.util.List;

import DZ.DZ_4.model.Teatcher;

public class TeacherView implements UserView<Teatcher> {

    @Override
    public void sendOnConsole(List<Teatcher> teachers) {
        // Collections.sort(teachers);
        System.out.println(teachers);
    }

}
