package _java.threads.creation;

public class ThreadStates {
    public ThreadStates() {
        for (Thread.State c : Thread.State.values()) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        ThreadStates obj = new ThreadStates();
    }
}
