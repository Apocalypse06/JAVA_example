package HomeWork_Ch10;

public class Cat extends Mammal{
	String _name;
	public Cat(String name){
		this._name = name;
	}
	public void _smile(){
		System.out.println("Cat=>" + _name + ":)");
	}
	public void _meao(){
		System.out.println("Cat=>" + _name + "meaomeao");
	}
}
