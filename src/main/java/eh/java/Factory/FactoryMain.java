package eh.java.Factory;

public class FactoryMain {
    public static void main(String[] args){
        DBConnectorFactory connectorFactory = new DBConnectorFactory();

        DBConnector mySqlConnector = connectorFactory.getConnector(Databases.MYSQL);
        DBConnector oracleConnector = connectorFactory.getConnector(Databases.ORACLE);

        System.out.println(mySqlConnector.connect("mysql:3306/localhost"));

        System.out.println(oracleConnector.connect("mysql:3306/localhost"));
        System.out.println(oracleConnector.connect("oracle:3306/localhost"));
    }
}
