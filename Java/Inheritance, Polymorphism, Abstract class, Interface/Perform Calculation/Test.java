 class Parent  {

    public void display()     {

        System.out.println("In Parent");

    }

}

class Test extends Parent  { 

    public void display()  {

        System.out.println("In child");

    } 

    public void testMethod()  {

        System.out.println("In test method");

    } 

    public static void main(String[] args)  {

        Parent p = new Test();

        p.display();        

        p.testMethod();

    }

}