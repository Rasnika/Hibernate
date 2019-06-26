/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatetest;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Rasnika
 */
public class Hibernatetest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Session s = connection.Controller.getSessionFactory().openSession();
        Transaction tr = s.beginTransaction();
        pojos.Actor1 at = new pojos.Actor1();
        at.setFirstName("rasna");
        at.setLastName("poladi");
        at.setActorid(48);

        s.save(at);

        tr.commit();
        System.out.println("Saved into database");

        s.close();
        tr = null;
    }

}
