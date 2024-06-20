package DZ.DZ_4.service;

import DZ.DZ_4.model.Teatcher;

public class TeacherService {
    public Teatcher creaTeatcher(int id, String name, String last, String patronymic){
        return new Teatcher(id, name, last, patronymic);
    }
}
