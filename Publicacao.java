package br.com.newton.poo.ex2;

public interface Publicacao {
    public String void buscarTitulo(String titulo){
        return ;
    }
    public abstract void visualizarDetalhes(){
        System.out.println( titulo + descricao + tipo + status + local_achado + data_hora + foto );
        return ;
    }
}
