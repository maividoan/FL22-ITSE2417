// Doan class for FinalProject
// Outputs a Fibonacci stream conversation when implementing begin()

public class FinalProjDoan implements FinalProject {
    public FinalProjDoan() {

    }

    public void generateFibonacciStream() {
        System.out.println("----------Fibonacci Stream------------");
        System.out.print("Enter a number: ");
            
        int n = Itse2417Main.myScan.nextInt(), firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println();
    }

    public void begin() {
        try {
            generateFibonacciStream();
            java.util.concurrent.TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
        }
    }
}
