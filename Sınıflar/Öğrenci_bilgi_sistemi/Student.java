public class Student {

    String name;
    String stuNo;
    int classes;
    double avarage;
    boolean isPass;
    Course mat;
    Course fizik;
    Course kimya;

    public Student(String name, String stuNo, Course mat, Course fizik, Course kimya) {

        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.isPass = false;
        this.avarage = 0;
        this.mat = mat ;
        this.fizik = fizik ;
        this.kimya = kimya;
    }

    public void addBulkExamNote(int mat, int fizik, int kimya) {
        if (mat >= 0 && mat <= 100) {
            this.mat.not = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.not = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.not = kimya;
        }
    }

    public void sozlu(int matsoz, int fizsoz, int kimsoz){
        if (kimsoz >= 0 && matsoz <= 100) {
            this.mat.soz = matsoz;
        }

        if (fizsoz >= 0 && fizsoz <= 100) {
            this.fizik.soz = fizsoz;
        }

        if (kimsoz >= 0 && kimsoz <= 100) {
            this.kimya.soz = kimsoz;
        }
    }


    public void calcAvarage() {
       this.avarage = ((this.mat.not*0.8 + this.mat.soz*0.2) + (this.fizik.not*0.8 + this.fizik.soz*0.2) + (this.kimya.not*0.8 + this.kimya.soz*0.2)) / 3.0;
    }


    public void isPass() {
        if (this.mat.not == 0 || this.fizik.not == 0 || this.kimya.not == 0) {
            System.out.println("Notlar tam olarak girilmemiþ");
        } else {
            printNote();
            calcAvarage();
            System.out.println("Ortalama : " + this.avarage);
            if (this.avarage > 55) {
                System.out.println("Sýnýfý Geçti. ");
            } else {
                System.out.println("Sýnýfta Kaldý.");
            }
        }
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öðrenci : " + this.name);
        System.out.println("Matematik Notu : " + mat.not);
        System.out.println("Fizik Notu : " + fizik.not);
        System.out.println("Kimya Notu : " + kimya.not);
        System.out.println("=========================");
        System.out.println("Matematik Sözlü : " + mat.soz);
        System.out.println("Fizik Sözlü : " + fizik.soz);
        System.out.println("Kimya Sözlü : " + kimya.soz);
        System.out.println("=========================");
    }

}
