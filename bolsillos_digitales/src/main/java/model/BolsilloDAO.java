package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BolsilloDAO {
    public class BolsilloVO extends Connect{
        Connection con; 
        PreparedStatement ps; 
        ResultSet rs; 
        String sql=null;  
}
}
