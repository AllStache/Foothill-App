package com.example.berkeley.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.*;


public class MainActivity extends AppCompatActivity {
    ArrayList<String> kanaList = new ArrayList<String>();
    String currentChar;
    int kanaTot = kanaList.size();
    public String currentKana(){
        return currentChar;
    }
    public void practiceHiragana(){
    }
    public void practiceKatakana(){
    }
    public boolean isCorrect(String input){

        return true;
    }
    public String getKana(){
        int d = (int) (Math.random() + kanaList.size());
        currentChar = kanaList.get(d);
        kanaList.remove(d);
        return currentChar;
    }
}
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

