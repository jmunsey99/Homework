public class MadLib {

    public static void main (String[] args){
        System.out.println("hello world");
        MadLib myStory = new MadLib();
    }// main method

    public MadLib (){
        System.out.println("halo varld");

        //define a string called story for mad lib
        String story = "This weekend I am going camping with "
                +classmate+ ". We are going to a campsite in "
                +city+ ". I packed my "+noun+ " and "
                +pluralNoun + ".  The forecast is calling for a high of "
                +decimalBiggerThan1+ " degrees fahrenheit. So it should be a "
                +adjective+" day! This year, the park rangers have seen "
                +number1+ " " +pluralAnimal + " which seems kind of dangerous. "
                +miltonTeacher+" said it's " + trueOrFalse + " that "+pluralAnimal+ " eat class "
                +wholeNumberBetween1And4+ " students in the " +season+ ". But, "
                +miltonDean+ " said it actually has only happened "
                + number2+" times. Wish us luck! If we survive, we will earn a "
                +letterGrade+ "- in P.E. class.";

//now print story to the dos window
        System.out.println(story);



    }//constructor method

   public String classmate = "Devan";

    public String city = "Beijing";

    public String noun = "beach";

    public String adjective = "round";

    public String pluralNoun = "ziplines";

    public String pluralAnimal = "wolves";

    public boolean trueOrFalse = false;

    public double decimalBiggerThan1 = 1.89;

    public int number1 = 10;

    public int number2 = 93;

    public int wholeNumberBetween1And4 = 3;

    public String miltonTeacher = "TomGagnon";

    public String miltonDean = "Mr.Gutierrez";

    public String letterGrade = "f";

    public String season = "Spring";









}
