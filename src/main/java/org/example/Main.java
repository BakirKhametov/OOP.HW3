package org.example;

import java.util.*;

public class Main {
        public static void main(String[] args) {
            ListOfCats cats = new ListOfCats();
            cats.setCatList(Arrays.asList(
                    new Cat("barsik", "lop-eared"),
                    new Cat("sharik", "lop-eared"),
                    new Cat("barsik", "mei-kun"),
                    new Cat("murzik", "mei-kun")));

            Iterator<Cat> cat = cats.iterator();
            while (cat.hasNext()){
                System.out.println(cat.next());
            }
            System.out.println("_____________");
            cats.getCatList().sort(new CompareCat());
            for (Cat pussycat: cats){
                System.out.println(pussycat);
            }

        }

}

