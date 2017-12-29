package com.example.dargorbaman.pairpersonapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.util.Random
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    internal var a: Int = 0
    var kisiler = arrayOf("Ahmet Battal","Ahmet Murat Kavran","Akın Bal","Alper Ali Özcan","Alper Yılmaz",
            "Ayşe Karafil","Aytaç Ünal","Batuhan Aydın","Berk Can Demir","Berk Kulaksız","Berkay Suat","Berrin Akan",
            "Burak Fırçasıgüzel","Burak Gülcan","Burhan Kılıç","Burkay Bayır","Can Mert Aydın","Emre Can Sütmen",
            "Emre Serbes","Erkan Muray Bay","Esen Şahin","Ezgi Aygün","Ferhan Akkan","Hakan Çalışkan",
            "Hasan Erkul","Hilmi Mertcan Gümüş","Kaan Türk","Mehmet Anıl Yeşil","Mehmet Batuhan Sakarya",
            "Mehmet Emre Çetin","Mesut Kılıç","Mohammed Raad","Dorukhan Akar","Oğuzhan Öksel","Ozan Deniz Demirtaş",
            "Sefa Özel","Semih Şahin","Seray Keslin","Sezgin Tazıcı","Şafak Birkan","Şemi Yalçın","Taha Şalva",
            "Tuğba Tepe","Tuğçe Durgut","Yusuf Emre Kenar","Çağrı Kaçmaz")//46 kişi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener({
            val rand = Random()
            textView1.text = kisiler[0]
            kisiler[0] = "kullanildi"
            do {
                a = rand.nextInt(10) + 0
            } while (kisiler[a] == "kullanildi")
            textView3.text = kisiler[a]
            kisiler[a] = "kullanildi"
            do {
                a = rand.nextInt(10) + 0
            } while (kisiler[a] == "kullanildi")
            textView5.text = kisiler[a]
            kisiler[a] = "kullanildi"
            do {
                a = rand.nextInt(10) + 0
            } while (kisiler[a] == "kullanildi")
            textView7.text = kisiler[a]
            kisiler[a] = "kullanildi"
            do {
                a = rand.nextInt(10) + 0
            } while (kisiler[a] == "kullanildi")
            textView9.text = kisiler[a]
            kisiler[a] = "kullanildi"
            do {
                a = rand.nextInt(10) + 0
            } while (kisiler[a] == "kullanildi")
            textView2.text = kisiler[a]
            kisiler[a] = "kullanildi"
            do {
                a = rand.nextInt(10) + 0
            } while (kisiler[a] == "kullanildi")
            textView4.text = kisiler[a]
            kisiler[a] = "kullanildi"
            do {
                a = rand.nextInt(10) + 0
            } while (kisiler[a] == "kullanildi")
            textView6.text = kisiler[a]
            kisiler[a] = "kullanildi"
            do {
                a = rand.nextInt(10) + 0
            } while (kisiler[a] == "kullanildi")
            textView8.text = kisiler[a]
            kisiler[a] = "kullanildi"
            do {
                a = rand.nextInt(10) + 0
            } while (kisiler[a] == "kullanildi")
            textView10.text = kisiler[a]
            kisiler[a] = "kullanildi"
        })

    }

}