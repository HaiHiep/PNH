package com.vietis.pnh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText txtAuthenCode;
    private Button btnLogin;
    private TextView txtForgotCode;
    private RelativeLayout btnGuide;
    private RelativeLayout btnRecover;
    private RelativeLayout btnDoctorInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initWidget();

        btnLogin.setOnClickListener(this);
        txtForgotCode.setOnClickListener(this);
        btnGuide.setOnClickListener(this);
        btnRecover.setOnClickListener(this);
        btnDoctorInfo.setOnClickListener(this);
    }

    public void initWidget() {
        txtAuthenCode   = (EditText) findViewById(R.id.txtAuthenCode);
        btnLogin        = (Button) findViewById(R.id.btnLogin);
        txtForgotCode   = (TextView) findViewById(R.id.txtForgotCode);
        btnGuide        = (RelativeLayout) findViewById(R.id.btnGuide);
		btnRecover      = (RelativeLayout) findViewById(R.id.btnRecover);
        btnDoctorInfo   = (RelativeLayout) findViewById(R.id.btnDoctorInfo);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnLogin:
				Toast.makeText(this, "btnLogin", Toast.LENGTH_SHORT).show();
                break;
            case R.id.txtForgotCode:
				Toast.makeText(this, "txtForgotCode", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnGuide:
				Toast.makeText(this, "btnGuide", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnRecover:
				Toast.makeText(this, "btnRecover", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnDoctorInfo:
				Toast.makeText(this, "btnDoctorInfo", Toast.LENGTH_SHORT).show();
                break;
			default:
				break;
        }
    }
}
