package fit.iuh.edu.vn.nguyenthanhdoanh.Jdbc;
import fit.iuh.edu.vn.nguyenthanhdoanh.entity.Manufacturer;
import fit.iuh.edu.vn.nguyenthanhdoanh.entity.Product;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import javax.sql.DataSource;
import java.util.List;

public class ProductDAO extends AbstractDAO   <Product,Long>{

    public ProductDAO(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void insert(Product entity) {
        return;
    }

    public void insert2(Product entity,Manufacturer manufacturer) {
        String sql ="INSERT INTO products  VALUES (?,?,?)";
        jdbcTemplate.update(sql,entity.getId(),entity.getName(),manufacturer.getId());
    }

    @Override
    public Product finById(Long aLong) {
        String sql ="select * from products where id = ?";
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(Product.class),aLong);

    }

    @Override
    public void update(Long aLong, Product entity) {
        String sql = "UPDATE products SET name=?, manu_id=? WHERE id=?";
        jdbcTemplate.update(sql, entity.getName(), entity.getManufacturer().getId(), aLong);

    }

    @Override
    public void delete(Long aLong) {
        String sql = "DELETE FROM products WHERE id=?";
        jdbcTemplate.update(sql, aLong);
    }

    @Override
    public List<Product> findAll() {
        String sql = "SELECT * FROM products";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Product.class));
    }


}
