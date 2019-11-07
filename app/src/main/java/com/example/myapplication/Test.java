package com.example.myapplication;

import android.util.Log;

public class Test {
    private static final String TAG = "Test";
    NewTest newTest=new NewTest(1);

    public Test(){
        newTest=new NewTest(2);
        Log.d(TAG, "Test: "+newTest.i);
    }

    public void show(){
        Log.d(TAG, "show: "+newTest.i);
    }

    public class NewTest{
        private int i=1;
        public NewTest(int j){
            i=j;
        }
    }
}
