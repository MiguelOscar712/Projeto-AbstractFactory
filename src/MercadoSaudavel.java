package mercado.abstractfactory;

public class MercadoSaudavel implements FabricaMercado {
    public Bebida createBebida() {
        return new SucoNatural();
    }
    public Alimento createAlimento() {
        return new Salada();
    }
}