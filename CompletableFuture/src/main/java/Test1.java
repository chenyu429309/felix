import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static java.util.concurrent.CompletableFuture.runAsync;
import static java.util.concurrent.CompletableFuture.supplyAsync;

/**
 * 作者 : Felix
 * 创建时间 : 2018-09-05 14:55
 */
public class Test1 {
    public static void main(String[] args) {
        //异步返回参数，同步不返回参数
        //异步：传入参数为Supplier<U> supplier类
        /**
         * Supplier类 （）->Supplier类->T
         */
        Supplier<Integer> supplier = new Supplier() {
            @Override
            public Object get() {
                return null;
            }
        };
        CompletableFuture d = supplyAsync(() -> 222);
        /**
         * 同步不返回参数，接受一个Runnable runnable
         *
         */
        Runnable runnable = () -> System.out.println(get());
        runAsync(() -> System.out.println(1));
        /***
         * 传入一个Function<? super T,? extends U> fn
         */
        Function<? super String, ? extends String> fn = (Function<String, String>) s -> s.toUpperCase();
        CompletableFuture<String> c = supplyAsync(() -> "test").thenApplyAsync(s -> s.toUpperCase());
        /**
         * 传入一个BiConsumer<? super T, ? super Throwable> action
         */
        BiConsumer<? super String, ? super Throwable> action = (BiConsumer<String, Throwable>) (s, throwable) -> {
            System.out.println("s: " + s);
            System.out.println("Throwable: " + throwable.getMessage());
        };
//        c.whenComplete((s, throwable) -> {
//            System.out.println("s: "+s);
//            System.out.println("Throwable: "+throwable.getMessage());
//        });

        final CompletableFuture<String> exceptionally = CompletableFuture.supplyAsync(Test1::get).thenApplyAsync(Test1::apply).exceptionally(e -> e.getMessage());
      /*  exceptionally.whenComplete((s, throwable) -> {
            System.out.println("s: " + s);
            System.out.println("Throwable: " + throwable.getMessage());
        })*/
        ;

        Function<Throwable, ? extends String> f = (Function<Throwable, String>) throwable -> throwable.getMessage();
        c.exceptionally(throwable -> throwable.getMessage());


        List<String> list = Lists.newArrayList("a s d", "z x c", "e r t ", "f g h");
        List<String> collect;
//        collect = list.parallelStream().map(String::toLowerCase).map(s -> CompletableFuture.supplyAsync(() -> {
//            // int i = 1 / 0;
//            return s.toUpperCase();
//        }).exceptionally(e -> {
//            throw new RuntimeException(e.getMessage());
//        })).map(CompletableFuture::join).collect(Collectors.toList());
//        collect.parallelStream().forEach(System.out::println);
//        list.parallelStream().map(s -> Lists.asList(10, s.split(""))).flatMap(strings -> strings.parallelStream()).forEach(System.out::println);
//        Function<? super Integer, ? extends CompletionStage<Integer>> fn1 = Test1::apply;
//        CompletableFuture.supplyAsync(() -> 1111).thenComposeAsync(s -> CompletableFuture.supplyAsync(() -> s + 1)).thenCombineAsync(CompletableFuture.supplyAsync(() -> 1111),
//                (a, b) -> {
//                    return a + b;
//                });
//
//        Person person = new Person();
//        Optional optional = Optional.ofNullable(person);
//        optional.get();
//
//        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
//            int i = 1 / 0;
//            return 100;
//        });
//        future.join();
//        //System.out.println(future.join());
//        System.out.println(future.getNow(null));
        // future.get();

        List<String> l1 = new ArrayList<>();
        l1.add(""+1);
        l1.add(""+2);
        l1.add(""+3);
        l1.add(""+4);
        List<String> l2 = new ArrayList<>();
        l2.add(""+5);
        l2.add(""+6);
        l2.add(""+7);
        l2.add(""+8);

        Stream.of(l1, l2).flatMap(n -> n.stream()).filter(n->n.length()>0).forEach(System.out::println);
        System.out.println(Optional.ofNullable("").isPresent());
        System.out.println(Objects.nonNull(""));

        Son son=new Son();
        son.set(new HashMap());

        Father father=new Father();
        father.set(new HashMap());

    }

    private static String get() {
        return "123";
    }

    private static String apply(String s) {
        int i = 1 / 0;
        return s.toUpperCase();
    }

    public static CompletableFuture apply(Integer s) {
        return CompletableFuture.supplyAsync(() -> s + 1);
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static class Person {
        private String name;
        private int age;
    }
}

class  Father {
    void set(Map map){
        System.out.println(map);
    }
}
class  Son extends Father{

    void set(HashMap map) {
        super.set(map);
    }
}


