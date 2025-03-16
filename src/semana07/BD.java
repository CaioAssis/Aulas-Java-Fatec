package semana07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Classe responsável por realizar a conexão ao banco de dados
 * @author caio.assis
 *
 */
public class BD {
	// faz conexão ao BD
	public Connection con = null;
	
	// executa instruções sql
	public PreparedStatement st = null;
	
	// recebe resultado de uma query (select)
	public ResultSet rs = null;
	
	
	////////////////////////////////////////////////////////////////
	// caminho do driver
	private final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	// nome do BD
	private final String DATABASE_NAME = "testePoo";
	// caminho do BD. Padrao sqlserver = jdbc:sqlserver://localhost:1433
	private final String URL = "jdbc:sqlserver://localhost:1433;databasename=" + DATABASE_NAME;
	
	
	// credenciais normalmente colocadas em arquivo a parte
	private final String LOGIN = "sa";
	private final String PASSWORD = "fatec";
	////////////////////////////////////////////////////////////////

	
	
	
	public boolean getConnection() {
		try {
			Class.forName(DRIVER); // carrega o driver
			con = DriverManager.getConnection(URL, LOGIN, PASSWORD);
			System.out.println("Driver carregado.");
			return true;
		}
		catch(SQLException e) {
			System.out.println("Falha na conexão: " + e);
		}
		catch(ClassNotFoundException e) {
			System.out.println("Driver não encontrado!");
		}
		return false;
	}
	
	public void close() {
		
		try {
			if(rs!=null) rs.close();
		} catch (SQLException e) {
			System.out.println("Erro: " + e);
		}
		try {
			if(st!=null) st.close();
		} catch (SQLException e) {
			System.out.println("Erro: " + e);
		}
		try {
			if(con!=null) con.close();
			System.out.println("Desconectado.");
		} catch (SQLException e) {
			System.out.println("Erro: " + e);
		}
	}
	
	public static void main(String[] args) {
		BD bd = new BD();
		bd.getConnection();
		//executar ação
		bd.close();
	}
}
