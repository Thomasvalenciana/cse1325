package store;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public interface Saveable
{
	public abstract void save(BufferedWriter writer) throws IOException;
}
