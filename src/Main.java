import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>();
        lista1.add(4);
        lista1.add(8);
        lista1.add(2);
        List<Integer> lista3 = new ArrayList<>();
        for(int i=0;i<lista1.size();i++){
        lista3.add(lista1.get(lista1.size()-i-1));
        }
        System.out.println(lista3);
    }
}