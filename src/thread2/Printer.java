package thread2;



public class Printer implements Runnable{

    private String name;

    public Printer(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        System.out.println(name + " Working...");

        for (int i = 1 ; i <= 10 ; i++){
            try {
                System.out.println(name + " Printing : " + i);

                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Thread breaked down...");
            }


        }
        System.out.println(name + " job was finished...");

    }

}
