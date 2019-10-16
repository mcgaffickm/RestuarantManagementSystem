/**
 * Is used to time various things in the program
 * @author Michael McGaffick
 * @version 4/4/18
 */
public class StopWatch
{
    //Declaration of variables
    private long startTime;
    private long elapse;
    
    /**
     * Start command that begins the timer
     */
    public void start()
    {
        startTime = System.currentTimeMillis();
    }

    /**
     * Stops the timer and returns the time it took for the given action
     * @return a long value of the time it took in ms
     */
    public long stop()
    {
        long endTime = System.currentTimeMillis();
        elapse = endTime - startTime;
        return elapse;
    }
}
