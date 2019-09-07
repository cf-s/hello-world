public class HelloWorld {

  public static void main (String[] args){

    System.out.println("Hello World!!");

    fizzBuzz();
  }

  public static void fizzBuzz(){
    for (int i = 1; i<101; i++){
      if(i%3 == 0) System.out.print("Fizz");
      if(i%5 == 0) System.out.print("Buzz");
      if (i%3!=0 && i%5!=0) System.out.print(i);
      System.out.println();
    }
  }
}

