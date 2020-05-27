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

public class LibraryView {

	public static void printBooksBy(String author, ArrayList<Book> books) {

		ArrayList<Book> bookShelf = new ArrayList<Book>();
		bookShelf = LibraryLogic.returnBooksBy(author, books);
		if (bookShelf.size() == 0) {
			System.out.println("Такого автора, как " + author + ", в библиотеке нет");
		} else if (bookShelf.size() > 0) {
			System.out.println("Книги заданного автора: ");
			for (Book b : bookShelf) {
				System.out.println("Название книги: " + b.getName() + " Автор(ы): " + b.getAuthor());
			}
		}

	}

	public static void printBooksPublishedBy(String publisher, ArrayList<Book> books) {

		ArrayList<Book> bookShelf = new ArrayList<Book>();
		bookShelf = LibraryLogic.returnBooksPublishedBy(publisher, books);
		if (bookShelf.size() == 0) {
			System.out.println("Такого издательства, как " + publisher + ", в библиотеке нет");
		} else if (bookShelf.size() > 0) {
			System.out.println("Книги, выпущенные данным издательством: ");
			for (Book b : bookShelf) {
				System.out.println("Название книги: " + b.getName() + " Автор(ы): " + b.getAuthor());
			}
		}
	}

	public static void printBooksPublishedAfter(int yearPublished, ArrayList<Book> books) {

		ArrayList<Book> bookShelf = new ArrayList<Book>();
		bookShelf = LibraryLogic.returnBooksPublishedAfter(yearPublished, books);

		if (bookShelf.size() == 0) {
			System.out.println("Книг, выпущенных после " + yearPublished + "года , в библиотеке нет");
		} else if (bookShelf.size() > 0) {
			System.out.println("Книги, выпущенные после данного года: ");
			for (Book b : bookShelf) {
				System.out.println("Название книги: " + b.getName() + " Автор(ы): " + b.getAuthor());
			}
		}
	}
}