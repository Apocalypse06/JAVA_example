package ch03.shortcut;
public class ShortCutDemo1 {
	public static void main(String[] args) {
		//  && : �p�G�Ĥ@�ӹB�⤸�����A&&���B�⵲�G�����A�_�h&&���B�⵲�G���ĤG�ӹB�⤸
	    System.out.println( "true  &&  true �����G: " + (true  &&  true ) ) ;
	    System.out.println( "true  &&  false �����G: " + (true  &&  false ) ) ;
	    System.out.println( "false  &&  true �����G: " + (false  &&  true ) ) ;
	    System.out.println( "false  &&  false �����G: " + (false  &&  false ) ) ;
		
     	//  || : �p�G�Ĥ@�ӹB�⤸���u�A||���B�⵲�G���u�A�_�h||���B�⵲�G���ĤG�ӹB�⤸
	    System.out.println( "true  ||  true �����G: " + (true  ||  true ) ) ;
	    System.out.println( "true  ||  false �����G: " + (true  ||  false ) ) ;
	    System.out.println( "false  ||  true �����G: " + (false  ||  true ) ) ;
	    System.out.println( "false  ||  false �����G: " + (false  ||  false ) ) ;
		
	}
}
