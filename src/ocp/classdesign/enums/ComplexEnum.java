package ocp.classdesign.enums;

enum Season{
	/* ; required
	 * enum values mandatory on first row
	 * the constructor is private
	 */
	WINTER("Low"),SPRING("Medium"),SUMMER("Low"),AUTUMN("High");
	
	public String rainfall;
	private Season(String s) {
		this.rainfall = s;
	}
}

public class ComplexEnum {
	
	Season currentSeason = Season.SUMMER;
	
	public boolean isSeasonPresent(Season s) {
		boolean response = false;
		for(Season season:Season.values()) {
			if(season.equals(s)) {
				response = true;
			}
		}
		
		return response;
	}
	
	public void printCurrentSeasonDescription() {
		switch(this.currentSeason) {
			case SPRING:
				System.out.println("Spring is here! Precipitations: " + this.currentSeason.rainfall);
				break;
			case SUMMER:
				System.out.println("Summer is here! Precipitations: " + this.currentSeason.rainfall);
				break;
			case AUTUMN:
				System.out.println("Autumn is here! Precipitations: " + this.currentSeason.rainfall);
				break;
			case WINTER:
				System.out.println("Winter is here! Precipitations: " + this.currentSeason.rainfall);
				break;
			default:
				System.out.println("Wrong season!");	
		}
	}
	
	public static void main(String[] args) {
		ComplexEnum simpleEnum = new ComplexEnum();
		System.out.println(simpleEnum.isSeasonPresent(Season.SPRING));
		simpleEnum.printCurrentSeasonDescription();
	}
	
}
