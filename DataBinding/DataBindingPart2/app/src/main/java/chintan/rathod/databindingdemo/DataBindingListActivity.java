package chintan.rathod.databindingdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import chintan.rathod.databindingdemo.Model.User;
import chintan.rathod.databindingdemo.adapter.UserAdapter;
import chintan.rathod.databindingdemo.databinding.MainActivityBinding;

public class DataBindingListActivity extends AppCompatActivity {

    private RecyclerView list;

    private UserAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.binding_list_activity);

        list = (RecyclerView) findViewById(R.id.list);
        list.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        User user1 = new User("Chintan Rathod",28);
        User user2 = new User("Saroj Rathod",27);
        User user3 = new User("Maulik Rathod",25);

        ArrayList<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        adapter = new UserAdapter(userList);
        list.setAdapter(adapter);
    }
}
