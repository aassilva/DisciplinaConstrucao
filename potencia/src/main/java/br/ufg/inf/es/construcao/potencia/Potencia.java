package br.ufg.inf.es.construcao.potencia;

/**
 * Calcular potencia.
 * i<-1
 * p<-1
 * enquanto i<=y faa
 * p<-p*x
 * i<-i+1
 * return p
 */
public class Potencia {
   public static int potencia(int x, int y){
       if  (x < 0 || y <0){
           throw new IllegalArgumentException(" x ou y invalido");
       }

       int p = 1;
       for (int i = 1; i <= y; i++){
           p = p * x;
       }
       return p;
   }
}

