public class Students{
    private int id;
    private String name;
    private int marks[];
    private float average;
    private char grade;

    public Students(int id, String name, int[] marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int[] getMarks() {
        return marks;
    }
    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    public float getAverage() {
        return average;
    }
    public void setAverage(float average) {
        this.average = average;
    }
    public char getGrade() {
        return grade;
    }
    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void calculateAvg(){
        float sum = 0.0f;;
        for(int i = 0; i < this.marks.length; i++){
            sum = sum + this.marks[i];
        }
        this.average = sum / this.marks.length;
    }
    public void findGrade(){
        int min = this.marks[0];
        for(int i = 1; i < this.marks.length; i++){
            if(this.marks[i] < min){
                min = this.marks[i];
            }
        }
        if(min < 50)
            this.grade = 'F';
        else if(this.average >= 80 && this.average <= 100)
            this.grade = 'O';
        else
            this.grade = 'A';
    }
}