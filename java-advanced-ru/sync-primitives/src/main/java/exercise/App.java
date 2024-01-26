package exercise;

class App {

    public static void main(String[] args) {
        // BEGIN
        System.out.println("Crate safetylist instance");
        var list = new SafetyList();

        var thread1 = new ListThread(list);
        var thread2 = new ListThread(list);

        thread1.start();
        thread2.start();
        // END
    }
}

