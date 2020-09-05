package com.yujuncheol.android.mobilept.UI.Login;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.yujuncheol.android.mobilept.R;
import com.yujuncheol.android.mobilept.UI.Adduser.AdduserActivity;


import Data.Message;
import Data.Resource;
import Socket.ConnectSocket;


public class LogFragment extends Fragment implements View.OnClickListener , Resource {
    private Button btn_login;
    private EditText edt_id, edt_pw;
    private TextView tv_add, tv_find;

    public LogFragment() {
    }

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_log, container, false);


        tv_add = (TextView) root.findViewById(R.id.login_tv_adduser);
        edt_id = (EditText) root.findViewById(R.id.login_edt_ID);
        edt_pw = (EditText) root.findViewById(R.id.login_edt_PW);

        btn_login = (Button) root.findViewById(R.id.login_btn_login);


        btn_login.setOnClickListener(this);
        tv_add.setOnClickListener(this);

        return root;
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.login_btn_login:
                user.setUserid(edt_id.getText().toString());
                user.setUserpw(edt_pw.getText().toString());
                new ConnectSocket(Message.Login);
                return;
            case R.id.login_tv_adduser:
                Intent login = new Intent(getActivity(), AdduserActivity.class);
                startActivity(login);
        }
    }
}
