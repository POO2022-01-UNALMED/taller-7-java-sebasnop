package comunicacion;

public class Fabula extends Escrito {
	
	private String ensenanza;
	private String interpretacion;
	
	private static int factor = 1;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}

	@Override
	public int palabrasTotales(int palabrasPagina) {
		return getPaginas()*palabrasPagina*factor;
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
		texto += getEnsenanza();
		
		return texto;
	}

	public String getEnsenanza() {
		return ensenanza;
	}

	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
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
		Fabula.factor = factor;
	}

}
