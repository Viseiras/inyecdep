package jvicedo.spring.inyecdep;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Autor {
    private String nombre = "Pepe";
    private String apellido = "Martínez";
}
