public class ClassesBasics {
//    public static class Student{
//        String name;
//        int rno;
//        double percent;
//    }
    public static void main(String[] args) {
        Student s1=new Student();
        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.percent);

        Student s2=new Student("anurag",10,81.2);
        System.out.println(s2.name);
        System.out.println(s2.rno);
        System.out.println(s2.percent);
        System.out.println(s1.getNumberOfInstances());
        System.out.println(Student.getNumberOfInstances());


    }
}
