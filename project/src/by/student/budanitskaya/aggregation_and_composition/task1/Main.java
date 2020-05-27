/* 4. Programming with classes
 *    Агрегация и композиция
 * 
 * 3. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
 * вывести на консоль текст, заголовок текста.
 * 
 */


package by.student.budanitskaya.aggregation_and_composition.task1;

public class Main {

	public static void main(String[] args) {
		
		Text smallText = new Text("Hello\nHello everyone!");
		
		smallText.printText();

	}

}