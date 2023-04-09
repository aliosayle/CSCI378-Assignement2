package queue;

public class Test 
{
    public static void splitQueue ( Queue q0, Queue q1, Queue q2)
    {
        String temp;
        while(!q0.isEmpty()) //loop to go through the queue
        {
            if(q0.head().charAt(0) >= 'A' && q0.head().charAt(0) <= 'H') //if first name is between A-H
            {
                temp = q0.dequeue();
                q1.enqueue(temp);   //add the name to q1
            }
            else
            {
                temp = q0.dequeue();
                q2.enqueue(temp); //add the name to q2
            }
        }
    }
    public static void main(String[] args) //test program
    {
        Queue q0 = new Queue();
        Queue q1 = new Queue();
        Queue q2 = new Queue();

        // add customer names to q0
        q0.enqueue("Alice");
        q0.enqueue("Bob");
        q0.enqueue("Charlie");
        q0.enqueue("David");
        q0.enqueue("Eve");
        q0.enqueue("Frank");
        q0.enqueue("Grace");
        q0.enqueue("Hank");
        q0.enqueue("Isaac");
        q0.enqueue("Jack");
        q0.enqueue("Karen");
        q0.enqueue("Lucy");
        q0.enqueue("Mike");
        q0.enqueue("Nancy");
        q0.enqueue("Oliver");
        q0.enqueue("Peter");
        q0.enqueue("Quincy");
        q0.enqueue("Rachel");
        q0.enqueue("Samantha");
        q0.enqueue("Tom");
        q0.enqueue("Ursula");
        q0.enqueue("Victor");
        q0.enqueue("Wendy");
        q0.enqueue("Xavier");
        q0.enqueue("Yara");
        q0.enqueue("Zack");

        // split q0 into q1 and q2
        splitQueue(q0, q1, q2);

        // display q1 and q2
        System.out.println("Customers in queue 1 (A-H):");
        while (!q1.isEmpty()) {
            System.out.println(q1.dequeue());
        }
        System.out.println("Customers in queue 2 (I-Z):");
        while (!q2.isEmpty()) {
            System.out.println(q2.dequeue());
        }
    }
}

