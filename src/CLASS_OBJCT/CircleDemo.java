class Circle {
	double radius = 2 ;
	double findArea()
	{double temp=radius*radius*3.14;
	return temp;
	}
	void displayArea(double ar)
	{System.out.println("Area is"+ar);
	}

	}
	class CircleDemo{
		public static void main (String[] args){
			Circle c = new Circle ();
			c.radius=2;
			double temp1 = c.findArea();
			c.displayArea(temp1);
		}
	}