public class Option

{
  protected String name;
  protected long cost;
  
 
 public Option (String name, long cost)
 {
    this.name=name;
    this.cost=cost;
    
    if(cost<0)
    {
       throw new IllegalArgumentException("invalid cost");
    }
    
 
 }


@Override
    public String toString()
   {
    return name;
    }

}
