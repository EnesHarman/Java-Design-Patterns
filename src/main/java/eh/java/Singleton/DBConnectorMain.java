package eh.java.Singleton;

public class DBConnectorMain {
    public static void main(String args[]){
        DBConnector connector1 = DBConnector.getDbConnector();

        DBConnector connector2 = DBConnector.getDbConnector();

        DBConnector connector3 = DBConnector.getDbConnector();

        DBConnector connector4 = DBConnector.getDbConnector();

        connector1.connectDB();
        connector2.connectDB();
        connector3.connectDB();
        connector4.connectDB();
    }
}
