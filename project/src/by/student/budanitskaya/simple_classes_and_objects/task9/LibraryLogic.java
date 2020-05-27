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

public class LibraryLogic {

	// возвращаем список книг заданного автора

	public static ArrayList<Book> returnBooksBy(String author, ArrayList<Book> books1) {

		ArrayList<Book> books2 = new ArrayList<>();

		for (Book one_book : books1) {

			if (one_book.getAuthor().equals(author)) {
				books2.add(one_book);
			}
		}
		return books2;
	}

	// возвращаем список книг, выпущенных заданным издательством

	public static ArrayList<Book> returnBooksPublishedBy(String publisher, ArrayList<Book> books1) {

		ArrayList<Book> books2 = new ArrayList<>();
		int counter = 0;

		for (Book one_book : books1) {

			if (!one_book.getPublisher().equals(publisher)) {
				counter++;
			}
			if (one_book.getPublisher().equals(publisher)) {
				books2.add(one_book);
			}
		}

		if (counter == 5) {
			System.out.println("Такого издательства, как " + publisher + ", в библиотеке нет");
		}
		return books2;
	}

	// возвращаем список книг, выпущенных после заданного года

	public static ArrayList<Book> returnBooksPublishedAfter(int yearPublished, ArrayList<Book> books1) {

		ArrayList<Book> books2 = new ArrayList<>();

		for (Book one_book : books1) {

			if (one_book.getYearPublished() >= yearPublished || one_book.getYearPublished() < 1500 || one_book.getYearPublished() > 2020 ) {
				books2.add(one_book);
			}
		}

		return books2;
	}

}