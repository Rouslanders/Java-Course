package Lesson12;

import jdk.internal.access.JavaIOFileDescriptorAccess;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<String> linkedList = new ArrayList<>();


        long startAddLinkedList = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {

        }
        long endAddLinkedlist =  System.currentTimeMillis();
        System.out.println("LinkedList add: " + (endAddLinkedlist- startAddLinkedList));
    }

 }
