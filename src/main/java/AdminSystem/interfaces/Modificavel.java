package AdminSystem.interfaces;

import com.rest.service.restservice.src.Products.Product;

public interface Modificavel {

    public abstract void tryToAddProduct(Product product);
    public abstract void tryToDeleteProduct(int id);
}
