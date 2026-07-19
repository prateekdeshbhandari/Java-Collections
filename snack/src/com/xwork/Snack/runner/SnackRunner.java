package com.xwork.Snack.runner;

import com.xwork.Snack.dto.SnackDTO;

import java.util.*;
import java.util.stream.Collectors;

public class SnackRunner {
    public static void main(String[] args) {
        Set<SnackDTO> snackSet = new HashSet<>();

        snackSet.add(new SnackDTO("Chips", "Spicy", 100.0, 50.0));
        snackSet.add(new SnackDTO("Biscuit", "Sweet", 50.0, 30.0));
        snackSet.add(new SnackDTO("Popcorn", "Salty", 80.0, 40.0));
        snackSet.add(new SnackDTO("Nuts", "Roasted", 60.0, 70.0));
        snackSet.add(new SnackDTO("Chips", "Spicy", 100.0, 50.0)); // Duplicate

        System.out.println("Total objects added: 5");
        Set<SnackDTO> snackDTOS = new HashSet<>();
        snackSet.add(new SnackDTO("Nuts", "Roasted", 60.0, 70.0));
        snackDTOS.add(new SnackDTO("Lays", "Classic", 95.0, 25.0));
        snackDTOS.add(new SnackDTO("Cheese", "Cheesy", 75.0, 35.0));
        snackDTOS.addAll(snackSet);
        System.out.println("new set objects added: 3");
        snackSet.addAll(snackDTOS);

        System.out.println("Unique objects in Set: " + snackSet.size());
        snackSet.forEach(snack -> System.out.println(snack.hashCode()));
        System.out.println("====================================================");
        snackSet.remove(new SnackDTO("Popcorn", "Salty", 80.0, 40.0));
        System.out.println("After removing Popcorn: ");
        System.out.println("====================================================");
        boolean ref = snackSet.contains(new SnackDTO("Popcorn", "Salty", 80.0, 40.0));
        System.out.println("Contains Popcorn: " + ref);
        System.out.println(snackSet.containsAll(snackDTOS));
        System.out.println(snackSet);
        System.out.println("====================================================");
        System.out.println("after checking contains remembar!  :" + snackSet.size());
        System.out.println("====================================================");
//        snackSet.clear();
        System.out.println("after clearing all objects: " + snackSet.size());
        snackSet.isEmpty();
        System.out.println("after clearing all objects: " + snackSet.isEmpty());
        System.out.println("====================================================");
        SnackDTO snackDTO[] = (snackDTOS.toArray(new SnackDTO[0]));
        for (SnackDTO snackDTO1 : snackDTO) {
            System.out.println(snackDTO1);
        }

        System.out.println("====================================================");
        Iterator<SnackDTO> snackDTOIterator = snackDTOS.iterator();
        while (snackDTOIterator.hasNext()) {
            SnackDTO refs = snackDTOIterator.next();
            System.out.println(refs);


        }
        System.out.println("====================================================");
        snackSet.retainAll(snackDTOS);
        System.out.println(snackDTOS);
        System.out.println("====================================================");

//        snackSet.removeIf(snackDTO1 -> snackDTO1.getPrice()<50);
//        System.out.println(snackSet);
//        System.out.println(snackSet.size());
        System.out.println("====================================================");
        HashSet<SnackDTO> ss = new HashSet<>(2);
        ss.addAll(snackSet);
        System.out.println(ss);
        System.out.println(ss.size());
        HashSet<SnackDTO> ff = new HashSet<>(4, 1f);
        ff.addAll(snackSet);
        System.out.println(ff);
        System.out.println(ff.size());

        snackSet.retainAll(snackDTOS);
        System.out.println(snackDTOS);
        System.out.println(snackDTOS.size());

        SnackDTO highest = null;

        for (SnackDTO snack : snackSet) {
            if (highest == null || snack.getPrice() > highest.getPrice()) {
                highest = snack;
            }
        }

        System.out.println("Highest Price Snack: " + highest);

        int sum = 0;
        for (SnackDTO snack : snackSet) {
            sum += snack.getWeight();
        }
        System.out.println("Sum of weights: " + sum);

        TreeSet<SnackDTO> sss = new TreeSet<>(Comparator.reverseOrder());
        sss.addAll(snackSet);
        sss.forEach(System.out::println);
        System.out.println("====================================================");
    TreeSet<SnackDTO>  ssss=new TreeSet<>((s1,s2)->s1.getFlavor().compareTo(s2.getFlavor()));
    ssss.addAll(sss);
        ssss.forEach(System.out::println);
        System.out.println("====================================================");
        TreeSet<SnackDTO>  snackDTOS2=new TreeSet<>((s1,s2)-> Double.compare(s1.getPrice(),s2.getPrice()));
        snackDTOS2.addAll(sss);
        snackDTOS2.forEach(System.out::println);
        System.out.println("====================================================");
        System.out.println(snackDTOS2.first());
        System.out.println(snackDTOS2.last());
snackDTOS.stream().map(snackDTO1 -> snackDTO1.getName()).sorted(Comparator.reverseOrder()).forEach(System.out::println);


        snackDTOS2.forEach(System.out::println);
        System.out.println("====================================================");
TreeSet<SnackDTO>ssssyu=snackSet.stream().filter(snackDTO1 -> snackDTOS.contains(snackDTO1)).collect(Collectors.toCollection(TreeSet::new));
        System.out.println(ssssyu);

        snackSet.stream().filter(snackDTO1 -> snackDTO1.getName().equals("Biscuit")).forEach(System.out::println);

TreeSet<SnackDTO> snackDTO1= ssssyu;
        System.out.println(snackDTO1);


    }
}
