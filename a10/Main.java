package a10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Collection <Socio> setDeSocios = new HashSet <>();

        Socio s1 = new Socio("1","Bob");
        Socio s2 = new Socio("3","Cat");
        Socio s3 = new Socio("2","Mat");
        Socio s4 = new Socio("1","Frat");
        Socio s5 = new Socio("8474","Rat");
        Socio s6 = new Socio("333","Fat");
        Socio s7 = new Socio("24","Pat");

        setDeSocios.add(s1);
        setDeSocios.add(s2);
        setDeSocios.add(s3);
        setDeSocios.add(s4);
        setDeSocios.add(s5);
        setDeSocios.add(s6);
        setDeSocios.add(s7);

        System.out.println("Set original:\n " + setDeSocios + "------------------------------------------------------------------------\n");

        Collection <Socio> TreeDeSocios = new TreeSet<>(setDeSocios);
        System.out.println("Set ordenado:\n " + TreeDeSocios + "------------------------------------------------------------------------\n");
       
        List <Socio> ListaDeSociosOrdenada = new ArrayList<>(TreeDeSocios);
        Socio ganador = ListaDeSociosOrdenada.get(1);

        System.out.println("El segundo socio de la lista es el ganador del premio: "+ ganador );
        
    }
}
