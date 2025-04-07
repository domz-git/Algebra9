import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        boolean isBroj = false;
        while (!isBroj){
            System.out.print("Unesi broj: ");
            String broj = scanner.nextLine();

            if (isNumeric(broj)){
                System.out.println("Unesen je broj");
                isBroj = true;
            }else {
                System.out.println("Nije unesen broj");
            }
        }

    }

    public static boolean isNumeric(String broj) {
        if (broj != null) {
            try {
                Integer.parseInt(broj);
                return true;
            } catch (Exception e) {
                return false;
            }
        }else{
            return false;
        }
    }
}
