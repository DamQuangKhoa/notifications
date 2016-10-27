package notifications.sunlegend.notifications;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class TableRow extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] textview;
    private final Integer[] image;
    public TableRow(Activity context, Integer[] image, String[] textview) {
        super(context,R.layout.table_layout, textview);
        this.context = context;
        this.image = image;
        this.textview = textview;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.table_layout, null, true);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageview);
        TextView text = (TextView) rowView.findViewById(R.id.textview);
        imageView.setImageResource(image[position]);
        text.setText(textview[position]);
        return rowView;
    }
}
