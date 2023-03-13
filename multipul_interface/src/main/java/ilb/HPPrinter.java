package ilb;

public class HPPrinter  implements printerable {




    @Override
    public void print(String content) {
        System.out.println("HP : printing " +content);
    }
}
