package com.example.navdrawer.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navdrawer.Adapter;
import com.example.navdrawer.Item;
import com.example.navdrawer.R;

import java.util.ArrayList;
import java.util.List;

public class MinumanKhasFragment extends Fragment{

    RecyclerView recyclerView;
    List<Item> listData;
    Adapter adapter;

    public MinumanKhasFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_minumankhas, container, false);
        recyclerView = rootView.findViewById(R.id.minumanKhas);
        listData = new ArrayList<>();

        Item item1 = new Item();
        item1.setImage(getResources().getDrawable(R.drawable.wedangpejuh));
        item1.setNama("Wedang Pejuh");
        item1.setDeskripsi("Wedang pejuh merupakan sajian minuman khas Kudus yang berasal dari singkatan pomelo, jahe, susu kental manis, dan sereh. Cara membuatnya mudah, rebusan air ditambah dengan jahe dan sereh, setelah mendidih tuang dalam gelas dan campur dengan susu kental manis serta bulir jeruk pomelo");
        listData.add(item1);

        Item item2 = new Item();
        item2.setImage(getResources().getDrawable(R.drawable.wedangblung));
        item2.setNama("Wedang Blung");
        item2.setDeskripsi("Wedang Blung Kudus adalah minuman tradisional dari Kudus, Jawa Tengah, Indonesia. Minuman ini terbuat dari campuran gula merah, jahe, kayu manis, dan cengkeh. Memiliki rasa hangat, aroma rempah yang khas, dan sering disajikan dalam keadaan hangat. Dikenal memiliki khasiat untuk menghangatkan tubuh dan meredakan masuk angin.");
        listData.add(item2);

        Item item3 = new Item();
        item3.setImage(getResources().getDrawable(R.drawable.kopijetak));
        item3.setNama("Kopi Jetak");
        item3.setDeskripsi("Kopi Jetak Kudus adalah varietas kopi arabika yang berasal dari daerah Jetak, Kudus, Jawa Tengah, Indonesia. Kopi ini dikenal karena cita rasanya yang khas, dengan sentuhan manis, asam yang seimbang, dan aroma yang menarik. Kopi Jetak Kudus biasanya disukai oleh para pecinta kopi karena keunikan rasanya yang berbeda dari jenis kopi lainnya. Kopi ini sering diolah dengan metode roasting yang khas untuk menjaga karakteristik rasanya yang unik.");
        listData.add(item3);

        adapter = new com.example.navdrawer.Adapter(getContext(), listData);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

        return rootView;
    }
}
