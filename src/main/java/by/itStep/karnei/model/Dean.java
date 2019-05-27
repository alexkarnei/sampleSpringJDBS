package by.itStep.karnei.model;

public class Dean {

    private Teachers teachers;

    public Dean(Teachers teachers) {
        if (teachers.getPosition().equals("Dean")) {
            this.teachers = teachers;
        }
    }
}
