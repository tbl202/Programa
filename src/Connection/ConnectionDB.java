package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDB {

	public static String status = "Não conectado...";

	private static String serverName, database, url, username, password;

	private static Connection con = null;
	private static Statement state;

	//Instanciar a classe
	public ConnectionDB() {
		serverName = "localhost:3306";
		database = "tbl_20";
		url = "jdbc:mysql://" + serverName + "/" + database;
		username = "root";
		password = "1234";
	}

	//Conectar ao BD
	public static Statement getConexao() {

		try {

			con = DriverManager.getConnection(url, username, password);
			state = con.createStatement();

			if (con != null) {

				status = ("STATUS: Conectado com sucesso!");

			} else {

				status = ("STATUS: Não foi possivel realizar a conexão!");
				
			}
			
			return state;
		}

		catch (SQLException ex) {
			
			System.out.println("Não foi possivel conectar ao Banco de Dados");
			
			return null;			
		}

	}
	
	//Mostrar se a Conexão está ativa ou não
	public static String statusConexao() {
		
		return status;		
	}
	
	//Fechar a conexão com o BD
	public static boolean fecharConexao() {
		
		try {
		
			con.close();
			
			return true;			
		}
		
		catch (SQLException ex) {
			
			return false;			
		}
		
	}

}
