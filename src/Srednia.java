import java.util.ArrayList;
import java.util.Scanner;

public class Srednia {

    public static void main(String[] args) {
        oceny(new ArrayList<>());
    }


    public static void oceny(ArrayList<Double> list){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile ocen chcesz dodać :");
        int liczbaOcen = scanner.nextInt();
        double suma =0;

        for(int i=0; i<liczbaOcen; i++){
            System.out.println("Podaj ocene :");
            list.add(scanner.nextDouble());
        }
        for(Double d : list){
            suma =  suma + d;
        }
        System.out.println("Srednia wynosi :" + suma / liczbaOcen);

    }



}
