

public class Main {
    public static void main(String[] args) throws Exception {
        Calculator calc = Calculator.instance.get();
        try {
            int a = calc.plus.apply(1, 2);
            int b = calc.minus.apply(1, 1);
            /** a = 3, b = 0
             делить на 0 нельзя
             можно написать обработчик ошибок, можно использовать бональную проверку на пустоту или кратность нулю
             раз делить нельзя только на ноль, я добавлю переменную  isEualZero ив данном случае буду использовать ее для проверки на ноль
             а далее обернем весь испольняемый блок в try catch и добавим проверку на 0 , в случае выполнения будем выбрасывать ошибку
             и отвечая на вопрос почему не isPositive,  мы можем выполнять все опрерации с отрицательными числами, а вот с нулем мы не можем только делить
             **/
            if (calc.isEqualZero.test(b)) {
                throw new Exception("Переменная равна нулю. По правилам математики делить на 0 нельзя");
            }
            int c = calc.devide.apply(a, b);

            calc.println.accept(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}