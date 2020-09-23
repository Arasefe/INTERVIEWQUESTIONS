package ArraysPackage;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    String lastName;
    int age;
    char gender;
    public Student (String name, String lastName, int age, char gender){

        this.name=name;
        this.lastName=lastName;
        this.age=age;
        this.gender=gender;
    }

    public static void main(String[] args) {
        List<Student> st = new ArrayList<>();
        Student s1 = new Student("Ali", "YILDIRIM", 43, 'M');

        st.add(new Student("Ali", "YILDIRIM", 43, 'M'));
        st.add(new Student("Ahmet", "OKUMUS", 34, 'M'));
        st.add(new Student("Nur", "OZTUNCA", 35, 'F'));
        st.add(new Student("Canan", "KONAR", 32, 'F'));
        //System.out.println(st.size());
        for (int i = 0; i < st.size(); i++) {
            //System.out.println(st.get(i).name + " " + st.get(i).lastName + " " + st.get(i).age + " " + st.get(i).gender);

            System.out.println(st.get(i).name);
        }
    }
}
