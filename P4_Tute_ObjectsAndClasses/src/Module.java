public class Module {
    public String ModuleCode;
    public double marksICT;
    public double marksCourseWork;

    public Module(String moduleCode, double marksICT, double marksCourseWork) {
        this.ModuleCode = moduleCode;
        this.marksICT = marksICT;
        this.marksCourseWork = marksCourseWork;
    }

    private double getFinalMark(){

        double finalMarks = (marksICT + marksCourseWork) / 2;
        return finalMarks;
    }
}
