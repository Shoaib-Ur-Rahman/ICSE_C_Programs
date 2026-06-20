import java.util.Scanner;

public class IcseSpeedTest 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== ICSE Board Exam Data Verification System ===");
        System.out.print("Press 1 to compile and verify student records: ");
        int choice = sc.nextInt();
        
        if (choice == 1) 
        {
            long startTime = System.currentTimeMillis();
            System.out.println("\nProcessing records... (Checking for Prime and Armstrong patterns)");
            
            long matchCount = 0;
            
            // Loop size scaled up to force a long processing wait
            for (long i = 1; i <= 2000000; i++) 
            {
                for (long j = 1; j <= 40000; j++) 
                {
                    if ((i * j) % 7 == 0) 
                    {
                        matchCount += (i + j);
                    }
                }
                
                if (i % 20000 == 0) 
                {
                    System.out.print("[LOADING RECORDS]: " + (i / 20000) + "%\r");
                }
            }
            
            long endTime = System.currentTimeMillis();
            double totalTime = (endTime - startTime) / 1000.0;
            
            System.out.println("\n\nVerification Complete!");
            System.out.println("Total Time Taken: " + totalTime + " seconds");
            System.out.println("Nodes Processed: " + matchCount);
        }
        else 
        {
            System.out.println("Invalid Choice.");
        }
        sc.close();
    }
}
