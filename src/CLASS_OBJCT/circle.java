import java.util.*;
import java.lang.*;

class Circle {

int r;
Circle() //constructor
{
	this.r=1;
}
Circle(int radius)
{
	this.r=radius;
}
double area()
{
	double ar;
	ar=Math.PI*r*r;
	return ar;
	
}