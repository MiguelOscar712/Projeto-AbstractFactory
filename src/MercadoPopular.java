package mercado.abstractfactory;

public class MercadoPopular implements FabricaMercado {
    public Bebida createBebida() {
        return new Refrigerante();
    }
    public Alimento createAlimento() {
        return new Sanduiche();
    }
}