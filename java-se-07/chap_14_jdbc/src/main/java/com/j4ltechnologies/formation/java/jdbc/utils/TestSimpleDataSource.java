package com.j4ltechnologies.formation.java.jdbc.utils;

import java.sql.Connection;
import java.sql.SQLException;


public class TestSimpleDataSource{
	public static void main(String[] args) {
		try {
			SimpleDataSource.init("mysqlParam");
			System.out.println("DRIVER OK");
			
			try(Connection connection = SimpleDataSource.getConnection()){
				System.out.println("CONNEXION OK");
			} catch (SQLException e) {
				System.out.println("CONNEXION NOK");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("DRIVER NOK");
		}
	}
}