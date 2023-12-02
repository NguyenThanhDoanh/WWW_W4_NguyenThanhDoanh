package fit.iuh.edu.vn.nguyenthanhdoanh;

import fit.iuh.edu.vn.nguyenthanhdoanh.Jdbc.ManufacturerDAO;
import fit.iuh.edu.vn.nguyenthanhdoanh.Jdbc.ProductDAO;
import fit.iuh.edu.vn.nguyenthanhdoanh.entity.Manufacturer;
import fit.iuh.edu.vn.nguyenthanhdoanh.entity.Product;
import net.datafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class W4WwwNguyenThanhDoanhApplicationTests {
    private ManufacturerDAO manuDao;
    private ProductDAO productDAO;
    Faker faker = new Faker();
    @Test
    void contextLoads() {
        manuDao.insert(new Manufacturer(faker.company().name(), faker.internet().emailAddress()));
        productDAO.insert2(new Product(faker.commerce().productName()), manuDao.finById(1L));

    }

}
