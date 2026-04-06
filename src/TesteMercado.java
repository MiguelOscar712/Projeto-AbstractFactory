package mercado.abstractfactory;

public class TesteMercado {
    public static void main(String[] args) {
        System.out.println("Teste Mercado Saudável");
        FabricaMercado mercadoSaudavel = new MercadoSaudavel();
        Cliente cliente1 = new Cliente(mercadoSaudavel);
        cliente1.consumirTudo();

        System.out.println("\nTeste Mercado Popular");
        FabricaMercado mercadoPopular = new MercadoPopular();
        Cliente cliente2 = new Cliente(mercadoPopular);
        cliente2.consumirTudo();
    }
}