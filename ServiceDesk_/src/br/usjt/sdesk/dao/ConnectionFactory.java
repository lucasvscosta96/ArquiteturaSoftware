package br.usjt.sdesk.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//F�brica de conex�o
public class ConnectionFactory {
	
	//Obt�m conex�o com o Banco de Dados
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/servicedesk?user=root&password=021504\"");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

