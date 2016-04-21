package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String input) {
		char I = 'I';
		char V = 'V';
		char X = 'X';
		int inputAsInt = Integer.valueOf(input);
		String resultat = new String();
		for (int x = 1; x <= inputAsInt; x++){
			if ( x == 4){
				resultat = "" + I + V;
			}
			else if ( x == 5 ){
				resultat = "" + V;
			}
			else {	
				resultat = resultat + I; 
			}
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
			else if (roman.charAt(i) == 'V'){
					if (roman.length() == 2 && roman.charAt(i-1) == 'I'){	
						resultat = 4;
					}
					else {
						resultat = 5;
					}
				}	
			else {
				resultat = 0;
			}	
		}
		resultatAsString = "" + resultat;
		return resultatAsString;
	}

}
