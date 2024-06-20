package DZ.DZ_4.view;

import java.util.List;

import DZ.DZ_4.model.User;

public interface UserView<T extends User> {

    void sendOnConsole(List<T> users);

}