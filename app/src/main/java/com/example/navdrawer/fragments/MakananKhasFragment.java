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

public class MakananKhasFragment extends Fragment{

    RecyclerView recyclerView;
    List<Item> listData;
    com.example.navdrawer.Adapter adapter;

    public MakananKhasFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_makanankhas, container, false);
        recyclerView = rootView.findViewById(R.id.makananKhas);
        listData = new ArrayList<>();

        Item item1 = new Item();
        item1.setImage(getResources().getDrawable(R.drawable.lentog));
        item1.setNama("Lentog Tanjung");
        item1.setDeskripsi("hidangan Lentog tradisional datang dari Tanjung daerah. Dengan demikian, hidangan ini adalah lebih dikenal sebagai Lentog Tanjung untuk membuatnya berbeda dari yang lain Lentog. Hidangan ini dibuat dengan mencampur lontong (beras cake), sayur nangka, opor tahu dan sambal terasi, dan percikan serikat goreng sebagai gratis. Lentog Tanjung biasanya disajikan di atas daun pisang.");
        listData.add(item1);

        Item item2 = new Item();
        item2.setImage(getResources().getDrawable(R.drawable.nasipindang));
        item2.setNama("Nasi Pindang");
        item2.setDeskripsi("Sesuai dengan namanya, Nasi Pindang Kudus berasal dari kota kretek, Kudus. Sekilas hidangan berkuah ini mirip dengan rawon. Kuahnya kecoklatan dengan cita rasa sedikit manis. Nama pindang bukan berarti ikan pindang seperti umumnya, melainkan daging kerbau. Di Kudus, penggunaan daging kerbau dalam berbagai masakan lazim digunakan. Hal ini tak lepas dari dakwah Sunan Kudus untuk mengharagai umat Hindu yang menganggap sapi sebagai hewan suci dan mulia. Nasi Pindang Kudus disajikan di atas piring beralaskan daun pisang.");
        listData.add(item2);

        Item item3 = new Item();
        item3.setImage(getResources().getDrawable(R.drawable.satekerbau));
        item3.setNama("Sate Kerbau");
        item3.setDeskripsi("Sate kerbau merupakan sate khas dari Kudus, Jawa Tengah. Sebagaimana namanya, sate ini terbuat dari bahan utama daging kerbau. Secara tekstur daging kerbau ini agak lunak, dan cita rasanya itu cukup pedas.Bumbu sambal kacang untuk sate kerbau di Kudus terasa lebih manis bila dibandingkan dengan bumbu-bumbu sate di Jakarta. Selain itu, rempah-rempah dari sate kerbau ini begitu meresap ke dalam daging, hal ini menjadi salah satu kelebihan dari sate ini.");
        listData.add(item3);

        adapter = new Adapter(getContext(), listData);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

        return rootView;
    }
}
