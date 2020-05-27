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

public class Book {

	private int id;
	private String name;
	private String author;
	private String publisher;
	private int yearPublished;
	private int pageCount;
	private int price;
	private String bindingType;

	public Book() {
		super();
	}

	public Book(int id, String name, String author, String publisher, int yearPublished, int pageCount, int price,
			String bindingType) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.yearPublished = yearPublished;
		this.pageCount = pageCount;
		this.price = price;
		this.bindingType = bindingType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBindingType() {
		return bindingType;
	}

	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}

	@Override
	public String toString() {
		return this.getClass().getName() + "[id=" + id + ", name=" + name + ", author=" + author + ", publisher="
				+ publisher + ", yearPublished=" + yearPublished + ", pageCount=" + pageCount + ", price=" + price
				+ ", bindingType=" + bindingType + "]";
	}

}
