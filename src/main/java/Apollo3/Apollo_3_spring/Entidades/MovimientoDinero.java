package Apollo3.Apollo_3_spring.Entidades;

public class MovimientoDinero {
    //Instanciar atributos
    private float monto;
    private String concepto;
    private String usuario;
    private String empresa;

    //Método Constructor

    public MovimientoDinero(float monto, String concepto, String usuario, String empresa) {
        this.monto = monto;
        this.concepto = concepto;
        this.usuario = usuario;
        this.empresa = empresa;
    }
    // Getter and Setter

    public float getMonto() {
        return monto;
    }
    public void setMonto(float monto) {
        this.monto = monto;
    }
    public String getConcepto() {
        return concepto;
    }
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
