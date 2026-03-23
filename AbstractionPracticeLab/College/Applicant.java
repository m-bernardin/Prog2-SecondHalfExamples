package College;
public abstract class Applicant{
    public Applicant(String name, String applyingCollege) {
        this.name = name;
        this.applyingCollege = applyingCollege;
    }
    protected String name;
    protected String applyingCollege;
    @Override
    public String toString() {
        return name+" applying to "+applyingCollege;
    }
}