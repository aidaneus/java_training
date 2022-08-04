import java.util.logging.*;

public class ex18 {
		private static Logger l = Logger.getLogger(ex18.class.getName());
		public static void main(String[] args) {
			l.setLevel(Level.ALL);
			ConsoleHandler c = new ConsoleHandler();
			XMLFormatter a = new XMLFormatter();
			// типа в консоль запихиваем, т.е. устанавливаем формат выводимого на экран, т.е. мы          хотим
			// видеть выводимое в виде ХМЛ
			c.setFormatter(a);
			// добовляем наш новообразованый с новыми настройками хэндлер.
			l.addHandler(c);
			//Выводим наши логи
			c.setLevel(Level.ALL);
			l.finest("Halyna");
			l.info("My first log");
			l.warning("YYY");
			l.severe("QQQQ");
		}
	private static void configureLogging() {
		Logger LOGGER1 = Logger.getLogger("org.stepic.java.logging.ClassA");
		LOGGER1.setLevel(Level.ALL);

		Logger LOGGER2 = Logger.getLogger("org.stepic.java.logging.ClassB");
		LOGGER2.setLevel(Level.WARNING);

		Logger LOGGER3 = Logger.getLogger("org.stepic.java");
		ConsoleHandler handler = new ConsoleHandler();
		handler.setLevel(Level.ALL);
		handler.setFormatter(new XMLFormatter());
		LOGGER3.addHandler(handler);
		LOGGER3.setUseParentHandlers(false);

	}
}
