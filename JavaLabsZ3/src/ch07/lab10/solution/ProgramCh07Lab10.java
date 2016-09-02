package ch07.lab10.solution;

// �����m�ߨB�J�G�G(���{���i����)
// ���O Vehicle ���ݩʦp�U :
//  load(double)    : �ثe������
//  maxLoad(double) : Vehicle �Ҥ��\���̤j����
// ���󪫫~�n�[�� Vehicle �ɡA���ݥ��ˬd�ثe����(load)�[�W
// ���󪺭��q���Ӥp�� maxLoad, �_�h����[�� Vehicle ��. 
// �{�b�n�N Plane, Rock, Dog �����O������[�� Vehicle ����
//  
// Vehicle ��Ӧ��T�Ӥ�k:
//   boolean addCargo(Dog d), 
//   boolean addCargo(Rock r) �P 
//   boolean addCargo(Plane p) 
// �Ӱ��� Plane, Rock, Dog �����O������[�� Vehicle ���\��:
// 
// �C��[�J�@�Ӫ����, �����P�_�[�J�᪺�`�����O�_�p�󤹳\��
// �̤j�`����(maxLoad)
// 
// �{�b�ХH interface ���覡��²�� Vehicle ���{���]�p
// ���] interface Weight �p�U:

 interface Weight {
    int getWeight() ;
 }  


class Vehicle {
  double  load ;
  double  maxLoad ; 
  Vehicle (double maxLoad) {
    this.maxLoad = maxLoad ; 
  }
  double  getLoad() {
    return load ;
  }  
  // �Ч�������k
  
  boolean addCargo(Weight  w ) {
	    if (load + w.getWeight() > maxLoad) 
	          return false ;
	    else {
	       	  load += w.getWeight() ; 
	       	  return true ;
	    }	  
  }
  
  // �U�C�T�Ӥ�k�����Q�����C
  /*
  boolean addCargo(Dog d) {
      if (load + d.dogWeight > maxLoad) 
          return false ;
      else {
       	  load += d.dogWeight ; 
       	  return true ;
      }	  
   }
   boolean addCargo(Rock r) {
      if (load + r.rockWeight > maxLoad) 
          return false ;
       else {
       	  load += r.rockWeight ; 
       	  return true ;
       }	  
   }
   boolean addCargo(Plane p) {
      if (load + p.weight > maxLoad) 
          return false ;
       else {
       	  load += p.weight ; 
       	  return true ;
       }	  
   }
   */
}
class Plane implements Weight {
	int weight = 100000;
	public int getWeight() {
		return weight;
	}
}

class Rock implements Weight {
	int rockWeight = 50000;
	public int getWeight() {
		return rockWeight;
	}
}

class Dog implements Weight {
	int dogWeight = 100;
	public int getWeight() {
		return dogWeight;
	}
}

public class ProgramCh07Lab10 {
  public static void main(String args[]) {
    Plane p1 = new Plane() ;  	
    Rock  r1 = new Rock() ;
    Dog d1 = new Dog() ;  	
    Vehicle v = new Vehicle(150000) ; 

    v.addCargo(p1) ;
    v.addCargo(d1) ;
    v.addCargo(r1); 
    System.out.println("�`���q��" + v.load) ;
  }
}