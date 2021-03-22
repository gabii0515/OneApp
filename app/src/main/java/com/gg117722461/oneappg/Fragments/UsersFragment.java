package com.gg117722461.oneappg.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gg117722461.oneappg.Adapters.UserAdapter;
import com.gg117722461.oneappg.Model.Users;
import com.gg117722461.oneappg.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

/*All below code from https://www.youtube.com/watch?v=5VPEvKhShK8&list=PLKETiCsEsH0qoTj0-ZAO-knfhNPRUJzVx&index=1 (https://github.com/developersamuelakram/MyChatApp)*/

public class UsersFragment extends Fragment {


    RecyclerView recyclerView;
    List<Users> usersList;
    UserAdapter mAdapter;
    FirebaseUser firebaseUser;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_users, container, false);
        recyclerView = view.findViewById(R.id.recyclerview_users);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        
        displayusers();
        
        return view;
    }

    private void displayusers() {

        usersList = new ArrayList<>();

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Users");

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                usersList.clear();

                for (DataSnapshot ds : snapshot.getChildren()) {

                    Users users = ds.getValue(Users.class);

                    firebaseUser = FirebaseAuth.getInstance().getCurrentUser();

                    if (!users.getId().equals(firebaseUser.getUid())) {


                        usersList.add(users);

                    }

                    mAdapter = new UserAdapter(getContext(), usersList, false);
                    recyclerView.setAdapter(mAdapter);

                }
            }


            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }}
