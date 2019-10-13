public class Student {
    private String name;
    private int score;

    public Student(String studentName,int studentScore){
        name = studentName;
        score = studentScore;
    }

    @Override
    public String toString(){
        return String.format("Student(name:%s,score:%d)",name,score);
    }

}
