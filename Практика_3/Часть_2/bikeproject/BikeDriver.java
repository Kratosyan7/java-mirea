package bikeproject;

/**
 * Практика №3, часть 2, пункты 7–10.
 *
 * Пункт 7: программа работает так же, как и раньше.
 * Пункт 8: внизу обновляем высоту поста для bike1 с 22 на 20.
 * Пункт 9: выводим значения bike1, чтобы подтвердить изменение.
 */
public class BikeDriver {

	public static void main(String[] args) {

		RoadBike bike1 = new RoadBike();
		RoadBike bike2 = new RoadBike("drop", "tourer", "semi-grip", "comfort", 14, 25, 18);
		MountainBike bike3 = new MountainBike();
		Bike bike4 = new Bike();

		bike1.printDescription();
		bike2.printDescription();
		bike3.printDescription();
		bike4.printDescription();

		// --- Пункт 8: обновить высоту поста bike1 до 20 вместо 22 ----------

		System.out.println("\n=== Пункт 8: меняем высоту поста bike1 ===");
		System.out.println("Было:  " + bike1.getPostHeight());
		bike1.setPostHeight(20);          // сеттер пришёл из интерфейса RoadParts
		System.out.println("Стало: " + bike1.getPostHeight());

		// --- Пункт 9: подтверждаем изменение ------------------------------

		System.out.println("\n=== Пункт 9: значения bike1 после изменения ===");
		System.out.println("Производитель: " + bike1.getMake());
		System.out.println("Руль:          " + bike1.getHandleBars());
		System.out.println("Рама:          " + bike1.getFrame());
		System.out.println("Покрышки:      " + bike1.getTyres());
		System.out.println("Седло:         " + bike1.getSeatType());
		System.out.println("Передач:       " + bike1.getNumGears());
		System.out.println("Ширина шины:   " + bike1.getTyreWidth() + " мм");
		System.out.println("Высота поста:  " + bike1.getPostHeight());
		System.out.println("Местность:     " + RoadParts.terrain);

		bike1.printDescription();

		// --- Константы интерфейсов ----------------------------------------

		System.out.println("\n=== Константы интерфейсов ===");
		System.out.println("BikeParts.MAKE          = " + BikeParts.MAKE);
		System.out.println("MountainParts.TERRAIN   = " + MountainParts.TERRAIN);
		System.out.println("RoadParts.terrain       = " + RoadParts.terrain);
		// BikeParts.MAKE = "другой";   // ошибка компиляции: поля интерфейса final
	}//end method main

}//end class BikeDriver
