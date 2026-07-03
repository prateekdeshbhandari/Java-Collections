package com.xworkz.functionalinterface.runner;

import java.sql.SQLOutput;
import java.util.function.*;


public class FunctionalInterfaceR {
    public static void main(String[] args) {
        BiConsumer<Integer,String> biConsumer=(t, p) ->{
            System.out.println(t+":"+p);

        };
        biConsumer.accept(4,"prateek");


        BiFunction<Integer,Integer,Integer>biFunction=((a, b) -> a+b);
        System.out.println(biFunction.apply(2,3));

        BinaryOperator<Integer>binaryOperator=((a, b) ->a*b );
        System.out.println(binaryOperator.apply(20,28));

        BiPredicate<String,String>biPredicate=((s, s2) -> s.equals(s2));
        System.out.println(biPredicate.test("prateek","prateek"));

       BooleanSupplier booleanSupplier=()->true;
        System.out.println(booleanSupplier.getAsBoolean());

        Consumer<String>consumer=s-> System.out.println(s);
            consumer.accept("consummae");

              DoubleBinaryOperator dbo=(a,b)->a+b;
        System.out.println(dbo.applyAsDouble(4.4,5.5));

        DoubleConsumer doc=d-> System.out.println(d);
        doc.accept(1000.55);

        DoubleFunction<String> df=d->"Value:"+d;
        System.out.println(df.apply(5.5));

        DoublePredicate dp=d->d>10;
        System.out.println(dp.test(20));

        DoubleSupplier ds=()->99.9;
        System.out.println(ds.getAsDouble());

        DoubleToIntFunction d2i=d->(int)d;
        System.out.println(d2i.applyAsInt(12.8));

        DoubleToLongFunction d2l=d->(long)d;
        System.out.println(d2l.applyAsLong(50.5));

        DoubleUnaryOperator duo=d->d*2;
        System.out.println(duo.applyAsDouble(8));

        Function<String,Integer> function=s->s.length();
        System.out.println(function.apply("Java"));

        IntBinaryOperator ibo=(a,b)->a+b;
        System.out.println(ibo.applyAsInt(5,6));

        IntConsumer ic=i->System.out.println(i);
        ic.accept(100);

        IntFunction<String> intFunction=i->"No:"+i;
        System.out.println(intFunction.apply(10));

        IntPredicate ip=i->i%2==0;
        System.out.println(ip.test(12));

        IntSupplier is=()->500;
        System.out.println(is.getAsInt());

        IntToDoubleFunction i2d=i->i*2.5;
        System.out.println(i2d.applyAsDouble(5));

        IntToLongFunction i2l=i->i*100L;
        System.out.println(i2l.applyAsLong(7));

        IntUnaryOperator iu=i->i*i;
        System.out.println(iu.applyAsInt(9));

        LongBinaryOperator lbo=(a,b)->a+b;
        System.out.println(lbo.applyAsLong(100,200));

        LongConsumer lc=l->System.out.println(l);
        lc.accept(1000L);

        LongFunction<String> lf=l->"Long:"+l;
        System.out.println(lf.apply(50));

        LongPredicate lp=l->l>500;
        System.out.println(lp.test(1000));

        LongSupplier ls=()->9999L;
        System.out.println(ls.getAsLong());

        LongToDoubleFunction l2d=l->l*1.5;
        System.out.println(l2d.applyAsDouble(20));

        LongToIntFunction l2i=l->(int)l;
        System.out.println(l2i.applyAsInt(30));

        LongUnaryOperator lu=l->l*2;
        System.out.println(lu.applyAsLong(20));

        ObjDoubleConsumer<String> odc=(s,d)->System.out.println(s+" "+d);
        odc.accept("Marks",99.5);

        ObjIntConsumer<String> oic=(s,i)->System.out.println(s+" "+i);
        oic.accept("Age",22);

        ObjLongConsumer<String> olc=(s,l)->System.out.println(s+" "+l);
        olc.accept("Salary",50000L);

        Predicate<String> predicate=s->s.startsWith("J");
        System.out.println(predicate.test("Java"));

        Supplier<String> supplier=()->"Hello";
        System.out.println(supplier.get());

        ToDoubleBiFunction<Integer,Integer> tdb=(a,b)->(a+b)/2.0;
        System.out.println(tdb.applyAsDouble(10,20));

        ToDoubleFunction<String> tdf=s->s.length();
        System.out.println(tdf.applyAsDouble("Java"));

        ToIntBiFunction<String,String> tib=(a,b)->a.length()+b.length();
        System.out.println(tib.applyAsInt("Java","Code"));

        ToIntFunction<String> tif=s->s.length();
        System.out.println(tif.applyAsInt("Lambda"));

        ToLongBiFunction<Integer,Integer> tlb=(a,b)->(long)(a*b);
        System.out.println(tlb.applyAsLong(5,6));

        ToLongFunction<String> tlf=s->s.length();
        System.out.println(tlf.applyAsLong("Function"));

        UnaryOperator<String> uo=s->s.toUpperCase();
        System.out.println(uo.apply("java"));


    }
}
