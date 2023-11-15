package com.example.viewdanviewgroup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    // View merupakan komponen dasar yang tampil di layar dan dapat digunakan untuk berinteraksi dengan pengguna. Contoh komponen turunan dari View seperti berikut.

    // TextView: komponen yang berguna untuk menampilkan teks ke layar.

    //Button: komponen yang membuat pengguna dapat berinteraksi dengan cara ditekan untuk melakukan sesuatu.

    //ImageView: komponen untuk menampilkan gambar.

    //RecyclerView: komponen untuk menampilkan informasi dalam bentuk list.

    //GridView: komponen untuk menampilkan informasi dalam bentuk grid.

    //RadioButton: komponen yang memungkinkan pengguna dapat memilih satu pilihan dari berbagai pilihan yang disediakan.

    //Checkbox: komponen yang memungkinkan pengguna dapat memilih lebih dari satu dari pilihan yang ada.

    // ViewGroup adalah sebuah View spesial yang mewadahi objek-objek View lainnya dan berguna untuk mengatur posisinya sehingga membentuk satu kesatuan tampilan aplikasi yang utuh. Contoh komponen ViewGroup adalah:

    // 1. LinearLayout
    // 2. RelativeLayout
    // 3. ConstraintLayout
    // 4. FrameLayout
    // 5. TableLayout
}