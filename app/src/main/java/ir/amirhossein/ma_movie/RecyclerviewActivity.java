package ir.amirhossein.ma_movie;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Movie;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.filme.ma_movie.R;

import java.util.List;

public class MyActivity extends AppCompatActivity {

    private RecyclerView recyclerNewView, recyclerBestView;
    private List<Movie> myNewList, myBestList;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_movie);

        // Find the RecyclerViews by their IDs
        recyclerNewView = findViewById(R.id.recycler_new_view);
        recyclerBestView = findViewById(R.id.recycler_best_view);

        // Set the LayoutManager for the RecyclerViews
        LinearLayoutManager layoutManagerNew = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerNewView.setLayoutManager(layoutManagerNew);

        LinearLayoutManager layoutManagerBest = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerBestView.setLayoutManager(layoutManagerBest);

        // Create the adapter for the RecyclerViews
        MyAdapter adapterNew = new MyAdapter(this, myNewList);
        recyclerNewView.setAdapter(adapterNew);

        MyAdapter adapterBest = new MyAdapter(this, myBestList);
        recyclerBestView.setAdapter(adapterBest);

        // Load the movie data from the database
        loadMovieData();
    }

    private void loadMovieData() {
        // Load the movie data from the database using Room or any other database library
        // Set the myNewList and myBestList variables based on the data
        // Call the notifyDataSetChanged() method on the adapters to update the RecyclerViews
    }

    // Define the RecyclerView Adapter
    private class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

        private Context context;
        private List<Movie> movieList;

        public MyAdapter(Context context, List<Movie> movieList) {
            this.context = context;
            this.movieList = movieList;
        }

        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_movie, parent, false);
            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            Movie movie = movieList.get(position);
            holder.titleTextView.setText(movie.getTitle());
            holder.descriptionTextView.setText(movie.getDescription());
            // Load the image from the URL
            Glide.with(context).load(movie.getImageUrl()).into(holder.imageView);
        }

        @Override
        public int getItemCount() {
            return movieList.size();
        }
    }

    // Define the RecyclerView ViewHolder
    private static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView, descriptionTextView;
        ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.text_view);
            descriptionTextView = itemView.findViewById(R.id.image_view);
            imageView = itemView.findViewById(R.id.image_view);
        }
    }
}