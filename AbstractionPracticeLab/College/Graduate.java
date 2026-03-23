package College;
public class Graduate extends Applicant{
    public String getCollegeOfOrigin() {
        return collegeOfOrigin;
    }
    public void setCollegeOfOrigin(String collegeOfOrigin) {
        this.collegeOfOrigin = collegeOfOrigin;
    }
    private String collegeOfOrigin;
    public String applicationLocation(){
        if(collegeOfOrigin.trim().toLowerCase().equals(applyingCollege.trim().toLowerCase()))return "from inside";
        else return "from outside";
    }
}