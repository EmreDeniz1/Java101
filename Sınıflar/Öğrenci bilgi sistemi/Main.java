public class Main {

    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101","MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya","KMY101", "KMY");

        Teacher t1 = new Teacher("Kazým", "753", "MAT");
        Teacher t2 = new Teacher("Ezgi", "789", "FZK");
        Teacher t3 = new Teacher("Deniz", "741", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Cemil", "564", mat, fizik, kimya);
        s1.addBulkExamNote(70,50,60);
        s1.sozlu(60,70,60);
        s1.isPass();
        System.out.print(s1.avarage);
    }


}
