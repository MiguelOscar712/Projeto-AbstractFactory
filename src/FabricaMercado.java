package mercado.abstractfactory;

public interface FabricaMercado {
    Bebida createBebida();
    Alimento createAlimento();
}