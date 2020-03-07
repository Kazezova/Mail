package com.example.mail;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public class MyAdapter extends RecyclerView.Adapter {
    MailListFragment.FragmentInteractionListener listener;
    Context mContext;
    public MyAdapter(Context context){
        mContext = context;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent,false);
        return new ListViewHolder(view, mContext);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ListViewHolder) holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return Mail.title.length;
    }

    private class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView itemText;
        private TextView itemSecondText;
        private TextView itemThirdText;
        private ImageView itemImage;
        Context context;
        int position;
        public ListViewHolder(View itemview, Context context){
            super(itemview);
            itemText=itemview.findViewById(R.id.people_name_txt);
            itemSecondText=itemview.findViewById(R.id.mail_txt);
            itemImage=itemview.findViewById(R.id.avatar);
            itemThirdText=itemview.findViewById(R.id.detail);
            itemview.setOnClickListener(this);
            this.context = context;
        }
        public void bindView (int position){
            this.position = position;
            itemText.setText(Mail.title[position]);
            itemSecondText.setText(Mail.information[position]);
            itemThirdText.setText(Mail.detail[position]);
            itemImage.setImageResource(Mail.picturePath[position]);
        }
        public void onClick(View view){
            String main=itemText.getText().toString();
            String inf=itemSecondText.getText().toString();
            String detail=itemThirdText.getText().toString();
            int image=Mail.picturePath[position];
            Bundle bundle=new Bundle();
            bundle.putString("Name", inf);
            bundle.putString("Mail", main);
            bundle.putString("Detail", detail);
            bundle.putInt("Image", image);
            MailDetailFragment mailDetailFragment=new MailDetailFragment();
            mailDetailFragment.setArguments(bundle);
            FragmentManager fragmentManager= ((AppCompatActivity)context).getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.detailMail,mailDetailFragment).commit();

        }

    }
    public interface OnNameClickListener{
        void onNameClick(int position);
    }
}

//public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ExampleViewHolder> {
//    private ArrayList<Mail> List;
//    private OnItemClickListener mListener;
//
//    public interface OnItemClickListener {
//        void onItemClick(int position);
//    }
//
//    public void setOnItemClickListener(OnItemClickListener listener) {
//        mListener = listener;
//    }
//
//    public class ExampleViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
//        public ImageView mImageView;
//        public TextView mTextView1;
//        public TextView mTextView2;
//
//
//        public ExampleViewHolder(View itemView) {
//            super(itemView);
//            mImageView = itemView.findViewById(R.id.avatar);
//            mTextView1 = itemView.findViewById(R.id.people_name_txt);
//            mTextView2 = itemView.findViewById(R.id.mail_txt);
//            itemView.setOnClickListener(this);
//        }
//        public void bindView(int position){
//            Mail currentItem = List.get(position);
//            mImageView.setImageResource(currentItem.getPhoto());
//            mTextView1.setText(currentItem.getName());
//            mTextView2.setText(currentItem.getMail());
//        }
//        public void onClick(View view){
//
//        }
//    }
//
//    public MyAdapter(ArrayList<Mail> List) {
//        List = List;
//    }
//
//    @Override
//    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
//        ExampleViewHolder evh = new ExampleViewHolder(v);
//        return evh;
//    }
//
//    @Override
//    public void onBindViewHolder(ExampleViewHolder holder, int position) {
//        ((ExampleViewHolder) holder).bindView(position);
//    }
//
//    @Override
//    public int getItemCount() {
//        return List.size();
//    }
//}