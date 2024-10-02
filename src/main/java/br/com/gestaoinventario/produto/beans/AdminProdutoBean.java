package br.com.gestaoinventario.produto.beans;

import br.com.gestaoinventario.produto.models.Produto;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class AdminProdutoBean {

    private Produto produto = new Produto();

    public void salvar() {
        System.out.println("Produto cadastrado: " + produto);
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
