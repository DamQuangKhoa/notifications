package notifications.sunlegend.notifications;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView list;
    String[] listtextview = {
            "Hinh 1 có chữ dài ơi là dài, xuống hàng không có bị lỗi, kích thước text làm sao mà thay đổi ta",
            "Hinh 2",
            "Hinh 3",
            "Hinh 4",
    } ;
    Integer[] listimage = {
            R.drawable.picture3,
            R.drawable.picture2,
            R.drawable.picture1,
            R.drawable.ic_stat_name

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TableRow adapter = new
                TableRow(MainActivity.this, listimage, listtextview);
        list = (ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

            }
        });
    }
}
