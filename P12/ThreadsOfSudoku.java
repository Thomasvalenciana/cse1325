import java.util.HashSet;
import java.util.Scanner;
import java.io.File;

public class ThreadsOfSudoku {
    public static void main(String[] args) {
        
        try {
            if(args.length < 2) {
                System.err.println("usage: java ThreadsOfSudoku threads puzzleFilename [puzzleName]");
                System.exit(-1);
            }
            
            Scanner in = new Scanner(new File(args[1]));
            String name = (args.length > 1) ? args[2] : null;
            Sudoku sud = new Sudoku(in, name);
            System.out.println(sud + "\n\n");
            
            int numThreads = Integer.parseInt(args[0]);
            
            // Split the search field into 81 different sub-puzzles
            int index = 0;
            for(int y=1; y<=9; ++y) {
                for(int x=1; x<=9; ++x) {
                    suds[index++] = new Sudoku(sud, new int[]{x, y});
                }
            }
            
            
            Thread [] threads = new Thread [numThreads];
            
            int puzzlesPerThread =suds.length/numThreads;
            int first =0;
            for(int i=0; i< numThreads; i++)
            {
              int last = first+puzzlesPerThread-1;
              if (i== numThreads -1) last = suds.length -1;
              threads[i] =new Thread(new SudokuSolver(first, last,  i+1));
              threads[i].start();
              first =last +1;
            }
            for(int i=0; i<numThreads; i++)
            {
              threads[i].join();
            }
          
            
            // WORK HERE
            // solveSuds accepts a range of the 81 Sudoku candidate solutions
            //   (in this case from 0 to suds.length-1 - that is, ALL of them!)
            //   with a "thread ID" hard-coded as 1.
            // Your job is to rewrite this to create numThreads threads, with
            //   the set of Sudoku candidate solutions split between them
            //   (for example, 0 to 40 for the first thread and 41-81 for the second).           
            //solveSuds(0, suds.length-1, 1);

            // END WORK HERE
                        
            // Show the solution(s), if a
   
            
            System.out.println("Found " + solutions.size() + " solutions");
            for(var s : solutions) System.out.println(s);
        } catch(Exception e) {
            //System.err.println("ABORT: " + e);
            e.printStackTrace(System.err);
            System.exit(-1);
        }
    }
    
    private static class SudokuSolver implements Runnable
    {
    
    private final int first;
    private final int last;
    private final int id;
    
    public SudokuSolver (int first, int last, int id){
    this.first =first;
    this.last= last;
    this.id=id;
    }
    
    
    // WORK HERE
    
    // Be sure to protect the solutions ArrayList from Thread Interference!
    private static void solveSuds(int first, int last, int id) {
        System.out.println("Thread " + id + " will solve " + first + " to " + last);
        HashSet<Sudoku>threadSolutions =new HashSet<>();
        for(int i=first; i<=last; ++i) {
            System.out.println("Thread " + id + " solving " + i);// + "\n\n" + suds[i]);
            if(suds[i].solve()) threadSolutions.add(suds[i]);
        }
        synchronized(solutions){
    solutions.addAll(threadSolutions);
    }
    }
    
    
    public void run()
    {
      solveSuds(first, last, id);
    }
    }
    // END WORK HERE
    
    private static Sudoku[] suds = new Sudoku[81];
    private static HashSet<Sudoku> solutions = new HashSet<>();
}
