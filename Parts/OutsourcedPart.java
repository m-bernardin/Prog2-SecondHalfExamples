import java.util.ArrayList;
import java.util.Scanner;
public class OutsourcedPart extends Part{
    private ArrayList<String> suppliers=new ArrayList<>();
    public OutsourcedPart(String partNum, int budget, ArrayList<String> suppliers) {
        super(partNum, budget);
        this.suppliers=suppliers;
    }
    @Override
    String getInfo() {
        String formattedSuppliers="";
        for (String supplier : suppliers) {
            formattedSuppliers+=supplier+"\n"; 
        }
        return "part num "+partNum+"; budget for part: "+budget+"suppliers:"+formattedSuppliers;
    }
    public String getCheapestSupplier(){
        String cheapest=".";
        for (String supplier : suppliers) {
            if(cheapest.equals("."))cheapest=supplier;
            else{
                Scanner parser=new Scanner(supplier).useDelimiter(";");
                int cost=Integer.parseInt(parser.next());
                parser.close();
                Scanner parser2=new Scanner(cheapest).useDelimiter(";");
                if(cost<Integer.parseInt(parser2.next()))cheapest=supplier;
                parser2.close();
            }
        }
        return cheapest;
    }
}