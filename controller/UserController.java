package DZ.DZ_4.controller;

import DZ.DZ_4.model.User;

public interface UserController {
    <T extends User> User create(T user);


}
