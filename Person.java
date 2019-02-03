import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.text.DateFormat;

final class Person {

   private final String firstName;
   private final String lastName;
   private final String city;
   private final String state;
   private final Calendar birthday;
   private final DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.US);
   
   public Person (String fn, String ln, String city, String state, int year, int month, int day) {
      firstName = fn;
      lastName = ln;
      this.city = city;
      this.state = state;
      birthday = new GregorianCalendar(year, month, day);
   }
   
   public String getFirstName() { return firstName; }
   public String getLastName() { return lastName; }
   public String getCity() { return city; }
   public String getState() { return state; }
   public Calendar getBirthday() { return birthday; }
   
   public String toString() {
      return "[Person: firstName: " + firstName + ", lastName: " + lastName + ", city: " + city + 
             ", state: " + state + ", birthday: " + df.format(birthday.getTime()) + "]";
   }
   
   public String toShortString() {
      return firstName + ' ' + lastName + " - " + city + ", " + state + " - " +  df.format(birthday.getTime());
   }  
   
   public static void main(String[] args) {
      Person p = new Person("Alice", "Waters", "Berkeley", "CA", 1944, 3, 28);
      System.out.println(p);
   }
}
   