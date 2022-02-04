package com.assignments.assignment12;

import java.util.*;
import java.util.stream.Collectors;
//Make a Student class having fields id,name,age,gender,engDepartment,year of enrollment ,perTillDate
//
//Add following student in list ;
//
//1.new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8)
//2.new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2)
//3 new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3)
//4.new Student(144, "Murali Gowda", 18, "Male", “Electrical”, 2018, 80)
//5.new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70)
//6.new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70)
//7.new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70)
//8.new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80);
//9.new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85);
//10.new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82);
//11.new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83);
//12.new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4);
//13.new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6);
//14.new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8);
//15.new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4);
//16.new Student(266, "Sanvi Pandey", 17, "Female", “Electric”, 2019, 72.4);
//17.new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5);
//
//Use stream api on above list of employees find
//
//1. Print the name of all departments in the college?
//2.Get the names of all students who have enrolled after 2018?
//3. Get the details of all male student in the computer sci department?
//4. How many male and female student are there ? (HINT:use Collectors.groupingBy() for grouping based on gender)
//5.What is the average age of male and female students?
//6.Get the details of highest student having highest percentage ?
//7.Count the number of students in each department? (Hint :use Collectors.groupingBy())
//8. What is the average percentage achieved in each department?
//9. Get the details of youngest male student in the Electronic department?(Hint :Use Collectors.minBy)
//10.How many male and female students are there in the computer science department?
public class Main {
    public static void Task1(ArrayList<Student> studentList)
    {
    //1. Print the name of all departments in the college?
        studentList.stream().map(x -> x.getEngDepartment()).forEach(x -> System.out.println(x));
    }
    public static void Task2(ArrayList<Student> studentList)
    {
        //2. Get the names of all students who have enrolled after 2018
        studentList.stream().filter(x -> x.getYearOfenrollment()>2018).map(x -> x.getName()).forEach(x -> System.out.println(x));
    }
    public static void Task3(ArrayList<Student> studentList)
    {
        //3. Get the details of all male student in the computer sci department?
        studentList.stream().filter(x -> x.getEngDepartment().equals("Computer Science") && x.getGender().equals("Male")).map(x -> x.getName()).forEach(x -> System.out.println(x));
    }
    public static void Task4(ArrayList<Student> studentList)
    {
        //4. How many male and female student are there ?
        System.out.println(studentList.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.counting())));
    }
    public static void Task5(ArrayList<Student> studentList)
    {
        //5. What is the average age of male and female students?
        System.out.println(studentList.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.averagingInt(Student::getAge))));
    }
    public static void Task6(ArrayList<Student> studentList)
    {
        //6.    Get the details of highest student having highest percentage ?
        Double highestPerc=studentList.stream().map(x->x.getPerTillDate()).max(Double::compare).get();
        System.out.println(highestPerc);
        studentList.stream().filter(x->x.getPerTillDate()==highestPerc).map(x-> Arrays.asList(x.getId(),x.getName(),x.getAge(),x.getGender(),x.getEngDepartment(),x.getYearOfenrollment())).forEach(x-> System.out.println(x));
    }
    public static void Task7(ArrayList<Student> studentList)
    {
        //7.Count the number of students in each department? (Hint :use Collectors.groupingBy())
        System.out.println( studentList.stream().collect(Collectors.groupingBy(Student::getEngDepartment,Collectors.counting())));

    }
    public static void Task8(ArrayList<Student> studentList)
    {
        //    8. What is the average percentage achieved in each department?
        System.out.println( studentList.stream().collect(Collectors.groupingBy(Student::getEngDepartment,Collectors.averagingDouble(Student::getPerTillDate))));
    }
    public static void Task9(ArrayList<Student> studentList)
    {
        //   9. Get the details of youngest male student in the Electronic department?(Hint :Use Collectors.minBy)
        System.out.println(studentList.stream().filter(x->x.getEngDepartment()=="Electronic"&&x.getGender().equals("Male")).collect(Collectors.minBy(Comparator.comparing(Student::getAge))));
    }
    public static void Task10(ArrayList<Student> studentList)
    {
        //    10.How many male and female students are there in the computer science department?
        System.out.println(studentList.stream().filter(x->x.getEngDepartment().equals("Computer Science")).collect(Collectors.groupingBy(Student::getGender,Collectors.counting())));
    }
        public static void main(String[] args) {
        ArrayList<Student> studentList=new ArrayList<Student>();
        studentList.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        studentList.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        studentList.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        studentList.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        studentList.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        studentList.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        studentList.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        studentList.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        studentList.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        studentList.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        studentList.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        studentList.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        studentList.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        studentList.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        studentList.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        studentList.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        studentList.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

            Task1(studentList);
            Task2(studentList);
            Task3(studentList);
            Task4(studentList);
            Task5(studentList);
            Task6(studentList);
            Task7(studentList);
            Task8(studentList);
            Task9(studentList);
            Task10(studentList);



    }

}
