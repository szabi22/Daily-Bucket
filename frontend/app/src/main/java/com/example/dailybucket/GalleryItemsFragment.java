package com.example.dailybucket;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class GalleryItemsFragment {
    public class UserProfileFragment extends Fragment {
        RecyclerView mRecyclerView2;
        int[] mGaleryItems;

        public UserProfileFragment() {
        }

        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            return inflater.inflate(R.layout.add_new_post, container, false);
        }

        @Nullable
        @Override
        public void onViewCreated(View view, Bundle savedInstanceState) {


            mRecyclerView2 = getView().findViewById(R.id.user_recyclerview);
            GridLayoutManager mGridLayoutManager;
            mGridLayoutManager = new GridLayoutManager(getContext(), 3);
            mRecyclerView2.setLayoutManager(mGridLayoutManager);
            mGaleryItems = new int[]{R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4, R.drawable.a5, R.drawable.a6,
                    R.drawable.a7, R.drawable.a8};


            MyPostAdapter myAdapter = new MyPostAdapter(getContext(), mGaleryItems);
            mRecyclerView2.setAdapter(myAdapter);
        }
    }
}
