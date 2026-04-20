package cr;

public class ChiffresRomains {

	public ChiffresRomains() {
		// TODO Auto-generated constructor stub
	}
	
	public String toChiffresRomains(int nombre) {
		if (nombre < 1 || nombre > 3999) {
			throw new IllegalArgumentException();
		}
		
		StringBuilder sb = new StringBuilder();
		
		
		if (nombre == 9) {
			sb.append("IX");
			nombre = 0;
		}
		if (nombre >= 5) {
			sb.append("V");
			nombre -= 5; 
		} 
		if (nombre <= 3) {
			for (int i = 0; i < nombre; i++)
				sb.append("I");
			nombre = 0;
		}
		if (nombre == 4) {
			sb.append("IV");
			nombre = 0;
		}
		
		return sb.toString();
	}

}
