package edu.grinnell.glimmer.mist.Evaluator;

public class Function
{
  /*
   * All functions used in MIST
   */
  
  /**
   * @param double, a and b
   * @return a number, the product of two values
   */
  public static double mult(double ... args){
    double product = 1;
    for (double numbers : args ){
    product *= numbers;
  }
    return product;
  }
  

  /**
   * @return double
   * @param double 
   */
  public static double sum(double ... args){
    double summation = 0;
    for (double numbers : args ){
    summation += numbers;
  }
    return summation;
  }
  
  /**
   * @return double
   * @param double
   */
  public static double sub(double ... args){
    double subtraction = 0;
    for(double numbers : args){
    	subtraction -= numbers;
    }
    
    return subtraction;
  }
  
 
  
  public static void main(String[] args)
  {
    double a = 0.2;
    double b = 0.2;
    double c = 0.2;
    System.out.println(Function.mult(a, b , c));
    System.out.println(Function.sum(a, b, c));
    
  }
}
