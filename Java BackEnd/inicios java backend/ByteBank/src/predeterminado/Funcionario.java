package predeterminado;

public abstract class Funcionario {

	private String id;
	private String nombre;
	private double salario;
	
	
	public Funcionario() {
		super();
	}


	public Funcionario(String id, String nombre, double salario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.salario = salario;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nombre=" + nombre + ", salario=" + salario + "]";
	}
	
	
	
	
}
