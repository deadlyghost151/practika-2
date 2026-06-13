// Java source code


import java.util.Scanner;

/**
 * Программа для преобразования строки к верхнему/нижнему регистру
 * на основе подсчета заглавных и строчных символов
 */
public class Main {

    /**
     * Метод преобразования строки к нужному регистру
     * @param str - входная строка
     * @return преобразованная строка
     */
    public static String convertString(String str) {
        // Защита от null
        if (str == null) return null;
        
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        
        // Подсчет заглавных и строчных символов
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(c)) {
                lowercaseCount++;
            }
        }
        
        // Преобразование по правилам
        if (uppercaseCount > lowercaseCount) {
            // Заглавных больше → преобразовать к верхнему регистру
            return str.toUpperCase();
        } else if (lowercaseCount > uppercaseCount) {
            // Строчных больше → преобразовать к нижнему регистру
            return str.toLowerCase();
        } else {
            // Равное количество → преобразовать к нижнему регистру
            return str.toLowerCase();
        }
    }

    // Тесты 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Программа преобразования строки к регистру ===\n");
        
        // Тест 1: ABccAAr → ABCCAAR (заглавных: 5, строчных: 2)
        String test1 = "ABccAAr";
        String result1 = convertString(test1);
        System.out.println("Тест 1: \"" + test1 + "\" → \"" + result1 + "\"");
        System.out.println("Ожидаем: \"ABCCAAR\" | Результат: " + 
            (result1.equals("ABCCAAR") ? "PASS" : "FAIL"));
        
        // Тест 2: abCCaaR → abccaar (строчных: 5, заглавных: 2)
        String test2 = "abCCaaR";
        String result2 = convertString(test2);
        System.out.println("\nТест 2: \"" + test2 + "\" → \"" + result2 + "\"");
        System.out.println("Ожидаем: \"abccaar\" | Результат: " + 
            (result2.equals("abccaar") ? "PASS" : "FAIL"));
        
        // Тест 3: Равное количество (например, "Aa")
        String test3 = "Aa";
        String result3 = convertString(test3);
        System.out.println("\nТест 3: \"" + test3 + "\" → \"" + result3 + "\"");
        System.out.println("Ожидаем: \"aa\" | Результат: " + 
            (result3.equals("aa") ? "PASS" : "FAIL"));
        
        // Тест 4: Только заглавные
        String test4 = "ABC";
        String result4 = convertString(test4);
        System.out.println("\nТест 4: \"" + test4 + "\" → \"" + result4 + "\"");
        System.out.println("Ожидаем: \"ABC\" | Результат: " + 
            (result4.equals("ABC") ? "PASS" : "FAIL"));
        
        // Тест 5: Только строчные
        String test5 = "abc";
        String result5 = convertString(test5);
        System.out.println("\nТест 5: \"" + test5 + "\" → \"" + result5 + "\"");
        System.out.println("Ожидаем: \"abc\" | Результат: " + 
            (result5.equals("abc") ? "PASS" : "FAIL"));
        
     
        // ввод с клавиатуры
        System.out.println("\n=== ВВОД С КЛАВИАТУРЫ ===\n");
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        
        String converted = convertString(input);
        System.out.println("Преобразованная строка: \"" + converted + "\"");
        
        // Подсчет для вывода
        int upper = 0, lower = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) upper++;
            else if (Character.isLowerCase(c)) lower++;
        }
        
        System.out.println("Заглавных символов: " + upper);
        System.out.println("Строчных символов: " + lower);
        
        scanner.close();
    }
}
