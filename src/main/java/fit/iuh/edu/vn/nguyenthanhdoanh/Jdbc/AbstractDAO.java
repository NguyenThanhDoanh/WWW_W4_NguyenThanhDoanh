package fit.iuh.edu.vn.nguyenthanhdoanh.Jdbc;

import fit.iuh.edu.vn.nguyenthanhdoanh.entity.Manufacturer;
import fit.iuh.edu.vn.nguyenthanhdoanh.entity.Product;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public abstract class AbstractDAO <T,ID> {

    private DataSource dataSource;
    protected JdbcTemplate jdbcTemplate;


    public AbstractDAO(DataSource dataSource)
    {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public abstract void insert(T entity);


    public abstract  T   finById(ID id);
    public abstract void update(ID id,T entity);
    public abstract void delete(ID id);
    public abstract List<T> findAll();


}
