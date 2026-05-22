package by.homework.lessons.Task8;

public class StringClass {
    String str1;
    String str2;
    String originText = "Каждая строка, создаваемая с помощью оператора new, литерала (заключенная в двойные апострофы) или " +
            "метода класса, создающего строку, является экземпляром класса String. Особенностью объекта класса String является то," +
            " что его значение не может быть изменено после создания объекта при помощи любого метода класса. Изменение строки " +
            "всегда приводит к созданию нового объекта в heap. Сама объектная ссылка при этом сохраняет прежнее значение и " +
            "хранится в стеке. Произведенные изменения можно сохранить переинициализируя ссылку.";
    String textTask3 = "Да1та выпуска 8 декабря 1998 года[12]. Кодовое имяPlayground. В данном случае встречается путаница. " +
            "Выпускались книги, например,Beginning Java 2 by Ivor Horton (Mar 1999), фактически по J2SE 1.2 (бывшее название — " +
            "Java 2). Вместе с тем по сей день такие книги публикуются, например: Х. М. Дейтел, П. Дж. Дейтел, С. И. Сантри. " +
            "Технологии программирования на Java2. Распределённые приложения (2011). В то время, когда, как известно, Java 2была " +
            "исторически заменена следующими релизами, подобные названия книг дезориентируют в понимании, о какой же версии Java " +
            "они написаны на самом деле. Если J2SE 1.2 принято считать за Java 2, а авторы книг за Java 2 принимают JDK7, это " +
            "приводит к полной путанице.";

    // Задание 1.1
    public String stroka1(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
        return str1 + str2;
    }

    // Задание 1.2
    public String stroka2(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
        String stroka1;

        if (str1.endsWith(str2)) {
            int index = str1.indexOf(str2);
            stroka1 = str1.substring(0, --index);
        } else {
            stroka1 = str1.toUpperCase();
        }
        return stroka1;
    }

    //Задание 2.1
    public void StringJoin(int k, String text) {

        String[] word = this.originText.split(" ");
        for (int i = k - 1; i < word.length; i = i + k) {
            word[i] = word[i].concat(text);
        }
        for (String s : word) {
            System.out.print(s + " ");
        }
    }

    //Задание 3.1
    public void deleteNotLetterSymbols() {
        String symbol1, symbol2;
        for (int i = 0, j = 1; j < textTask3.length(); i++, j++) {
            symbol1 = textTask3.substring(i, j);
            symbol2 = textTask3.substring(i + 1, j + 1);
            boolean s1 = symbol1.matches("[\\p{L}]");
            boolean s2 = symbol2.matches("[\\p{L}]");
            if (s1 == true & s2 == true) {
                String part1 = textTask3.substring(0, i + 1);
                String part2 = textTask3.substring(i + 1);
                part1 = part1 + " ";
                textTask3 = part1 + part2;
            } else {
                continue;
            }
        }
        String lettersAndSpaces = textTask3.replaceAll("[^\\p{L}\\s]", "");
        System.out.println();
        System.out.println(lettersAndSpaces);
    }


}