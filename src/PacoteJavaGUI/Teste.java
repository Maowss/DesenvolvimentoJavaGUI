package PacoteJavaGUI;

import java.sql.Connection;

public class Teste {

    public static void main(String[] args) {
        Connection con = Conexao.abrirConexao();

        Produtos produtos = new Produtos();
        ProdutosDAO prodDao = new ProdutosDAO(con);

        //INSERIR
//        produtos.setNome("Moranga");
//        produtos.setQuantidade("12");
//        produtos.setPreco("1.20");
//        produtos.setCodBarra("0987654321");
//        produtos.setTipoProduto("André");
//        System.out.println(prodDao.inserir(produtos)); 

        //ALTERAR
//        produtos.setNome("Miçanga");
//        produtos.setQuantidade("20");
//        produtos.setPreco("3.80");
//        produtos.setTipoProduto("Jaguatirica");
//        produtos.setCodBarra("0987654321");
//        System.out.println(prodDao.alterar(produtos));

//        EXCLUIR
//        produtos.setCodBarra("Carro 1");
//        System.out.println(prodDao.excluir(produtos));



        Funcionarios funcionarios = new Funcionarios();
        FuncionariosDAO funcDAO = new FuncionariosDAO(con);
        
        funcionarios.setNomeFuncionario("Moranga");
        funcionarios.setEmailFuncionario("12");
        funcionarios.setRgFuncionario("1.20");
        funcionarios.setCpfFuncionario("0987654321");
        funcionarios.setTelefoneFuncionario("André");
        funcionarios.setEnderecoFuncionario("André");

        System.out.println(funcDAO.inserir(funcionarios));     
    }
}
