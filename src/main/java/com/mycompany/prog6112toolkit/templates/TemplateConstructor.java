package com.mycompany.prog6112toolkit.templates;

/*
 * A constructor has the same name as the class.
 * It runs when an object is created.
 */
public class TemplateConstructor {

    // Variables belonging to each object.
    private String name;
    private int value;

    // Constructor receives values when the object is created.
    public TemplateConstructor(String name, int value) {

        // this.name refers to the object's variable.
        this.name = name;

        // Store the value in the object's variable.
        this.value = value;
    }

    public static void main(String[] args) {

        // Create an object and pass values to the constructor.
        TemplateConstructor object =
                new TemplateConstructor("Example", 100);

        // Display the object's values.
        System.out.println(object.name);
        System.out.println(object.value);
    }
}
