package cr;

public class ChiffresRomains {

	public ChiffresRomains() {
		// TODO Auto-generated constructor stub
	}
	
	private int in(int value, int[] liste) {
		for (int i = 0; i < liste.length; i++) {
			if (value == liste[i]) return i;
		}
		return -1;
	}
	
	public String toChiffresRomains(int nombre) {
		final String[] litterals = new String[]{"I", "V", "X", "L", "C", "D", "M"};
		final int[] keyValues = {1, 5, 10, 50, 100, 500, 1000};
		
		if (nombre < 1 || nombre > 3999) {
			throw new IllegalArgumentException();
		}
		
		StringBuilder sb = new StringBuilder();
		int index = litterals.length -1;
		
		while (nombre != 0 && index >= 0) {
			if (nombre%keyValues[index] == 0) {
				for (int i = 0; i < nombre / keyValues[index]; i++)
					sb.append(litterals[index]);
				nombre = 0;
			} else if (nombre > keyValues[index]) {
				sb.append(litterals[index]);
				nombre -= keyValues[index];
			}
			if (nombre == 9) {
				sb.append("IX");
				nombre = 0;
			}
			if (nombre == 4) {
				sb.append("IV");
				nombre = 0;
			}
			
			index--;
		}
		
		return sb.toString();
	}
	


}
