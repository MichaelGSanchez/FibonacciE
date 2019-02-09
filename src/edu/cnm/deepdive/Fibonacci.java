package edu.cnm.deepdive;

public class Fibonacci {

  public static void main (String[] args){

    long prev = 0;
    long curr = 1;
    long temp = 0;
    long evenTemp = 0;
    long currEvenTemp = 0;

    do{
      temp = prev + curr;
      if (temp % 2 == 0){
        evenTemp = temp;
        currEvenTemp += evenTemp;
      }
      prev = curr;
      curr = temp;
    } while (temp < 4_000_000);
    System.out.println(temp);
    System.out.println(evenTemp);
    System.out.println(currEvenTemp);
  }

}
