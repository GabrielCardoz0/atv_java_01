public class App {
    public static void main(String[] args) {
        int number = 2;

        System.out.println("Tabela de multiplicação de: "+number);

        for(int i = 1; i < 11; i++) {
            System.out.println(i*number);
        }

        // for(int i = 1; i <= number; i++) {
        //     String concNumber = "";
        //     for(int j = 1; j <= i; j++) {
        //         concNumber = concNumber+i;
        //     }
        //     System.out.println(concNumber);
        // }

    }
}
