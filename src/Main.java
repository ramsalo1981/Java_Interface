//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CD item = new CD(2000,"hello","john");
        System.out.println(item.GetItemPrice());
        System.out.println(item.GetInfo());
    }
}