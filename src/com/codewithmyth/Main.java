package com.codewithmyth;

public class Main {
    public static void main(String[] args) {
        drawUIControl(new CheckBox());
    }

    // Creating a method
    public static void drawUIControl(UIControl control) {
        control.draw();
    }
        /* CheckBox and CheckBox කියන්නේ UIControl class එකේ child classes නිසා
           UIControl class එකේ instances විදියට CheckBox and CheckBox classes වල
           instances pass කරන්න පුළුවන්

           We're working with UIControl object (line 9), but at RUNTIME that object
           can behave like many different forms */

}
