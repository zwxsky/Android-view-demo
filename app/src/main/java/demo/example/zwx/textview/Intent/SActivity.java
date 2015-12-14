package demo.example.zwx.textview.Intent;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import demo.example.zwx.textview.R;

/**
 * Created by luo on 15-11-10.
 */
public class SActivity extends Activity{
    private Button bt;
    private String content ="hello";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sactivity);
//        第二个也页面什么时候给第一个页面回传数据
//        回传给第一个页面实际上是一个Intent对象
        Intent data =getIntent();
        if(data != null){
            content =data.getStringExtra("content");

        }
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(content);

        bt = (Button) findViewById(R.id.button1);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent data =getIntent();
                TextView textView = (TextView) findViewById(R.id.textView);

                content =textView.getText().toString();
                Log.i("TAG", content);
                data.putExtra("content", content);
                setResult(2, data);



                finish();  //结束当前页面
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        setContentView(R.layout.sactivity);
        Log.i("TAG", "requestCode" + requestCode);
        Log.i("TAG","resultCode"+resultCode);
        String content = data.getStringExtra("content");
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(content);

    }
}

