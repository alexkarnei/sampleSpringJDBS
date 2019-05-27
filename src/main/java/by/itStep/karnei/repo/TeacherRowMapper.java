package by.itStep.karnei.repo;

import by.itStep.karnei.model.Teachers;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TeacherRowMapper implements RowMapper<Teachers> {
    @Override
    public Teachers mapRow(ResultSet resultSet, int i) throws SQLException {

        Teachers teachers = new Teachers();

        teachers.setId(resultSet.getInt("id"));
        teachers.setName(resultSet.getString("name"));
        teachers.setSalary(resultSet.getInt("salary"));
        teachers.setSurName(resultSet.getString("surname"));

        return teachers;
    }
}
