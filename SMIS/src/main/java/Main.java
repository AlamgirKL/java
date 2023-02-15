import  lib.Student;
public class Main {
    public static void main(String[] args) {
        Student fahim , minhaj , amit, kabir;

        fahim = new lib.Student( 1,"fahim Haque");
         minhaj = new Student("minhaj");
         amit = new Student(
                 4,
                 "jahin",
                 "swe"
         );
        kabir =new Student(2,"kabir");

        fahim.id = 1;
        fahim.read();

        kabir.id = 3;
        kabir.read();

        amit.id= 4;
        amit.read();
        amit.write();

        minhaj.id =5;
        minhaj.read();
    }
}