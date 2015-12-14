package demo.example.zwx.textview.control;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.NumberPicker;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import demo.example.zwx.textview.R;

public class ListViewActivity extends ActionBarActivity implements AdapterView.OnItemClickListener,AbsListView.OnScrollListener {

    private ListView listView;
    private ListView imgList;
    private ArrayAdapter<String> arr_adapter;

    private SimpleAdapter simpleAdapter;

    private List<Map<String,Object>> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = (ListView)findViewById(R.id.listView);



        imgList = (ListView)findViewById(R.id.imglist);


//        1.新建一个适配器
//        arrayAdapter(上下文，当前listview加载的每一个列表项所对应的布局文件，数据源)
        String[] arr_data = {"student1","student2","student3"};
//      2.适配器加载数据
        arr_adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr_data);
        //3.加载到视图
//        listView.setAdapter(arr_adapter);


        //simpleAdapter()
        /*
        * context:上下文
        * data: 数据源（List<? extends Map<String,?>> data） 一个Map所组成的List集合
        *       每一个map对应一条item
        *
        * resource: 布局文件
        * from: Map中的键名
        * to：布局文件中对应视图的ID，与from成对应关系
        * */

        dataList = new ArrayList<Map<String,Object>>();

        simpleAdapter = new SimpleAdapter(this,getData(),R.layout.item,new String[]{"pic","text"},new int[]{R.id.pic,R.id.text});
//        imgList.setAdapter(simpleAdapter);

//        imgList.setOnItemClickListener(this);
//        imgList.setOnScrollListener(this);

        listView.setAdapter(simpleAdapter);
        listView.setOnItemClickListener(this);
        listView.setOnScrollListener(this);


    }

    private List<Map<String, Object>> getData(){
        for(int i=0;i<20;i++){
            Map<String,Object>map = new HashMap<String,Object>();
            map.put("pic",R.drawable.abc);
            map.put("text","student"+i);
            dataList.add(map);
        }

        return dataList;
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        String text =listView.getItemIdAtPosition(position)+"";
        Toast.makeText(this,"position="+position+",text="+text,Toast.LENGTH_SHORT).show();
//        String text1 =imgList.getItemIdAtPosition(position)+"";
//        Toast.makeText(this,"position="+position+",text1="+text1,Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {
        switch (scrollState)
        {
            case SCROLL_STATE_FLING:
                Log.i("main","用户在手指离开之前，由于用力滑了一下，视图依靠惯性继续滑动");
                Map<String,Object> map = new HashMap<String,Object>();
                map.put("pic",R.drawable.abc);
                map.put("text","新增数据");
                dataList.add(map);
                simpleAdapter.notifyDataSetChanged();
                break;
            case SCROLL_STATE_IDLE:
                Log.i("main","视图已经停止滑动");break;
            case SCROLL_STATE_TOUCH_SCROLL:
                Log.i("main","手指没有离开屏幕，视图还在滑动");break;
        }

    }

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {


    }
}
