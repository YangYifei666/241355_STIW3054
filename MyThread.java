
package Week_01;

class MyThread extends Thread {

    public void run() {
        System.out.println("running...");
<<<<<<< HEAD
=======
        System.out.println("241355_STIW3054");
>>>>>>> 2f0f4c20b47b8ad624096e059078136571c3915f
    }

    public static void main(String args[]) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        System.out.println("Name of t1:" + t1.getName());
        System.out.println("Name of t2:" + t2.getName());
        System.out.println("id of t1:" + t1.getId());

        t1.start();
        t2.start();

        t1.setName("STIW3054");
        System.out.println("After changing name of t1:" + t1.getName());
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 2f0f4c20b47b8ad624096e059078136571c3915f
