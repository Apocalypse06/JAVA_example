package HomeWork_Ch10;

	public class Dog extends Mammal{
		String _name;
		public Dog(String name){
			this._name = name;
		}
		public void _smile(){
			System.out.println("Cat=>" + _name + ":)");
		}
		public void _wann(){
			System.out.println("Cat=>" + _name + "wannwann");
		}
	}

