package com.mycompany.prog6112toolkit.templates;

/*
 * A subclass inherits from a parent class using extends.
 */
public class TemplateInheritance
        extends TemplateAbstractClass {

    // Constructor for the child class.
    public TemplateInheritance(String name, int value) {

        // super(...) calls the parent constructor.
        super(name, value);
    }

    // A method that belongs to the child class.
    public void printReport() {

        // Use inherited getter methods.
        System.out.println("Name: " + getName());
        System.out.println("Value: " + getValue());
    }

    public static void main(String[] args) {

        // Create an object from the child class.
        TemplateInheritance object =
                new TemplateInheritance("Example", 100);

        // Call the child's report method.
        object.printReport();
    }
}
