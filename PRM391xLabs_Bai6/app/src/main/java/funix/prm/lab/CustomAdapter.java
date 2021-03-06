package funix.prm.lab;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    private Context mContent;
    private String mCountryList[];
    private int mFlag [];
    private LayoutInflater mInflater;

    public CustomAdapter (Context applicationContext, String[] countryList, int [] flags) {
        this.mContent = applicationContext;
        this.mCountryList = countryList;
        this.mFlag = flags;
        mInflater = (LayoutInflater.from(mContent));
    }

    @Override
    public int getCount() {
        return mCountryList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = mInflater.inflate(R.layout.row_item, null);
        TextView country = view.findViewById(R.id.textView);
        ImageView icon = view.findViewById(R.id.icon);
        country.setText(mCountryList[i]);
        icon.setImageResource(mFlag[i]);
        return view;
    }
}
