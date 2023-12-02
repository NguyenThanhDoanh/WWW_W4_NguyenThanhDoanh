package fit.iuh.edu.vn.nguyenthanhdoanh;

import fit.iuh.edu.vn.nguyenthanhdoanh.Jdbc.ManufacturerDAO;
import fit.iuh.edu.vn.nguyenthanhdoanh.Jdbc.ProductDAO;
import fit.iuh.edu.vn.nguyenthanhdoanh.entity.Manufacturer;
import fit.iuh.edu.vn.nguyenthanhdoanh.entity.Product;
import net.datafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class W4WwwNguyenThanhDoanhApplication {
    @Autowired
    private ManufacturerDAO manuDao;
    private ProductDAO productDAO;
    Faker faker = new Faker();

    public static void main(String[] args) {
        SpringApplication.run(W4WwwNguyenThanhDoanhApplication.class, args);
    }
    @Bean
    CommandLineRunner test1()
    {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
//                manuDao.insert(new Manufacturer(faker.company().name(), faker.internet().emailAddress()));
//                System.out.println(manuDao.findAll());
//                manuDao.update(1L,new Manufacturer("UPDATEHERE",faker.internet().emailAddress()));
//                System.out.println(manuDao.finById(1L));
                manuDao.delete(1L);
                System.out.println(manuDao.findAll());
            }

        };
    }


}
