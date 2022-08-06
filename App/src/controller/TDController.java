/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.TD;

/**
 *
 * @author Dell
 */
public class TDController {
    public static List<TD> findAllTD() {
        List<TD> TDList = new ArrayList<>();

        Connection connection = null;
        Statement statement = null;
        PreparedStatement prestatement = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/league_football_management", "root", "trung123Aa");

            //query
            String sql = "SELECT matran, tentran FROM trandau";
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                TD td;
                td = new TD(resultSet.getInt("matran"),
                        resultSet.getInt("tentran"));
                TDList.add(td);
            }

        } catch (SQLException ex) {
            Logger.getLogger(TDController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(TDController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(TDController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        // Kết thúc
        return TDList;
    }
}
