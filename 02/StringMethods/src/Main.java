import java.util.Date;

public class Main {
    public static void main(String[] args) {

        String car = "Volkswagen";

        //Метод charAt(int index) - возращает значение char по указанному индексу.
        System.out.println(car.charAt(5));

        //Метод codePointAt(int index) - возвращает символ (кодовую точку Юникода) по указанному индексу.
        System.out.println(car.codePointAt(1));

        //Метод codePointBefore(int index) - возвращает символ (кодовую точку Юникода) перед указанным индексом.
        System.out.println(car.codePointBefore(2));

        //Метод codePointCount(int beginIndex, int endIndex) - возвращает количество
        // кодовых точек Юникода в указанном текстовом диапазоне (от beginIndex до endIndex) этой строки.
        System.out.println(car.codePointCount(0, 5));

        //Метод compareTo(String anotherString) - сравнивает две строки лексикографически.
        //Возвращает положительное число, если вызывающая строка больше переданной строки
        //Возвращает отрицательное число, если вызывающая строка меньше переданной строки
        //Возвращает ноль, если строки равны
        System.out.println(car.compareTo("Volkswage")); //1
        System.out.println(car.compareTo("Volkswagen1")); //-1
        System.out.println(car.compareTo("Volkswagen")); //0

        //Метод compareToIgnoreCase(String str) - сравнивает две строки лексикографически, игнорируя различия в регистре.
        //Возвращаемые значения аналогичны compareTo(String anotherString)
        System.out.println(car.compareToIgnoreCase("VOLKSWAGEN"));//0

        //Метод concat(String str) - объединяет вызывающую строку с переданной строкой str, добавляя str в конец.
        System.out.println(car.concat(" Jetta"));

        //Метод contains(CharSequence s) - возвращает true, если вызывающая строка содержит указанную последовательность символов.
        System.out.println(car.contains("wag")); //true
        System.out.println(car.contains("olksa")); //false

        //Методы contentEquals(CharSequence cs) и contentEquals(StringBuffer sb) -
        // сравнивает вызывающую строку с cs или sb
        // возвращает true, если содержимое строки совпадает с содержимым cs ли sb, и false в противном случае.
        System.out.println(car.contentEquals("Volkswag"));

        //Метод valueOf() - возвращает строковое значение переданного параметра
        System.out.println(String.valueOf(true));
        System.out.println(String.valueOf('a'));
        System.out.println(String.valueOf(new char[]{'v', 'a', 'g'}));
        System.out.println(String.valueOf(new char[]{'v', 'a', 'g'}, 0, 2));
        System.out.println(String.valueOf(74));
        System.out.println(String.valueOf(car));

        //Метод copyValueOf() - эквивалент valueOf().
        System.out.println(String.copyValueOf(new char[]{'a', 'u', 'd', 'i'}));
        System.out.println(String.copyValueOf(new char[]{'a', 'u', 'd', 'i'}, 0, 2));

        //Метод endsWith(String suffix) - проверяет, заканчивается ли эта строка строкой suffix.
        //true - если заканчивается, иначе - false
        System.out.println(car.endsWith("gen"));

        //Метод equals(Object anObject) - cравнивает эту строку с указанным объектом.
        System.out.println(car.equals("Volkswagen"));

        //Метод equalsIgnoreCase(String anotherString) - сравнивает эту строку с другой строкой, игнорируя регистр.
        System.out.println(car.equalsIgnoreCase("VOLKSWAGEN"));

        //Метод format - возвращает форматированную строку, используя переданные параметры
        System.out.println(String.format("Привет, %s! Сегодня %tD", "Мир", new Date()));

        //Метод getBytes() - кодирует строку в последовательность байтов, используя кодировку по умолчанию, сохраняя результат в новый массив байтов.
        System.out.println(car.getBytes());

        //Метод getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) - копирует символы из строки в массив символов.
        char another_car [] = new char[10];
        car.getChars(0, 10, another_car, 0);
        System.out.println(another_car);

        //Метод hashCode() - возвращает хеш-код строки.
        System.out.println(car.hashCode());

        //Метод indent(int n) - возвращает строку с n символами ' ' перед ней.
        System.out.println(car.indent(9));

        //Метод indexOf(int ch) - возвращает индекс первого вхождения указанного символа в этой строке.
        System.out.println(car.indexOf('a'));

        //Метод intern() - возвращает каноническое представление строкового объекта.
        System.out.println(car.intern());

        //Метод isBlank - возвращает true, если строка пуста или содержит только кодовые точки пробелов, в противном случае — false.
        System.out.println(car.isBlank());

        //Метод isEmpty() - возвращает true тогда и только тогда, когда length() равен 0.
        System.out.println(car.isEmpty());

        //Метод join(CharSequence delimiter, CharSequence... elements) - возвращает новую строку, состоящую
        // из копий элементов CharSequence, разделенную через delimiter
        System.out.println(String.join(" ", "R" ,"ena", "u", "lt"));

        //Метод lastIndexOf - возвращает индекс последнего вхождения указанного символа (строки) в вызывающей строке.
        String tmp_car = "Mercedes-Benz";
        System.out.println(tmp_car.lastIndexOf('e')); //10

        //Метод length() - возвращает длину строки
        System.out.println(car.length());

        //Метод matches(String regex) - cообщает, соответствует ли эта строка данному регулярному выражению.
        System.out.println(car.matches("[a-z]"));

        //Метод offsetByCodePoints(int index, int codePointOffset) - возвращает индекс внутри этой строки, который смещен от заданного индекса на отступ codePointOffset.
        System.out.println(car.offsetByCodePoints(0, 5));

        //Метод
        //regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) - проверяет, равны ли две строки
        System.out.println(car.regionMatches(true, 1, "olks", 0, 4));

        //Метод repeat(int count) - возвращает строку, значение которой представляет собой объединение этой строки, повторенной несколько раз
        System.out.println(car.repeat(3));

        //Метод replace - заменяет подстроку/символ в вызывающей строке на новую подстроку/символ
        System.out.println(car.replace('V', 'T'));
        System.out.println(car.replace("wagen", "mobile"));

        //Метод replaceAll(String regex, String replacement) - заменяет каждую подстроку этой строки, соответствующую данному регулярному выражению, заданной подстрокой.
        System.out.println(car.replaceAll("gen", "stage"));

        //Метод split - разбивает строку на массив типа String подстрок по регулярному выражению.
        System.out.println(car.split("w")[0]);

        //Метод startsWith - gроверяет, начинается ли эта строка с указанного префикса.
        System.out.println(car.startsWith("V"));

        //Метод strip() - возвращает строку с удаленными пробелами в начале и в конце.
        String spaced_car = "    VW Golf     ";
        System.out.println(spaced_car.strip());

        //Метод stripIndent() - возвращает строку со случайными удаленными пробелами в начале и в конце.
        System.out.println(spaced_car.stripIndent());

        //Метод stripLeading() - возвращает строку с удаленными пробелами в начале.
        System.out.println(spaced_car.stripLeading());

        //Метод stripTrailing() - возвращает строку с удаленными пробелами в конце.
        System.out.println(spaced_car.stripTrailing());

        //Метод subSequence(int beginIndex, int endIndex) - возвращает последовательность символов
        // от начальной позиции до конечной.
        System.out.println(car.subSequence(4, 8));

        //Метод substring(int beginIndex, int endIndex) - возвращает подстроку от начальной позиции до конечной.
        System.out.println(car.substring(0, 7));

        //Метод toCharArray() - преобразует строку в массив символов.
        System.out.println(car.toCharArray());

        //Метод toLowerCase() - преобразует все символы в строке в нижний регистр
        String upper_car = "PASSAT";
        System.out.println(upper_car.toLowerCase());

        //Метод toString() - приведёт объект к строке (для строки вернёт тот же объект)
        System.out.println(car.toString());

        //Метод toUpperCase() - преобразует все символы в строке в верхний регистр
        String lower_car = "tiguan";
        System.out.println(lower_car.toUpperCase());

        //Метод trim() - возвращает строку без специальных символов, пробелов в начале и конце строки
        String special_car = "   \tPolo   ";
        System.out.println(special_car.trim());

    }
}
