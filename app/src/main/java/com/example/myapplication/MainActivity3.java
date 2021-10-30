package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView tvDeskripsi;
    TextView textDeskrisi;
    TextView textketerangan;
    TextView textobat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tvDeskripsi=(TextView) findViewById(R.id.textView23);
        textDeskrisi= (TextView) findViewById(R.id.textView7);
        textketerangan=(TextView) findViewById(R.id.textView10);
        textobat=(TextView) findViewById(R.id.textView12);

        tvDeskripsi.setText("Flu merupakan penyakit yang di sebabkan oleh infeksi virus yang dapat menyerang hiding,tenggorokan dan paru paru, penyakit ini" +
                "sangat mudah menular ke orang lain."
        );

        textDeskrisi.setText("Gejala flu hampir serupa dengan gejala batuk atau pilek, seperti, Demam,hidung tersumbat, bersin bersin, sakit tenggorokan, sakit " +
                "kepala, lemas, nyeri otot, tidak nafsu makan, mengigil, pilek, batuk dan mual dan muntah");
        textketerangan.setText("Flu di sebabkan oleh virus Infuenza yang mudah menular. Penularan sering kali terjadi ketika seseorang tidak sengaja menghiruo" +
                "percikan air liur di udara, yang di keluarkan oleh penderita melalui bersin atau batuk. Penularan juga dapat terjadi ketika tangan menyentuh mata, " +
                "hidung, atau mulut, setelah memegang barang yang terkena percikan air liur penderita");

        textobat.setText("1. Bawang Putih" +
                "\n" +
                "Kandungan minyak allicin (senyawa yang memberikan harum khas bawang putih) di percaya ampuh untuk mengarasi pilek dab flu, dan bawang " +
                "putih juga memiliki kandungan anti virus yang dapat mencegah flu atau pilik, cara penggunannya cukup tambahkan bawang putih pada setiap masakan" +
                "\n" +
                "2.Madu" +
                "\n" +
                "Sifat anti mikroba alami dari madu dapat membantu melawan kuman penyakit, termasuk bakteri dan virus penyebab flu. cara penggunaannya  larutkan 2 sendok" +
                "makan madu kedalam segelas air hangat. tetapi madu tidak di perbolehkan di berikan kepada anak bayi yang usianya kurang dari 2 tahun." +
                "\n" +
                "3. Teh herbal" +
                "\n" +
                "Dengan mengonsumsi teh herbal tubuh memiliki sistem kekebalan yang baik untuk melawan infeksi viris, termasuk virus influenza karen teh " +
                "herbal mengandung zat anti virus dan bakteri. car mengonsumsinya cukup campurkan seduhan teh heral dengan madu." +
                "\n");
    }

}