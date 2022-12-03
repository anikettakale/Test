package Test_Assignment;

public class Planet {
	private String name,gases;
	private int no_of_moons;
	private boolean rings;
	public Planet(String name,String Gases,int no_of_moons, boolean rings) {

	this.name=name;
	this.gases=gases;
	this.no_of_moons=no_of_moons;

}



public static void main (String[] args) {
	Planet p1=new Planet("Earth","nitrogen oxygen",1, true) ;
	Planet p2=new Planet("Venus","carbon Dioxide, Nitrogen",0, false) ;
	Planet p3=new Planet("mercury","",0, false) ;
	Planet p4=new Planet("jupitor","hydrogen,Helium ",79, true) ;
	Planet p5=new Planet("Saturn","hydrogen,Helium",83, true) ;
	Planet p6=new Planet("uranus","hydrogen,Helium, methane",27,true) ;



}




public String getName() {
	
	return name;
}


public void setName(String name) {
	System.out.println(name);
	this.name = name;
}


public String getGases() {
	return gases;
}


public void setGases(String gases) {
	this.gases = gases;
}


public int getNo_of_moons() {
	return no_of_moons;
}


public void setNo_of_moons(int no_of_moons) {
	this.no_of_moons = no_of_moons;
}


public boolean isRings() {
	return rings;
}


public void setRings(boolean rings) {
	this.rings = rings;
}
}

