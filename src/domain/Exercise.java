package domain;

import java.util.Objects;

/*
                            У класі Exercise
   Функція ArmstrongNumber(Long R) приймає й працює з Long типу числами(можна було
   використовувати й звичайний Integer), але все ж таки використав саме Long, бо
   якщо будуть великі числа в перевірці праграмма почне некоректно працювати
   через те, що Integer не підтримує занадто великі числа
   також ця функція є boolean й повертає лише true або false
*/
public class Exercise {
    public static boolean ArmstrongNumber(Long R){
        String num = Long.toString(R);
        Integer lenght = num.length();
        Double sum = 0d;
        for(int i = 0;i<lenght;i++){
            sum += Math.pow(Long.parseLong(Character.toString(num.charAt(i))), lenght);
        }
        return Objects.equals(Double.valueOf(R), sum);
    }
}
