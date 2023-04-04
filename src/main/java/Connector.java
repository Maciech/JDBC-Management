import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
public class Connector {
    static final String DB_URL = "jdbc:mysql://127.0.0.1:3306";
    static final String DB_URL_Library = "jdbc:mysql://127.0.0.1:3306/ksiegarnia";
    static final String DB_URL_World = "jdbc:mysql://127.0.0.1:3306/world";
    static final String DB_URL_Ptaki = "jdbc:mysql://127.0.0.1:3306/ptaki";
    static final String USER = "root";
    static final String PASS = "";
    //static final String QUERY = "SELECT * FROM ksiegarnia.klienci LIMIT 3";

    public static void connectLibrary() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String QUERY = null;
        try {
            QUERY = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(QUERY)) {
            // Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                System.out.print(rs.getInt("idklienta")+" ");
                System.out.print(rs.getString("imie")+" ");
                System.out.print(rs.getString("nazwisko")+" ");
                System.out.print(rs.getString("miejscowosc")+" ");
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }


    }

    public static void connectWorld() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String QUERY = null;
        try {
            QUERY = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(QUERY)) {
            // Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                System.out.print(rs.getInt("ID")+" ");
                System.out.print(rs.getString("Name")+" ");
                System.out.print(rs.getString("CountryCode")+" ");
                System.out.print(rs.getString("District")+" ");
                System.out.print(rs.getInt("Population")+" ");
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }


    }

    public static void connectBirds() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String QUERY = null;
        try {
            QUERY = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (Connection conn = DriverManager.getConnection(DB_URL_Ptaki, USER, PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(QUERY)) {
            // Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                System.out.print(rs.getInt("idklienta")+" ");
                System.out.print(rs.getString("imie")+" ");
                System.out.print(rs.getString("nazwisko")+" ");
                System.out.print(rs.getString("miejscowosc")+" ");
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }


    }
}
