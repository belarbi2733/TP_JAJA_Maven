/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umons.fmps.ig19;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

/**
 *
 * @author noffa
 */
public class Prof {
    private String name;
            String firstname;
            String dateNaiss;
            String lieuNaiss;

    public Prof(String name, String firstname, String dateNaiss, String lieuNaiss) {
        this.name = name;
        this.firstname = firstname;
        this.dateNaiss = dateNaiss;
        this.lieuNaiss = lieuNaiss;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(String dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public String getLieuNaiss() {
        return lieuNaiss;
    }

    public void setLieuNaiss(String lieuNaiss) {
        this.lieuNaiss = lieuNaiss;
    }
    
    public void add() {
        Connection conn = DataAccess.connect();
        try {
            PreparedStatement prstm =  conn.prepareStatement("INSERT INTO prof(nomprof, prenomprof, datenaiss, lieunaiss) values(?,?,?,?);");
            prstm.setString(1, this.getName());
            prstm.setString(2, this.getFirstname());
            prstm.setString(3, this.getDateNaiss());
            prstm.setString(4, this.getLieuNaiss());
            if(prstm.execute()){
                System.out.println("New prof inserted.");
            }
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    public void update(int id) {
        Connection conn = DataAccess.connect();
        PreparedStatement prstm;
        try {
            prstm = conn.prepareStatement("UPDATE prof SET nomprof = ?, prenomprof = ? WHERE idprof = ?;");
            prstm.setString(1, this.getName());
            prstm.setString(2, this.getFirstname());
            prstm.setInt(3, id);
            if(prstm.execute()){
                System.out.println("A prof updated.");
            }
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    public static void delete(int id) {
        Connection conn = DataAccess.connect();
        PreparedStatement prstm;
        try {
            prstm = conn.prepareStatement("DELETE prof WHERE idprof = ?;");
            prstm.setInt(1, id);
            if(prstm.execute()){
                System.out.println("A prof deleted.");
            }
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    public static Collection<Prof> select() {
        Connection conn = DataAccess.connect();
        PreparedStatement prstm;
        try {
            prstm = conn.prepareStatement("SELECT * FROM prof;");
            if(prstm.execute()){
                System.out.println("All prof selected.");
            }
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }
    
    public static Prof select(int id) {
        Connection conn = DataAccess.connect();
        PreparedStatement prstm;
        try {
            prstm = conn.prepareStatement("SELECT * FROM prof WHERE idprof = ?;");
            prstm.setInt(1, id);
            if(prstm.execute()){
                System.out.println("A prof selected.");
            }
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }
    
    public static Collection<Prof> select(String name) {
        Connection conn = DataAccess.connect();
        PreparedStatement prstm;
        try {
            prstm = conn.prepareStatement("SELECT * FROM prof WHERE nomprof = ?;");
            prstm.setString(1, name);
            if(prstm.execute()){
                System.out.println("A prof selected.");
            }
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }
    
    public Collection<Cours> getListCours() {
        Connection conn = DataAccess.connect();
        PreparedStatement prstm;
        try {
            prstm = conn.prepareStatement("SELECT * FROM cours WHERE nomprof = ? AND prenomprof = ?;");
            prstm.setString(1, this.getName());
            prstm.setString(2, this.getFirstname());
            if(prstm.execute()){
                System.out.println("A List of 'Cours' of a 'Prof'.");
            }
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }
    
    @Override
    public String toString() {
        return "Prof{" + "name=" + name + ", firstname=" + firstname + ", dateNaiss=" + dateNaiss + ", lieuNaiss=" + lieuNaiss + '}';
    }
    
    
}
