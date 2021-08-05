package com.example.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.Adapter;

public class MainActivity extends AppCompatActivity {
    ViewPager2 myViewPager,myViewPager2;
    String[] names={"java1","java2","java3","java4","java5","java6","java7","java8","java9"};
    int[] images={R.drawable.capture1,R.drawable.capture2,R.drawable.capture3,R.drawable.capture4,R.drawable.capture5,R.drawable.capture6,R.drawable.capture7,R.drawable.capture8,R.drawable.capture9};

    MyAdapter myAdapter,myAdapter2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myViewPager=findViewById(R.id.my_viewpager);
        myViewPager2=findViewById(R.id.my_viewpager2);

        myAdapter=new MyAdapter(names);
       // myAdapter2=new MyAdapter(names,images);

        myViewPager.setAdapter(myAdapter);
        myViewPager2.setAdapter(myAdapter);




    }
}