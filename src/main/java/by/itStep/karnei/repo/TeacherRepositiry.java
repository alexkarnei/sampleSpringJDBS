package by.itStep.karnei.repo;

import by.itStep.karnei.model.Teachers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
@Component
public class TeacherRepositiry implements InterfaceTeachersRepo {

    @Autowired
    private JdbcTemplate template;

    @Override
    public Integer save(final Teachers teachers) {
        final String INSERT_SQL = "INSERT INTO public.\"Teachers\" (name,,salary," +
                "surname) VALUES (?, ?, ?,?,?,?,?)";
        GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();
        template.update((connection) -> {
                    PreparedStatement ps = null;
                    try {
                        ps = connection.prepareStatement(INSERT_SQL, new String[]{"id"});
                        ps.setString(1, teachers.getName());
                        ps.setString(2, teachers.getSurName());
                        ps.setInt(3, teachers.getSalary());
                        return ps;
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
                },
                keyHolder);
        return keyHolder.getKey().intValue();
    }

    @Override
    public Teachers getById(Integer id) {
        List<Teachers> query = template.query(
                "SELECT * FROM public.\"Students\" s WHERE s.id = " + id.toString(),
                new TeacherRowMapper());
        if (!query.isEmpty()) {
            return query.iterator().next();
        }
        return null;
    }

    @Override
    public void delete(Integer id) {
        template.execute("DELETE FROM public.\"Students\" s WHERE s.id = " + id.toString());
    }


}


