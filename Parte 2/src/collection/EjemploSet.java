package collection;

import java.util.HashSet;
import java.util.Set;

public class EjemploSet {

    public static void main(String[] args) {
        Set<Integer> integers =  new HashSet<>();
        integers.add(1);
        integers.add(5);
        //System.out.println(integers);
        integers.add(1);
        //System.out.println(integers);
        integers.addAll(Set.of(5,1,2,3,12,50,30));
        //System.out.println(integers);
        integers.add(20);
        integers.remove(30);
        //System.out.println(integers);

        integers.forEach(integer -> System.out.println(integer));



    }
}
