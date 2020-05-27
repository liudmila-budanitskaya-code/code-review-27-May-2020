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

public class Main {

	public static void main(String[] args) {

		Library library = new Library();
		ArrayList<Book>javaLib = library.getJavaLibrary();
		
		// книги данного автора
		String author = UserInput.checkUserInput("Введите имя автора:");
		LibraryView.printBooksBy(author, javaLib);
		
		// книги, выпущенные данным издательством

		String publisher = UserInput.checkUserInput("Введите название издательства:");
		LibraryView.printBooksPublishedBy(publisher, javaLib);
		
		// книги, выпущенные после заданного года

		int yearPublished = UserInput.checkYearPublished("Введите наименьший год издания:");
		LibraryView.printBooksPublishedAfter(yearPublished, javaLib);

	}

}