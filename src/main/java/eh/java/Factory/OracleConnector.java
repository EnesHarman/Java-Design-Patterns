package eh.java.Factory;

public class OracleConnector implements DBConnector{
    @Override
    public String connect(String connString) {
        if(!connString.startsWith("oracle")){
            return "Oracle: Connection string error!";
        }
        return "Oracle Connection Successful.";
    }
}
