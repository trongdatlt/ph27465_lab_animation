package com.example.ph27465_lab_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.LinearLayout;

public class LoginActivity extends AppCompatActivity {
    LinearLayout layout_Account;
    LinearLayout layout_MatKhau;
    Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        layout_Account = findViewById(R.id.ln_taikhoan);
        layout_MatKhau = findViewById(R.id.ln_matkhau);
        btn_login = findViewById(R.id.btn_login);

        float x_tv = layout_Account.getX();
        float x_tv2 = layout_MatKhau.getX();

        AnimatorSet animatorSet = new AnimatorSet();
// tạo hiệu ứng:
        ObjectAnimator sangPhai = ObjectAnimator.ofFloat(layout_Account,"x",x_tv,150);
        sangPhai.setDuration(3000);
// tạo hiệu ứng sang trái
        ObjectAnimator sangTrai =ObjectAnimator.ofFloat(layout_MatKhau,"x",1200,150);
        sangTrai.setDuration(3000);
        ObjectAnimator lenTren =ObjectAnimator.ofFloat(btn_login,"y",2000,1700);
        sangTrai.setDuration(3000);

        animatorSet.playSequentially(sangPhai,sangTrai,lenTren);
        animatorSet.start();




    }
}