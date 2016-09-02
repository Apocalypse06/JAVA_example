package ch07.lab10;

//�����m�ߨB�J�G�G (���{���i����)

//���OVehicle���ݩʦp�U :
//load(double)    : �ثe������
//maxLoad(double) : Vehicle�Ҥ��\���̤j����
//����f���n�[��Vehicle�ɡA���ݥ��ˬd�ثe����(load)�[�W�f������
//�q���Ӥp��maxLoad�A�_�h����[��Vehicle���C�{���n�D�NPlane�B
//Rock�BDog�����O������[��Vehicle���󤺡A�]����Vehicle�]�p�F
//�U�C�T�Ӥ�k:
//boolean addCargo(Dog d) 
//boolean addCargo(Rock r) 
//boolean addCargo(Plane p) 
//��Plane, Rock, Dog�����O������[��Vehicle�ɥ����P�_�[�J�᪺�`
//�����O�_�p�󵥩󤹳\���̤j�`����(maxLoad)�C
//�{�b�г]�p�@�Ӥ�k�Ө��N�W�z���T�Ӥ�k�C
//���ܡG�Q�Τ�����²��Vehicle���O���]�p�C

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
  // �г]�p�@�Ӥ�k����N�U�C�T�Ӥ�k
  /*
  boolean addCargo(??????????  w ) {
     
  }
  */
  // �U�C�T�Ӥ�k�����Q�����C
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