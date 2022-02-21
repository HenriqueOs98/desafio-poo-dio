package br.com.dio.desafio.dominio;

import lombok.Data;
import lombok.NonNull;
import lombok.Value;

@Data
public class Curso extends Conteudo{

   private int cargaHoraria;

   @Override
   public double calcularXp(){
      return XP_PADRAO * cargaHoraria;
   }

}
