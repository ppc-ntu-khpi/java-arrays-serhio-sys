[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-f4981d0f882b2a3f0472912d15f9806d57e124e0fc890972558857b51b24a6f9.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=10111273)
# Практична робота "Масиви, вирази, керування виконанням програми"

# Задача

Перевірте чи є задане число числом Армстронга

# Скріншот працюючої програми
![README](images/task.png)


# Код класу Exercise
```java
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

```