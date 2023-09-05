public class Main {
    public static void main(String[] args) {
        GenericHolder obj = new GenericHolder(123);
        System.out.println(obj.getObj());
        obj.setObj("shit");
        System.out.println(obj.getObj());
    }
}