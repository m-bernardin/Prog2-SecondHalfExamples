package College;
public class Undergrad extends Applicant{
    private int satScore;
    public int getSatScore() {
        return satScore;
    }
    public void setSatScore(int satScore) {
        this.satScore = satScore;
    }
    private double gpa;
    public Undergrad(String name, String applyingCollege, int satScore, double gpa) {
        super(name, applyingCollege);
        this.satScore = satScore;
        this.gpa = gpa;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        return super.toString()+", sat score: "+satScore+", gpa: "+gpa;
    }
}