public class Loops {
    public static void main(String[] args) {
Loops myCount = new Loops();
    }

    public Loops (){
    System.out.println("First Challenge");
        countUp();
    System.out.println("Second challenge");
    countByThrees();
    System.out.println();
    System.out.println("Third challenge");
    countDown();
    System.out.println();
    System.out.println("Happy Loop Year!");

    }// end of loops method

    public void countUp (){

        for (int i = 1; i <= 5; i = i+1){
            System.out.println(i);
        }


    }
    public void countByThrees () {
        for (int i = 3; i <= 15; i = i + 3) {
            System.out.print(i + " ");
        }

    }
public void countDown (){

        for (int i = 10; i >= 1; i = i-1){
            if (i >=2){
                System.out.print(i + ", " );
            }else System.out.print(i);
        }

}


}// end of loops class
