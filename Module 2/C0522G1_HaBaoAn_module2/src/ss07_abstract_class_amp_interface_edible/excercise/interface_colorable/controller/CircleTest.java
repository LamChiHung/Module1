package ss07_abstract_class_amp_interface_edible.excercise.interface_colorable.controller;

import ss07_abstract_class_amp_interface_edible.excercise.resizeable.model.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
    }
}