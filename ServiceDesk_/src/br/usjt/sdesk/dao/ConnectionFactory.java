package br.usjt.sdesk.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Fábrica de conexão
public class ConnectionFactory {
	
	//Obtém conexão com o Banco de Dados
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/servicedesk?user=root&password=021504\"");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

