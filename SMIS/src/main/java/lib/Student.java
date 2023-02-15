package lib;

public class Student {
 public int id;
String name;
String program;

public  Student (){
    System.out.println("a new student is instanciated");
}

public  Student (int id, String name){
    this.id=id;
    this.name=name;
}

    public  Student (int id, String name, String program){
        this.id=id;
        this.name=name;
    }
    public  Student (int id){
        this.id=id;

    }
    public  Student ( String name){

        this.name=name;
    }


public void read (){
    System.out.println( this.name+" can read");
}

 public void  write( ){
    System.out.println(this.name+" can write");
}
}
