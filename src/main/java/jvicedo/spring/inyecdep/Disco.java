package jvicedo.spring.inyecdep;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Disco {
    @Autowired
    private Autor autor;
    private String titulo= "Power of the three";
    private String genero = "jazz";
    private String discográfica = "ECM";
    private int precio = 25;
}
