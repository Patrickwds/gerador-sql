import static org.junit.Assert.*;

import org.junit.Test;

public class GeradorSqlTest {
	
	@Test
	public void insertIntoTabela() {
		String nomeTabela = "nome_tabela";
		String[] nomeColunas = {"coluna1","coluna2"};
		String[] valorCampos = {"15","30"};
		String codigoSQL = GeradorSql.insert(nomeTabela, nomeColunas, valorCampos);
		assertEquals("INSERT INTO nome_tabela(coluna1,coluna2) VALUES(15,30)", codigoSQL);	
		}
	
	@Test
	public void insertIntoOutraTabela() {
		String nomeTabela = "nome_tabela";
		String[] nomeColunas = {"coluna1","coluna2","coluna3"};
		String[] valorCampos = {"15","30","40"};
		String codigoSQL = GeradorSql.insert(nomeTabela, nomeColunas, valorCampos);
		assertEquals("INSERT INTO nome_tabela(coluna1,coluna2,coluna3) VALUES(15,30,40)", codigoSQL);	
		}
	
}
