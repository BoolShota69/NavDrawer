package com.example.navdrawer;

import android.graphics.drawable.Drawable;

public class Item {

        String nama, deskripsi;
        Drawable image;

        public Item() {
            this.nama = nama;
            this.deskripsi = deskripsi;
            this.image = image;
        }

        public String getNama() {
            return nama ;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getDeskripsi() {
            return deskripsi ;
        }

        public void setDeskripsi(String deskripsi) {
            this.deskripsi = deskripsi;
        }

        public Drawable getImage() {
            return image;
        }

        public void setImage(Drawable image) {
            this.image = image;
        }
}