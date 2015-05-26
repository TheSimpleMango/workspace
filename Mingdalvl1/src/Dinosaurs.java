public class Dinosaurs {
	private String species;
	private int yearExtinct;
	Dinosaurs(String species, int yearExtinct){
		this.setSpecies(species);
		this.setYearExtinct(yearExtinct);
	}
	
	public int getYearExtinct() {
		return yearExtinct;
	}
	public String getSpecies() {
		return species;
	}
	
	public void setYearExtinct(int yearExtinct) {
		this.yearExtinct = yearExtinct;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
}
