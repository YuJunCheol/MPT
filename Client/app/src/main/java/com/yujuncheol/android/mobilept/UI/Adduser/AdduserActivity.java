package com.yujuncheol.android.mobilept.UI.Adduser;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.yujuncheol.android.mobilept.R;

import Data.Message;
import Data.Resource;
import Socket.ConnectSocket;

public class AdduserActivity extends AppCompatActivity implements View.OnClickListener, Resource {
    private EditText edt_id,edt_pw,edt_name;
    private Button btn_add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adduser);
        edt_id = findViewById(R.id.adduser_edt_id);
        edt_pw = findViewById(R.id.adduser_edt_pw);
        edt_name = findViewById(R.id.adduser_edt_nikname);

        btn_add = findViewById(R.id.adduser_btn_add);
        btn_add.setOnClickListener(this);
    }

    public void onClick(View b){
        switch(b.getId()){
            case R.id.adduser_btn_add:
                user.setUserid(edt_id.getText().toString());
                user.setUserpw(edt_pw.getText().toString());
                user.setPname(edt_name.getText().toString());
                new ConnectSocket(Message.AddUser);
                return;
        }
    }
}
