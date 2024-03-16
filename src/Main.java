import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product p1 = new HotDrinks("Espresso", 3.2, 25.2);
        Product p2 = new HotDrinks("Americano", 5.2, 20.0);
        Product p3 = new HotDrinks("Cappuccino", 6.2);
        Product p4 = new HotDrinks("Ristretto");


        AvtomatHotDrinks avtomat = new AvtomatHotDrinks();
        avtomat.setListProduct(List.of(p1, p2, p3,p4));
        System.out.println(avtomat.getProduct("Cappuccino"));
    }
}
