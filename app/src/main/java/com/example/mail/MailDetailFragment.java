package com.example.mail;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class MailDetailFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_mail_detail,container,false);
        Bundle bundle=getArguments();
        String firstName=bundle.getString("Mail");
        String lastName=bundle.getString("Name");
        String detail=bundle.getString("Detail");
        int image=bundle.getInt("Image");

        TextView firstText= view.findViewById(R.id.name);
        TextView secondText= view.findViewById(R.id.mail);
        TextView thirdText=view.findViewById(R.id.detality);
        ImageView imageView=view.findViewById(R.id.photo);
        firstText.setText(firstName);
        secondText.setText(lastName);
        thirdText.setText(detail);
        imageView.setImageResource(image);
        return view;
    }
}
//public class MailDetailFragment extends Fragment {
//
//    private Mail Mail;
//    private ImageView photo;
//    private TextView name;
//    private TextView mail;
//
//    @Nullable
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//    }
//    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_mail_detail, container, false);
//        if (getArguments() != null) {
//            Mail = getArguments().getParcelable(MailListFragment.MAIL_KEY);
//        }
//        if (Mail != null) {
//            initializeViews(view);
//            photo.setImageResource(Mail.getPhoto());
//            name.setText(Mail.getName());
//            mail.setText(Mail.getMail());
//        }
//        return view;
//    }
//
//    private void initializeViews(View view) {
//        photo = (ImageView) view.findViewById(R.id.photo);
//        name = (TextView) view.findViewById(R.id.name);
//        mail = (TextView) view.findViewById(R.id.mail);
//
//    }
//
//
//}
