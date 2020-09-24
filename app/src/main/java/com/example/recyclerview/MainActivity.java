package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView conRecv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        conRecv =findViewById(R.id.conrec);

        ArrayList<contact> contact=new ArrayList<>();

        contact.add(new contact("email","email.com","r.jpg"));
        contact.add(new contact("email","email.com","r.jpg"));
        contact.add(new contact("email","email.com","r.jpg"));
        contact.add(new contact("email","email.com","r.jpg"));

        contactRecvAdapter adapter=new contactRecvAdapter();
        adapter.setContacts(contact);
        conRecv.setAdapter(adapter);
        conRecv.setLayoutManager(new LinearLayoutManager(this));


    }
}
