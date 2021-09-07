/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orm.mysql.demo;

import dao.CustomerDAO;
import entity.Customer;

/**
 *
 * @author dangt
 */
public class OrmMysqlDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CustomerDAO customerDAO = new CustomerDAO();
        Customer c = customerDAO.getCustomerById(2);
        System.out.println(c);
    }
    
}
