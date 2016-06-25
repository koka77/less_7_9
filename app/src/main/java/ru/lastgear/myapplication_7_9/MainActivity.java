package ru.lastgear.myapplication_7_9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static  final  String TAG = "MyLog";

    TextView tv1;
    Button bt1, bt2, bt3;
    ImageView iv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        tv1 = (TextView) findViewById(R.id.tv1);

        iv1 = (ImageView) findViewById(R.id.iv1);

        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.bt1:
                        tv1.setText("Нажата кнопка 1");
                        break;
                    case R.id.bt2:
                        tv1.setText("Нажата кнопка 2");
                        break;
                    case R.id.bt3:
                        tv1.setText("Нажата кнопка 3");
                        break;
                }
            }
        };

        bt1.setOnClickListener(onClickListener);
        bt2.setOnClickListener(onClickListener);
        bt3.setOnClickListener(onClickListener);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText("Large Text");
            }
        });

        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv1.setImageDrawable(getResources().getDrawable(R.drawable.ic_camera_black_48dp));
                Log.d(TAG, iv1.getDrawable().toString());
            }
        });


    }
}
