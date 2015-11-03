package demo.example.zwx.textview;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtView = (TextView) findViewById(R.id.text_id);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void showEditText(View view){

        Intent intent = new Intent(this,EditTextActivity.class);
        startActivity(intent);
    }

    public void showAutoCompleteTextView(View view){

        startActivity(new Intent(this,AutoCompleteTextViewActivity.class));
    }

    public void showButton(View view){

        startActivity(new Intent(this,ButtonActivity.class));
    }

    public void showImageButton(View view){

        startActivity(new Intent(this,ImageButtonActivity.class));
    }

    public void showCheckboxButton(View view){

        startActivity(new Intent(this,CheckBoxActivity.class));
    }

    public void showToggleButton(View view){

        startActivity(new Intent(this,ToggleButtonActivity.class));
    }

    public void showDatepicker(View view){

        startActivity(new Intent(this,DatePickerActivity.class));
    }

    public void showSpinner(View view){

        startActivity(new Intent(this,SpinnerActivity.class));
    }

    public void showProcessBar(View view){

        startActivity(new Intent(this,ProcessBarActivity.class));
    }

    public void showRadioButton(View view){

        startActivity(new Intent(this,RadioButtonActivity.class));
    }

    public void  showMarqueeButton(View view){

        startActivity(new Intent(this,MarqueeActivity.class));
    }

    public void showMultiAutoCompleteTextView(View view){

        startActivity(new Intent(this,MultiAutoCompleteTextViewActivity.class));
    }



}
