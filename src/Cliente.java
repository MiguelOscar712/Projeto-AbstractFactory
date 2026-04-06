package mercado.abstractfactory;

public class Cliente {

    private Bebida bebida;
    private Alimento alimento;

    public Cliente(FabricaMercado fabrica) {
        this.bebida = fabrica.createBebida();
        this.alimento = fabrica.createAlimento();
    }

    public void consumirTudo() {
        System.out.println(bebida.consumir());
        System.out.println(alimento.consumir());
    }
}