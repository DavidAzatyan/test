package javaC.Schildt.Chapter_11.Pause_resume_and_stop_execution_threads;

public class SuspendResume {
    public static void main(String[] args) {

        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");

        try {
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Пpиocтaнoвкa потока Один");
            Thread.sleep(1000);
            ob1.muresume();
            System.out.println("Boзoбнoвлeниe потока Один");
            ob2.mysuspend();
            System.out.println("Пpиocтaнoвкa потока Два");
            Thread.sleep(1000);
            ob2.muresume();
            System.out.println("Boзoбнoвлeниe потока Два");
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }

        try {
            System.out.println("Oжидaниe завершения потоков.");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException е) {
            System.out.println("Main thread was interrupted");
        }
        System.out.println("Main thread was finished");
    }
}
