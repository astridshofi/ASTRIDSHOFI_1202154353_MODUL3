package com.example.android.astridshofi_1202154353_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class Main2Activity extends AppCompatActivity {

    private final LinkedList<String> njudul = new LinkedList<>(); //atribut judul
    private final LinkedList<String> ndesc = new LinkedList<>(); //atribut deskripsi
    private final LinkedList<Integer> nimage = new LinkedList<>(); //atribut image

    private RecyclerView recycler; //atribut recyclerview
    private ListAir list; //atribut untuk menghubungkan data ListAir


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        list();

        recycler=(RecyclerView)findViewById(R.id.recyclerview); //Implementasi recyclerview
        list = new ListAir(this,njudul,ndesc,nimage); //Implementsi untuk list judul deskripsi dan image
        recycler.setAdapter(list); //Koneksi adapter
        recycler.setLayoutManager(new LinearLayoutManager(this)); //Set layout adapter
    }

    private void list(){ //untuk memasukan list pada recyclerview
        njudul.add("Ades");
        njudul.add("Amidis");
        njudul.add("Aqua");
        njudul.add("Cleo");
        njudul.add("Club");
        njudul.add("Equil");
        njudul.add("Evian");
        njudul.add("Le minerale");
        njudul.add("Nestle");
        njudul.add("Pristine");
        njudul.add("Vit");

        ndesc.add("Ades kemasan hijau yang mengingatkan kita pada indahnya pemandangan");
        ndesc.add("Amidis kemasan oranye yang mengingatkan kita pada cerahnya matahari");
        ndesc.add("Aqua kemasan biru yang mengingatkan kita pada sejuknya lautan");
        ndesc.add("Cleo kemasan oranye hitam yang mengingatkan kita pada langit senja");
        ndesc.add("Club kemasan biru mudah yang mengingatkan kita pada langit yang sejuk");
        ndesc.add("Equil kemasan merah yang mengingatkan kita akan hal keberanian");
        ndesc.add("Evian kemasan yang ramah lingkungan sangat enak");
        ndesc.add("Le Minerale kemasan biru yang berasa");
        ndesc.add("Nestle kemasan biru mudah memproduksi juga bubur bayi");
        ndesc.add("Pristine kemasan hijau tosca yang cute");
        ndesc.add("VIT kemasan merah yang menyejukan kehausan dahaga");

        nimage.add(R.drawable.ades);
        nimage.add(R.drawable.amidis);
        nimage.add(R.drawable.aqua);
        nimage.add(R.drawable.cleo);
        nimage.add(R.drawable.club);
        nimage.add(R.drawable.equil);
        nimage.add(R.drawable.evian);
        nimage.add(R.drawable.leminerale);
        nimage.add(R.drawable.nestle);
        nimage.add(R.drawable.pristine);
        nimage.add(R.drawable.vit);
    }


}
