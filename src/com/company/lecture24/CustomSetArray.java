package com.company.lecture24;

import java.util.ArrayList;

public class CustomSetArray<k> {
    ArrayList<k> data;
    int size = 20;
    public CustomSetArray(ArrayList<k> data){
        this.data= data;
    }
    public void  add(k value){
        int hash = value.hashCode();
        int index = hash % size;
        if(data.get(index)!= null){
            data.add(index, value);
        }
    }
}
