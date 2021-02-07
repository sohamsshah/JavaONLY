// Write out.print instead of System.out.print
import static java.lang.System.out;


/**
 * NOTE: This works only on command-line interface (e.g. cmd prompt in Windows). IDEs do not support this feature.
 * 
 * Write these commands to execute the program and see the magic:
 * javac Multithreading7.java
 * java Multithreading7
 *
 * And Voilà!
 */
public class Multithreading7 {
    public static void main(String[] args) {
	out.println();
        
        // Create Thread and start loading for 2 seconds
        Loading loading = new Loading(6000);
        Thread load = new Thread(loading);
	load.start();

        try {
            // Wait for thread to stop to replace text displayed on screen.
	    load.join();
            
            // Since "Loading" has 7 characters, we go back 7 times, print 7 spaces and go back again 7 times.
            System.out.print("\b\b\b\b\b\b\b       \b\b\b\b\b\b\b");
            System.out.println("FINISHED LOADING!!!");
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}

class Loading implements Runnable {

    /** 
     * The duration - of how long it should load for.
     */
    private long duration;


    public Loading(long duration) {
        this.duration = duration;
    }

    @Override
    public void run() {
        out.print("Loading");
        for (int i = 0; i < duration / 3000; i++) {
            for (int j = 0; j < 3; j++) {.
                // Print 1 period and wait for 1 second.
                out.print(".");
		try {
            	    Thread.sleep(1000);
        	} catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
        	}
            }
            
            // We need to replace "...". So we go back 3 times, print 3 spaces and go back again 3 times.
            System.out.print("\b\b\b   \b\b\b");
        }
    }
}