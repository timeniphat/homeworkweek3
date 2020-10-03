package com.example.homeworkweek3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyAdapter adapter = new MyAdapter();
        LinearLayoutManager lm = new LinearLayoutManager(MainActivity.this);
        RecyclerView rv = findViewById(R.id.word_lis_recycler_view);
        rv.setLayoutManager(lm);
        rv.setAdapter(adapter);
    }
}
class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    WordItem[] item = {
            new WordItem(R.drawable.a1,"LOVESICK GIRL","BLACKPINK"),
            new WordItem(R.drawable.a2,"DYNAMIET","BTS"),
            new WordItem(R.drawable.a3,"Blooming Day","EXO-CBX"),
            new WordItem(R.drawable.a4,"KOKOPOP","EXO"),
            new WordItem(R.drawable.a5,"ICE-CREAM","BLACKPINK x SELENA"),
            new WordItem(R.drawable.a6,"VIOLETA","IZ*ONE"),
            new WordItem(R.drawable.a7,"PSYCHO","REDVELVET"),
            new WordItem(R.drawable.a8,"REVEAL","THEBOYZ"),
            new WordItem(R.drawable.a9,"GOOD GUY","SF9"),
            new WordItem(R.drawable.a10,"MILIONS","WINNER")
    };
    public MyAdapter() {

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_world, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.imageView.setImageResource(item[position].imageResId);
        holder.wordTextView.setText(item[position].word);
        holder.wordTextView2.setText(item[position].word2);
    }

    @Override
    public int getItemCount() {
        return item.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView wordTextView;
        TextView wordTextView2;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);
            wordTextView = itemView.findViewById(R.id.word_text_view);
            wordTextView2 = itemView.findViewById(R.id.word_text_view2);
        }
    }
}