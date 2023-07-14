package predeterminado;

public class Cliente implements Autenticable {
	
	private String nombre;
	private int clave;

	@Override
	public void setContraseña(int contraseña) {
		this.clave = contraseña;
		
	}

	@Override
	public boolean iniciarSesion(int contraseña) {
		return false;
	}

}
