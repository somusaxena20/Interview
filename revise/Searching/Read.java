import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Read {
    public static void main(String []args)throws FileNotFoundException
    {
        File f = new File("input.txt");

        Scanner sc = new Scanner(f);

        while(sc.hasNext())
        {
            System.out.print(sc.nextLine());
        }
    }
}
