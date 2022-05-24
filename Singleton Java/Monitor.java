public class Monitor{

    private static Monitor mMonitor; // Null

    private Monitor() {

    }

    public synchronized static Monitor getMonitor(){
        if(mMonitor == null){
            mMonitor = new Monitor();
        }

        return mMonitor;
    }
}