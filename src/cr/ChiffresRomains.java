package cr;

public class ChiffresRomains {

	public ChiffresRomains() {
		// TODO Auto-generated constructor stub
	}
	
	public String toChiffresRomains(int nombre) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < nombre; i++) {
			sb.append("I");
			
		}
		return sb.toString();
	}

}
