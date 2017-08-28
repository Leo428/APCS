package CarProject;

public class Car {
	private String color;
	private String model; 
	private String make; 
	private String plate; 
	private String nickName; 
	private int year; 
	
	public Car() {
		
	}
	
	public Car(String mNickName) {
		this.nickName = mNickName; 
	}
	
	public Car
	(
			String mColor, String mModel,
			String mMake, String mPlate, 
			String mNickName, int mYear)
	{
		this.color = mColor;
		this.model = mModel;
		this.make = mMake;
		this.plate= mPlate;
		this.nickName = mNickName;
		this.year = mYear;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	public void turnOn() {
		
	}
	
	public void turnOff() {
		
	}
	
	public boolean race2V2(Car oppoentCar) {
		double mChance = Math.random();
		double chance1 = this.getYear() * mChance * Math.random();
		double chance2 = oppoentCar.getYear() * mChance * Math.random(); 
		if (chance1 > chance2) return true;
		else return false; 
	}
	
	public void turnLeft() {
		
	}
	
	public void turnRight(){
		
	}
	
	public void reverse() {
		
	}
	
	public void stop() {
		
	}
	
	@Override 
	public String toString() {
		return this.nickName;
	}
}
