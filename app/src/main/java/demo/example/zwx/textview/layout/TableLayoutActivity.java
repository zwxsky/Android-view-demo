package demo.example.zwx.textview.layout;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import demo.example.zwx.textview.R;

public class TableLayoutActivity extends ActionBarActivity implements View.OnClickListener {

    //声明一些控件
    Button btn0=null;
    Button btn1=null;
    Button btn2=null;
    Button btn3=null;
    Button btn4=null;
    Button btn5=null;
    Button btn6=null;
    Button btn7=null;
    Button btn8=null;
    Button btn9=null;
//    Button btnBackspace=null;
//    Button btnCE=null;
    Button btnC=null;
    Button btnAdd=null;
    Button btnSub=null;
    Button btnMul=null;
    Button btnDiv=null;
    Button btnEqu=null;

    TextView tvResult=null;
    //声明两个参数。接收tvResult前后的值
    double num1=0,num2=0;
    double Result=0;//计算结果
    int op=0;//判断操作数，
    boolean isClickEqu=false;//判断是否按了“=”按钮



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);
        tvResult = (TextView) findViewById(R.id.textView2);

        btn0=(Button)findViewById(R.id.btn0);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
//        btnBackspace=(Button)findViewById(R.id.btnBackspace);
//        btnCE=(Button)findViewById(R.id.btnCE);
        btnC=(Button)findViewById(R.id.btnC);
        btnEqu=(Button)findViewById(R.id.btnEqu);
        btnAdd=(Button)findViewById(R.id.btnAdd);
        btnSub=(Button)findViewById(R.id.btnSub);
        btnMul=(Button)findViewById(R.id.btnMul);
        btnDiv=(Button)findViewById(R.id.btnDiv);



        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);


        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnEqu.setOnClickListener(this);
        btnC.setOnClickListener(this);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_table_layout, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void clear(View view){

        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setText("");

        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText("0");

    }

    public void plus(View view){
        TextView textView2=(TextView) findViewById(R.id.textView2);
        TextView textView1= (TextView) findViewById(R.id.textView1);
        textView1.setText(textView1.getText()+"+"+textView2.getText());
//        textView2.setText("0");
//        String[] str=

    }

    public void button1(View view){
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(textView2.getText()+"pic1");

    }

    public void button2(View view){
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(textView2.getText()+"pic2");

    }

    public void button3(View view){
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(textView2.getText()+"pic3");

    }

    public void button4(View view){
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(textView2.getText()+"pic4");

    }
    public void button5(View view){
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(textView2.getText()+"pic5");

    }

    public void button6(View view){
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(textView2.getText()+"pic5");

    }
    public void button7(View view){
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(textView2.getText()+"7");

    }
    public void button8(View view){
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(textView2.getText()+"8");

    }
    public void button9(View view){
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(textView2.getText()+"9");

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            //btnBackspace和CE--------------------
           /* case R.id.btnBackspace:
                String myStr = tvResult.getText().toString();
                try {
                    tvResult.setText(myStr.substring(0, myStr.length() - pic1));
                } catch (Exception e) {
                    tvResult.setText("");
                }

                break;*/
            case R.id.btnC:
                tvResult.setText(null);
                break;

            //btn0--9---------------------------
            case R.id.btn0:
                if (isClickEqu) {
                    tvResult.setText(null);
                    isClickEqu = false;
                }
                String myString = tvResult.getText().toString();
                myString += "0";
                tvResult.setText(myString);
                break;
            case R.id.btn1:
                if (isClickEqu) {
                    tvResult.setText(null);
                    isClickEqu = false;
                }
                String myString1 = tvResult.getText().toString();
                myString1 += "pic1";
                tvResult.setText(myString1);
                break;
            case R.id.btn2:
                if (isClickEqu) {
                    tvResult.setText(null);
                    isClickEqu = false;
                }
                String myString2 = tvResult.getText().toString();
                myString2 += "pic2";
                tvResult.setText(myString2);
                break;
            case R.id.btn3:
                if (isClickEqu) {
                    tvResult.setText(null);
                    isClickEqu = false;
                }
                String myString3 = tvResult.getText().toString();
                myString3 += "pic3";
                tvResult.setText(myString3);
                break;
            case R.id.btn4:
                if (isClickEqu) {
                    tvResult.setText(null);
                    isClickEqu = false;
                }
                String myString4 = tvResult.getText().toString();
                myString4 += "pic4";
                tvResult.setText(myString4);
                break;
            case R.id.btn5:
                if (isClickEqu) {
                    tvResult.setText(null);
                    isClickEqu = false;
                }
                String myString5 = tvResult.getText().toString();
                myString5 += "pic5";
                tvResult.setText(myString5);
                break;
            case R.id.btn6:
                if (isClickEqu) {
                    tvResult.setText(null);
                    isClickEqu = false;
                }
                String myString6 = tvResult.getText().toString();
                myString6 += "pic5";
                tvResult.setText(myString6);
                break;
            case R.id.btn7:
                if (isClickEqu) {
                    tvResult.setText(null);
                    isClickEqu = false;
                }
                String myString7 = tvResult.getText().toString();
                myString7 += "7";
                tvResult.setText(myString7);
                break;
            case R.id.btn8:
                if (isClickEqu) {
                    tvResult.setText(null);
                    isClickEqu = false;
                }
                String myString8 = tvResult.getText().toString();
                myString8 += "8";
                tvResult.setText(myString8);
                break;
            case R.id.btn9:
                if (isClickEqu) {
                    tvResult.setText(null);
                    isClickEqu = false;
                }
                String myString9 = tvResult.getText().toString();
                myString9 += "9";
                tvResult.setText(myString9);
                break;

            //btn+-*/=--------------------------------
            case R.id.btnAdd:
                String myStringAdd=tvResult.getText().toString();
                if(myStringAdd.equals(null))
                {
                    return;
                }
                num1=Double.valueOf(myStringAdd);
                tvResult.setText(null);
                op=1;
                isClickEqu=false;
                break;

            case R.id.btnSub:
                String myStringSub=tvResult.getText().toString();
                if(myStringSub.equals(null))
                {
                    return;
                }
                num1=Double.valueOf(myStringSub);
                tvResult.setText(null);
                op=2;
                isClickEqu=false;
                break;
            case R.id.btnMul:
                String myStringMul=tvResult.getText().toString();
                if(myStringMul.equals(null))
                {
                    return;
                }
                num1=Double.valueOf(myStringMul);
                tvResult.setText(null);
                op=3;
                isClickEqu=false;
                break;
            case R.id.btnDiv:
                String myStringDiv=tvResult.getText().toString();
                if(myStringDiv.equals(null))
                {
                    return;
                }
                num1=Double.valueOf(myStringDiv);
                tvResult.setText(null);
                op=4;
                isClickEqu=false;
                break;
            case R.id.btnEqu:
                String myStringEqu=tvResult.getText().toString();
                if(myStringEqu.equals(null))
                {
                    return;
                }
                num2=Double.valueOf(myStringEqu);
                tvResult.setText(null);
                switch (op) {
                    case 0:
                        Result=num2;
                        break;
                    case 1:
                        Result=num1+num2;
                        break;
                    case 2:
                        Result=num1-num2;
                        break;
                    case 3:
                        Result=num1*num2;
                        break;
                    case 4:
                        Result=num1/num2;
                        break;
                    default:
                        Result=0;
                        break;
                }
                tvResult.setText(String.valueOf(Result));
                isClickEqu=true;
                break;

            default:
                break;

        }


    }
}
