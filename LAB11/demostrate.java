class MyThread extends Thread{
    public void run(){
        for(int i=0;i<1;i++){
            System.out.println(Thread.currentThread() + " " + i);
        }
    }
}

class Main{
    public static void main(String args[]){
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        System.out.println(t1.isAlive());
        try{
            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}