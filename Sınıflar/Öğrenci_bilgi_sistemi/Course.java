public class Course {

    Teacher teacherCourse;
    String name;
    String code;
    String prefix;
    int not;
    int soz;


    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.not = 0;
        this.soz = 0;

    }

    public void addTeacher(Teacher teacherCourse){
        if(this.prefix.equals(teacherCourse.branch)){
            System.out.println("Ýþlem Baþarýlý");
        }else {
            System.out.println(teacherCourse.name + " Bu derse eklenemez.");
        }
    }

    public void printTeacher(){
        if(teacherCourse != null){
            System.out.println(this.name +"dersine" + teacherCourse.name);
        }else{
            System.out.print(this.name +"dersi boþtadýr.");
        }
    }


}
