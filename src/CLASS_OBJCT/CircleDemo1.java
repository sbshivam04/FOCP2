class Circle {
	private double radius = 2 ;
	public double findArea()
	{double temp=radius*radius*3.14;
	return temp;
	}
	void displayArea(double ar)
	{System.out.println("Area is"+ar);
	}

	}
	class CircleDemo1{
		public static void main (String[] args){
			Circle c = new Circle ();
			double temp1 = c.findArea();
			c.displayArea(temp1);
		}
	}