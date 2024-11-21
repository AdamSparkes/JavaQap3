public class Demo {
    public static void main(String[] args) {
        // Test Person class
        Person mike = new Person("Michael O'brie", 25, "M");
        System.out.println(mike);

        // Test Student class
        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        System.out.println(lynne);

        // Test Teacher class
        Teacher bill = new Teacher("Bill Nye", 34, "M", "Science", 50000);
        System.out.println(bill);

        // Test CollegeStudent class
        CollegeStudent adam = new CollegeStudent("Adam Sparkes", 25, "M", "UCB123", 4.0, 1, "Software Development");
        System.out.println(adam);
    }
}