public class Driver {
    public static void main(String[] args) {
        // create a object for Doctor, set the name and specialization, invoke the
        // method and print the result
        Doctor doc = new Doctor();
        doc.name = "Tenma";
        doc.specializationType = "Brain Surgeon";
        System.out.println(doc.displayDetails());
    }
}