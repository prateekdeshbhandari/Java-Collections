package com.xworkz.disease.Runner;

import com.xworkz.disease.dto.DiseaseDTO;

import java.util.*;

public class DiseaseRunner {
    public static void main(String[] args) {
        DiseaseDTO d1 = new DiseaseDTO(101, "rrrrr", "High blood sugar", "Frequent urination", "Insulin deficiency", "Insulin therapy", "No permanent cure", "Healthy diet", "Genetic");
        DiseaseDTO d2 = new DiseaseDTO(102, "Malaria", "Mosquito-borne disease", "Fever", "Plasmodium parasite", "Antimalarial drugs", "Curable", "Mosquito nets", "Parasitic");
        DiseaseDTO d3 = new DiseaseDTO(103, "Dengue", "Viral disease", "High fever", "Dengue virus", "Supportive care", "No specific cure", "Avoid mosquito bites", "Viral");
        DiseaseDTO d4 = new DiseaseDTO(104, "Tuberculosis", "Lung infection", "Persistent cough", "Mycobacterium tuberculosis", "Antibiotics", "Curable", "BCG vaccine", "Bacterial");
        DiseaseDTO d5 = new DiseaseDTO(105, "Typhoid", "Bacterial infection", "High fever", "Salmonella typhi", "Antibiotics", "Curable", "Clean water", "Bacterial");
        DiseaseDTO d6 = new DiseaseDTO(105, "Asthma", "Respiratory disorder", "Breathing difficulty", "Allergy", "Inhalers", "Not permanent", "Avoid allergens", "Chronic");
        DiseaseDTO d7 = new DiseaseDTO(107, "COVID-19", "Coronavirus infection", "Cough and fever", "SARS-CoV-2", "Antiviral treatment", "Usually recoverable", "Vaccination", "Viral");
        DiseaseDTO d8 = new DiseaseDTO(108, "Cholera", "Water-borne disease", "Severe diarrhea", "Vibrio cholerae", "ORS and antibiotics", "Curable", "Safe drinking water", "Bacterial");
        DiseaseDTO d9 = new DiseaseDTO(109, "Chickenpox", "Viral infection", "Skin rash", "Varicella-zoster virus", "Antiviral medicines", "Curable", "Vaccination", "Viral");
        DiseaseDTO d10 = new DiseaseDTO(110, "Hypertension", "High blood pressure", "Headache", "Lifestyle and genetics", "Blood pressure medicines", "Controlled", "Exercise", "Chronic");
        List<DiseaseDTO> diseaseList = new ArrayList<>();

        diseaseList.add(d1);
        diseaseList.add(d2);
        diseaseList.add(d3);
        diseaseList.add(d4);
        diseaseList.add(d5);
        diseaseList.add(d6);
        diseaseList.add(d7);
        diseaseList.add(d8);
        diseaseList.add(d9);
        diseaseList.add(d10);

        System.out.println("========================================================");
        diseaseList.stream()
                .filter(diseaseDTO -> diseaseDTO.getName().length()>8)
                .map(diseaseDTO -> diseaseDTO.getName()).forEach(diseaseLi-> System.out.println(diseaseLi));

        System.out.println("========================================================");
        diseaseList.stream()

                .map(diseaseDTO -> diseaseDTO.getName().toUpperCase())
                .forEach(System.out::println);
        System.out.println("========================================================");
        diseaseList.stream()

                .map(diseaseDTO -> diseaseDTO.getName().length())

                .forEach(System.out::println);

        System.out.println("========================================================");
//        diseaseList.stream()
//                .map(diseaseDTO -> new DiseaseDTO(diseaseDTO.getName()))
//                .forEach(System.out::println);

        diseaseList.stream().filter(Objects::nonNull).map(diseaseDTO -> diseaseDTO.getName()).forEach(System.out::println);
        System.out.println("========================================================");
     diseaseList.stream().map(diseaseDTO -> diseaseDTO.getId()>106).forEach(System.out::println);
        System.out.println("========================================================");
        Collections.sort(diseaseList);

        System.out.println(diseaseList);

        System.out.println("========================================================");

//        Comparator<DiseaseDTO> comparator=(a1,a2)->{
//            System.out.println(" "+a1+"vv"+a2);
//int ref=a1.getName().compareTo(a2.getName());
//          return Integer.compare(a1.getId(), a2.getId());
        Comparator<DiseaseDTO> comparator1 = (a1, a2) -> {
            int ref=a1.getName().compareTo(a2.getName());


                  return Integer.compare(a1.getId(), a2.getId());



        };



Collections.sort(diseaseList,comparator1);
        diseaseList.forEach(System.out::println);
        System.out.println("========================================================");
        diseaseList.stream()
                .sorted((a1, a2) -> {
                    int result = Integer.compare(a1.getId(), a2.getId());

                    if (result == 0) {
                        result = a1.getName().compareTo(a2.getName());
                    }

                    return result;
                })
                .forEach(System.out::println);

        Optional<DiseaseDTO> disease = diseaseList.stream()
                .filter(d -> d.getCause().equalsIgnoreCase("Viral"))
                .findFirst();

        diseaseList.stream()
                .filter(Objects::nonNull)
                .forEach(System.out::println);

        List<String> names = diseaseList.stream()
                .map(DiseaseDTO::getName)
                .toList();

        diseaseList.stream()
                .filter(d -> d.getName()==null)
                .forEach(System.out::println);

        diseaseList.stream()
                .sorted(Comparator.comparing(DiseaseDTO::getName));

        System.out.println("========================================================");
diseaseList.stream().map(diseaseDTO -> diseaseDTO.getCure()).distinct().sorted(Collections.reverseOrder()).forEach(System.out::println);
        System.out.println("========================================================");
Set<DiseaseDTO>diseaseDTOS=new
        LinkedHashSet<>();
diseaseDTOS.addAll(diseaseList);
diseaseDTOS.stream().sorted((a1,a2)->Integer.compare(a1.getId(), a2.getId())).forEach(System.out::println);
for(DiseaseDTO dto:diseaseDTOS){
    System.out.println(dto);

}


    }
}
