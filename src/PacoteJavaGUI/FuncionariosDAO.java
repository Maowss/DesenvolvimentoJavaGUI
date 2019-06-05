package PacoteJavaGUI;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionariosDAO {

    private Connection con;

    public FuncionariosDAO(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public String inserir(Funcionarios funcionarios) {
        String sql = "insert into funcionarios(nome, email, rg, cpf, telefone, endereco) values(?,?,?,?,?,?)";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, funcionarios.getNomeFuncionario());
            ps.setString(2, funcionarios.getEmailFuncionario());
            ps.setString(3, funcionarios.getRgFuncionario());
            ps.setString(4, funcionarios.getCpfFuncionario());
            ps.setString(5, funcionarios.getTelefoneFuncionario());
            ps.setString(6, funcionarios.getEnderecoFuncionario());

            if (ps.executeUpdate() > 0) {
                return "Funcionario inserido com sucesso";
            } else {
                return "Erro ao inserir o produto";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public String alterar(Funcionarios funcionarios) {
        String sql = "update funcionarios set nome = ?, email = ?, rg = ?, telefone = ?, emdereco = ?";
        sql += "where cpf = ?";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, funcionarios.getNomeFuncionario());
            ps.setString(2, funcionarios.getEmailFuncionario());
            ps.setString(3, funcionarios.getRgFuncionario());
            ps.setString(4, funcionarios.getCpfFuncionario());
            ps.setString(5, funcionarios.getTelefoneFuncionario());
            ps.setString(6, funcionarios.getEnderecoFuncionario());

            if (ps.executeUpdate() > 0) {
                return "funcionario alterado com sucesso";
            } else {
                return "Erro ao alterar o funcionario";
            }

        } catch (SQLException e) {
            return e.getMessage();
        }

    }

    public String excluir(Funcionarios funcionarios) {
        String sql = "delete from funcionarios where cpf = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, funcionarios.getCpfFuncionario());
            if (ps.executeUpdate() > 0) {
                return "Excluído com sucesso.";
            } else {
                return "Erro ao excluir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public List<Funcionarios> listarTodos() {
        String sql = "select * from funcionarios ";

        List<Funcionarios> listaFuncionarios = new ArrayList<Funcionarios>();

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Funcionarios funcionarios = new Funcionarios();
                    funcionarios.setNomeFuncionario(rs.getString(1));
                    funcionarios.setEmailFuncionario(rs.getString(2));
                    funcionarios.setRgFuncionario(rs.getString(3));
                    funcionarios.setCpfFuncionario(rs.getString(4));
                    funcionarios.setTelefoneFuncionario(rs.getString(5));
                    funcionarios.setEnderecoFuncionario(rs.getString(6));
                    listaFuncionarios.add(funcionarios);
                }

                return listaFuncionarios;
            } else {
                return null;
            }

        } catch (SQLException e) {
            return null;
        }
    }
}
