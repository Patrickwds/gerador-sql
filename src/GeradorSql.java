
public class GeradorSql {

	public static String insert(String nomeTabela, String[] nomeColunas,
			String[] valorCampos) {
		String Tabela  = nomeTabela;
		
		String primeiraColunas = nomeColunas[0];
		String outrasColunas = "";
		
		String primeiroCampo = valorCampos[0]; 
		String outrasCampos = "";

		int i;
		for (i=1; i < nomeColunas.length; i++){
			outrasColunas = outrasColunas + "," + nomeColunas[i];
		}
		
		for (i=1; i < valorCampos.length; i++){
			outrasCampos = outrasCampos + "," + valorCampos[i];
		}
	    
		return "INSERT INTO " + Tabela + "(" + primeiraColunas + outrasColunas + ")" + " VALUES" + "(" + primeiroCampo + outrasCampos+")";
}
}
