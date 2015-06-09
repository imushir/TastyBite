package com.example.mushirahmed.tastybite.slidingtabactivity;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.mushirahmed.tastybite.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import static com.example.mushirahmed.tastybite.slidingtabactivity.SlidingTabBasicFragment.*;


/**
 * Created by mushirahmed on 1/6/15.
 */
public class CustomListAdapter extends BaseAdapter
{
    private int[] colors = new int[]{0xAAf6ffc8, 0xAA538d00};
    private LayoutInflater mInflater;

    //The variable that will hold our text data to be tied to list
    //private String[] data;
    private List<String> data;

    public CustomListAdapter(Context context,List<String> items)
    {
        mInflater = LayoutInflater.from(context);
        this.data = items;
    }
    @Override
    public int getCount()
    {
        return this.data.size();
    }
    @Override
    public Object getItem(int position)
    {
        return position;
    }
    @Override
    public long getItemId(int position)
    {

        return position;

    }
    //A view to hold each row in the list
    @Override
    public View getView(int position,View convertView,ViewGroup parent)
    {
        //A ViewHolder keeps references to children views to avoid unneccessary calls
        // to findViewById() on each row.
        ViewHolder viewHolder;
        if(convertView == null)
        {
            convertView = mInflater.inflate(R.layout.list_custom_items,null);
            viewHolder = new ViewHolder();
            viewHolder.txtItemNm = (TextView)convertView.findViewById(R.id.txt_cst_itm_nm);
            viewHolder.txtItemPrc = (TextView)convertView.findViewById(R.id.txt_cst_itm_prc);
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder = (ViewHolder)convertView.getTag();

        }
        Log.v("Array List Size ", Integer.toString(getCount()));
        
        //Bind the data efficiently with the holder.
        for(int i =0;i<data.size();i++)
        {
            if(position == i)
            {
                String list_contains = data.get(i);
                String[] parts = list_contains.split(":");
                String item_name = parts[0];
                String item_price = parts[1];
                viewHolder.txtItemNm.setText(item_name);
                viewHolder.txtItemPrc.setText("Rs."+item_price);
            }
        }

        return convertView;




    }





}
