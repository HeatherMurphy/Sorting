final class People {
   private final Person[] people = {
      new Person("Alice", "Waters", "Berkeley", "California", 1944, 3, 28),
      new Person("Chris", "Rock", "Brooklyn", "New York", 1965, 1, 7),
      new Person("Dave", "Chappelle", "Washington", "District of Columbia", 1973, 7, 24),
      new Person("Evan Rachel", "Wood", "Raleigh", "North Carolina", 1987, 8, 7),
      new Person("Fred", "Armison", "Portland", "Oregon", 1966, 11, 4),
      new Person("Jennifer", "Lawrence", "Los Angeles", "California", 1990, 7, 15),
      new Person("Justin", "Timberlake", "Memphis", "Tennessee", 1981, 0, 31),
      new Person("Peter", "Dinklage", "Morristown", "New Jersey", 1969, 5, 11),
      new Person("Steph", "Curry", "Oakland", "California", 1988, 2, 14),
      new Person("Tom", "Brady", "San Mateo", "California", 1977, 7, 3),
      new Person("Whitney", "Houston", "Newark", "New Jersey", 1963, 7, 9),
      new Person("Yoenis", "Cespedes", "Flushing ", "New York", 1985, 9, 18) };
      
      
   public People() { }
   
   public Person[] getPersons() { return people; }


   public Boolean isYounger(Person a, Person b) {
      if (a.getBirthday().compareTo(b.getBirthday()) < 0)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   public void swap(Person[] people, int i , int j){
      Person temp = people[i];
      people[i] = people[j];
      people[j] = temp;
   }
   public void BubbleSort(Person[] p){
      for (int j = 0; j < p.length; j++){

         for (int i = 0; i < p.length-1; i++)
         {
            if(isYounger(p[i], p[i+1]))
            {
               swap(p, i, i+1);
            }
         }
      }
   }
   /*
   always compare the item on the right!
   */
   public void MergeSort(Person[] p)
{
   int[] bigGroup1 = new int[p.length/2] ;
   int[] bigGroup2 = new int[p.length/2];
   int count1 = 0;
   int count2 = 0;
      for (int i =0; i < p.length-1; i++)
      {
         if (i%2==0){
            bigGroup1[count1] = i;
            count1++;
         }
         if (i%2==1){
            bigGroup2[count2] = i;
            count2++;
         }
         
      }
       for (int n=0; n < bigGroup1.length; n++)
   {
         System.out.println(bigGroup1[n]); 
   }
          for (int n=0; n < bigGroup2.length; n++)
   {
         System.out.println(bigGroup2[n]); 
   }
}
   public static void main(String[] args) 
   {
      People p = new People();
      for (Person person : p.getPersons()) 
      {
         if (person.getFirstName() == "Steph")
         {
            System.out.println("Steph Curry's City is: " + person.getCity());
         }
         
      }

      //p.BubbleSort(p.getPersons());
      p.MergeSort(p.getPersons());
            for (Person person : p.getPersons())
      {
         System.out.println(person.toShortString());
      }
   }
   
}