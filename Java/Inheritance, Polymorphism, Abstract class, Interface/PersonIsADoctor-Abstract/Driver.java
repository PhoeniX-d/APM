public class Driver {
    public static void main(String[] args) {
        // create a object for Doctor, set the name and specialization, invoke the
        // method and print the result
        Doctor dr = new Doctor();
        dr.name = "Trafalgar D. Water Law";
        dr.specializationType = "Surgeon of Death";
        System.out.println(dr.displayDetails());

    }

}