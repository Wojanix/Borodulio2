public class Main {
    public static void main(String[] args) {
//        GenericHolder obj = new GenericHolder(123);
//        System.out.println(obj.getObj());
//        obj.setObj("shit");
//        System.out.println(obj.getObj());
//
//
//        ObjectHolder objectHolder = new ObjectHolder(123);
//        System.out.println(objectHolder.getObj());
//        objectHolder.setObj(251);
//        System.out.println(objectHolder.getObj());
//
//        String a = "23";
//        String b = "bb";
//
//        Compare cos = new Compare();
//
//        Compare.compareValues(23.02 , 220.3);
//
//        if(cos.compareValues(12, 32));
//        if (cos.compareValues("233", "42"));


        Car merc = new Car("Mercedes", 100, 300, 500);
        Car bmw = new Car("BMW", 100, 230, 500);
        Car audi = new Car("Audi", 234, 320, 590);

        merc.compareTo(bmw);
        bmw.compareTo(audi);
    }
}