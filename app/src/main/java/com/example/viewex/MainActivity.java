package com.example.viewex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
  // 체크박스 _ 1.변수 설정
  private CheckBox cb1, cb2, cb3;
  private ImageView img1, img2, img3;

  //라디오버튼 _ 1.변수설정
  private RadioButton[] rbArr;
  private ImageView[] imgArr;
  private int[] rbRes = {R.id.rb1,R.id.rb2,R.id.rb3};
  private int[] imgViewRes = {R.id.imageView4, R.id.imageView5, R.id.imageView6};
  private int[] imgRes = {R.drawable.img1, R.drawable.img2, R.drawable.img3};

  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    //체크박스 _ 2.버튼 초기화
    cb1 = findViewById(R.id.cb1);
    cb2 = findViewById(R.id.cb2);
    cb3 = findViewById(R.id.cb3);
    img1 = findViewById(R.id.imageView);
    img2 = findViewById(R.id.imageView2);
    img3 = findViewById(R.id.imageView3);

    //라디오 _ 2. 초기화
    rbArr = new RadioButton[3];
    imgArr = new ImageView[3];

    for (int i = 0; i < rbArr.length; i++) {
      rbArr[i] = findViewById(rbRes[i]);
      imgArr[i] = findViewById(imgViewRes[i]);
      imgArr[i].setImageResource(imgRes[i]);  //drawble의 이미지 소스
      //라디오 _ 3. 클릭이벤트 적용
      final int tmp = i;
      rbArr[i].setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
          Log.d("rb::", tmp+"");
          changeImageView(tmp);
        }
      });
    }
    
    //체크박스 _ 3.change(클릭)이벤트 실행
    cb1.setChecked(true);
    img1.setVisibility(View.VISIBLE);
    img2.setVisibility(View.INVISIBLE);
    img3.setVisibility(View.INVISIBLE);
    cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (cb1.isChecked()) {
          img1.setVisibility(View.VISIBLE);
          img2.setVisibility(View.INVISIBLE);
          img3.setVisibility(View.INVISIBLE);
        } else {
          img1.setVisibility(View.INVISIBLE);
        }
      }
    });
    cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (cb2.isChecked()) {
          img1.setVisibility(View.INVISIBLE);
          img2.setVisibility(View.VISIBLE);
          img3.setVisibility(View.INVISIBLE);
        }else {
          img2.setVisibility(View.INVISIBLE);
        }
      }
    });
    cb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (cb3.isChecked()) {
          img1.setVisibility(View.INVISIBLE);
          img2.setVisibility(View.INVISIBLE);
          img3.setVisibility(View.VISIBLE);
        }else {
          img3.setVisibility(View.INVISIBLE);
        }
      }
    });
  }

  //라디오버튼 _ 3. change(클릭)이벤튼 실행시 클릭한 이미지만 출력되도록 설정
  private void changeImageView(int tmp) {
    for (int i = 0; i < rbArr.length; i++) {
      imgArr[i].setVisibility((tmp==i)?View.VISIBLE:View.INVISIBLE);
    }
  }

}



//
//  @Override
//  protected void onCreate(Bundle savedInstanceState) {
//    super.onCreate(savedInstanceState);
//    setContentView(R.layout.activity_main); //항상 제일 위에 위치해야 함!
//
//    cb1 = findViewById(R.id.cb1);
//    cb2 = findViewById(R.id.cb2);
//    cb3 = findViewById(R.id.cb3);
//
//
//    rbArr = new RadioButton[3];
//    imgArr = new ImageView[3];
//
//    for (int i = 0; i < rbArr.length; i++) {
//      rbArr[i] = findViewById(rbRes[i]);
//      imgArr[i] = findViewById(imgRes[i]);
//      final int tmp = i;
//
//      rbArr[i].setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//          Log.d("rd::", tmp + "");
//          changeImageView(tmp);
//        }
//
//        private void changeImageView(int tmp) {
//          for (int i = 0; i < rbArr.length; i++) {
//            imgArr[i].setVisibility((tmp == 1) ? View.VISIBLE : View.INVISIBLE);
//          }
//        }
//      });
//
//    }
//
//
//      //체크박스 클릭시 이미지 보이게
//      cb1.setChecked(true);
//      img1 = findViewById(R.id.imageView);
//      img2 = findViewById(R.id.imageView2);
//      img3 = findViewById(R.id.imageView3);
//      cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//        @Override
//        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//          if (cb1.isChecked()) {
//            img1.setVisibility(View.VISIBLE);
//            img2.setVisibility(View.INVISIBLE);
//            img3.setVisibility(View.INVISIBLE);
//          }
//        }
//      });
//
//
//      cb2.setChecked(false);
//      cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//        @Override
//        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//          if (cb2.isChecked()) {
//            img1.setVisibility(View.INVISIBLE);
//            img2.setVisibility(View.VISIBLE);
//            img3.setVisibility(View.INVISIBLE);
//          }
//        }
//      });
//
//      cb3.setChecked(false);
//      cb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//        @Override
//        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//          if (cb3.isChecked()) {
//            img1.setVisibility(View.INVISIBLE);
//            img2.setVisibility(View.INVISIBLE);
//            img3.setVisibility(View.VISIBLE);
//          }
//        }
//      });
//
//    }
//  }








