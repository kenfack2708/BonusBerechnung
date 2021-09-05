package net.codejava.javaee;

public class Bonusrechner {
	
    public double berechneBonusProzentsatz(String Firmenzugehoerigkeit) {
    	
        if (Double.parseDouble(Firmenzugehoerigkeit)<=3) {
        	return 0.05;
        }else if (Double.parseDouble(Firmenzugehoerigkeit)<=5){
       	 return 0.1;        	
        }else if (Double.parseDouble(Firmenzugehoerigkeit)<=8){
       	 return 0.15;
        }else if (Double.parseDouble(Firmenzugehoerigkeit)<=10){
       	 return 0.20;
        }else if (Double.parseDouble(Firmenzugehoerigkeit)<=15){
       	 return 0.25;
        }else if (Double.parseDouble(Firmenzugehoerigkeit)<=20){
       	 return 0.30;
        }else return 0.35;
   }
   
   public double berechneBonus(String Firmenzugehoerigkeit, String AktuellesGehalt) {
   	
   	double bonus = Double.parseDouble(AktuellesGehalt)*berechneBonusProzentsatz(Firmenzugehoerigkeit);
   	
   	return bonus;
  }

}
