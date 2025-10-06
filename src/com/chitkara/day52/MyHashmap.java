package com.chitkara.day52;

class MyHashMap {
    class Node {
        int key;
        int val;
        Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    private Node[] storage;

    public MyHashMap() {
        this.storage = new Node[10000];
    }

    private int hashFunction(int key) {
        return key % 10000;
    }

    private Node find(Node head, int key) {
        // returns previous node to current node if we find the current key in the linked list
        Node prev = head;
        Node curr = head.next;

        while (curr != null && curr.key != key) {
            prev = curr;
            curr = curr.next;
        }

        return prev;
    }

    public void put(int key, int value) {
        int idx = hashFunction(key);
        if (storage[idx] == null) {
            storage[idx] = new Node(-1, -1);
        }

        Node prev = find(storage[idx], key);

        if (prev.next == null) {
            prev.next = new Node(key, value);
        } else {
            prev.next.val = value;
        }
    }

    public int get(int key) {
        int idx = hashFunction(key);
        if (storage[idx] == null) return -1;
        Node prev = find(storage[idx], key);
        if (prev.next == null) return -1;
        return prev.next.val;
    }

    public void remove(int key) {
        int idx = hashFunction(key);
        if (storage[idx] == null) return;
        Node prev = find(storage[idx], key);
        if (prev.next == null) return;
        Node temp = prev.next;
        prev.next = prev.next.next;
        temp.next = null; // so it can be garbage collected
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */