package Java_Bootcamp;

public class Student_Project {

    public static void main(String[] args) {

        Student[] myClass = new Student[3];

        myClass[0] = new Student("James", 87);
        myClass[1] = new Student("Alice", 65);
        myClass[2] = new Student("Bob", 42);

        float sum = 0;
        for (int i = 0;i< myClass.length;i++){
            myClass[i].ShowDetails();
            sum += myClass[i].getMark();

        }
        float avg = (sum/(myClass.length * 100) * 100);
        System.out.println("The whole grade average is " + avg);

    }

}


class Student{
    private String name;
    private float mark;

    public Student( String name, float mark){
        this.name = name;
        this.mark = mark;

    }

    public String Grade(){
        if (mark>= 80){
            return "Distinction";
        } else if (mark >=50) {
            return "Pass";

        }else{
            return "Fail";
        }
    }
    public float getMark(){
        return mark;
    }

    public void ShowDetails(){
        System.out.println("The student, " + name + " got the mark of "+ mark+ ", thefore a "+ Grade()+ "grade");
    }



        }
