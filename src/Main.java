package mercado.abstractfactory;

public class Main {
    public static void main(String[] args) {
        // Mercado saudável
        FabricaMercado mercadoSaudavel = new MercadoSaudavel();
        Cliente cliente1 = new Cliente(mercadoSaudavel);
        System.out.println("Consumindo produtos do mercado saudável:");
        cliente1.consumirTudo();

        System.out.println("-----");


        FabricaMercado mercadoPopular = new MercadoPopular();
        Cliente cliente2 = new Cliente(mercadoPopular);
        System.out.println("Consumindo produtos do mercado popular:");
        cliente2.consumirTudo();
    }
}