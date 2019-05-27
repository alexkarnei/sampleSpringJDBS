package by.itStep.karnei.repo;

import by.itStep.karnei.model.Teachers;

public interface InterfaceTeachersRepo {

    Integer save (Teachers teachers);

    Teachers getId(Integer id);

    Void delete (Integer id);

}
