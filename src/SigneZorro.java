
public class SigneZorro {

	public static void main(String[] args) {
		String Etoiles = "*";
		String EspacesAvantEtoiles = "        ";		
		String EspaceApresEtoile = " ";
		
		for(int i =0 ; i <10; i++) {
			if (i == 0 || i == 9) {
				System.out.println("**********");
			}else {
				
				System.out.println(EspacesAvantEtoiles + Etoiles +  EspaceApresEtoile);
				EspacesAvantEtoiles = EspacesAvantEtoiles.substring(0, EspacesAvantEtoiles.length() - 1);
				EspaceApresEtoile +=" ";
			}
		}
		

	}

}
