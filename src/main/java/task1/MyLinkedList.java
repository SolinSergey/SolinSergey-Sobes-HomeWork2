package task1;

public class MyLinkedList <T> {
    Element<T> head;
    public void add(T value)
    {
        Element<T> new_node = new Element<>(value);
        if (head == null) {
            head = new_node;
        }
        else {
            Element<T> last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
    }

    public void printList()
    {
        Element<T> currNode = head;
        System.out.print("MyLinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.value + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public void delete(T findValue)
    {
        Element<T> currNode = head;
        Element<T> prev = null;
        if (currNode != null && currNode.value == findValue) {
            head = currNode.next;
            return;
        }
        while (currNode != null && currNode.value != findValue) {
            prev = currNode;
            currNode = currNode.next;
        }
        if (currNode != null) {
            prev.next = currNode.next;
        }
        if (currNode == null) {
            System.out.println(findValue + " не найден в списке");
        }
    }
}
