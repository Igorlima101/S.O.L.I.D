package src.dip.problem;

public class ProductRepository {

    private MySQLConnection mySQLConnections;

    public ProductRepository(MySQLConnection mySQLConnection){
        this.mySQLConnections = mySQLConnection;
    }
}
