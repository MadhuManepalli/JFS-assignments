import java.util.*;

public class CollecQ4 {
    int date,month,year;
    
    public CollecQ4(int date,int month,int year){
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public String toString(){
        return date+"-"+month+"-"+year;
    }

    public int getYear(){
        return year;
    }
    
    public static void main(String[] args) {
        LinkedList<CollecQ4> dob = new LinkedList<>();
        

        dob.add(new CollecQ4(18,11,2000));
        dob.add(new CollecQ4(15,06,1999));
        dob.add(new CollecQ4(12,11,2000));
        dob.add(new CollecQ4(25,12,2008));
        dob.add(new CollecQ4(11,08,1999));
        dob.add(new CollecQ4(19,05,2012));
        dob.add(new CollecQ4(21,01,1992));

        for (int i = 0 ; i<dob.size();i++){
            int year = dob.get(i).getYear();
            if (year%400==0 || year%100==0 || year%4==0){
                System.out.println(dob.get(i)+" : Born in Leap Year.");
            }else{
                System.out.println(dob.get(i)+" : Not Born in a Leap Year.");
            }
            
        }
    }
    
}
