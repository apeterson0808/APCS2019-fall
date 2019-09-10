//Alice Peterson
//August 29,2019
//Calls math functions from calculate library
public class DoMath {
	public static void main(String[] args) {
		System.out.println(Calculate.square(2));
		System.out.println(Calculate.cube(2));
		System.out.println(Calculate.average(2,4.5));
	    System.out.println(Calculate.average(1,3,2));
	    System.out.println(Calculate.toDegrees(1));
	    System.out.println(Calculate.toRaidian(1));
	    System.out.println(Calculate.discriminant(6,10,-1));
	    System.out.println(Calculate.toDivisibleBy(24,5));
	    
	    System.out.println(Calculate.max(1, 2));
	    System.out.println(Calculate.min(3,2));
	}

}
