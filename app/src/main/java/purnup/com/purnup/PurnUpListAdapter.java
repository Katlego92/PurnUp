package purnup.com.purnup;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by katlegomoukangwe on 2015/08/18.
 */
public class PurnUpListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private String mdata[];

    //Holds the views to display and does the binding
    public static class HeaderViewHolder extends RecyclerView.ViewHolder {
        public HeaderViewHolder(View v) {
            super(v);
        }
    }

    public static class EventCardsViewHolder extends RecyclerView.ViewHolder {
        public EventCardsViewHolder(View v) {
            super(v);
        }
    }

    //Constructor holds the object which contains items to instantiate
    public PurnUpListAdapter(String mdata[]) {
        this.mdata = mdata;
    }

    @Override
    public int getItemViewType(int position) {
        if ( position == 0 ) {
            return 0;
        }
        else {
            return 1;
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        switch (viewType) {
            case 0 :
                View main_header = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.main_header, parent, false);
                return new HeaderViewHolder(main_header);

            case 1 :
                View event_card = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.purnup_main_list, parent, false);
                return new EventCardsViewHolder(event_card);

        }

        return new EventCardsViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.purnup_main_list, parent, false));
        }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    /**
     * Gets the total number of items
     * @return
     */
    @Override
    public int getItemCount() {
        return mdata.length;
    }
}
