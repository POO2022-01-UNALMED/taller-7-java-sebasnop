package comunicacion;

public class Periodico extends Escrito {

	private String fecha;
	private String primicia;
	private String interpretacion;
	
	private static int factor = 10;
	
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia,
			String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
	}

	@Override
	public int palabrasTotales(int palabrasPagina) {
		return palabrasPagina*factor;
	}

	@Override
	public String interpretacion() {
		return interpretacion;
	}

	@Override
	public String toString() {
		String texto = "";
		
		texto += getOrigen() + "\n";
		texto += getTitulo() + "\n";
		texto += getAutor() + "\n";
		texto += getPaginas() + "\n";
		texto += getFecha() + "\n";
		texto += getPrimicia();
		
		return texto;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getPrimicia() {
		return primicia;
	}

	public void setPrimicia(String primicia) {
		this.primicia = primicia;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	public static int getFactor() {
		return factor;
	}

	public static void setFactor(int factor) {
		Periodico.factor = factor;
	}
	
}
