import javax.print.DocFlavor;
import java.util.ArrayList;

public class RecycleBin_EHan {
    public static class Rubbish{
        private String name;
        public Rubbish(String _name){
            name = _name;
        }

        public String getName() {
            return name;
        }

        public void setName(String _name) {
            this.name = _name;
        }
    }

    private ArrayList<Rubbish> binList;
    private RecycleBin_EHan(){
        binList = new ArrayList<Rubbish>();
    }
    private static RecycleBin_EHan instance = new RecycleBin_EHan();
    public static RecycleBin_EHan getInstance(){
        return instance;
    }
    public void clear(){
        binList.clear();
    }
    public void add(Rubbish o){
        binList.add(o);
    }
    public void restore(Rubbish o){
        binList.remove(o);
    }
    public void showAll(){
        System.out.println("Rubbish:");
        if(binList.isEmpty()) System.out.println("empty!");
        for(Rubbish x : binList){
            System.out.println(x.getName());
        }
    }

    public static void main(String[] args) {
        Rubbish apple = new Rubbish("apple");
        Rubbish orange = new Rubbish("orange");
        RecycleBin_EHan.getInstance().add(apple);
        RecycleBin_EHan.getInstance().add(orange);
        RecycleBin_EHan.getInstance().showAll();
        RecycleBin_EHan.getInstance().restore(apple);
        RecycleBin_EHan.getInstance().showAll();
        RecycleBin_EHan.getInstance().clear();
        RecycleBin_EHan.getInstance().showAll();
    }
}
