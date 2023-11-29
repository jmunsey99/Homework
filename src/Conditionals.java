public class Conditionals {
    public static void main(String[] args) {
        Conditionals MagicEightBall= new Conditionals();

    }
    public double randomInt;

    public Conditionals (){
     String question = "Will the patriots win the super bowl in the next 10 years?";
     System.out.println(question);

    System.out.println(" ");
     randomInt = Math.random();

     if (randomInt < 0.2){
         System.out.println("Absolutely!" + "     Number: " + randomInt);

     }else if (randomInt < 0.4) {
            System.out.println("Yes, but only a 90% chance" + "     Number: " + randomInt);

        }else if (randomInt < 0.6) {
         System.out.println("50/50" + "     Number: " + randomInt);

     }else if (randomInt < 0.8){
         System.out.println("Probably Not, but I'll give you a 20% chance" + "     Number: " + randomInt);

     }else if (randomInt < 1.0){
         System.out.println ("Absolutely Not" + "     Number: " + randomInt);

     }




    }


}


