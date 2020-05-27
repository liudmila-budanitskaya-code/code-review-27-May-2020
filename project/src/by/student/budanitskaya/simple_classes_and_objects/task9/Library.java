/*4. Programming with classes
 * 
Простейшие классы и объекты.

9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get-методы и метод
toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные консоль.

Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплёта.

Найти и вывести:
a) список книг заданного автора
b) список книг, выпущенных заданным издательством
c) список книг, выпущенных после заданного года

 */

package by.student.budanitskaya.simple_classes_and_objects.task9;

import java.util.ArrayList;

public class Library {

	private ArrayList<Book> javaLibrary = new ArrayList<Book>();

	public Library() {
		super();
		ArrayList<Book> defaultJavaLibrary = new ArrayList<Book>();
		defaultJavaLibrary
		.add(new Book(1, "Thinking in Java", "Bruce Eckel", "Prentice Hall", 2006, 790, 100, "hardCover"));
		defaultJavaLibrary.add(new Book(2, "A Beginner's Guide", "Herbert Schildt", "McGraw-Hill Education", 2019, 567,
				120, "hardCover"));
		defaultJavaLibrary.add(
				new Book(3, "Head First Java", "Kathy Sierra & Bert Bates", "O'Reilly", 2004, 664, 60, "softCover"));
		defaultJavaLibrary
		.add(new Book(4, "The Java Language Specification", "James Gosling", "Oracle", 2015, 768, 0, "eBook"));
		defaultJavaLibrary.add(
				new Book(5, "The Java Programming Language", "James Gosling", "Prentice Hall", 2012, 324, 4, "eBook"));

		this.javaLibrary = defaultJavaLibrary;

	}

	public Library(ArrayList<Book> javaLibrary) {
		super();
		this.javaLibrary = javaLibrary;
	}

	// геттер

	public ArrayList<Book> getJavaLibrary() {
		return javaLibrary;
	}

}
