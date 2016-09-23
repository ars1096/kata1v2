/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1v2;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author usuario
 */
public class Person {
    private static final long MILLISECONDS_PER_YEAR = (long)(1000 * 60 * 60 * 24 * 365.25) ;
    private final String name;
    private final Calendar birthday;

    public Person(String name, Calendar birthdate) {
        this.name = name;
        this.birthday = birthdate;
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthday() {
        return birthday;
    }
   

    public static long getMILLISECONDS_PER_YEAR() {
        return MILLISECONDS_PER_YEAR;
    }
    
    public int getAge(){
    Calendar today;
    
    today= GregorianCalendar.getInstance();
    
        return (int) (milliSecondsToYear(today.getTimeInMillis() - birthday.getTimeInMillis()));
    }
    
    private long milliSecondsToYear(long milles){
    return milles/ MILLISECONDS_PER_YEAR;
    }
   
    
    
}
