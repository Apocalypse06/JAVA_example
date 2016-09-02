package ch06._08_polymorphism;

class Vet { 
   void vaccinate (Mammal m){
      m.cry() ;                  		// ��������Mammal�a�ڪ��@����k�A�������O�ഫ                                     
      if ( m instanceof Dog) {  		// �p�G�s��b�ܼ�m����������Dog���O�Ψ�l���O������
          Dog d = (Dog)m ;       		// �N�ܼ�m��������Ѧ���s��Dog���A���ܼ�d��
          d.bark() ;             		// �z�L�ܼ�d����Dog���O�W������kbark()
      } else if ( m instanceof Cat) { 	// �p�G�s��b�ܼ�m����������Cat�a�����O������
	      Cat c = (Cat)m ;              // �N�ܼ�m��������Ѧ���s��Cat���A���ܼ�c��
	      c.sleep() ;                   // �z�L�ܼ�c����Cat���O�W������ksleep() 
     }
   }
}
class Mammal {
   void cry() {
      System.out.println("???") ;
   }
}
class Dog extends Mammal {
   // Dog  members
   void cry() {
     System.out.println("Dog:WouWouuu...") ;
   }
   void bark() {
     System.out.println("Dog:WannWannWaannn...") ;
   }
}
class Cat extends Mammal  {
   void cry() {
      System.out.println("Cat:Maeo...") ;
   }
   void sleep() {
      System.out.println("Cat:zzzZZZ...") ;
   }
}
class Kitty extends Cat  {
   void cry() {
      System.out.println("Kitty:Maeo...") ;
   }
   void sleep() {
     System.out.println("Kitty:zzzZZZ...") ;
   }
}
public class PolymorphicParameters {
   public static void main(String args[]) {
      Vet  doctor      = new Vet() ;
      Mammal  snoopy   = new Dog() ;
      Mammal  garfield   = new Cat() ;
      doctor.vaccinate(snoopy) ;
      doctor.vaccinate(garfield) ;
      Mammal kitty = new Kitty() ;
      doctor.vaccinate (kitty) ;
   }
}