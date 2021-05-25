package javaBasics;
class ArrayCopyDemo {
    public static void main(String[] args) {
        String[] copyFrom = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
            "Marocchino", "Ristretto" };
        
        String[] copyTo = new String[7];
        System.arraycopy(copyFrom, 0, copyTo, 0, 7);
        for (String coffee : copyTo) {
            System.out.print(coffee + " "); 
            
        } 
            String[] copyTo2 = java.util.Arrays.copyOfRange(copyFrom, 0, 13);        
            for (String coffee2 : copyTo2) {
                System.out.println(coffee2 + " ");
        }
}}