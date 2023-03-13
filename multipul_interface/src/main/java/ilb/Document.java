package ilb;

public class Document {

   private  String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Document(String content) {
        this.content = content;
    }

    public void  print (printerable printer){
        printer.print(this.content);
    }

}
