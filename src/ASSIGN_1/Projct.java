class Projct
{
  String name;
  String role;
  String work;

 Project(String name, String role )
    {
        this.name=name;
        this.role=role;
        
   }
   public void setName(String name) 
   {   
      this.name=name;
   }
   public String getName()
   {
   	return name;
   }
    public void setRole(String role) 
   {   
      this.role=role;
   }
   public String getRole()
   {
   	return role;
   }
     public void setWrk(String work) 
   {   
      this.work=work;
   }
   public String get()
   {
   	return work;
   }
    public void displayProject()
     {
        System.out.println("The project Name of the student is\n"+ "name =" + name +"Role =" + role );
    }
	
}
