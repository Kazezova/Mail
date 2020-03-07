package com.example.mail;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
public class MailListFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mail_list, container,false);
        RecyclerView recyclerView=view.findViewById(R.id.recycler);
        MyAdapter myAdapter=new MyAdapter(getActivity());
        recyclerView.setAdapter(myAdapter);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        return view;
    }

    public interface FragmentInteractionListener {
        void onInteract(int type);
    }

}

//public class MailListFragment extends Fragment {
//    private ArrayList<Mail> mExampleList;
//    Context context;
//    private RecyclerView mRecyclerView;
//    private MyAdapter mAdapter;
//    private RecyclerView.LayoutManager mLayoutManager;
//    FragmentManager fragmentManager;
//    public static final String MAIL_KEY = "mail_key";
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
////        setContentView(R.layout.fragment_mail_list);
//        createExampleList();
//    }
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_mail_list, container, false);
//        buildRecyclerView();
//        return view;
//    }
//
//    public void createExampleList() {
//        mExampleList = new ArrayList<>();
//        mExampleList.add(new Mail( "Line 1", "Line 2",R.drawable.aitgul,R.drawable.malika));
//        mExampleList.add(new Mail( "Line 1", "Line 2",R.drawable.aitgul,R.drawable.malika));
//        mExampleList.add(new Mail( "Line 1", "Line 2",R.drawable.aitgul,R.drawable.malika));
//
//    }
//    MailDetailFragment mailDetailsFragment;
//
//    public void buildRecyclerView() {
//        mRecyclerView = mRecyclerView.findViewById(R.id.recycler);
//        mRecyclerView.setHasFixedSize(true);
//        mLayoutManager = new LinearLayoutManager(getActivity());
//        mAdapter = new MyAdapter(mExampleList);
//
//        mRecyclerView.setLayoutManager(mLayoutManager);
//        mRecyclerView.setAdapter(mAdapter);
//
//        mAdapter.setOnItemClickListener(new MyAdapter.OnItemClickListener() {
//            @Override
//            public void onItemClick(int position) {
//                Bundle args = new Bundle();
//                args.putParcelable(MAIL_KEY, mExampleList.get(position));
//                mailDetailsFragment = new MailDetailFragment();
//                mailDetailsFragment.setArguments(args);
//                fragmentManager=getFragmentManager();
////                fragmentManager.beginTransaction()
////                        .add(R.id.detailMail, mailDetailsFragment, MAIL_KEY)
////                        .addToBackStack(null)
////                        .commit();
//            }
//        });
//    }
//}