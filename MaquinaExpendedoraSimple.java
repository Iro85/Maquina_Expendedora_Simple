public class MaquinaExpendedoraSimple {
    
    // El precio del billete
    private int precioBillete;
    // La cantidad de dinero que lleva metida el cliente actual
    private int balanceClienteActual;
    // El total de dinero almacenado en la maquina desde su ultimo vaciado
    private int totalDineroAcumulado;
    // El origen del billete
    private String estacionOrigen;
    // El destino del billete
    private String estacionDestino;
    // El nuevo precio del billete introducido
    private int nuevoPrecio;
    // El descuento aplicable al billete
    private int descuento;

    /**
     * Crea una maquina expendedora de billetes de tren con el 
     * precio del billete y el origen y destino dados. Se asume que el precio
     * del billete que se recibe es mayor que 0.
     */
    //Precio, origen y destino establecido de serie
    public MaquinaExpendedoraSimple() {
        precioBillete = 12;
        balanceClienteActual = 0;
        totalDineroAcumulado = 0;
        estacionOrigen = "Leon";
        estacionDestino = "Santa Maria del Paramo";
    }
   
    public MaquinaExpendedoraSimple(int costeBillete, String destino) {
        precioBillete = costeBillete;
        balanceClienteActual = 0;
        totalDineroAcumulado = 0;
        estacionOrigen = "León";
        estacionDestino = destino;
    }

    /**
     * Devuelve el precio del billete
     */
    public int getPrecioBillete() {
        return precioBillete;
    }

    /**
     * Devuelve la cantidad de dinero que el cliente actual lleva introducida
     */
    public int getBalanceClienteActual() {
        return balanceClienteActual;
    }
    
    /**
     * Devuelve la cantidad de dinero acumulada en la maquina
     */
    public int gettotalDineroAcumulado() {
        return totalDineroAcumulado;
    }

    /**
     * Simula la introduccion de dinero por parte del cliente actual
     */
    public void introducirDinero(int cantidadIntroducida) {
        if (cantidadIntroducida>=0){
            balanceClienteActual = balanceClienteActual + cantidadIntroducida;
        }
        else{
            System.out.println("Cantidad introdica incorrecta");
        }
    }

    public void setPrecioBillete(int nuevoPrecio){
        precioBillete = nuevoPrecio;
    }
    
    public void setDescuento(int descuento){
        precioBillete = precioBillete - descuento;
    }
    
    public void vaciarDepositoDinero(){
        totalDineroAcumulado = 0;
    }
    /**
     * Imprime un billete para el cliente actual
     */
    public void imprimirBillete() {
        if(balanceClienteActual>=precioBillete){
            // Simula la impresion de un billete
            System.out.println("##################");
            System.out.println("# Billete de tren:");
            System.out.println("# De " + estacionOrigen + " a " + estacionDestino);
            System.out.println("# " + precioBillete + " euros.");
            System.out.println("##################");
            System.out.println();

            // Actualiza el total de dinero acumulado en la maquina
            totalDineroAcumulado = totalDineroAcumulado + precioBillete;
            // Queda preparada para el proximo cliente
            balanceClienteActual = balanceClienteActual - precioBillete;
        }
        else{
            System.out.println("No hay bastante dinero introducido");
        }
    }
}
