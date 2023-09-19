import java.util.Calendar;

public class Car <WeightT extends Number & Comparable,LengthT extends Number & Comparable,WidthT extends Number & Comparable> implements Comparable<Car>{
    private String marka;
    private WeightT weight;
    private LengthT length;
    private WidthT width;
    private int ID;

    private static int id =0;

    public Car(String marka, WeightT masa, WidthT szerokosc, LengthT dlugosc)  {
        this.marka = marka;
        this.weight = masa;
        this.width = szerokosc;
        this.length = dlugosc;
        this.ID = id++;
    }



    @Override
    public int compareTo(Car car1) {
        Calendar rightNow = Calendar.getInstance();
        int hour = rightNow.get(Calendar.HOUR_OF_DAY);
        if(hour>12){
            System.out.println();
            System.out.println();
            System.out.println();
            if(weight.compareTo(car1.getWeight())>0){
                System.out.println(car1);
                System.out.printf(" jest mniejszy od \n");
                System.out.println(this);
            }else if(weight.compareTo(car1.getWeight())==0){
                System.out.println(car1);
                System.out.printf(" jest rowny \n");
                System.out.println(this);
            } else {
                System.out.println(car1);
                System.out.printf(" jest wiekszy od \n");
                System.out.println(this);
            }
        } else {
            System.out.println();
            System.out.println();
            System.out.println();
            if(weight.compareTo(car1.getWeight())>0){
                System.out.println(car1);
                System.out.printf(" jest mniejszy od \n");
                System.out.println(this);
            }else if(weight.compareTo(car1.getWeight())==0){
                if(length.compareTo(car1.getLength())>0){
                    System.out.println(car1);
                    System.out.printf(" jest mniejszy od \n");
                    System.out.println(this);
                }else if(length.compareTo(car1.getLength())==0){
                    if(width.compareTo(car1.getWidth())>0){
                        System.out.println(car1);
                        System.out.printf(" jest mniejszy od \n");
                        System.out.println(this);
                    }else if(width.compareTo(car1.getWidth())==0){
                        System.out.println(car1);
                        System.out.printf(" jest rowny \n");
                        System.out.println(this);
                    } else {
                        System.out.println(car1);
                        System.out.printf(" jest wiekszy od \n");
                        System.out.println(this);
                    }
                } else {
                    System.out.println(car1);
                    System.out.printf(" jest wiekszy od \n");
                    System.out.println(this);
                }
            } else {
                System.out.println(car1);
                System.out.printf(" jest wiekszy od \n");
                System.out.println(this);
            }
        }

        return 0;
    }


    public WeightT getWeight() {
        return weight;
    }

    public LengthT getLength() {
        return length;
    }

    public WidthT getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", weight=" + weight +
                ", length=" + length +
                ", width=" + width +
                ", ID=" + ID +
                ", id=" + id +
                '}';
    }

}
