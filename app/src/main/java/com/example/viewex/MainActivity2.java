package com.example.viewex;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity2 extends AppCompatActivity {

  private Button btnToast, btnSnackbar;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main2);

    findViewById(R.id.btnToast).setOnClickListener(v -> {
      LayoutInflater inf = getLayoutInflater();
      View customView = inf.inflate(
        R.layout.toastborder, (ViewGroup) findViewById(R.id.toast_layout_root));
      TextView toastTextView = customView.findViewById(R.id.text);

      Toast customToast = new Toast(this);
      toastTextView.setText("Custom Toast");
      customToast.setGravity(Gravity.CENTER,0,-100);
      customToast.setDuration(Toast.LENGTH_LONG);
      customToast.setView(customView);
      customToast.show();
    });

    findViewById(R.id.btnSnackbar).setOnClickListener( v ->{
      Snackbar.make(v, "스낵바 입니다. 참신합니까?", Snackbar.LENGTH_LONG).show();
    });
  }
}