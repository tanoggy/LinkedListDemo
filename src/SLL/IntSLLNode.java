package SLL;
import java.util.*;



public class IntSLLNode {
    public int info;
    public IntSLLNode next;
    public IntSLLNode(){}
    public IntSLLNode(int i)
    {
        info = i;
        next = null;
    }
    public IntSLLNode(int i, IntSLLNode n)
    {
        info = i;
        next = n;
    }
}
class IntSLL
{
    IntSLLNode head, tail;
    int size;
    public IntSLL()
    {
        head = tail =  null;
        size = 0;
    }
    public boolean isEmpty()
    {
        return size == 0;
    }
    public void clear()
    {
        head = tail = null;
        size = 0;
    }
    public void AddFirst(int el)
    {
        IntSLLNode newest = new IntSLLNode();
        newest.info = el;
        newest.next = head;
        head = newest;
        size++;
        if(tail == null)
        {
            tail = head;

        }

    }

    public boolean contains(int el)
    {
        IntSLLNode tmp = head;
        while(tmp!= null)
        {
            if(tmp.info == el)
            {
                return true;
            }
            tmp = tmp.next;
        }
        return false;
    }

    public void traverse() throws Exception // print all info of the list
    {
        if(isEmpty())
        {
            throw new Exception("Empty list");
        }
        IntSLLNode temp = head;
        while(temp != null)
        {
            System.out.println(temp.info);
            temp = temp.next;
        }
    }

    public void AddLast(int el)
    {
        IntSLLNode newest = new IntSLLNode(el);
        //newest.info = el;
        //newest.next = null;
        if(isEmpty())
            head = tail = newest;
        else
        {
            tail.next = newest;
            tail = newest;
        }
        size++;
    }

    public void input()
    {
        System.out.print("Enter elements separated by space: ");
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            if(sc.hasNextInt())
            {
                int e = sc.nextInt();
                this.AddLast(e);
            }
            else
            {
                try
                {
                    sc.next();
                }
                catch(NoSuchElementException ex)
                {
                    break;// end of input
                }
            }
        }

    }

    public int get(int position) throws IndexOutOfBoundsException
    {

       return 0;
    }

  /*  public IntSLLNode getNode(int position) throws IndexOutOfBoundsException
    {

    }
*/


    public void Add(int el, int position) throws IndexOutOfBoundsException
    {


    }

    public int RemoveFirst() throws Exception
    {   int temp = 0;
        if(isEmpty())
        {
            throw new Exception("Empty list");
        }
        else {
            if (head == tail)
            {   temp = head.info;
                head = tail = null;
            }
            else {
                temp = head.info;
                head = head.next;

            }
            size--;
        }

        return temp;
    }

    public int RemoveLast() throws Exception
    {   int temp = -1;
        if(isEmpty())
        {
            throw new Exception("Empty list");
        }
        else {

        }

        return temp;
    }

    public int RemoveAt(int position) throws IndexOutOfBoundsException
    {
        return 0;
    }

    public void reverse() // require take in place
    {

    }

    public void sort() // require take in place
    {

    }
}

class Test
{
    public static void main(String[] args) throws Exception {
        IntSLL sll = new IntSLL();

        for(int i = 0; i < 10; i++)
            sll.AddFirst(i);
        sll.traverse();
        int resultDelFirst = sll.RemoveFirst();
        System.out.println("after delete " + resultDelFirst);
        sll.traverse();
        int resultDelLast = sll.RemoveLast();
        System.out.println("Afer delete " + resultDelLast);
        sll.traverse();


    }}