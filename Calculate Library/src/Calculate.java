//Alice Peterson
//August 29, 2019
//Library of math functions
public class Calculate {
//Part 1
//a call to square, returns the square of the value passed
	public static int square(int a) {
		int answer;
		answer = a*a;
		return answer;
	}
//a call to cube, returns the cube value passed
	public static int cube(int a) {
		int answer;
		answer = a*a*a;
		return answer;
	}
//a call to average, returns the average of the values passed, overload method
	public static double average(double a,double b) {
		double answer;
		answer = (a*b)/2;
		return answer;
	}
//a call to average, returns the average of the three values passed, overload method
	public static double average(double a, double b, double c) {
		double answer;
		answer = (a*b*c)/3;
		return answer;
	}
//a call to toDegrees, converts an angle measure from radians into degrees
	public static double toDegrees(double number) {
		double answer;
		answer = number*(180/3.14159);
		return answer;
	}
//a call to toRadian, converts an angle measure from degrees into radians
	public static double toRaidian(double a) {
		double answer;
		answer = a*(3.14159/180);
		return answer;
	}
//a call to discriminant, provides coefficients of a quadratic equation in standard form and returns discriminant
	public static double discriminant(double a, double b, double c) {
		double answer;
		answer = (b*b)-(4*a*c);
		return answer;
	}
//a call to toImproperFrac, converts mixed number into an improper frac
	public static void toImproperFrac (int whole, int numer, int denom) { 
		int answer = (denom*whole)+numer;
		System.out.println(answer"//"denom);
	}
//a call toMixedNum, converts a improper frac into a mixed number
	public static void toMixedNum (int numer, int denom) {
		int answer = (numer/denom);
		System.out.println(answer%denom);
	}
//a call to foil, converts binomial multiplication of the form (ax+b)(cx+d) into a quadratic equation
	public static void foil (int a, int b, int c, int d) {
		(a*c)(a*d)(b*c)(b*d)
	}

//Part 2 
//a call to isDivisibleBy, determine whether or not one integer is evenly divisible by another
	public static boolean toDivisibleBy (int a,int b) {
		boolean divis = false;
		if(a%b==0) {
			divis=true;
		}
		return divis;}
		
//a call to absValue, returns the abolute number of the values passed
	public static double absValue (double a) {
		if(a>0) {
			return (a*-1);
		}else {
			return a;
			
		}
//a call to max, returns the larger of two values passed, overload
	public static double max (double a, double b) {
		if(a>b) {
				return a;
			}else { 
				return b;
				}
			}
//a call to max, returns the larger of 3 values passed, overload
	public static double max (double a, double b, double c) {
		if(a>b)	{
			if(a>c) {
				return a;
			if (b>a) {
				if(b>c) {
					return b;
				}else {
					return c;
				}
				}
			}
			}
		}
	}
//a call to min, returns smaller of two values passed
	public static int min (int a, int b) {
		if(a<b) {
				return a;
			}else {
				return b; 
			}
		}
//a call to round2, rounds variable correctly to two decimal places
	public static double round2 (double a) {
		double answer;
		answer = ((a*100)+0.5);
		return (answer%100);
	}
}
	

//Part 3
//a call to exponent, raises value of a positive integer power
	public static double exponent (int a, double b) {
		
	}
//a call to factorial, returns the factorial of the value passed
	public static int factorial (int a) {
		while()
	}
//a call to isPrime, determines wether or not an integer is prime
	public static boolean isPrime (int a) {
		
	}
//a call to gcf, finds the greatest common factor of two integers
	public static int gcf (int a, int b) {
		while(a%b==0) {
		}
			
	}
//a call to sqrt, returns the approximation of the square root of the value passed rounded to two decimals places
	public static double sqrt (double a) {
		while(a/a==0) {
			
		}
	}
	
//Part 4
//a call to quadForm, uses the coefficients of a quadratic formula in standard form and uses the quad form to approximate the real roots
	public static void quadForm () {
		
	}
}
	

