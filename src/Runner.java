import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a sport theme: Football, Soccer or basketball");
        String sport = myObj.nextLine();

        if (sport.equals("Football")) {
            System.out.println("Here is your madlips word problem: My Berkeley High School's football team (1). I absolutely (2) the football team." +
                    "To me, football is (3). My favorite football player is (4). (5) won this year's superbowl. To play football, one must (6) the football " +
                    " with their (7). Football is quite dangerous to play, one must wear (8) to play.");
            System.out.println("Your first sentence is: My Berkeley High School's football team (1)");
            System.out.println("Please enter a adjective for (1)");

            String num1 = myObj.nextLine();

            System.out.println("Your second sentence is: I absolutely (2) the football team.");
            System.out.println("Please enter a verb for (2)");

            String num2 = myObj.nextLine();

            System.out.println("Your third sentence is: Your third sentence is: To me, Football is (3)");
            System.out.println("Please enter an adjective for (3)");

            String num3 = myObj.nextLine();


            System.out.println("Your fourth sentence is: My favorite football player is (4).");
            System.out.println("Please enter a football player for (4)");

            String num4 = myObj.nextLine();

            System.out.println("Your fifth sentence is: (5) won this year's superbowl.");
            System.out.println("Please enter this year's superbowl winner");

            String num5 = myObj.nextLine();

            System.out.println("Your sixth sentence is: To play football, one must (6) the football with their (7)");
            System.out.println("Please enter a verb for (6)");
            String num6 = myObj.nextLine();
            System.out.println("Please enter a noun for (7)");
            String num7 = myObj.nextLine();

            System.out.println("Your seventh sentence is: Football is quite dangerous to play, one must wear (8) to play");
            System.out.println("Please enter a noun for (8)");

            String num8 = myObj.nextLine();

            System.out.println("Here is your new madlips paragraph: My Berkeley High School's football team " + num1 + ". I absolutely " + num2 + " the football team." +
                    "To me, football is " + num3 + ". My favorite football player is " + num4 + ". " + num5 + " won this year's superbowl. To play football, one must " + num6 + " the football " +
                    " with their " + num7 + ". Football is quite dangerous to play, one must wear " + num8 + " to play.");


        } else if (sport.equals("Soccer")) {
            System.out.println("Here is your madlips word problem: My Berkeley High School's soccer team (1). I absolutely (2) the soccer team." +
                    "To me, soccer is (3). My favorite soccer player is (4). (5) won this year's Soccer World Cup. To play football, one must (6) the Soccer " +
                    " with their (7). Soccer is quite dangerous to play, one must wear (8) to play.");
            System.out.println("Your first sentence is: My Berkeley High School's Soccer team (1)");
            System.out.println("Please enter a adjective for (1)");

            String Num1 = myObj.nextLine();

            System.out.println("Your second sentence is: I absolutely (2) the Soccer team.");
            System.out.println("Please enter a verb for (2)");

            String Num2 = myObj.nextLine();

            System.out.println("Your third sentence is: Your third sentence is: To me, Soccer is (3)");
            System.out.println("Please enter an adjective for (3)");

            String Num3 = myObj.nextLine();


            System.out.println("Your fourth sentence is: My favorite Soccer player is (4).");
            System.out.println("Please enter a Soccer player for (4)");

            String Num4 = myObj.nextLine();

            System.out.println("Your fifth sentence is: (5) won this year's Soccer World Cup.");
            System.out.println("Please enter this year's Soccer World Cup winner");

            String Num5 = myObj.nextLine();

            System.out.println("Your sixth sentence is: To play Soccer, one must (6) the Soccer with their (7)");
            System.out.println("Please enter a verb for (6)");
            String Num6 = myObj.nextLine();
            System.out.println("Please enter a noun for (7)");
            String Num7 = myObj.nextLine();

            System.out.println("Your seventh sentence is: Soccer is quite dangerous to play, one must wear (8) to play");
            System.out.println("Please enter a noun for (8)");

            String Num8 = myObj.nextLine();

            System.out.println("Here is your new madlips paragraph: My Berkeley High School's Soccer team " + Num1 + ". I absolutely " + Num2 + " the Soccer team." +
                    "To me, football is " + Num3 + ". My favorite Soccer player is " + Num4 + ". " + Num5 + " won this year's Soccer World Cup. To play soccer, one must " + Num6 + " the soccer " +
                    " with their " + Num7 + ". Soccer is quite dangerous to play, one must wear " + Num8 + " to play.");

        } else if (sport.equals("Basketball")) {
            System.out.println("Here is your madlips word problem: My Berkeley High School's basketball team (1). I absolutely (2) the basketball team." +
                    "To me, basketball is (3). My favorite basketball player is (4). (5) won this year's NBA. To play basketball, one must (6) the ball " +
                    " with their (7). basketball is quite dangerous to play, one must wear (8) to play.");
            System.out.println("Your first sentence is: My Berkeley High School's basketball team (1)");
            System.out.println("Please enter a adjective for (1)");

            String Numb1 = myObj.nextLine();

            System.out.println("Your second sentence is: I absolutely (2) the basketball team.");
            System.out.println("Please enter a verb for (2)");

            String Numb2 = myObj.nextLine();

            System.out.println("Your third sentence is: Your third sentence is: To me, basketball is (3)");
            System.out.println("Please enter an adjective for (3)");

            String Numb3 = myObj.nextLine();


            System.out.println("Your fourth sentence is: My favorite basketball player is (4).");
            System.out.println("Please enter a basketball player for (4)");

            String Numb4 = myObj.nextLine();

            System.out.println("Your fifth sentence is: (5) won this year's NBA.");
            System.out.println("Please enter this year's NBA winner");

            String Numb5 = myObj.nextLine();

            System.out.println("Your sixth sentence is: To play basketball, one must (6) the ball with their (7)");
            System.out.println("Please enter a verb for (6)");
            String Numb6 = myObj.nextLine();
            System.out.println("Please enter a noun for (7)");
            String Numb7 = myObj.nextLine();

            System.out.println("Your seventh sentence is: basketball is quite dangerous to play, one must wear (8) to play");
            System.out.println("Please enter a noun for (8)");

            String Numb8 = myObj.nextLine();

            System.out.println("Here is your new madlips paragraph: My Berkeley High School's basketball team " + Numb1 + ". I absolutely " + Numb2 + " the basketball team." +
                    "To me, basketball is " + Numb3 + ". My favorite basketball player is " + Numb4 + ". " + Numb5 + " won this year's NBA. To play basketball, one must " + Numb6 + " the basketball " +
                    " with their " + Numb7 + ". Basketball is quite dangerous to play, one must wear " + Numb8 + " to play.");

        } else {
            System.out.println("Error, please enter a sport that is either Basketball, Soccer, or Basketball");
        }

    }
    }
