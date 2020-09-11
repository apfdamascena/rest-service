package com.rest.service.restservice.src.Admin;
import com.rest.service.restservice.src.Product;
import com.rest.service.restservice.src.interfaces.Modificavel;
import com.rest.service.restservice.src.interfaces.Autenticavel;

public class Admin implements Autenticavel, Modificavel{

    private Autentica autenticador = new Autentica() ;
    private Modifica modificador = new Modifica();
    private boolean DoYouHavePermissions = false;

    public Admin(int password){
        this.autentica(password);
    }

    @Override
    public boolean autentica(int password){
        return this.DoYouHavePermissions = this.autenticador.autentica(password);
    }

    @Override
    public void tryToAddProduct(Product product) {
        if(DoYouHavePermissions){
            this.addProduct(product);
        }
    }

    private void addProduct(Product product){
        try {
            this.modificador.addProduct(product);
        } catch (Exception execution){
            execution.printStackTrace();
        }
    }

    @Override
    public void tryToDeleteProduct(int id) {
        if(DoYouHavePermissions){
            this.deleteProduct(id);
        }
    }

    private void deleteProduct(int id){
        try {
            this.modificador.deleteProduct(id);
        } catch (Exception execution){
            execution.printStackTrace();
        }
    }
}
