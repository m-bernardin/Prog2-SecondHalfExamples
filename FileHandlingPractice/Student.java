import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Student {
    private static String name;
    private static String ID;
    private static int grade;
    public Student(String name, String iD, int grade) {
        this.name = name;
        ID = iD;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getID() {
        return ID;
    }
    public void setID(String iD) {
        ID = iD;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean running=true;
        Student student=null;
        File studentFile=new File("studentData.txt");
        while(running){
            System.out.print("Please select an option\n1. Load student data\n2. Purge student data\n3. Display student data\n4. Write new student data\n 5. save and quit\n> ");
            switch (input.nextInt()) {
                case 1:
                    student=load();
                    if(student==null){
                        System.out.println("No student data found...");
                        break;
                    }
                    System.out.println("Student data loaded!");
                    break;
                case 2:
                    boolean deleted=studentFile.delete();
                    if(deleted){
                        student=null;
                        System.out.println("Student data purged!");
                    }
                    else System.out.println("Error purging data...");
                    break;
                case 3:
                    if(student!=null)System.out.println("Student data:\n"+student);
                    else System.out.println("No data to display...");
                    break;
                case 4:
                    student=null;
                    writeStudent();
                    break;
                case 5:
                    running=false;
                    saveStudent();
                    System.out.println("Goodbye :)");
                    break;
                default:
                    System.out.println("Please select a valid option...");
                    break;
            }
        }
    }
    private static void saveStudent() {
        File studentFile=new File("studentData.txt");
        studentFile.delete();
        try {
            studentFile.createNewFile();
        } catch (IOException e1) {
            System.out.println("Error making file...");
        }
        FileWriter writer;
        try {
            writer=new FileWriter(studentFile,true);
            writer.write(name+";"+ID+";"+grade+";");
            writer.flush();
        } catch (IOException e) {
            try {
                studentFile.createNewFile();
            } catch (IOException e1) {
                System.out.println("Error making file...");
            }
            saveStudent();
        }
    }
    private static Student writeStudent() {
        File studentFile=new File("studentData.txt");
        studentFile.delete();
        try {
            studentFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Error creating student file...");
        }
        String tempName=getInput("name");
        String tempID=getInput("ID");
        int tempGrade=Integer.parseInt(getInput("grade"));
        return new Student(tempName, tempID, tempGrade);
    }
    private static String getInput(String type) {
        Scanner input=new Scanner(System.in);
        boolean valid=false;
        while(!valid){
            System.out.print("Please enter the student's "+type+"\n> ");
            if(type.equals("grade")){
                input.close();
                return input.nextInt()+"";
            }
            String result=input.next();
            if(!result.contains(";")){
                input.close();
                return result;
            }
            else System.out.println("Please enter a valid "+type);
        }
        input.close();
        return null;
    }
    private static Student load(){
        File studentFile=new File("studentData.txt");
        Scanner reader;
        try {
            reader=new Scanner(studentFile);
        } catch (FileNotFoundException e) {
            return null;
        }
        reader.useDelimiter(";");
        String tempName=reader.next();
        String tempID=reader.next();
        int tempGrade=Integer.parseInt(reader.next());
        reader.close();
        return new Student(tempName, tempID, tempGrade);
    }
    @Override
    public String toString() {
        return "name: "+name+"\nID: "+ID+"\nGrade: "+grade;
    }
}