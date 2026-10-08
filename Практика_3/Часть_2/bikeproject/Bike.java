package bikeproject;

/**
 * Практика №3, часть 2, пункт 4. Класс Bike использует интерфейс BikeParts.
 *
 * Поле make убрано: производитель теперь хранится в константе BikeParts.MAKE,
 * одной для всех велосипедов.
 */
public class Bike implements BikeParts {

	private String handleBars, frame, tyres, seatType;
	private int NumGears;

	public Bike(){
	}//end constructor

	public Bike(String handleBars, String frame, String tyres, String seatType, int numGears) {
		this.handleBars = handleBars;
		this.frame = frame;
		this.tyres = tyres;
		this.seatType = seatType;
		NumGears = numGears;
	}//end constructor

	// --- Методы, требуемые интерфейсом BikeParts ---------------------------

	@Override
	public String getMake() { return MAKE; }   // константа интерфейса

	@Override
	public String getHandleBars() { return this.handleBars; }

	@Override
	public void setHandleBars(String newValue) { this.handleBars = newValue; }

	@Override
	public String getFrame() { return this.frame; }

	@Override
	public void setFrame(String newValue) { this.frame = newValue; }

	@Override
	public String getTyres() { return this.tyres; }

	@Override
	public void setTyres(String newValue) { this.tyres = newValue; }

	@Override
	public String getSeatType() { return this.seatType; }

	@Override
	public void setSeatType(String newValue) { this.seatType = newValue; }

	@Override
	public int getNumGears() { return this.NumGears; }

	@Override
	public void setNumGears(int newValue) { this.NumGears = newValue; }

	// --- Вывод описания ----------------------------------------------------

	protected void printDescription()
	{
		System.out.println("\n" + MAKE + "\n"
				          + "This bike has " + this.handleBars + " handlebars on a "
				          + this.frame + " frame with " + this.NumGears + " gears."
				          + "\nIt has a " + this.seatType + " seat with " + this.tyres + " tyres.");
	}//end method printDescription

}//end class Bike
