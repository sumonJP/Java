package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class student {

    public static void main(String[] args) {

//        insertStudent();
//        updateStudent();
//        deleteStudent();
        queryStudent();
    }

    public static void insertStudent() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/college", "root", "sumon123");
            String s = "INSERT INTO student (id, name, gender, date_of_birth) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(s);
            ps.setInt(1, 1280111);
            ps.setString(2, "puspita");
            ps.setString(3, "male");
            ps.setString(4, "1990-12-10");
            ps.executeUpdate();

            System.out.println("Student inserted successfully");
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public static void updateStudent() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/college", "root", "sumon123");

            PreparedStatement ps = con.prepareStatement("update student set gender = 'female' where id = 1280111");
            ps.executeUpdate();

            System.out.println("Student updated successfully");
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public static void deleteStudent() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/college", "root", "sumon123");

            PreparedStatement ps = con.prepareStatement("delete from student where id = 1280110 ");
            ps.executeUpdate();

            System.out.println("Student deleted successfully");
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public static void queryStudent() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/college", "root", "sumon123");

            PreparedStatement ps = con.prepareStatement("select *  from student where id > 1280107 ");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int a = rs.getInt(1);
                String b = rs.getString(2);
                String c = rs.getString(3);
                String d = rs.getString(4);
                System.out.println("ID = "+a+" "+"Name = "+b+" " + "Gender = "+c+" " +"date of birth = "+ d);
            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
