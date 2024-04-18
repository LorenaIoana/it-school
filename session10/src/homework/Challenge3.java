package homework;

import java.util.ArrayList;

public class Challenge3 {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("Maria");
        studentList.add("Sergiu");
        studentList.add("Andrei");
        studentList.add("Ioana");
        studentList.add("Matei");
        studentList.add("Serena");
        studentList.add("Andreea");
        studentList.add("Ioan");
        studentList.add("Ariana");
        studentList.add("Mircea");

        ArrayList<String> graduateStudentList = new ArrayList<>();
        graduateStudentList.add("Maria");
        graduateStudentList.add("Mircea");
        graduateStudentList.add("Andreea");
        graduateStudentList.add("Ioan");

        for (int i =0; i < graduateStudentList.size(); i++) {
            System.out.println(graduateStudentList.get(i));
        }
    }
}
