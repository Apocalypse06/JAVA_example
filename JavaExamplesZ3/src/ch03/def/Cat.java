package ch03.def;
public  class  Cat {
     public double weight  ;
     public int iq  ;
     String name;
     String address;
      public  Cat(String n, String a, double w) {	// «Øºc¤l
		name = n;
		address = a;
		weight = w;
	}
     public void eat(int foodWeight) {
         weight = weight + foodWeight * 0.1   ;
     }   
     public void study(int hours) {
         iq = (int)(iq + hours * 0.1);
     }
}
