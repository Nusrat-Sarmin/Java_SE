package json_file_manipulation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class json_Question_Bank {
    static int points = 0;
    static int min = 0, max = 0;
    static String fileName = "./src/main/resources/question.json";

    public static void main(String[] args) throws IOException, ParseException {
        Scanner input = new Scanner(System.in);

        System.out.println("1.Add Quiz\n" +
                "2.Start Quiz");
        System.out.println("Select Any One?");

        int bb = input.nextInt();
        switch (bb) {
            case 1:
                addQuiz();
                break;
            case 2:
                startQuiz();
                System.out.println("You get " + points + " out of 5");
                break;
        }
    }

    private static void addQuiz() throws IOException, ParseException {
        char ch = 'y';

        do {
            JSONParser jsonParser = new JSONParser();
            Object obj = jsonParser.parse(new FileReader(fileName));
            JSONObject quizObj = new JSONObject();
            Scanner input = new Scanner(System.in);
            System.out.println("Please add a question here:");
            quizObj.put("Questions", input.nextLine());
            System.out.println("Input Options");
            System.out.println("Option a: ");
            quizObj.put("a", input.nextLine());

            System.out.println("Option b: ");
            quizObj.put("b", input.nextLine());

            System.out.println("Option c: ");
            quizObj.put("c", input.nextLine());

            System.out.println("Option d: ");
            quizObj.put("d", input.nextLine());

            System.out.println("Please Input Correct Answer: ");
            quizObj.put("Correct Answer", input.nextLine());
            JSONArray questionBank = (JSONArray) obj;

            questionBank.add(quizObj);
            System.out.println(questionBank);
            FileWriter file = new FileWriter(fileName);
            file.write(questionBank.toJSONString());
            file.flush();
            file.close();
            System.out.println("Saved");
            System.out.println("\nDo You Want to add more?[y/n]");
            ch = input.next().charAt(0);

        }
        while (ch != 'n');
    }

    private static void startQuiz() throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader(fileName));
        JSONArray jsonArray = (JSONArray) obj;
        max = jsonArray.size();
        for (int i = 0; i < 5; i++) {
            int rand1 = (int) (Math.random() * ((max - min) + min));
            JSONObject jsonObject = (JSONObject) jsonArray.get(rand1);

            String question = (String) jsonObject.get("Questions");
            String a = (String) jsonObject.get("a");
            String b = (String) jsonObject.get("b");
            String c = (String) jsonObject.get("c");
            String d = (String) jsonObject.get("d");
            String answer = (String) jsonObject.get("Correct ans");

            System.out.println("Question: " + question);
            System.out.println("a: " + a);
            System.out.println("b: " + b);
            System.out.println("c: " + c);
            System.out.println("d: " + d);

            Scanner input = new Scanner(System.in);
            String choice = input.next();

            if (choice.equals(answer)) {
                System.out.println("correct");
                points++;
            } else {
                System.out.println("not correct");
            }

        }
    }
}
