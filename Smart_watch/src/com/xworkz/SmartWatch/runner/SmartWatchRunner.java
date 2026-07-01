package com.xworkz.SmartWatch.runner;

import com.xworkz.SmartWatch.Dto.SmartWatchDto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;




public class SmartWatchRunner {
    public static void main(String[] args) {


//add() Operations\n
    List<SmartWatchDto> smartWatchDtos = new ArrayList<>();
    smartWatchDtos.add(new SmartWatchDto("Samsung", "Galaxy Watch 6", "Black", 1.5, true, true, 7, 29999.99, "Wear OS", LocalDateTime.of(2024, 5, 10, 10, 30)));
        smartWatchDtos.add(new SmartWatchDto("Samsung", "Galaxy Watch 6", "Black", 1.5, true, true, 7, 29999.99, "Wear OS", LocalDateTime.of(2024, 5, 10, 10, 30)));

        smartWatchDtos.add(new SmartWatchDto("Apple", "Watch Series 9", "Silver", 1.9, true, true, 5, 45999.99, "watchOS", LocalDateTime.of(2023, 9, 22, 9, 0)));

       smartWatchDtos.add(new SmartWatchDto("Noise", "ColorFit Pro", "Blue", 1.7, true, true, 10, 4999.99, "Noise OS", LocalDateTime.of(2024, 2, 15, 11, 0)));

        smartWatchDtos.add(new SmartWatchDto("boAt", "Wave Call", "Green", 1.8, false, true, 8, 2999.99, "boAt OS", LocalDateTime.of(2023, 12, 5, 8, 30)));

        smartWatchDtos.add(new SmartWatchDto("Fire-Boltt", "Ninja", "Grey", 1.6, true, false, 6, 3499.99, "Fire OS", LocalDateTime.of(2024, 1, 20, 12, 45)));
//      smartWatchDtos.add(null);
      smartWatchDtos.add(0,new SmartWatchDto("Fastark", " Watch 2", "witch", 2.5, false, true, 7, 29999.99, "Wear OS", LocalDateTime.of(2024, 5, 10, 10, 30)));
        smartWatchDtos.add(2, new SmartWatchDto("OnePlus", "Watch 2", "Green", 1.46, true, true, 12, 24999.99, "Wear OS", LocalDateTime.of(2024, 3, 15, 11, 0)));


       Iterator<SmartWatchDto>smartWatchDtoIterator=smartWatchDtos.iterator();

      while(smartWatchDtoIterator.hasNext()) {
          SmartWatchDto watch = smartWatchDtoIterator.next();



          System.out.println(watch);
          if (watch!=null&&watch.getBrand().equals("Apple")) {
              watch.setBrand("iwatch");
              System.out.println("this chang values jast band: "+watch);

          }
      }
       // addAll() Operations\n


        List<SmartWatchDto> secondList = new ArrayList<>();

        secondList.add(new SmartWatchDto("Amazfit", "GTR 4", "Black", 1.43, true, true, 14, 16999.99, "Zepp OS", LocalDateTime.of(2024, 6, 1, 10, 0)));

        secondList.add(new SmartWatchDto("OnePlus", "Watch 2", "Green", 1.46, true, true, 12, 24999.99, "Wear OS", LocalDateTime.of(2024, 3, 15, 11, 0)));

        secondList.add(new SmartWatchDto("Huawei", "Watch GT 4", "Brown", 1.5, true, true, 10, 19999.99, "HarmonyOS", LocalDateTime.of(2024, 4, 20, 9, 30)));
//        Create a second list of 3 smart watches and add all to the main list
//        Add all watches from one list to another at a specific position
//        Combine two lists of smart watches using addAll
   smartWatchDtos.addAll(2,secondList);
        System.out.println(smartWatchDtos+"\n");
        System.out.println(smartWatchDtos.size());

////       Add all watches from a collection that has GPS enabledo>
//        for(SmartWatchDto s:smartWatchDtos){
//            if(s.isHasGPS()==true){
//                System.out.println(s );
//
//            }
//
//        }
//
////        Add all watches from a list to an empty list\n
//        List<SmartWatchDto>empty=new ArrayList<>();
//       empty.addAll(smartWatchDtos);


//        contains() Operations\n

//        Check if the list contains a specific brand (e.g., "Apple")
//        Check if the list contains a watch with model "Series 7"
        String brand="Fastark";

       boolean  contemss=smartWatchDtos.contains(brand);
      System.out.println("contens "+contemss);

        for(SmartWatchDto www:smartWatchDtos){
            if(www.getBrand().equals(brand)) {
                System.out.println(smartWatchDtos);

                System.out.println("==================================");

            }
                if(www.getModel().equals("Watch 2")) {
                    System.out.println(www);

                }
//                    Check if the list contains a watch with model "Series 7"
        }
        System.out.println("==================================");
        for(SmartWatchDto ww:smartWatchDtos){
            if(ww.getPrice()<40000){
                System.out.println(ww);
            }
        }



        SmartWatchDto smartWatchDto=new SmartWatchDto("Huawei", "Watch GT 4", "Brown", 1.5, true, true, 10, 19999.99, "HarmonyOS", LocalDateTime.of(2024, 4, 20, 9, 30));
boolean contemns=smartWatchDtos.contains(smartWatchDto);
        System.out.println(contemns);

//        containsAll() Operations\n

        boolean contemsss =smartWatchDtos.containsAll(smartWatchDtos);
        System.out.println("contens "+contemsss);
        for(SmartWatchDto sss:smartWatchDtos){
            if(sss.isHasGPS()==true)
            {
                System.out.println(sss);
            }
        }
        Iterator<SmartWatchDto> iterator = smartWatchDtos.iterator();

        while (iterator.hasNext()) {
            SmartWatchDto watch = iterator.next();

            if (watch.getBrand().equals("Fire-Boltt")) {
                iterator.remove();
            }
        }
        System.out.println();

        System.out.println(smartWatchDtos.get(1));


        System.out.println(smartWatchDtos.size());
smartWatchDtos.remove(4);
        System.out.println(smartWatchDtos.size());
        smartWatchDtos.removeAll(smartWatchDtos);
        System.out.println(smartWatchDtos.size());
    }

}
