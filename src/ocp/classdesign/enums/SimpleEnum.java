package ocp.classdesign.enums;

enum SeasonSimple{
	//No ; required when is not anything else besides the values 
	SUMMER,WINTER,AUTUMN,SPRING
}

public class SimpleEnum {
	
	Season currentSeason = Season.SUMMER;
	
	public boolean isSeasonPresent(SeasonSimple s) {
		boolean response = false;
		for(SeasonSimple season:SeasonSimple.values()) {
			if(season.equals(s)) {
				response = true;
			}
		}
		
		return response;
	}
	
	public void printCurrentSeasonDescription() {
		switch(this.currentSeason) {
			case SPRING:
				System.out.println("Spring is here!");
				break;
			case SUMMER:
				System.out.println("Summer is here!");
				break;
			case AUTUMN:
				System.out.println("Autumn is here!");
				break;
			case WINTER:
				System.out.println("Winter is here!");
				break;
			default:
				System.out.println("Wrong season!");	
		}
	}
	
	public static void main(String[] args) {
		SimpleEnum simpleEnum = new SimpleEnum();
		System.out.println(simpleEnum.isSeasonPresent(SeasonSimple.SPRING));
		simpleEnum.printCurrentSeasonDescription();
	}

}
