package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareCat implements Comparator<Cat>  {
            @Override
            public int compare(Cat c1, Cat c2){
            return c1.getCatBreed().compareTo(c2.getCatBreed());
            }
}
