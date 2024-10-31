
public class Main { 
  public static void main(String[] args) {
    Account account = new Account("Ivanov", 57528194, 7, 1350);

    account.changeSurname("Petrov");
    account.withdrawMoney(350);
    account.putMoney(500);
    account.Percentage();
    account.numberWriting();

    Prism prism = new Prism(10, 5);

    prism.print();

    IntegerQueue queue = new IntegerQueue();

    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);

    queue.printQueue();

    queue.contains(20); 
    queue.contains(40); 

    queue.dequeue();
    queue.printQueue();

    queue.dequeue();
    queue.dequeue();

    queue.dequeue();
  } 
}
