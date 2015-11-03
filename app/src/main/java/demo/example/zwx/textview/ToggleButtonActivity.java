package demo.example.zwx.textview;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends ActionBarActivity implements CompoundButton.OnCheckedChangeListener{
    ToggleButton tg1,tg2;
    Button b1;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);

        tg1=(ToggleButton)findViewById(R.id.toggleButton);
        tg2=(ToggleButton)findViewById(R.id.toggleButton2);

        b1=(Button)findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer result = new StringBuffer();
                result.append("You have clicked first ON Button-:) ").append(tg1.getText());
                result.append("\nYou have clicked Second ON Button -:) ").append(tg2.getText());
                Toast.makeText(ToggleButtonActivity.this, result.toString(), Toast.LENGTH_SHORT).show();
            }
        });

        img = (ImageView)findViewById(R.id.imageView);

        tg1.setOnCheckedChangeListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_toggle_button, menu);
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

    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){

        img.setBackgroundResource(isChecked?R.drawable.on:R.drawable.off);
    }
}
