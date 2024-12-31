public class Student {
     String name;
     int rno;
    double percent;
    final String CollegeName="IPSCTM";
    private static int numberOfInstances;
    public Student(){
    numberOfInstances++;
    }
    public Student(String name,int rno,double percent){
        this.name=name;
        this.rno=rno;
        this.percent=percent;
        numberOfInstances++;
    }
    public int getRno() {
        return rno;
    }
    public void setRno(int roll) {
        this.rno = roll;
    }

    public static int getNumberOfInstances() {
        return numberOfInstances;
    }
}
