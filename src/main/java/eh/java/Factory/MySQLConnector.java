package eh.java.Factory;

public class MySQLConnector implements DBConnector{
    @Override
    public String connect(String connString) {
        if (!connString.startsWith("mysql")){
            return "MySQL: Connection string error!";
        }
        return "MySQL Connection Successful.";
    }
}
