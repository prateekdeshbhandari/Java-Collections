package com.xworkz.functionalinterface.runner;

import com.xworkz.functionalinterface.dao.*;

public class MoviesRunner {
    public static void main(String[] args) {
        Movies movies = (arr) -> {
            for (String ref : arr) {
                System.out.println(ref);
            }
            return null;
        };
        String[] arr = {"KGF", "Kantara"};
        movies.moveNaame(arr);


        Squre squr = (number) -> (number * number);
        int r = squr.squre(10);

        System.out.println(r);


        Prateek prateek = (tvName) -> System.out.println("prateek whatc tv  brand is: " + tvName);

        prateek.WhatchTV("samsung");

        AddNumber addNumber = ((a, b) -> a + b);
        int f = addNumber.addNumber(10, 70);
        System.out.println(f);

        CustemarDetiels custemarDetiels = (Id, name, number, sallry) -> {
            System.out.println(Id+" "+ name+" "+number+" "+sallry);
return name;
        };
     String g=   custemarDetiels.custemar(34,"Prateek",87123468123l,25000.87);

        System.out.println(g);


        OnAndOfButton onAndOfButton=(buttonIson)->buttonIson.equals("on");
//            if(buttonIson.equals("on")){
//                return true;
//            }
//            return false;

//        };
       boolean s= onAndOfButton.onOf("0n");
        System.out.println(s);

        Kundan kundan=(i) -> {

            for(i=0;i<=10;i++){
          if(i * 2 == 0) {
              System.out.println(i);
          }
          }
        };

        kundan.allodd(2);

        ReadLength readLength=(name) -> (name.length()) ;

        System.out.println(readLength.readLine("Prateek"));


        FoodQuntity foodQuntity=(name,quntity,price) -> {
            System.out.println(quntity+" "+name+" "+price);
            return (int) ( price * quntity);


        };
        int fooo=foodQuntity.food("fsd",3,250);
        System.out.println(fooo);

        BankAccount bankAccount=(pin, amount) -> {

            return pin==1234&&amount<=10000.00;
        };
        boolean b=bankAccount.DebitAmount(124,5000);
        System.out.println(b);
if(b){
    System.out.println("data is sucesfully");

}else{
    System.out.println("pin amount is not match");
}
        BookStore bookStore=(bookId)->{
            if(bookId==101)
                return "Effective Java";
            return "Book Not Found";
        };
        System.out.println(bookStore.getBookName(101));

        Gst gst=(entries)->
        {
            for(int entry:entries)
            {
                if(entry>10000)
                {
                    System.out.println(entry+": GST will apply");
                    entry+=250;
                    System.out.println(entry+"(updated)");
                }
                else
                {
                    System.out.println(entry);
                }
            }
            return 0;
        };
        int[] entries={12300,3455,231,45067};
        gst.getAmount(entries);

        HighWay highWay=(nhNumber,name)->
        {
            System.out.println(nhNumber+", "+name);
            return 90.0;
        };
        System.out.println(highWay.speed(153,"national highway"));

        Roof roof=(bricksCount)->
        {
            System.out.println(bricksCount+" in bricks");
            return 10.0;
        };
        System.out.println(roof.getTime(123));

        CottonMill cottonMill=(type)->{
            System.out.println(type+" in Kg");
            return 250;
        };
        System.out.println(cottonMill.getQuantity("Fluffy Rice"));

        Bakery bakery=(item,quantity)->{
            System.out.println(item+" : "+quantity);
            return quantity*45.5;
        };
        System.out.println(bakery.getPrice("Cake",3));


        Hospital hospital=(department,roomNo)->{
            System.out.println(department+" "+roomNo);
            return "Dr. Kumar";
        };
        System.out.println(hospital.getDoctor("Cardiology",201));

        School school=(rollNo)->{
            return rollNo==101;
        };
        System.out.println(school.isPresent(101));

        Library library=(category,author)->{
            System.out.println(category+" "+author);
            return 250;
        };
        System.out.println(library.getBooks("Java","James Gosling"));






    }
}
