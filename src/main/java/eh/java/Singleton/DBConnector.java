package eh.java.Singleton;

public class DBConnector {
    private static DBConnector dbConnector;

    //constructor must be private
    private DBConnector() {
    }

    public static DBConnector getDbConnector(){
        if(dbConnector ==null){
            System.out.println("New instance has been created.\n");
            dbConnector = new DBConnector();
        }
        System.out.println("Old instance has been returned. \n");
        return dbConnector;
    }

    public void connectDB(){
        System.out.println("DB connection is successful.");
    }
}
