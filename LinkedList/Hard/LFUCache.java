/**
 * Problem Name: LFU Cache
 * Difficulty: Hard
 *
 * Problem Statement:
 * Design LFU cache with O(1) operations.
 *
 * Approach:
 * Use HashMaps + Doubly Linked Lists grouped by frequency.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(n)
 */

import java.util.*;

class LFUCache {

    class Node {
        int key, val, freq;
        Node prev, next;
        Node(int k,int v){
            key=k; val=v; freq=1;
        }
    }

    class DLList {
        Node head=new Node(0,0);
        Node tail=new Node(0,0);
        int size=0;

        DLList(){
            head.next=tail;
            tail.prev=head;
        }

        void add(Node node){
            node.next=head.next;
            head.next.prev=node;
            head.next=node;
            node.prev=head;
            size++;
        }

        void remove(Node node){
            node.prev.next=node.next;
            node.next.prev=node.prev;
            size--;
        }

        Node removeLast(){
            if(size>0){
                Node node=tail.prev;
                remove(node);
                return node;
            }
            return null;
        }
    }

    private int capacity, minFreq;
    private Map<Integer, Node> map = new HashMap<>();
    private Map<Integer, DLList> freqMap = new HashMap<>();

    public LFUCache(int capacity){
        this.capacity = capacity;
    }

    public int get(int key){

        if(!map.containsKey(key)) return -1;

        Node node = map.get(key);
        update(node);

        return node.val;
    }

    public void put(int key, int value){

        if(capacity == 0) return;

        if(map.containsKey(key)){
            Node node = map.get(key);
            node.val = value;
            update(node);
        } else {

            if(map.size() == capacity){
                DLList list = freqMap.get(minFreq);
                Node removed = list.removeLast();
                map.remove(removed.key);
            }

            Node node = new Node(key,value);
            map.put(key,node);
            minFreq = 1;

            freqMap.computeIfAbsent(1,k->new DLList()).add(node);
        }
    }

    private void update(Node node){

        int freq = node.freq;
        DLList list = freqMap.get(freq);
        list.remove(node);

        if(freq == minFreq && list.size == 0)
            minFreq++;

        node.freq++;

        freqMap.computeIfAbsent(node.freq,k->new DLList()).add(node);
    }
}
