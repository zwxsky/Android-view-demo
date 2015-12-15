package demo.example.zwx.textview.Intent;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import demo.example.zwx.textview.R;

/**
 * Created by luo on 15-11-10.
 */
public class FActivity extends Activity{

    private Button bt1;
    private Button bt2;
    private Button bt3;

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.factivity);
        /*
        通过点击bt1实现页面跳转
        pic1.startActivity 的方式来实现

         */

        context = this;
        bt1= (Button) findViewById(R.id.button1_first);
        //注册点击事件
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* 第一个参数，上下文对象this，第二个参数，目标文件*/
                Intent intent = new Intent(context, SActivity.class);
                startActivity(intent);

            }
        });

        /*通过startActivityForresult*/

        bt2 = (Button) findViewById(R.id.button2_second);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context,SActivity.class);
                intent.putExtra("content","这是第一个activity的button2点击过来的");
                /*
                第二个参数是请求的标志,可以知道是哪个activity过去的
                * */
//                String requestCode = "hello sactivity";
                startActivityForResult(intent, 1);
            }
        });

        bt3 = (Button) findViewById(R.id.button3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context,SActivity.class);
                intent.putExtra("content","这是第一个页面的button3点击过来的");

                startActivityForResult(intent,3);
            }
        });


    }


    /*  通过startActivityForresult跳转，接受返回参数的方法
        requestCode:请求的标识
        resultCode:第二个页面返回的标识
        data:第二个页面回传的数据
    */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode ==1 && resultCode==2){
            String content = data.getStringExtra("content");
//            String content = "第二个按钮回传的数据";
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText(content);
        }
        if(requestCode ==3 && resultCode==2){
            String content = data.getStringExtra("content");
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText(content);
        }
    }
}
