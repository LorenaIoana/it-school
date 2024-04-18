package com.itschool.course;

public class StringBuilderDemo {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("ionutz ");
        sb.append("baur ");
        sb.append("it-school");
        StringBuilder lastStringBuilder = sb.append(46).append("ceva").append("blabla").append(6.8);
        sb.append("course");
        sb.append("text");

        sb.insert(2, "aa");
        System.out.println(lastStringBuilder);
        sb.delete(5, 10);

        System.out.println(sb);
    }
}
