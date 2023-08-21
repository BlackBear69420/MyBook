package com.example.mybook.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mybook.R;
import com.example.mybook.models.TextBook;

import java.util.List;

public class TextBookAdapter extends RecyclerView.Adapter<TextBookAdapter.TextBookHolder> {

    List<TextBook> list;
    Activity activity;

    public TextBookAdapter(List<TextBook> list, Activity activity) {
        this.list = list;
        this.activity = activity;
    }

    @NonNull
    @Override
    public TextBookHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TextBookHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_text,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull TextBookHolder holder, int position) {
        TextBook textBook=list.get(position);
        holder.chapterName.setText(textBook.getChapterName());
        holder.chapter.setText(textBook.getChapter());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class TextBookHolder extends RecyclerView.ViewHolder{
        TextView chapterName,chapter;

        public TextBookHolder(@NonNull View itemView) {
            super(itemView);

            chapterName=itemView.findViewById(R.id.textbook_chapterName);
            chapter=itemView.findViewById(R.id.text_book_content);
        }
    }
}
