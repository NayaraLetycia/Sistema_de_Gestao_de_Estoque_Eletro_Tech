package org.example;

import controller.ProdutoDAO;
import model.Produto;

import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {

        ProdutoDAO produtoDAO = new ProdutoDAO();
        ArrayList<Produto> produtos = new ArrayList<>();

        produtoDAO.insert();
        produtos = produtoDAO.getall();

        for (Produto produto:produtos){
            System.out.println(produto);

        }

    }
}