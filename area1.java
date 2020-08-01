public class shape{
 shape(){
	System.out.println("Parent Class Shape");
	}
 public void area(double a){}
public static void main(String args[]){
square s=new square();
circle c=new circle();
s.area(15);
c.area(4);
}
}

public class square extends shape{
 square(){
 	System.out.println("Child Class Square");
	}
 public void area(double s){
 	System.out.println("Area of Square: "+(s*s));
	}
}
public class circle extends shape{
 final double PI=3.14;
 circle(){
 	System.out.println("Child Class Circle");
	}
 public void area(double c){
	System.out.println("Area of Circle: "+(PI*c*c));
	}
}