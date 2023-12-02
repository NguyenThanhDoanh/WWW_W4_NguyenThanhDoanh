package fit.iuh.edu.vn.nguyenthanhdoanh.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
    private long id;
    private String name;
    private Manufacturer manufacturer;

    public Product(String name) {
        this.name = name;
    }
}
