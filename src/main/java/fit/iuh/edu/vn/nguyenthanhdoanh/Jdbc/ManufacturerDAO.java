package fit.iuh.edu.vn.nguyenthanhdoanh.Jdbc;

import fit.iuh.edu.vn.nguyenthanhdoanh.entity.Manufacturer;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class ManufacturerDAO  extends AbstractDAO   <Manufacturer,Long>{


    public ManufacturerDAO(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void insert(Manufacturer entity) {
        String sql ="INSERT INTO manufacturer  VALUES (?,?,?)";
        jdbcTemplate.update(sql,entity.getId(),entity.getName(),entity.getEmail());
    }

    @Override
    public Manufacturer finById(Long aLong) {

            String sql ="select * from manufacturer where id = ?";
            return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(Manufacturer.class),aLong);


    }

    @Override
    public void update(Long aLong, Manufacturer entity) {
        String sql = "UPDATE manufacturer SET name=?, email=? WHERE id=?";
        jdbcTemplate.update(sql, entity.getName(), entity.getEmail(), aLong);
    }

    @Override
    public void delete(Long aLong) {
        String sql = "DELETE FROM manufacturer WHERE id=?";
        jdbcTemplate.update(sql, aLong);
    }

    @Override
    public List<Manufacturer> findAll() {
        String sql = "SELECT * FROM manufacturer";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Manufacturer.class));
    }
}
