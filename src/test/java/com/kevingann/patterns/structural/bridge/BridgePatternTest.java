package com.kevingann.patterns.structural.bridge;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BridgePatternTest {

    /**
     * Meant to decouple abstraction and implementation.
     * Encapsulation, Composition, Inheritance.
     * Changes in Abstraction won't affect client.
     * Examples:
     * JDBC
     * Drivers
     * <p/>
     * Design
     * Interfaces and Abstract classes
     * Composition over Inheritance
     * More than Composition
     * Expect change from both sides
     */

    @Test
    public void testThatBridgePatternWorks() {
        Color blue = new Blue();

        Shape square = new Square(blue);
        square.applyColor();

        Color red = new Red();
        Shape redCircle = new Circle(red);
        redCircle.applyColor();

        // Note that when adding new colors it doesn't affect Shape.
        Color green = new Green();

        // The Shape takes an instance of (uses composition).
        Shape greenCircle = new Circle(green);

        // Shape doesn't know anything about what applyColor does but Color does.
        greenCircle.applyColor();
    }

    @Test
    public void testThatEverydayUsageOfPatternWorks() {
        try {
            // JDBC is an API
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
            String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
            Connection connection = DriverManager.getConnection(dbUrl);
            Statement statement = connection.createStatement();
            String sql = "CREATE TABLE Address (ID INT, StreetName VARCHAR(20), City VARCHAR(20))";

            // This client is an abstraction and can work with any database that has a driver.
            statement.executeUpdate(sql);
            System.out.print("Table Created");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
