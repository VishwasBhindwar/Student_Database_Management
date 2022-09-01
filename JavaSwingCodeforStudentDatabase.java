import javax.swing.*;
import java.awt.*;
import java.awt.Image;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.*;
import javafx.print.Printer;
import java.io.*;
import java.io.IOException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SchoolRecord extends javax.swing.JFrame {
 
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    class jbutton1{
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/student", "root",
            "root");
        stmt = con.createStatement();
        String rollno = jTextField1.getText();
        String name = jTextField2.getText();
        String class = jTextField3.getText();
        String sec = jTextField4.getText();
        String adr = jTextArea1.getText();
        String INSERT = "INSERT INTO RECORD VALUES('"
                        + rollno + "','" + name + "','"
                        + class + "','" + sec + "','" + adr
                        + "');";
        stmt.executeUpdate(INSERT);
        JOptionPane.showMessageDialog(
            this, "Record Added Successfully");
        jButton1.setEnabled(true);
    }
    catch (Exception e) {
        JOptionPane.showMessageDialog(
            this, "Error In Connectivity");
    }
}
class jbutton2{

DefaultTableModel model
    = (DefaultTableModel)jTable1.getModel();
try {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/student", "root",
        "root");
    String query = "SELECT* FROM RECORD;";
    ResultSet rs = stmt.executeQuery(query);
    while (rs.next()) {
        String rollno = rs.getString("rollno");
        String name = rs.getString("name");
        String class = rs.getString("class");
        String sec = rs.getString("section");
        String adr = rs.getString("address");
        model.addRow(
            new Object[] { rollno, name, class, sec, adr });
    }
    rs.close();
    stmt.close();
    con.close();
}
catch (Exception e) {
    JOptionPane.showMessageDialog(this,
                                  "Error In Connectivity");
}
}

class jbutton3{

jTextField1.setText("");
jTextField2.setText("");
jTextField3.setText("");
jTextField4.setText("");
jTextArea1.setText("");
DefaultTableModel dm
    = (DefaultTableModel)jTable1.getModel();
dm.getDataVector().removeAllElements();
jTable1.repaint();
}

class jbutton4{
System.exit(0);
}
