package ir.amirhossein.ma_movie;

import android.content.ClipData;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.filme.ma_movie.R;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

    private List<List<ClipData.Item>> dataList;

    public MainAdapter(List<List<ClipData.Item>> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        List<ClipData.Item> itemList = dataList.get(position);
        holder.titleTextView.setText("Title " + (position + 1));
        holder.innerRecyclerView.setAdapter(new InnerAdapter(itemList));
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    static class MainViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView;
        RecyclerView innerRecyclerView;

        MainViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.titleTextView);
            innerRecyclerView = itemView.findViewById(R.id.innerRecyclerView);
            innerRecyclerView.setLayoutManager(new LinearLayoutManager(itemView.getContext(), LinearLayoutManager.HORIZONTAL, false));
        }
    }

    static class InnerAdapter extends RecyclerView.Adapter<InnerAdapter.InnerViewHolder> {

        private List<ClipData.Item> itemList;

        InnerAdapter(List<ClipData.Item> itemList) {
            this.itemList = itemList;
        }

        public InnerAdapter(List<ClipData.Item> itemList) {
        }

        public InnerAdapter(List<ClipData.Item> itemList) {
        }

        public InnerAdapter(List<ClipData.Item> itemList) {
        }

        @NonNull
        @Override
        public InnerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie, parent, false);
            return new InnerViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull InnerViewHolder holder, int position) {
            ClipData.Item item = itemList.get(position);
            holder.imageView.setImageResource(item.getImageResource());
            holder.textView.setText(item.getText());
        }

        @Override
        public int getItemCount() {
            return itemList.size();
        }

        static class InnerViewHolder extends RecyclerView.ViewHolder {
            ImageView imageView;
            TextView textView;

            InnerViewHolder(@NonNull View itemView) {
                super(itemView);
                imageView = itemView.findViewById(R.id.image_view);
                textView = itemView.findViewById(R.id.text_view);
            }
        }
    }
}