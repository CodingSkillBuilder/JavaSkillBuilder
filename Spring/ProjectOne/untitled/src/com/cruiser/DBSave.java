package com.cruiser;

import java.util.ArrayList;


public class DBSave {
    private static ArrayList<User> users = new ArrayList();

    public static void addUser(User person){
        users.add(person);
    }

    public static String getPassword(int id){
        return users.get(id).password;
    }

    public static int idFinder(int id){
        // I know lasith brother...over messed up logic here... :)))))
        int size = users.size();
        int index = -1;
        for(int i =0; i< size; i++){
            if (users.get(i).getId() == id){
                index = i;
                break;
            }
        }
        return index;
    }

    public static int last(){
        return users.get((users.size() - 1)).getId();
    }
}


//public class MyThread01 extends Thread{
//    public MyThread01(String name){
//        super(name);
//    }
//
//    // body of the thread
//    @Override
//    public void run(){
//        System.out.println(Thread.currentThread().getName());
//    }
//
//}















