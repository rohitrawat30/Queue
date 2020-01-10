public class Main {
    public static void main(String arg[]){
        LinearQueue q = new LinearQueue(5);
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        q.enQueue(6);

        q.print();

        for(int i=0; i<7; i++){
            System.out.println("its "+q.deQueue());
        }
    }

}
