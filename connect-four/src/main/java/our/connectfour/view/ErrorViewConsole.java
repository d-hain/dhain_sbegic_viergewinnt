package our.connectfour.view;

public class ErrorViewConsole implements ErrorView{
    @Override
    public void display(String str){
        final String ESCAPE = "\u001B[0m";
        final String RED = "\u001B[31m";
        System.out.println(RED + str + ESCAPE);
    }
}
