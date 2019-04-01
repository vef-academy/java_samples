package InterfaceExample;

public class Music implements FinalExam {

    private static final String EXAM_INSTRUCTION = "Play or sing one song. When students take final, they all get 100";
    private static final int SCORE = 100;


    @Override
    public void printFinalExamInstruction() {
        System.out.println(EXAM_INSTRUCTION);
    }

    @Override
    public int getFinalExamScore() {
        return SCORE;
    }
}
