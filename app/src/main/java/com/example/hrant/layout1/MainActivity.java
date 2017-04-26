package com.example.hrant.layout1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

//    --------------------1st method------------------------
//public class MainActivity extends AppCompatActivity{

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        RelativeLayout m_Layout = (RelativeLayout) findViewById(R.id.m_layout);
//        RelativeLayout f_Layout = (RelativeLayout) findViewById(R.id.f_layout);
//        m_Layout.setOnClickListener(m_LayoutListener);
//        f_Layout.setOnClickListener(f_LayoutListener);
//    }
//
//
//    private View.OnClickListener m_LayoutListener = new View.OnClickListener() {
//        public void onClick(View v) {
//            if(findViewById(R.id.m_pic).getVisibility() == View.VISIBLE)
//                findViewById(R.id.m_pic).setVisibility(View.GONE);
//            else {
//                findViewById(R.id.f_pic).setVisibility(View.GONE);
//                findViewById(R.id.m_pic).setVisibility(View.VISIBLE);
//            }
//        }
//    };
//
//    private View.OnClickListener f_LayoutListener = new View.OnClickListener() {
//        public void onClick(View v) {
//            if(findViewById(R.id.f_pic).getVisibility() == View.VISIBLE)
//                findViewById(R.id.f_pic).setVisibility(View.GONE);
//            else {
//                findViewById(R.id.m_pic).setVisibility(View.GONE);
//                findViewById(R.id.f_pic).setVisibility(View.VISIBLE);
//            }
//        }
//    };

//-----------------------------2nd method ----------------------------------------
//public class MainActivity extends AppCompatActivity{
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        RelativeLayout m_Layout = (RelativeLayout) findViewById(R.id.m_layout);
//        RelativeLayout f_Layout = (RelativeLayout) findViewById(R.id.f_layout);
//
//        m_Layout.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                if(findViewById(R.id.m_pic).getVisibility() == View.VISIBLE)
//                    findViewById(R.id.m_pic).setVisibility(View.GONE);
//                else {
//                    findViewById(R.id.f_pic).setVisibility(View.GONE);
//                    findViewById(R.id.m_pic).setVisibility(View.VISIBLE);
//                }
//            }});
//
//        f_Layout.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                if(findViewById(R.id.f_pic).getVisibility() == View.VISIBLE)
//                    findViewById(R.id.f_pic).setVisibility(View.GONE);
//                else {
//                    findViewById(R.id.m_pic).setVisibility(View.GONE);
//                    findViewById(R.id.f_pic).setVisibility(View.VISIBLE);
//                }
//            }});
//    }
//}


//      --------------------3th method--------------------------------------
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Capture our button from layout
        RelativeLayout m_Layout = (RelativeLayout) findViewById(R.id.m_layout);
        RelativeLayout f_Layout = (RelativeLayout) findViewById(R.id.f_layout);
        // Register the onClick listener with the implementation above
        m_Layout.setOnClickListener(this);
        f_Layout.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()){
            case R.id.m_layout :
                if(findViewById(R.id.m_pic).getVisibility() == View.VISIBLE)
                    findViewById(R.id.m_pic).setVisibility(View.GONE);
                else {
                    findViewById(R.id.f_pic).setVisibility(View.GONE);
                    findViewById(R.id.m_pic).setVisibility(View.VISIBLE);
                }
            break;
            case R.id.f_layout :
                if(findViewById(R.id.f_pic).getVisibility() == View.VISIBLE)
                    findViewById(R.id.f_pic).setVisibility(View.GONE);
                else {
                    findViewById(R.id.m_pic).setVisibility(View.GONE);
                    findViewById(R.id.f_pic).setVisibility(View.VISIBLE);
                }
            break;
        }
    }
}