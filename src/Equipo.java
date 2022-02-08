
public class Equipo {
	private String nombreEquipo;
	private int ranking;
	
	
	public Equipo () {
	}
	
	
	public void setNombreEquipo(String nombreEquipo) {
		if(nombreEquipo!=null && nombreEquipo.length()<20) {
			this.nombreEquipo = nombreEquipo;
		}
	}
	public void setRanking(int ranking) {
		if(ranking>0 && ranking<10) {
			this.ranking = ranking;
		}
	}
	
	public String categoriaEquipo() {
		String categoria = "";
		return categoria;
	}
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public int getRanking() {
		return ranking;
	}
}
