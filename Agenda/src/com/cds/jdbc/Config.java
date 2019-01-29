package com.cds.jdbc;
/*
 * Ing. Jaime Ramirez
 * Configuracion de acceso a BD
 */

abstract class Config{
	
	// Librería de MySQL
    protected final String driver = "com.mysql.jdbc.Driver";

    // Nombre de la base de datos
    protected final  String database = "agenda";

    // Host
    protected final String hostname = "localhost";

    // Puerto
    protected final String port = "3306";
    
    protected final String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false";

    // Nombre de usuario
    protected final String username = "root";

    // Clave de usuario
    protected final String password = "";
}
