package Ex1;

public class StudyTest {
    public static void main(String[] args) {
        Study study = new Study();
        study.setUnit(Unit.U1);
        study.show(study.getUnit());
        study.setUnit(Unit.U2);

        study.show(study.getUnit());
        study.setUnit(Unit.U3);
        study.show(study.getUnit());
    }
}
