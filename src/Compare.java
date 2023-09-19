public class Compare {
    public boolean  compareValues(int cos, int cos2){
        if(cos2>cos)System.out.println("wartosc " + cos+ " jest mniejsza od " + cos2 + " o "+ (cos2-cos) );
        else System.out.println("wartosc " + cos2+ " jest mniejsza od " + cos + " o "+ (cos-cos2) );
        return true;
    }


    public boolean  compareValues(byte cos, byte cos2){
        if(cos2>cos)System.out.println("wartosc " + cos+ " jest mniejsza od " + cos2 + " o "+ (cos2-cos) );
        else System.out.println("wartosc " + cos2+ " jest mniejsza od " + cos + " o "+ (cos-cos2) );
        return  true;
    }

    public boolean compareValues(float cos, float cos2){
        if(cos2>cos)System.out.println("wartosc " + cos+ " jest mniejsza od " + cos2 + " o "+ (cos2-cos) );
        else System.out.println("wartosc " + cos2+ " jest mniejsza od " + cos + " o "+ (cos-cos2) );
        return true;
    }


    public static boolean  compareValues(double cos, double cos2){
        if(cos2>cos)System.out.println("wartosc " + cos+ " jest mniejsza od " + cos2 + " o "+ (cos2-cos) );
        else System.out.println("wartosc " + cos2+ " jest mniejsza od " + cos + " o "+ (cos-cos2) );
        return true;
    }

    public  boolean compareValues(String cos, String cos2){

        if(cos2.compareTo(cos)>0)System.out.println("wartosc " + cos+ " jest mniejsza od " + cos2  );
        else System.out.println("wartosc " + cos2+ " jest mniejsza od " + cos);
        return true;


    }
}
