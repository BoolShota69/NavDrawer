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

public class MakananFavFragment extends Fragment{

    RecyclerView recyclerView;
    List<Item> listData;
    com.example.navdrawer.Adapter adapter;

    public MakananFavFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_makananfav, container, false);
        recyclerView = rootView.findViewById(R.id.makananFav);
        listData = new ArrayList<>();

        Item item1 = new Item();
        item1.setImage(getResources().getDrawable(R.drawable.ayamgoreng));
        item1.setNama("Ayam Goreng");
        item1.setDeskripsi("Ayam goreng adalah hidangan kuliner yang populer di banyak negara di seluruh dunia, termasuk Indonesia. Dalam hidangan ini, potongan ayam biasanya digoreng dalam minyak panas hingga menjadi cokelat keemasan dan renyah di luar, namun tetap lembut dan juicy di dalamnya. Ayam goreng sering kali disajikan dengan berbagai macam sambal, lalapan, nasi, atau bahan pelengkap lainnya, tergantung pada preferensi dan kebiasaan lokal. Rasanya yang gurih dan teksturnya yang renyah membuatnya menjadi favorit di banyak meja makan.");
        listData.add(item1);

        Item item2 = new Item();
        item2.setImage(getResources().getDrawable(R.drawable.migoreng));
        item2.setNama("Mi Goreng");
        item2.setDeskripsi("Mi goreng adalah hidangan mie yang populer di Indonesia dan banyak negara Asia lainnya. Dalam mi goreng, mie digoreng dalam minyak panas bersama dengan bumbu-bumbu seperti bawang putih, bawang merah, cabai, kecap manis, dan bumbu lainnya. Hidangan ini sering ditambahkan dengan potongan daging, udang, telur, dan sayuran sesuai selera. Mi goreng memiliki rasa yang kaya, pedas, dan gurih, dan sering dianggap sebagai hidangan yang praktis dan lezat.");
        listData.add(item2);

        Item item3 = new Item();
        item3.setImage(getResources().getDrawable(R.drawable.esteh));
        item3.setNama("Es Teh");
        item3.setDeskripsi("Es teh adalah minuman populer yang terdiri dari teh yang disajikan dingin dengan es batu. Teh yang digunakan bisa berbagai jenis, seperti teh hitam, teh hijau, atau teh herbal. Es teh biasanya diberi tambahan gula sesuai selera, dan kadang-kadang juga ditambahkan perasan jeruk atau potongan buah lainnya untuk memberikan rasa segar. Minuman ini sangat populer di berbagai negara dan sering dianggap sebagai minuman penyegar yang menyegarkan, terutama saat cuaca panas.");
        listData.add(item3);

        adapter = new Adapter(getContext(), listData);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

        return rootView;
    }
}
