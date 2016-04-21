package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String input) {
		int inputAsInt = Integer.valueOf(input);
		String resultat = new String();
		for (int x =1; x <= inputAsInt; x++){
			resultat = resultat + "I"; 
		}
		return resultat;
	}

	public String convertFromRoman(String roman) {
		int resultat = 0;
		String resultatAsString;
		for ( int i = 0; i < roman.length(); i++){
			if ( roman.charAt(i) == 'I') {
				resultat += 1;
			}
			else {
				resultat =0;
			}
		}
		resultatAsString = "" + resultat;
		return resultatAsString;
	}

}
