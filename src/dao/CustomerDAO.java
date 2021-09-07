/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Customer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dangt
 */
public class CustomerDAO extends DBContext {

    public Customer getCustomerById(int id) {
        try {
            String sql = "select * from customer where cust_id=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Customer c = new Customer();
                c.setCustId(rs.getInt(1));
                c.setAddress(rs.getString(2));
                c.setCity(rs.getString(3));
                c.setCustTypeCd(rs.getString(4));
                c.setFedId(rs.getString(5));
                c.setPostalCode(rs.getInt(6));
                c.setState(rs.getString(7));
                return c;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
