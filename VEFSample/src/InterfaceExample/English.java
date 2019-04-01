package InterfaceExample;

public class English implements FinalGrade {

    private static final String GRADING_INSTRUCTION = "Pass (P) when final Score is above 50. Otherwise, No Pass (N).";

    private static final int FINAL_GRADE_THRESHOLD = 50;

    @Override
    public void printGradingInstruction() {
        System.out.println(GRADING_INSTRUCTION);
    }

    @Override
    public char getFinalGrade(int finalScore) {
        return finalScore > FINAL_GRADE_THRESHOLD ? 'P' : 'N';
    }
}
