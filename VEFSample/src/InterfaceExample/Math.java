package InterfaceExample;

import java.util.Random;

public class Math implements FinalExam, FinalGrade {

    private static final String EXAM_INSTRUCTION = "There are 10 questions on Derivatives and Integrals, " +
            "                                       ten points each.";

    private static final String GRADING_INSTRUCTION = "Above 90% will be an A.";

    private static final int MIN_SCORE = 50;
    private static final int MAX_SCORE = 100;

    private static final int letter_A_threshold = 90;

    @Override
    public void printFinalExamInstruction() {
        System.out.println(EXAM_INSTRUCTION);
    }

    @Override
    public int getFinalExamScore() {
        Random r = new Random();
         return r.nextInt((MAX_SCORE - MIN_SCORE) + 1) + MIN_SCORE;
    }

    @Override
    public void printGradingInstruction() {
        System.out.println(GRADING_INSTRUCTION);
    }

    @Override
    public char getFinalGrade(int finalScore) {
        return finalScore > letter_A_threshold ? 'A' : 'B';
    }
}
