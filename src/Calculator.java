import java.util.function.*;

public class Calculator {
    static Supplier supplier;
    static Supplier<Calculator> instance = Calculator::new;


    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> x / y;

    Predicate<Integer> isPositive = x -> x > 0;

    Predicate<Integer> isEqualZero = x -> x == 0;
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;


    Consumer<Integer> println = System.out::println;

}

