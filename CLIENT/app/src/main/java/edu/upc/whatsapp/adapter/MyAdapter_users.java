package edu.upc.whatsapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import edu.upc.whatsapp.R;
import entity.UserInfo;

import java.util.List;

/**
 * @Authors: BLANCO CAAMANO, Ramon <ramonblancocaamano@gmail.com>
 * GREGORIO DURANTE, Nicola <ng.durante@gmail.com>
 */
public class MyAdapter_users extends BaseAdapter {

    Context context;
    public List<UserInfo> users;

    public MyAdapter_users(Context context, List<UserInfo> users) {
        this.context = context;
        this.users = users;
    }

    public int getCount() {
        return users.size();
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.row_twotextviews, parent, false);
        }

        TextView nameView = (TextView) convertView.findViewById(R.id.row_twotextviews_name);
        TextView surnameView = (TextView) convertView.findViewById(R.id.row_twotextviews_surname);
        UserInfo userInfo = users.get(position);

        nameView.setText(userInfo.getName());
        surnameView.setText(userInfo.getSurname());

        return convertView;
    }

    public Object getItem(int arg0) {
        return users.get(arg0);
    }

    public long getItemId(int arg0) {
        return users.get(arg0).getId();
    }
}
