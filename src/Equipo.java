
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
		//code here
	}
	
	public String categoriaEquipo() {
		return null;
	}
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public int getRanking() {
		return ranking;
	}
}
