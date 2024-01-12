package src.dip.solution;

import src.dip.problem.MySQLConnection;

public class ProductRepository {

    private DBConnection dbConnection;
    public ProductRepository(DBConnection dbConnection){
        this.dbConnection = dbConnection;
    }
}
