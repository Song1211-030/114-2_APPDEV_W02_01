public class ex02 {
    public static void main(String[] args) {
        int grade = 80;
        char type = 'm';
        if (grade > 60 && type == 'm') {
            System.out.println("Course:" + type + "\nyou can pass:" + grade);
        } else
            System.out.println("課程不正確或成績不及格");
    }
}