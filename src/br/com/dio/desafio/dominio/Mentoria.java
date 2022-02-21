package br.com.dio.desafio.dominio;

import lombok.Data;
import lombok.NonNull;

import java.time.LocalDate;


@Data
public class Mentoria extends Conteudo {

    private LocalDate data;

    @Override
    public double calcularXp(){
        return XP_PADRAO + 20d;
    }




}
