package com.cookandroid.cap4;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button coffee_btn = (Button) findViewById(R.id.coffee_btn);
        coffee_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), coffee.class);
                startActivity(intent);
            }
        }); //버튼클릭시 커피화면전환

        Button juice_btn = (Button) findViewById(R.id.juice_btn);
        juice_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), juice.class);
                startActivity(intent);
            }
        }); //버튼클릭시 주스화면전환
        Button latte_btn = (Button) findViewById(R.id.latte_btn);
        latte_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), latte.class);
                startActivity(intent);
            }
        }); //버튼클릭시 라떼화면전환
        Button smoothie_btn = (Button) findViewById(R.id.smoothie_btn);
        smoothie_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), smoothie.class);
                startActivity(intent);
            }
        }); //버튼클릭시 스무디 화면전환
        Button tie_btn = (Button) findViewById(R.id.tie_btn);
        tie_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), tie.class);
                startActivity(intent);
            }
        }); //버튼클릭시 티화면전환
        Button bubble_btn = (Button) findViewById(R.id.bubble_btn);
        bubble_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), bubbletie.class);
                startActivity(intent);
            }
        }); //버튼크릭시 버블티화면전환
    }
}


