package com.company.lecture24;

import java.util.ArrayList;
import java.util.LinkedList;

public class CustomSetLinkedList<k> {
    ArrayList<LinkedList<k>> data;
    static final int DRFAULT_SIZE = 20;
    int size;

    CustomSetLinkedList(){
        this.data = new ArrayList<>();
        for (int i =0 ;i<DRFAULT_SIZE; i++){
            this.data.add(new LinkedList<>()); // har ek Arraylist ke index pe ek linkedlist bannayi
        }

        this.size = 0;
    }

    public  boolean add(k value){
        int hash = value.hashCode();
        int index = Math.abs(hash % data.size());
        LinkedList<k> list = this.data.get(index);
        for(k key : list){
            if(key.equals(value)){
                return true;
            }
        }
        return false;

    }

    public boolean remove(k value){
        int hash = value.hashCode();
        int index = Math.abs(hash % data.size());
        LinkedList<k> list = this.data.get(index);
        for(k key : list){
            if(key.equals(value)){
                list.remove(value);
                return true;
            }
        }
        return false;

    }
    private void rehash() {
        ArrayList<LinkedList<k>> old = this.data;
        this.data = new ArrayList<>();
        for (int i = 0; i < old.size()*2; i++) {
            this.data.add(new LinkedList<>());
        }
        this.size = 0;
        for(LinkedList<k> list : old) {
            for (k element : list) {
                add(element);
            }
        }
    }
}
