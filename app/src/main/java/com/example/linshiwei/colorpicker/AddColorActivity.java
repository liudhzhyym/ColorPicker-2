package com.example.linshiwei.colorpicker;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.linshiwei.colorpicker.addcolor.InputButtonContainerView;
import com.example.linshiwei.colorpicker.addcolor.colormaker.ColorMakerView;

import static java.security.AccessController.getContext;

/**
 * Created by linshiwei on 2017/6/9.
 */

public class AddColorActivity extends AppCompatActivity {
    private static final String TAG = "AddColorActivity";

    private ImageView mColorIndicationView;
    private ColorMakerView mColorMakerView;
    private InputButtonContainerView mInputButtonContainerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_color);

        LinearLayout layout = (LinearLayout) findViewById(R.id.root_layout);
        mColorMakerView = (ColorMakerView) layout.findViewById(R.id.color_maker_view);

//        mColorMakerView =
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.animator.left_to_right,R.animator.right_to_left);
    }

//    public void onClickChangeModeButton(View v){
//
//        switch (v.getId()){
//            case R.id.buttonRGB:
//
//                break;
//            case R.id.buttonHEX:
//                Log.i(TAG,"HEX");
//
//                break;
//        }
//    }

    public void onClickNumberButton(View v){
        Button btn = (Button)v;
        String inputString = btn.getText().toString();
        Log.d(TAG,inputString);
        switch (inputString){
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "0":
            case "A":
            case "B":
            case "C":
            case "D":
            case "E":
            case "F":
                mColorMakerView.inputOneNumber(inputString);
                break;
            case "AC":
                mColorMakerView.clearAllTextFields();
                break;
            case "TAB":
                mColorMakerView.tapToFocusOnNextTextField();
                break;
        }
    }

    public void saveCurrentColor(View v){
        //
    }
}
