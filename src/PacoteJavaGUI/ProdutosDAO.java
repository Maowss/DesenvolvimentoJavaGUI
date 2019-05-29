package PacoteJavaGUI;
import java.sql.*;
import java.util.*;

public class ProdutosDAO {
    
    private Connection con;

    public ProdutosDAO() {
    }

    public ProdutosDAO(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public String inserir(){
        
    }
    
}
