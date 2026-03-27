public class Employee extends Family implements EducationalInfo, EmploymentInfo, PersonalInfo{
    private String name;
    private int age;
    private String location;
    private String position;
    private int salary;
    private String lastDegree;
    private String fieldOfStudy;
    private int gradYear;
    public Employee(int nbFamilyMembers, boolean lowIncome, String name, int age, String location, String position, int salary, String lastDegree, String fieldOfStudy, int gradYear) {
        super(nbFamilyMembers, lowIncome);
        this.name = name;
        this.age = age;
        this.location = location;
        this.position = position;
        this.salary = salary;
        this.lastDegree = lastDegree;
        this.fieldOfStudy = fieldOfStudy;
        this.gradYear = gradYear;
    }
    public boolean promotion(){
        if((age>45&&nbFamilyMembers>=2&&position.equals("manager"))||(age>50&&lastDegree.equals("PhD")&&salary<5000))return true;
        else return false;
    }
    @Override
    public String[] parsePersonalInfo(String name, int age, String location) {
        String[] info={name,age+"",location};
        return info;
    }
    @Override
    public String[] parseEmploymentInfo(String position, int salary) {
        this.salary = salary;
        String[] info={position,salary+""};
        return info;
    }
    @Override
    public String[] parseEducationalInfo(String lastDegree, String fieldOfStudy, int gradYear) {
        this.lastDegree = lastDegree;
        this.fieldOfStudy = fieldOfStudy;
        this.gradYear = gradYear;
        String[] info={lastDegree,fieldOfStudy,gradYear+""};
        return info;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getLastDegree() {
        return lastDegree;
    }
    public void setLastDegree(String lastDegree) {
        this.lastDegree = lastDegree;
    }
    public String getFieldOfStudy() {
        return fieldOfStudy;
    }
    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }
    public int getGradYear() {
        return gradYear;
    }
    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }
}