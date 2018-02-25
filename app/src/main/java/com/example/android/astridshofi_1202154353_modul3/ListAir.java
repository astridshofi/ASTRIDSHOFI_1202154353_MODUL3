package com.example.android.astridshofi_1202154353_modul3;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;


public class ListAir extends RecyclerView.Adapter<ListAir.airView> {
    
    private final LinkedList<String> judul; //Linkedlist
    private final LinkedList<String> desc;
    private final LinkedList<Integer> image;
    
    private LayoutInflater inflater; //Layout untuk Mengambil data RecycleView

    public ListAir(Main2Activity main2Activity, LinkedList<String> njudul, LinkedList<String> ndesc, LinkedList<Integer> nimage) {
        inflater = LayoutInflater.from(main2Activity);
        this.judul=njudul;
        this.desc=ndesc;
        this.image=nimage;
    }


    @Override
    public airView onCreateViewHolder(ViewGroup parent, int viewType) { //parent margin layout
        View listView= inflater.inflate(R.layout.listair,parent,false);
        return new airView(listView,this);
    }

    @Override
    public void onBindViewHolder(airView holder, int position) { //meletakan objek objek
        String Currentjudul = judul.get(position);
        String Currentdesc = desc.get(position);
        Integer Currentimage = image.get(position);

        holder.juduls.setText(Currentjudul);
        holder.descs.setText(Currentdesc);
        holder.images.setImageResource(Currentimage);
    }

    @Override
    public int getItemCount() {
        return image.size();
    }

    public class airView extends RecyclerView.ViewHolder {//menyimpan semua dari recyclerview
        private final TextView juduls;
        private final TextView descs;
        private final ImageView images;

        public airView(final View listView, final ListAir listAir) {
            super(listView);//memamnggil constactor

            juduls=(TextView)listView.findViewById(R.id.judul);//menyimpan textview judul
            descs=(TextView)listView.findViewById(R.id.desc);//menyimpan deskripsi
            images=(ImageView) listView.findViewById(R.id.gambar);//menyimpan gambar

            images.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View view) {//agar gambar bisa di klik
                    int position = getLayoutPosition();

                    String title = judul.get(position); //judul mengambil data dari linked list
                    String deskripsi = desc.get(position); //desc mengambil data dari linked list
                    Integer gambar = image.get(position); //image mengambil data dari linked list

                    //untuk pindah ke aktivitas berikutnya
                    Intent intent = new Intent(listView.getContext(), DetailAir.class); //karena sudah diset dari airView

                    //Ketika pindah, yang akan ditaro
                    intent.putExtra("Judul", title); //putextra untuk melempar data
                    intent.putExtra("Deskripsi", deskripsi);
                    intent.putExtra("Gambar", gambar);

                    //memulai aktivitas
                    listView.getContext().startActivity(intent);
                }
            });
        }
    }
}
