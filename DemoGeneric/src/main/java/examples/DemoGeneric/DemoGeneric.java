package examples.DemoGeneric;

import java.util.ArrayList;

public class DemoGeneric {

	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		// ArrayList<int> b = new ArrayList<int>(); // ошибка компиляции - примитивный
		// тип недопустим - нужен объект (Integer)
		list.add("JavaFX 2");
		list.add("Java"); //компилятор "знает" допустимый тип передаваемого значения (String)
		// list.add(new StringBuilder("C#")); // ошибка компиляции - компилятор не позволит 
		// добавить "посторонний" тип (StringBuilder) 
		String res = list.get(0); //извлекаем первый (индекс - 0) элемент коллекции
		System.out.println(res); // вывод перевого элемента коллекции
		System.out.println(list); // вывод всей коллекции
	}
}