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
import java.util.List;

/**
 *
 * @author noffa
 */
public class Cours {
    private String intitule;
        String duree;
        int prof;

    public Cours(String intitule, String duree, int prof) {
        this.intitule = intitule;
        this.duree = duree;
        this.prof = prof;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public int getProf() {
        return prof;
    }

    public void setProf(int prof) {
        this.prof = prof;
    }
    
    public void add() {
        Connection conn = DataAccess.connect();
        try {
            PreparedStatement prstm =  conn.prepareStatement("INSERT INTO cours(intitule, duree, idprof) values(?,?,?);");
            prstm.setString(1, this.getIntitule());
            prstm.setString(2, this.getDuree());
            prstm.setInt(3, this.getProf());
            if(prstm.execute()){
                System.out.println("New 'Cours' inserted.");
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
            prstm = conn.prepareStatement("UPDATE cours SET intitule = ?, duree = ? WHERE idcours = ?;");
            prstm.setString(1, this.getIntitule());
            prstm.setString(2, this.getDuree());
            prstm.setInt(3, id);
            if(prstm.execute()){
                System.out.println("A 'Cours' updated.");
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
            prstm = conn.prepareStatement("DELETE cours WHERE idcours = ?;");
            prstm.setInt(1, id);
            if(prstm.execute()){
                System.out.println("A 'Cours' deleted.");
            }
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    public static Collection<Cours> select() {
        Connection conn = DataAccess.connect();
        PreparedStatement prstm;
        try {
            prstm = conn.prepareStatement("SELECT * FROM cours;");
            if(prstm.execute()){
                System.out.println("A 'Cours' selected with 'intitule'.");
            }
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }
    
    public static Cours select(int id) {
        Connection conn = DataAccess.connect();
        PreparedStatement prstm;
        try {
            prstm = conn.prepareStatement("SELECT * FROM cours WHERE idcours = ?;");
            prstm.setInt(1, id);
            if(prstm.execute()){
                System.out.println("A 'Cours' Selectes with id: " + id);
            }
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }
    
    public static Cours select(String intitule) {
        Connection conn = DataAccess.connect();
        PreparedStatement prstm;
        try {
            prstm = conn.prepareStatement("SELECT * FROM cours WHERE intitule = ?;");
            prstm.setString(1, intitule);
            if(prstm.execute()){
                System.out.println("A 'Cours' selected with 'intitule':" + intitule);
            }
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return null;
    }    
    
    public Collection<Prof> getProfCours() {
        Connection conn = DataAccess.connect();
        PreparedStatement prstm;
        try {
            prstm = conn.prepareStatement("SELECT nomprof, prenomprof, intitule, duree FROM prof p INNER JOIN cours c ON p.idprof = c.idprof WHERE intitule = ?;");
            prstm.setString(1, this.getIntitule());
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
        return "Cours{" + "intitule=" + intitule + ", duree=" + duree + ", prof=" + prof + '}';
    }
    
    
}
