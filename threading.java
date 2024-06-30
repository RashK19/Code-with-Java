public class Threading {
    public static void main(String[] args) {
        // Create a new thread
        Thread thread = new Thread(); 
            @Override
            public void run() {
                try {
                    // Print the original thread name
                    System.out.println("Original Thread Name: " + Thread.currentThread().getName());
                    
                    // Make the thread sleep for 5 seconds
                    Thread.sleep(5000);
                    
                    // Change the thread name
                    Thread.currentThread().setName("NewThreadName");
                    
                    // Print the new thread name
                    System.out.println("New Thread Name: " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start the thread
        thread.start();
    }
}
