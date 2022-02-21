package br.com.dio.desafio.dominio;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
public abstract class Conteudo {


    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;


    public abstract double calcularXp();

}
