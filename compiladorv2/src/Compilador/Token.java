package Compilador;

public class Token {
	private String tipo;
	private String nombre;
	private int linea;
	private String valor;

	public Token() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Token(String tipo, String nombre, int linea, String valor) {
		super();
		this.tipo = tipo;
		this.nombre = nombre;
		this.linea = linea;
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLinea() {
		return linea;
	}

	public void setLinea(int linea) {
		this.linea = linea;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}


	@Override
	public String toString() {
		return "Token [tipo=" + tipo + ", nombre=" + nombre + ", linea=" + linea + ", valor=" + valor + "]";
	}

}