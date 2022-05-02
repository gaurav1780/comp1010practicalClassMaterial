public class MyQueueClient {
    public static void main(String[] args) {
        String[] names = { "Homer", "Wiggum", "Gaurav", "Bernard" };

        MyQueue donutQueue = new MyQueue();
        int nextPersonToAdd = 0;
        while (nextPersonToAdd < names.length || !donutQueue.isEmpty()) {
            double coinToss = Math.random();
            if (coinToss < 0.5) { // add person to queue, if any
                if (nextPersonToAdd < names.length) {
                    donutQueue.insert(names[nextPersonToAdd]);
                    System.out.println(names[nextPersonToAdd] + " joined the donut queue");
                    System.out.println("Donut queue: " + donutQueue);
                    nextPersonToAdd++;
                }
            } else {
                if (!donutQueue.isEmpty()) {
                    System.out.println("Serving " + donutQueue.remove());
                    System.out.println("Donut queue: " + donutQueue);
                }
            }
        }
    }
}