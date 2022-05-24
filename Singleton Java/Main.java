public class Main {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run(){
                Monitor monitor1 = Monitor.getMonitor();
                System.out.println(monitor1.hashCode());
            }
        });

        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run(){
                Monitor monitor2 = Monitor.getMonitor();
                System.out.println(monitor2.hashCode());
            }
        });

        t1.start();
        t2.start();


    }
}