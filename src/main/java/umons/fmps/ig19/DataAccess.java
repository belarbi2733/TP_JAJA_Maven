/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umons.fmps.ig19;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 *
 * @author noffa
 */
public class DataAccess {
    private String dbName, dbUser, dbPass, dbHost, dbServer, dbPort="3306";

    public DataAccess() {
        dbName = "test_java";
        dbUser = "root";
        dbPass = "";
        dbHost = "localhost";
        dbServer = "mysql";
    }

    public DataAccess(String dbName, String dbUser, String dbPass, String dbHost, String dbServer) {
        this.dbName = dbName;
        this.dbUser = dbUser;
        this.dbPass = dbPass;
        this.dbHost = dbHost;
        this.dbServer = dbServer;
    }
    
    public void connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String dsn = String.join("", "jdbc:", dbServer, "://", dbHost, ":", dbPort, "/", dbName);
            System.out.println("dsn = " + dsn);
            Connection con = DriverManager.getConnection(dsn, dbUser, dbPass);
            Reader reader = new BufferedReader(new FileReader("./db.sql"));
            
        } catch(FileNotFoundException | ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public String getDbPass() {
        return dbPass;
    }

    public void setDbPass(String dbPass) {
        this.dbPass = dbPass;
    }

    public String getDbHost() {
        return dbHost;
    }

    public void setDbHost(String dbHost) {
        this.dbHost = dbHost;
    }

    public String getDbServer() {
        return dbServer;
    }

    public void setDbServer(String dbServer) {
        this.dbServer = dbServer;
    }
}
