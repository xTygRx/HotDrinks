import java.util.ArrayList;
import java.util.List;

public class AvtomatHotDrinks implements Avtomat{

    List<Product> listProduct = new ArrayList<Product>();

    public void setListProduct(List<Product> listProduct) {
        this.listProduct = listProduct;
    }
    public Product getProduct(String name){
        for (Product pr : listProduct){
            if (pr.getName().equals(name)) return pr;

        }
        return null;
    }
}