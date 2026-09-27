package com.mycompany.prog6112toolkit.templates;

/*
 * An abstract class can implement an interface
 * and store common variables/methods for subclasses.
 */
public abstract class TemplateAbstractClass
        implements TemplateInterface {

    // Common data stored by objects.
    private String name;
    private int value;

    // Constructor stores the values.
    public TemplateAbstractClass(String name, int value) {
        this.name = name;
        this.value = value;
    }

    // Implement the interface's getName method.
    @Override
    public String getName() {
        return name;
    }

    // Implement the interface's getValue method.
    @Override
    public int getValue() {
        return value;
    }
}
