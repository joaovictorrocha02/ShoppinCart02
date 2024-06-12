public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Camisa";
        String message = custName+" quer comprar uma "+itemDesc;
         
        
        double doublepreço, doubleimposto; 
        doublepreço = 15.00;          //valor do preço da camisa
        doubleimposto = 10.78;       //valor do imposto da camisa
        
        int intqntd; 
        intqntd = 1;               //quantidade de camisa
        
        
        System.out.println(message);
        
        String totalPrice = "O custo total com imposto vai ser: $" + ((doublepreço + doubleimposto) * intqntd);
        System.out.println(totalPrice);
        // total do custo com o imposto calculado
        
    }    
}
