package store;

public class Customer

{
	private String name;
	private String email;
	
	
	
	 
	public Customer(String name, String email)
	 {
        int atIndex = email.indexOf('@', 0);
        int dotIndex = (atIndex >= 0) ? email.indexOf('.', atIndex) : -1;
        if(dotIndex < 0) // will be true if atIndex < 0, so don't check that
            throw new IllegalArgumentException("Invalid email address: " + email);
        this.name = name;
        this.email = email;
    }
	  
 
 

  @Override
  public String toString()
  {
       
       return  email +" " + name;
  }
  
    @Override
    public boolean equals(Object o) {
        try {
            if(this == o) return true;
            if(this.getClass() != o.getClass()) return false;
            Customer c = (Customer) o;
            return this.name.equals(c.name) && this.email.equals(c.email);
        } catch (Exception e) {
            return false;
        }
    }
    }
    

