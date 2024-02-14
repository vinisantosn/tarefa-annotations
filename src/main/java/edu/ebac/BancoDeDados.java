package edu.ebac;

/**
 * @author vinisantosn
 */
public class BancoDeDados {
    @Tabela(nome = "tbl_alunos")
    public static void criarTabelaAlunos() {
        System.out.println("CRIANDO TABELA DE ALUNOS ...");
    }
}