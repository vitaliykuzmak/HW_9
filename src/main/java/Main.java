public class Main {
    public static void main(String[] args) {
        // Тестування MyArrayList
        System.out.println("Testing MyArrayList:");
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("Hello");
        myArrayList.add("World");
        myArrayList.add("!");
        System.out.println("Element at index 1: " + myArrayList.get(1)); // World
        System.out.println("Size: " + myArrayList.size()); // 3
        myArrayList.remove(1);
        System.out.println("Element at index 1 after removal: " + myArrayList.get(1)); // !
        System.out.println("Size after removal: " + myArrayList.size()); // 2
        myArrayList.clear();
        System.out.println("Size after clear: " + myArrayList.size()); // 0

        // Тестування MyLinkedList
        System.out.println("\nTesting MyLinkedList:");
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("Apple");
        myLinkedList.add("Banana");
        myLinkedList.add("Cherry");
        System.out.println("Element at index 2: " + myLinkedList.get(2)); // Cherry
        System.out.println("Size: " + myLinkedList.size()); // 3
        myLinkedList.remove(1);
        System.out.println("Element at index 1 after removal: " + myLinkedList.get(1)); // Cherry
        System.out.println("Size after removal: " + myLinkedList.size()); // 2
        myLinkedList.clear();
        System.out.println("Size after clear: " + myLinkedList.size()); // 0

        // Тестування MyQueue
        System.out.println("\nTesting MyQueue:");
        MyQueue myQueue = new MyQueue();
        myQueue.add("First");
        myQueue.add("Second");
        myQueue.add("Third");
        System.out.println("Peek: " + myQueue.peek()); // First
        System.out.println("Poll: " + myQueue.poll()); // First
        System.out.println("Peek after poll: " + myQueue.peek()); // Second
        System.out.println("Size: " + myQueue.size()); // 2
        myQueue.clear();
        System.out.println("Size after clear: " + myQueue.size()); // 0

        // Тестування MyStack
        System.out.println("\nTesting MyStack:");
        MyStack myStack = new MyStack();
        myStack.push("One");
        myStack.push("Two");
        myStack.push("Three");
        System.out.println("Peek: " + myStack.peek()); // Three
        System.out.println("Pop: " + myStack.pop()); // Three
        System.out.println("Peek after pop: " + myStack.peek()); // Two
        System.out.println("Size: " + myStack.size()); // 2
        myStack.remove(0);
        System.out.println("Peek after removal: " + myStack.peek()); // Two
        myStack.clear();
        System.out.println("Size after clear: " + myStack.size()); // 0

        // Тестування MyHashMap
        System.out.println("\nTesting MyHashMap:");
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put("Key1", "Value1");
        myHashMap.put("Key2", "Value2");
        myHashMap.put("Key3", "Value3");
        System.out.println("Value for Key2: " + myHashMap.get("Key2")); // Value2
        System.out.println("Size: " + myHashMap.size()); // 3
        myHashMap.remove("Key2");
        System.out.println("Value for Key2 after removal: " + myHashMap.get("Key2")); // null
        System.out.println("Size after removal: " + myHashMap.size()); // 2
        myHashMap.clear();
        System.out.println("Size after clear: " + myHashMap.size()); // 0
    }
}
