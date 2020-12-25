import java.util.ArrayList;

public class RecycleBin_LanHan {
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
    private RecycleBin_LanHan(){
        binList = new ArrayList<Rubbish>();
    }
    private static RecycleBin_LanHan instance ;
    public static synchronized RecycleBin_LanHan getInstance(){
        if(instance == null) {
            instance = new RecycleBin_LanHan();
        }
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
        RecycleBin_LanHan.getInstance().add(apple);
        RecycleBin_LanHan.getInstance().add(orange);
        RecycleBin_LanHan.getInstance().showAll();
        RecycleBin_LanHan.getInstance().restore(apple);
        RecycleBin_LanHan.getInstance().showAll();
        RecycleBin_LanHan.getInstance().clear();
        RecycleBin_LanHan.getInstance().showAll();
    }
}
