package semana08BD;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
	private String driver = "";
	// nome do BD
	private String databaseName = "";
	// caminho do BD. Padrao sqlserver = jdbc:sqlserver://localhost:1433
	private String url = "";
	
	
	// credenciais normalmente colocadas em arquivo a parte
	private String login = "";
	private String password = "";
	////////////////////////////////////////////////////////////////

	public BD() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("banco.txt")); //leitor de arquivos - usando arquivo na raiz do projeto
			driver = br.readLine();
			databaseName = br.readLine();
			url = br.readLine() + databaseName; // copia a linha da url + o nome da database
			login = br.readLine();
			password = br.readLine();
			br.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
	
	
	public boolean getConnection() {
		try {
			Class.forName(driver); // carrega o driver
			con = DriverManager.getConnection(url, login, password);
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
