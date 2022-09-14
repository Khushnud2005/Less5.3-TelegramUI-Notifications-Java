package uz.exemple.less53_telegramui_notifications_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import uz.exemple.less53_telegramui_notifications_java.adapter.MainAdapter;
import uz.exemple.less53_telegramui_notifications_java.model.ItemModel;
import uz.exemple.less53_telegramui_notifications_java.model.MainModel;

public class MainActivity extends AppCompatActivity {
    private List<MainModel> mList;
    private ArrayList<ItemModel> list;
    private ArrayList<ItemModel> list2;
    private ArrayList<ItemModel> list3;
    private ArrayList<ItemModel> list4;
    private ArrayList<ItemModel> list5;
    private RecyclerView recyclerView;
    private MainAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }
    void initViews(){
        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        list = new ArrayList<ItemModel>();
        list.add(new ItemModel(R.drawable.ic_account,"Private Chats",null,true));
        list.add(new ItemModel(R.drawable.ic_groups,"Group Chats",null,false));
        list.add(new ItemModel(R.drawable.ic_sms,"Channels",null,true));

        list2 = new ArrayList<ItemModel>();
        list2.add(new ItemModel(null,"In-App Sounds",null,true));
        list2.add(new ItemModel(null,"In-App Vibrate",null,false));
        list2.add(new ItemModel(null,"In-App Preview",null,true));
        list2.add(new ItemModel(null,"In-Chat Sounds",null,true));

        list3 = new ArrayList<ItemModel>();
        list3.add(new ItemModel(null,"Show Badge Icon",null,true));
        list3.add(new ItemModel(null,"Include Muted Chats",null,false));
        list3.add(new ItemModel(null,"Count Unread Messages",null,true));

        list4 = new ArrayList<ItemModel>();
        list4.add(new ItemModel(null,"Contact joined Telegram",null,true));
        list4.add(new ItemModel(null,"Pinned Message",null,false));

        String text1 = "Relaunch app when shut down.Enable for reliable notifications.";
        String text2 = "Keep a low impact background connection to telegram for reliable notifications.";
        String text3 = "Relaunch app when shut down.Enable for reliable for notifications.";
        list5 = new ArrayList<ItemModel>();
        list5.add(new ItemModel(null,"Keep-Alive Service",text1,true));
        list5.add(new ItemModel(null,"Background Connection",text2,false));
        list5.add(new ItemModel(null,"Repeat Notifications",null,true));


        mList = new ArrayList<MainModel>();
        mList.add(new MainModel(list,"Message Notifications"));
        mList.add(new MainModel(list2,"In-App Notifications"));
        mList.add(new MainModel(list3,"Badge Counter"));
        mList.add(new MainModel(list4,"Events"));
        mList.add(new MainModel(list5,"Other"));

        adapter = new MainAdapter(mList);
        recyclerView.setAdapter(adapter);
    }
}