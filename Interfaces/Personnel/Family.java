public class Family {
    protected int nbFamilyMembers;
    private boolean lowIncome;
    public Family(int nbFamilyMembers, boolean lowIncome) {
        this.nbFamilyMembers = nbFamilyMembers;
        this.lowIncome = lowIncome;
    }
    public int getNbFamilyMembers() {
        return nbFamilyMembers;
    }
    public void setNbFamilyMembers(int nbFamilyMembers) {
        this.nbFamilyMembers = nbFamilyMembers;
    }
    public boolean isLowIncome() {
        return lowIncome;
    }
    public void setLowIncome(boolean lowIncome) {
        this.lowIncome = lowIncome;
    }
    @Override
    public String toString() {
        return "nb family members: "+nbFamilyMembers+"low income: "+lowIncome;
    }
}