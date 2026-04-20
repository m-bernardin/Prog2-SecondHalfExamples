package InterfaceAndFileHandlingPractice;
public class CompanyB implements Organize,Calculate{
    @Override
    public int calculate(int[] nums) {
        int minPos=0;
        for(int i=0;i<nums.length;++i){
            if(nums[i]<nums[minPos])minPos=i;
        }
        return minPos;
    }
    @Override
    public String[] sort(String[] salaries) {
        for(int i=0;i<salaries.length;++i){
            for(int j=0;j<salaries.length-1;++j){
                if(compare(salaries[i],salaries[j])==1){
                    String temp=salaries[j]; 
                    salaries[j]=salaries[i];
                    salaries[i]=temp;
                }
            }
        }
        return salaries;
    }
    private String[] names;
    private int[] ages;
    private String[] salaries;
    public String[] getNames() {
        return names;
    }
    public void setNames(String[] names) {
        this.names = names;
    }
    public int[] getAges() {
        return ages;
    }
    public void setAges(int[] ages) {
        this.ages = ages;
    }
    public String[] getSalaries() {
        return salaries;
    }
    public void setSalaries(String[] salaries) {
        this.salaries = salaries;
    }
    public int compare(String first,String second){
        // if first bigger return 0; if samller return 1; else return -1
        if(first.charAt(0)>second.charAt(0))return 0;
        else if(first.charAt(0)<second.charAt(0))return 1;
        else if(first.charAt(0)==second.charAt(0))
            try {
                return compare(first.substring(1), second.substring(1));
            } catch (Exception e) {
                return -1;
            }
        return -1;
    }
}