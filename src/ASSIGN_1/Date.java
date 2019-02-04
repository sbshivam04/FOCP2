class Date
{
int day;
int year;
int month;

Date(int dd, int mm, int yy)
 {
this.day=dd;
 this.month=mm;
this.year=yy;
}

	void DisplayDate()
	{
		System.out.print(day+" "+month+" "+year+" ");
	}
}