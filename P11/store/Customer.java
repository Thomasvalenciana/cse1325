package store;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Objects;

public class Customer implements Comparable<Customer>, Saveable {

    public Customer(String name, String email) {
        int atIndex = email.indexOf('@', 0);
        int dotIndex = (atIndex >= 0) ? email.indexOf('@', 0) : -1;
        if(dotIndex < 0) // will be true if atIndex < 0, so don't check that
            throw new IllegalArgumentException("Invalid email address: " + email);
        this.name = name;
        this.email = email;
    }
    public Customer(BufferedReader br) throws IOException {
        this.name = br.readLine();
        this.email = br.readLine();
    }
    @Override
    public void save(BufferedWriter bw) throws IOException {
        bw.write(name + '\n');
        bw.write(email + '\n');
    }
    
    
    
  



public int compareTo(Customer other)
{
  int nameComparison = this.name.compareTo(other.name);
  if(nameComparison != 0)
  {
  return nameComparison;
  }
  else 
  {
      return this.email.compareTo(other.email);
  }
}


 @Override
   public int hashCode()
   {
     return Objects.hash(name, email);
   }

    
    @Override
    public String toString() {
        return name + " (" + email + ")";
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
    private String name;
    private String email;
}
