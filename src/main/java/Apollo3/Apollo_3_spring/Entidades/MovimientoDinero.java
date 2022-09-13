package Apollo3.Apollo_3_spring.Entidades;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Movimiento_Dinero")
public class MovimientoDinero {
    //Instancio atributos
    @Id
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_movimiento;
    @Column(length = 50, nullable = false)
    private String concepto;
    @Column(nullable = false)
    private float monto;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_empleado", referencedColumnName = "id_empleado", nullable = false)
    private Empleado empleado;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_empresa", referencedColumnName = "id_empresa", nullable = false)
    private Empresa empresa;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date creacionAt;
    @Temporal(TemporalType.TIMESTAMP)
    private Date actualizacionAt;

    @PrePersist
    public void prePersist(){
        this.creacionAt = new Date();
    }

    public MovimientoDinero() {
    }

    public MovimientoDinero(long id_movimiento, String concepto, float monto, Empleado empleado, Empresa empresa, Date creacionAt, Date actualizacionAt) {
        this.id_movimiento = id_movimiento;
        this.concepto = concepto;
        this.monto = monto;
        this.empleado = empleado;
        this.empresa = empresa;
        this.creacionAt = creacionAt;
        this.actualizacionAt = actualizacionAt;
    }

    public long getId_movimiento() {
        return id_movimiento;
    }

    public void setId_movimiento(long id_movimiento) {
        this.id_movimiento = id_movimiento;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Date getCreacionAt() {
        return creacionAt;
    }

    public void setCreacionAt(Date creacionAt) {
        this.creacionAt = creacionAt;
    }

    public Date getActualizacionAt() {
        return actualizacionAt;
    }

    public void setActualizacionAt(Date actualizacionAt) {
        this.actualizacionAt = actualizacionAt;
    }

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "id_movimiento=" + id_movimiento +
                ", concepto='" + concepto + '\'' +
                ", monto=" + monto +
                ", empleado=" + empleado +
                ", empresa=" + empresa +
                ", creacionAt=" + creacionAt +
                ", actualizacionAt=" + actualizacionAt +
                '}';
    }
}
