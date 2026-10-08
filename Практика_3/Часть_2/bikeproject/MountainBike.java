package bikeproject;

/**
 * Практика №3, часть 2, пункт 5. MountainBike использует интерфейс
 * MountainParts (и через Bike — BikeParts).
 */
public class MountainBike extends Bike implements MountainParts {

	private String suspension, type;
	private int frameSize;

	public MountainBike()
	{
		this("Bull Horn", "Hardtail", "Maxxis", "dropper", 27, "RockShox XC32", "Pro", 19);
	}//end constructor

    public MountainBike(String handleBars, String frame, String tyres, String seatType, int numGears,
    		            String suspension, String type, int frameSize) {
		super(handleBars, frame, tyres, seatType, numGears);
		this.suspension = suspension;
		this.type = type;
		this.frameSize = frameSize;
	}//end constructor

	// --- Методы, требуемые интерфейсом MountainParts -----------------------

	@Override
	public String getSuspension() { return this.suspension; }

	@Override
	public void setSuspension(String newValue) { this.suspension = newValue; }

	@Override
	public String getType() { return this.type; }

	@Override
	public void setType(String newValue) { this.type = newValue; }

	// --- Своё поле, в интерфейс не вошло -----------------------------------

	public int getFrameSize() { return this.frameSize; }

	public void setFrameSize(int newValue) { this.frameSize = newValue; }

	public void printDescription()
	{
		super.printDescription();
		System.out.println("This mountain bike is a " + this.type + " bike and has a " + this.suspension
				          + " suspension and a frame size of " + this.frameSize + "inches."
				          + "\nTerrain: " + TERRAIN);
	}//end method printDescription
}//end class MountainBike
