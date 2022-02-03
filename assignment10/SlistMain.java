package com.assignments.assignment10;

public class SlistMain {
    public static void main(String[] args) {
        SList<Integer> list=new SList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.show();
        list.remove(2);
        list.show();
        SList<String> list2=new SList<>();
        list2.add("abc");
        list2.add("def");
        list2.show();
    }
}
