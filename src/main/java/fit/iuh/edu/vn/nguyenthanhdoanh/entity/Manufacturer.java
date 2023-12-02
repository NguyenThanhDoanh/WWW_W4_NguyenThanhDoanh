package fit.iuh.edu.vn.nguyenthanhdoanh.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Manufacturer {
    private  long id;
    private String name;
    private String email;

    public Manufacturer(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
