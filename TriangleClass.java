public class TriangleClass {
	
	private double sideA;
	private double sideB;
	private double sideC;
	
	private double perimeter;
	private double semiPerimeter;
	private double area;
	private double height;
	private double inCircleRadius;
	private double incircleArea;
	private double circumcircleRadius;
	private double circumcirlceArea;
	private String typeOfTriangle;
	private Boolean trueFlase;
	
	public TriangleClass(double userSideA, double userSideB, double userSideC){
		
		this.sideA = userSideA;
		this.sideB = userSideB;
		this.sideC = userSideC;
		
		this.perimeter = (this.sideA + this.sideB + this.sideC);
		this.semiPerimeter = (perimeter)/2;
		
		this.area = Math.sqrt(this.semiPerimeter*
				(this.semiPerimeter - this.sideA)*
				(this.semiPerimeter - this.sideB)*
				(this.semiPerimeter - this.sideC));
		
		this.height = 2*(this.area / this.sideB);
		
		this.inCircleRadius = this.area/this.semiPerimeter;
		
		this.incircleArea = Math.PI * Math.pow(this.inCircleRadius, 2);
		
		this.circumcircleRadius = (this.sideA * this.sideB * this.sideC)/
				              Math.sqrt((this.sideA + this.sideB + this.sideC)* 
						      (this.sideB + this.sideC - this.sideA)*
						      (this.sideA + this.sideC - this.sideB)*
						      (this.sideA + this.sideB - this.sideC));
		
		this.circumcirlceArea = Math.PI * Math.pow(this.circumcircleRadius, 2);
		
		
        if (this.sideA == this.sideB  && this.sideB == this.sideC){
			
			 this.typeOfTriangle = "Equilateral";
			
		     } else {
		
		         if (this.sideA == this.sideB || this.sideB == this.sideC || this.sideA == this.sideC){
			
			     this.typeOfTriangle = "Isosceles";
			
		     } else{
			
			this.typeOfTriangle = "Scalene";
			
		}
		
	}
		
} 
	    		
	
     boolean isTriangle(){
    	
    	if ((this.sideA != 0)&&(this.sideB != 0)&&(this.sideC != 0)){
    		
    		return true;
    		
    	} else{

		    return false;
		
    	}
    }
	
	
	public String currentTriangle(){
			
		    String CurrentTriangle =
				"Side A is " + this.sideA + 
				", Side B is " + this.sideB + 
				", Side C is " + this.sideC + 
				", Perimeter is " + this.perimeter + 
				", Semiperimeter is " + this.semiPerimeter + 
				", Area is " + this.area + 
				", Height is " + this.height +
				", Incircle radius is " + this.inCircleRadius +
				", Incircle area is " + this.incircleArea +
				", Circumcircle radius is " + this.circumcircleRadius + 
				", Circumcircle area is " + this.circumcirlceArea + 
				", Type of triangle is " + this.typeOfTriangle;
		
		return CurrentTriangle;	
		
	}

}
