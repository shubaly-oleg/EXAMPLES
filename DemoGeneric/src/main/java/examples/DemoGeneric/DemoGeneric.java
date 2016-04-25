package examples.DemoGeneric;

import java.util.ArrayList;

public class DemoGeneric {

	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		// ArrayList<int> b = new ArrayList<int>(); // ошибка компиляции
		list.add("Java"); //компилятор "знает" допустимый тип передаваемого значения
		list.add("JavaFX 2");
		String res = list.get(0); //компилятор "знает"допустимый тип возвращаемого значения
		System.out.println(res); // вывод перевого (индекс - 0) элемента коллекции
		// list.add(new StringBuilder("C#")); // ошибка компиляции - компилятор не позволит 
		// добавить "посторонний" тип
		System.out.println(list); // вся коллекция
	}
}