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

    public String inserir(Produtos produtos) {
        String sql = "insert into produtos(nome, quantidade, preco, codBarra, tipoProduto) values(?,?,?,?,?)";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, produtos.getNome());
            ps.setString(2, produtos.getQuantidade());
            ps.setString(3, produtos.getPreco());
            ps.setString(4, produtos.getCodBarra());
            ps.setString(5, produtos.getTipoProduto());

            if (ps.executeUpdate() > 0) {
                return "Produto inserido com sucesso";
            } else {
                return "Erro ao inserir o produto";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public String alterar(Produtos produtos) {
        String sql = "update produtos set nome = ?,quantidade = ?,preco = ?, tipoProduto = ?";
        sql += "where codBarra = ?";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, produtos.getNome());
            ps.setString(2, produtos.getQuantidade());
            ps.setString(3, produtos.getPreco());
            ps.setString(4, produtos.getTipoProduto());
            ps.setString(5, produtos.getCodBarra());
            

            if (ps.executeUpdate() > 0) {
                return "Produto alterado com sucesso";
            } else {
                return "Erro ao alterar o produto";
            }

        } catch (SQLException e) {
            return e.getMessage();
        }

    }

    public String excluir(Produtos produtos) {
        String sql = "delete from produtos where codBarra = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, produtos.getCodBarra());
            if (ps.executeUpdate() > 0) {
                return "Excluído com sucesso.";
            } else {
                return "Erro ao excluir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }


    public List<Produtos> listarTodos() {
        String sql = "select * from produtos "; 

        List<Produtos> listaProdutos = new ArrayList<Produtos>(); 

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ResultSet rs = ps.executeQuery(); 

            if (rs != null) { 
                while (rs.next()) {
                    Produtos produtos = new Produtos();
                    produtos.setNome(rs.getString(1));
                    produtos.setQuantidade(rs.getString(2));
                    produtos.setPreco(rs.getString(3));
                    produtos.setCodBarra(rs.getString(4));
                    produtos.setTipoProduto(rs.getString(5));
                    listaProdutos.add(produtos);
                }
                    
                return listaProdutos;
            }else{
                return null;
            }

        } catch (SQLException e) {
            return null;
        }
    }
}