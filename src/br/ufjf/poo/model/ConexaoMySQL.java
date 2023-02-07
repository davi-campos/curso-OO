package br.ufjf.poo.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {
	private static String status = "Não conectado...";
	
	public static String criarConexao() throws SQLException, ClassNotFoundException {
		
		Connection connection = null;
		String serverName = "aaronlab.dev";//caminho do seridor do BD
		String mydatabase = "teste";//nome do seu banco de dados
		String url = "jbdc:mysql://" + serverName +"/"+mydatabase;
		String username = "root"; //nome de um usuario de su BD
		String password = "senha00123";//sua senha de acesso
		connection = DriverManager.getConnection(url,username,password);
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//testa a conexao com o bando
		if(connection != null) {
			status = ("STATUS: Conectado com sucesso!");
		}else {
			status = ("STATUS: Não foi possível realizar conexão.");
		}
		connection.close();
		return status;
	}

}
