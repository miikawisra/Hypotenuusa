import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.*;

class Hypotenuusa {
    public static void main(String [] args){
        int e_kateetti;
        int t_kateetti;
        double hypotenuusa;

        BufferedReader in= new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.println("Anna ensimmäinen kateetti:");
        e_kateetti = Integer.parseInt(in.readLine());

        System.out.println("Anna toinen kateetti:");
        t_kateetti = Integer.parseInt(in.readLine());

        hypotenuusa = (e_kateetti*e_kateetti)+(t_kateetti*t_kateetti);

        System.out.println("Hypotenuusan pituus:"+Math.sqrt(hypotenuusa));

        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
}
/*Math.sqrt(double_luku)


Anna ensimmäinen kateetti:43
Anna toinen kateetti:33
Hypotenuusan pituus: 54.20332093147061
*/