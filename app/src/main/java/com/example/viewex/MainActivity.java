package com.example.viewex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
  private CheckBox cb1, cb2, cb3;
  private ImageView img1, img2, img3;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    cb1 = findViewById(R.id.cb1);
    cb2 = findViewById(R.id.cb2);
    cb3 = findViewById(R.id.cb3);


    img1 = findViewById(R.id.imageView);
    img2 = findViewById(R.id.imageView2);
    img3 = findViewById(R.id.imageView3);
  //배열사용해서 이미지 기본설정 해주면 첫화면에서 이미지도 안나오거나 첫이미지 하나만 띄우기

    cb1.setChecked(true);
    cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (cb1.isChecked()) {
          img1.setVisibility(View.VISIBLE);
          img2.setVisibility(View.INVISIBLE);
          img3.setVisibility(View.INVISIBLE);
        }
      }
    });

    cb2.setChecked(false);
    cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (cb2.isChecked()) {
          img1.setVisibility(View.INVISIBLE);
          img2.setVisibility(View.VISIBLE);
          img3.setVisibility(View.INVISIBLE);
        }
      }
    });

    cb3.setChecked(false);
    cb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (cb3.isChecked()) {
          img1.setVisibility(View.INVISIBLE);
          img2.setVisibility(View.INVISIBLE);
          img3.setVisibility(View.VISIBLE);
        }
      }
    });

  }
}



