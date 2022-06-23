package eh.java.Factory;

public class DBConnectorFactory {
    public DBConnector getConnector(Databases database){
        switch (database){
            case MYSQL:
                return new MySQLConnector();
            case ORACLE:
                return new OracleConnector();
            default:
                return null;
        }
    }
}
