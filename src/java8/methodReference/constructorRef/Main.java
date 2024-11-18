package java8.methodReference.constructorRef;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main method called");

        Provider provider = Student::new;

     Student student = provider.getStudent();
     student.display();
    }
}
// 11:16 93%
// 11:23 85%