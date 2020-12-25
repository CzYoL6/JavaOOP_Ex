public class Temp {
    {
        System.out.println("init block");
    }
    public Temp(int x){
       // this();
        System.out.println(x);
    }
    public Temp(){
        System.out.println("default");
    }

    public static void main(String[] args) {
        new Temp();
        new Temp(10);
    }
}
