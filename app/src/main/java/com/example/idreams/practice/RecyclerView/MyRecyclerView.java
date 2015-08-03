package com.example.idreams.practice.RecyclerView;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.example.idreams.practice.R;

import java.util.ArrayList;


public class MyRecyclerView extends AppCompatActivity {
    private MyRecyclerViewAdapter adapter;
    private RecyclerView rvUsers;
    private ArrayList<User> items;
    private SwipeRefreshLayout swipeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_recycler_view);

        swipeLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_container);
        swipeLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                // Your code to refresh the list here.
                // Make sure you call swipeContainer.setRefreshing(false)
                // once the network request has completed successfully.
                // Remember to CLEAR OUT old items before appending in the new ones
                adapter.clear();
                // ...the data has come back, add new items to your adapter...
                adapter.addAll(setThronesCharacters());
                // Now we call setRefreshing(false) to signal refresh has finished
                swipeLayout.setRefreshing(false);

            }
        });

        swipeLayout.setColorSchemeResources(android.R.color.holo_blue_bright,
                android.R.color.holo_green_light,
                android.R.color.holo_orange_light,
                android.R.color.holo_red_light);


        rvUsers = (RecyclerView) findViewById(R.id.rvUsers);
        // Create adapter passing in the sample user data
        adapter = new MyRecyclerViewAdapter(this, getThronesCharacters());
        // Attach the adapter to the recyclerview to populate items
        rvUsers.setAdapter(adapter);
        // Set layout manager to position the items
        rvUsers.setLayoutManager(new LinearLayoutManager(this));
        // That's all!



        //Show divide line
        RecyclerView.ItemDecoration itemDecoration = new
                DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST);
        rvUsers.addItemDecoration(itemDecoration);

    }

    private ArrayList<User> getThronesCharacters() {
        items = new ArrayList<>();
        items.add(new User("Dany Targaryen", "Valyria"));
        items.add(new User("Rob Stark", "Winterfell"));
        items.add(new User("Jon Snow", "Castle Black"));
        items.add(new User("Tyrion Lanister", "King's Landing"));
        return items;
    }
    private ArrayList<User> setThronesCharacters() {
        items = new ArrayList<>();
        items.add(new User("Tyrion Lanister", "King's Landing"));
        items.add(new User("Jon Snow", "Castle Black"));
        items.add(new User("Rob Stark", "Winterfell"));
        items.add(new User("Dany Targaryen", "Valyria"));

        return items;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_recycler_view, menu);
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
            // Add a new user
            items.remove(0);
            // Notify the adapter
            adapter.notifyItemRemoved(0);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
//    public void fetchTimelineAsync(int page) {
//        client.getHomeTimeline(0, new JsonHttpResponseHandler() {
//            public void onSuccess(JSONArray json) {
//                // Remember to CLEAR OUT old items before appending in the new ones
//                adapter.clear();
//                // ...the data has come back, add new items to your adapter...
//                adapter.addAll(...);
//                // Now we call setRefreshing(false) to signal refresh has finished
//                swipeContainer.setRefreshing(false);
//            }
//
//            public void onFailure(Throwable e) {
//                Log.d("DEBUG", "Fetch timeline error: " + e.toString());
//            }
//        });
//    }

}
