package com.example.viewex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TextActivity extends AppCompatActivity {

  private EditText edName, edId, edPass, edRepass, edMobile;
  private Button button;

  @Override
  protected void onCreate(Bundle savedInstanceState) {


    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_text);

    edName = findViewById(R.id.editName);
    edId = findViewById(R.id.editId);
    edPass = findViewById(R.id.editPass);
    edRepass = findViewById(R.id.editRePass);
    edMobile = findViewById(R.id.editMobile);
    button = findViewById(R.id.btnJoin);
    
    //유효성 검사
    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        if(edName.getText().toString().equals("")){
          edName.setHint("Please Check the Name!");
          edName.requestFocus();
          return;
        }
        if(edId.getText().toString().equals("")){
          edId.setHint("Please Check the Id!");
          edId.requestFocus();
          return;
        }

        if(!edRepass.getText().toString().equals(edPass.getText())){
          edPass.setText("");
          edRepass.setText("");
          edPass.setHint("Please Check the PassWord!");
          edPass.requestFocus();
          return;
        }
        if(edMobile.getText().toString().equals("")){
          edMobile.setHint("Please Check the Mobile!");
          edMobile.requestFocus();
          return;
        }
      }
    });
  }
}