package com.example.test.model;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.example.test.R;
public class SpinnerAdapter extends BaseAdapter {
private int[] imgs= {R.drawable.spa,R.drawable.gym,R.drawable.giatla,
                     R.drawable.duadon };
private Context context;
    public SpinnerAdapter(Context context) {
        this.context = context;
    }
    @Override
    public int getCount() {
        return imgs.length;
    }
    @Override
    public Object getItem(int position) {
        return position;
    }
    @Override
    public long getItemId(int i) {
        return i;
    }
    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View item = LayoutInflater.from(context).inflate(R.layout.item_image,viewGroup, false);
        ImageView img=item.findViewById(R.id.img);
        img.setImageResource(imgs[position]);
        return item;
    }
}
