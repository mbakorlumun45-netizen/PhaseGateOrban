import java.util.Scanner;

public class MbtiBuilder{

    public static String collectName(){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        return name;
        }

    public static char[] collectResponses(String[] questions) {

        Scanner input = new Scanner(System.in);

        char[] responses = new char[20];

        for (int count = 0; count < questions.length; count++) {

            System.out.println();
            System.out.println(questions[count]);
            System.out.print("Enter A or B: ");

            char answer = input.next().toUpperCase().charAt(0);


            while (answer != 'A' && answer != 'B') {

                System.out.print("Invalid answer. Enter A or B: ");

                answer = input.next().toUpperCase().charAt(0);
            }

            responses[count] = answer;
        }

        return responses;
    }


    public static String calculatePersonality(char[] responses) {

        int extrovert = 0;
        int introvert = 0;

        int sensing = 0;
        int intuition = 0;

        int thinking = 0;
        int feeling = 0;

        int judging = 0;
        int perceiving = 0;


        for (int count = 0; count < responses.length; count++) {

            if (count == 0 || count == 4 || count == 8 || count == 12 || count == 16){

                if (responses[count] == 'A') {
                    extrovert++;
                }else{
                    introvert++;
                }
                }

                else if (count == 1 || count == 5 || count == 9 || count == 13 || count == 17){ 

                if (responses[count] == 'A') {
                    sensing++;
                } else {
                    intuition++;
                }
                }

                else if (count == 2 || count == 6 || count == 10 | count == 14 || count == 18){

                if (responses[count] == 'A') {
                    thinking++;
                } else {
                    feeling++;
                }
                }

                else {

                if (responses[count] == 'A') {
                    judging++;
                } else {
                    perceiving++;
                }
            }
        }


        String personality = "";


        if (extrovert > introvert) {
            personality += "E";
        } else {
            personality += "I";
        }


        if (sensing > intuition) {
            personality += "S";
        } else {
            personality += "N";
        }


        if (thinking > feeling) {
            personality += "T";
        } else {
            personality += "F";
        }


        if (judging > perceiving) {
            personality += "J";
        } else {
            personality += "P";
        }


        return personality;
    }


    public static void displayResponses(char[] responses) {

        System.out.println();
        System.out.println("YOUR RESPONSES");

        for (int count = 0; count < responses.length; count++) {

            System.out.println("Question " + (count + 1) + ": " + responses[count]);
        }
    }


    public static void main(String[] args) {

        String[] questions = {

            "1. At a party, do you usually: A) Talk to many people  B) Talk to a few people?",

            "2. Do you prefer: A) Facts and details  B) Ideas and possibilities?",

            "3. When making decisions, do you rely more on: A) Logic  B) Feelings?",

            "4. Do you prefer: A) Planning things ahead  B) Being spontaneous?",

            "5. Do you feel energized by: A) Being around people  B) Spending time alone?",

            "6. Do you focus more on: A) What is real and present  B) What could happen?",

            "7. When solving problems, do you prefer: A) Objective reasoning  B) Personal values?",

            "8. Do you like your life to be: A) Organized  B) Flexible?",

            "9. In a group, do you usually: A) Speak first  B) Listen first?",

            "10. Do you prefer learning through: A) Practical experience  B) Imagination?",

            "11. When someone disagrees with you, do you focus on: A) Being correct  B) Keeping harmony?",

            "12. Do you prefer: A) Having a schedule  B) Going with the flow?",

            "13. Do you enjoy: A) Social activities  B) Quiet activities?",

            "14. Do you trust more: A) Experience  B) Intuition?",

            "15. When making a difficult choice, do you ask: A) What makes logical sense?  B) What feels right?",

            "16. Do you prefer: A) Finishing tasks early  B) Keeping your options open?",

            "17. Do you usually: A) Think out loud  B) Think before speaking?",

            "18. Are you more interested in: A) Practical facts  B) New theories?",

            "19. Do you value more: A) Fairness  B) Compassion?",

            "20. Do you prefer: A) A predictable routine  B) A flexible routine?"
        };

        String name = collectName();
        
        char[] responses = collectResponses(questions);

        System.out.println();
        String personality = calculatePersonality(responses);


        displayResponses(responses);


        System.out.println();
        System.out.println("MBTI RESULT");
        System.out.println(name + " " +"Your personality type is: " + personality);
    }
}
