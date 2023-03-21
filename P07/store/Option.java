package store;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
public class Option {
    public Option(String name, long cost) {
        if(cost < 0) throw new IllegalArgumentException("Negative cost for " + name + ": " + cost);
        this.name = name;
        this.cost = cost;
    }
    public long cost() {
        return this.cost;
    }
    public void save(BufferedWriter bw )throws IOException
    {
       bw.write( name + '\n');
       bw.write( "" + cost + '\n');
    }
    
    public Option(BufferedReader br )throws IOException
    {
       this.name  =             br.readLine();
       this.cost = Long.parseLong  (br.readLine());
    }
    
    
    @Override
    public String toString() {
        return name + " ($" + String.format("%.2f", cost / 100.0) + ")";
    }
    @Override
    public boolean equals(Object o) {
        try {
            if(this == o) return true;
            if(this.getClass() != o.getClass()) return false;
            Option p = (Option) o;
            return this.name.equals(p.name) && (this.cost == p.cost);
        } catch (Exception e) {
            return false;
        }
    }

    protected String name;
    protected long cost;
}
