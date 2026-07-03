package com.xworkz.functionalinterface.runner;

import com.xworkz.functionalinterface.dao.Movies;
import com.xworkz.functionalinterface.dao.Prateek;
import com.xworkz.functionalinterface.dao.Squre;

public class MoviesRunner {
    public static void main(String[] args) {
        Movies movies=(arr)->{
            for(String ref:arr){
                System.out.println(ref);
            }
            return  null;
        };
        String[] arr={"KGF","Kantara"};
        movies.moveNaame(arr);


        Squre squr=(number) -> (number*number);
        int r=  squr.squre(10);

        System.out.println(r);


        Prateek prateek=(tvName)-> System.out.println("prateek whatc tv  brand is: "+tvName);

        prateek.WhatchTV("samsung");

    }
}
