class Qualification
{
	String qualName, university, institute;
	double marksr;

	Qualification(String a, String b, String c, double marks)
	{
		this.qualName=a;
		this.university=b;
		this.institute=c;
		this.marks=marks;
	}

	void DisplayQualification()
	{
		System.out.print(qualName+" "+university+" "+institute+" "+marks+" ");
	}
}

class Project
{
	String name, role;
	String responsibilities[];
	Date startDate,endDate;
	int z;

	Project(String n,String r, int ds, int ms, int ys, int de, int me, int ye, int z, Project proj[])
	{
		int i;
		Scanner input = new Scanner(System.in);
	this.name=n;
	this.role=r;
	startDate= new Date(ds,ms,ys);
	endDate= new Date(de,me,ye);
	this.z=z;	
	this.responsibilities=new String[z];
	System.out.println("enter responsibilities");
	for(i=0;i<z;i++)
	{
		this
		this.responsibilities[i]=resp[i];
	}
	}

	void DisplayProject(int z)
	{
		int i;
		System.out.print(name+" "+role+" ");
		startDate.DisplayDate();
		System.out.print(" ");
		endDate.DisplayDate();
		System.out.print(" ");
		for (i=0;i<z;i++)
		{
			System.out.print(responsibilities[i]+" ");
		}
	}

	int getz()
	{
		return z;
	}
}