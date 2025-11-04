public class QuestionDistributionSolver {
    public static void main(String[] args) {
        int totalQuestions = 15;
        int totalMarks = 100;

        int y = (totalMarks - 5 * totalQuestions) / 5;
        int x = totalQuestions - y;

        if (5 * x + 10 * y == totalMarks) {
            System.out.println("5 NUmber Qus: " + x);
            System.out.println("10 Number Qus: " + y);
        } else {
            System.out.println("No ans");
        }

    }
}