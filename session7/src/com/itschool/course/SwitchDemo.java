package com.itschool.course;

public class SwitchDemo {
    public static void main(String[] args) {
        int var = 3;
    }

   /* private static void classicSwitch(int variable) {
        switch (variable) {
            case 1:
                System.out.println("value is 1");
                break;
            case 2:
                System.out.println("value is 2");
                break;
            case 5:
                System.out.println("value is 5");
                break;
            default:
                System.out.println("value unknown");
        }
    }*/

    private void enhancedSwitch(int variable) {
        switch (variable) {
            case 1 -> System.out.println("value is 1");
            case 2 -> System.out.println("value is 2");
            case 3 -> System.out.println("value is 3");
            default -> System.out.println("unknown value");
        }
    }
}
