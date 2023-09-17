package med.voll.api.medico;

import jakarta.persistence.*;
import lombok.*;
import med.voll.api.direccion.Direccion;

@Entity(name="Medico")
@Table(name="medicos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;
    private String documento;
    @Enumerated(EnumType.STRING)
    private Especialidad especialidad;
    @Embedded
    private Direccion direccion;

    public Medico(DatosRegistroMedico datosRegistroMedico) {
        this.nombre = datosRegistroMedico.nombre();
        this.email = datosRegistroMedico.email();
        this.especialidad = datosRegistroMedico.especialidad();
        this.documento = datosRegistroMedico.documento();
        this.direccion = new Direccion(datosRegistroMedico.direccion());
    }
}
