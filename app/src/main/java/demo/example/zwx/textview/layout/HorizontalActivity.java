package demo.example.zwx.textview.layout;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;

import demo.example.zwx.textview.R;
import demo.example.zwx.textview.View.HorizontalListView;
import demo.example.zwx.textview.adapter.HorizontalListViewAdapter;

public class HorizontalActivity extends Activity {

    HorizontalListView hListView;
    HorizontalListViewAdapter hListViewAdapter;
    ImageView previewImg;
    View olderSelectView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizaontal);
        initUI();
    }



    public void initUI() {
        hListView = (HorizontalListView) findViewById(R.id.horizon_listview);
        previewImg = (ImageView) findViewById(R.id.image_preview);
        String[] titles = {"怀师", "南怀瑾军校", "闭关", "南怀瑾", "南公庄严照", "怀师法相"};
        final int[] ids = {R.drawable.pic1, R.drawable.pic2,
                R.drawable.pic3, R.drawable.pic4,
                R.drawable.pic5,R.drawable.pic6};
        hListViewAdapter = new HorizontalListViewAdapter(getApplicationContext(), titles, ids);
        hListView.setAdapter(hListViewAdapter);
        //      hListView.setOnItemSelectedListener(new OnItemSelectedListener() {
        //
        //          @Override
        //          public void onItemSelected(AdapterView<?> parent, View view,
        //                  int position, long id) {
        //              // TODO Auto-generated method stub
        //              if(olderSelected != null){
        //                  olderSelected.setSelected(false); //上一个选中的View恢复原背景
        //              }
        //              olderSelected = view;
        //              view.setSelected(true);
        //          }
        //
        //          @Override
        //          public void onNothingSelected(AdapterView<?> parent) {
        //              // TODO Auto-generated method stub
        //
        //          }
        //      });
        hListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
//              if(olderSelectView == null){
//                  olderSelectView = view;
//              }else{
//                  olderSelectView.setSelected(false);
//                  olderSelectView = null;
//              }
//              olderSelectView = view;
//              view.setSelected(true);
                previewImg.setImageResource(ids[position]);
                hListViewAdapter.setSelectIndex(position);
                hListViewAdapter.notifyDataSetChanged();

            }
        });

    }
}
