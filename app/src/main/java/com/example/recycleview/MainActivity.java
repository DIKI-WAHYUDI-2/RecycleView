package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterMovie adapterMovie;
    private ArrayList<Movie> movies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        recyclerView = findViewById(R.id.recycleView);
        adapterMovie = new AdapterMovie(movies);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterMovie);

    }

    private void getData() {

        movies = new ArrayList<>();
        movies.add(new Movie("Judul: Greyhound", "Sinopsis: Greyhound mengambil latar saat Perang Dunia II. Kisahnya diadaptasi dari novel berjudul The Good Shepherd karya C. S. Foster yang dirilis pada 1955 silam.\n" +
        "\n" +
                "Cerita berawal saat komandan kapal perang Angkatan Laut, Kapten Ernest Krause (Tom Hanks), ditugaskan memimpin 37 kapal sekutu melewati Atlantik Utara. Konvoi yang dipimpin Kapten Krause akhirnya memasuki kawasan perbatasan. Sayangnya, kawasan tersebut lepas dari perlindungan udara Amerika.\n" +
                "\n" +
                "Di situlah deretan kapal sekutu yang dipimpin Kapten Krause disergap kapal selam U-boat dari Angkatan Laut Jerman. Ganasnya lautan sering menyulitkan kapal Kapten Krause. Sebaliknya, pergerakan kapal selam Jerman jadi lebih gesit dan keberadaan mereka sulit dideteksi.\n" +
                "\n" +
                "Meski begitu, Kapten Krause berhasil mengamankan posisi di atas kapal selam Jerman dan meluncurkan tembakan. Pertempuran sengit pun terjadi di perairan tersebut. Kapten Krause harus bertahan menghalau pasukan Nazi yang terus berdatangan dengan jumlah semakin banyak.","Sutradara: Aaron Scheiner","Biaya: 50,3 juta USD","Rilis: 10 Juli 2020", R.drawable.greyhound));
        movies.add(new Movie("Judul: Dunkirk","Sinopsis: Film ini menghadirkan sudut pandang dari tiga perspektif yang berbeda: The Mole (darat), The Sea (laut), dan The Air (udara), dengan rentang waktu masing-masing satu minggu, satu hari, dan satu jam. Dalam sudut pandang darat, kita mengikuti perjuangan Tommy, seorang tentara Inggris, untuk bertahan hidup dan mencari evakuasi. Dia bergabung dengan dua tentara lainnya, Gibson dan Alex, untuk menemukan cara keluar dari situasi yang mencekam.\n" +
                "\n" +
                "Sementara itu, sudut pandang laut menceritakan tentang Dawson, seorang marinir, yang bersama anaknya Peter, berlayar menggunakan kapal pribadinya untuk menyelamatkan para tentara. Mereka membutuhkan satu hari untuk mencapai Dunkirk dan melakukan penyelamatan.\n" +
                "\n" +
                "Di sudut pandang udara, pilot RAF Farrier dan Collins terlibat dalam pertempuran udara melawan pesawat musuh. Meskipun terpisah karena Farrier dilumpuhkan, mereka berjuang sendiri untuk mengalahkan musuh dalam satu jam pertempuran.\n" +
                "\n" +
                "Pada akhirnya, cerita dari ketiga sudut pandang ini saling terhubung ketika para pemeran dari sudut pandang yang berbeda bertemu di laut, di mana usaha penyelamatan mencapai puncaknya.\n" +
                "\n" +
                "Film ini dikenal karena penyutradaraannya yang brilian oleh Christopher Nolan, sinematografinya yang spektakuler, dan penggunaan suara yang intens. Selain itu, penampilan para pemainnya, termasuk Tom Hardy dan aktor baru Fionn Whitehead serta Harry Styles dari One Direction, juga mendapat banyak pujian.\n" +
                "\n" +
                "\"Dunkirk\" merupakan film produksi dari empat negara, yakni Inggris, Amerika, Belanda, dan Perancis, dan berhasil masuk dalam beberapa nominasi penghargaan di berbagai ajang perfilman.","Sutradara: Crishtoper Nolan","Biaya: 10,2 Juta USD","Rilis: 20 Juli 2017", R.drawable.dunkirk));
        movies.add(new Movie("Judul: All Quiet Place","Sinopsis: Menceritakan tentang kelamnya kehidupan di parit saat perang, yang dirasakan oleh Paul, saat bertugas di Front Barat di Perang Dunia I.\n" +
                "\n" +
                "Gambaran akan perjuangan dan semangat patriotik sirna saat Paul benar-benar berhadapan dengan kenyataan hidup yang brutal di garis depan.\n" +
                "\n" +
                "Paul bersama dua orang temannya, Albert dan Muller, secara sukarela mendaftar sebagai tentara Jerman atas bimbingan gurunya yang menghidupkan semangat bela tanah air dalam diri mereka.\n" +
                "\n" +
                "Pandangan Paul akan musuh, siapa yang benar, dan siapa yang salah dalam konflik itu langsung runtuh.\n" +
                "\n" +
                "Meski tak mendapat banyak latihan, persenjataan yang minim, dan seragam bekas pakai, Paul harus bertahan hidup sampai perang berakhir.\n" +
                "\n" +
                "Mengandalkan nasihat dari seorang veteran yang lebih tua, mencegah Paul masuk dalam hitungan korban perang.\n" +
                "\n" +
                "Tapi, akankah Paul benar-benar dapat melihat perang berakhir?","Sutradara: Edward Berger","Biaya: 120 Juta USD","Tanggal: 29 September 2022", R.drawable.allquiet));
        movies.add(new Movie("Judul: Hacksaw Ridge","Sinopsis: Film Hacksaw Ridge diangkat berdasarkan kejadian nyata pengalaman Perang Dunia II dari Desmond Doss , seorang petugas medis perang pasifik Amerika yang menolak untuk membawa atau menggunakan senjata atau senjata api dalam bentuk apapun selama Pertempuran Okinawa.\n" +
                "\n" +
                "Desmond T. Doss adalah seorang dokter tentara Amerika Serikat yang menolak membawa satu pun senjata dalam pertempuran Okinawa di era Perang Dunia II. Desmond berhasil mengevakuasi 75 orang tentara sendirian, tanpa satu pun peluru ia tembakkan.\n" +
                "\n" +
                "Keyakinan Desmond untuk tidak membawa senjata diawali dari pengalamannya pada tahun 1925 di Lynchburg, Virginia, Amerika Serikat, Desmond Doss (Andrew Garfield) muda hampir membunuh saudaranya saat melakukan kekerasan. Akibat peristiwa itu, dan pendidikannya di Geraja Masehi Advent Hari Ketujuh, memperkuat keyakinan Desmond untuk tidak mau membunuh siapapun.\n" +
                "\n" +
                "Lima belas tahun kemudian, Doss membawa seorang pria yang terluka ke rumah sakit dan bertemu dengan seorang perawat bernama Dorothy Schutte (Teresa Palmer). Mereka menjalin hubungan asmara, dan Doss memberi tahu Dorothy tentang minatnya pada pekerjaan medis." +
                "Setelah serangan Jepang di Pearl Harbor, Doss mendaftar di Angkatan Darat AS untuk bertugas sebagai tenaga medis tempur . Ayahnya, Tom (Hugo Weaving), seorang veteran Perang Besar, sangat kecewa dengan keputusan tersebut. Sebelum berangkat ke Fort Jackson, Desmond meminta Dorothy untuk menikah, dan dia menerimanya.\n" +
                "\n" +
                "Karena hal itu, Howell dan Kapten Glover (Sam Worthington) berusaha membawa Doss ke psikiater, tetapi ditolak. Sebab keyakinan agama Doss bukan merupakan penyakit mental .\n" +
                "\n" +
                "\n" +
                "Mereka kemudian menyiksa Doss dengan membuatnya melalui kerja yang melelahkan, berniat untuk membuat Doss pergi atas kemauannya sendiri. Namun, keyakinan Doss tidak runtuh. Film Hacksaw Ridge digarap oleh sutradara Mel Gibson, dan dibintangi oleh Andrew Garfield, Sam Worthington , Luke Bracey, Teresa Palmer, Hugo Weaving, Rachel Griffiths, dan Vince Vaughn.","Sutradara: Mel Gibson","Biaya: 100 juta USD","Rilis: 4 November 2016", R.drawable.hacksawridge));
        movies.add(new Movie("Judul: Midway","Sinopsis: Film dimulai dengan serangan Jepang terhadap Pangkalan Angkatan Laut Amerika Serikat di Pearl Harbor pada 7 Desember 1941. Setelah serangan mematikan ini, Amerika Serikat bersiap untuk membalas dendam. Kita mengikuti kisah beberapa tokoh kunci, termasuk Dick Best (diperankan oleh Ed Skrein), seorang penerbang tempur yang pemberani, dan Edwin Layton (diperankan oleh Patrick Wilson), seorang perwira intelijen Angkatan Laut.\n" +
                "\n" +
                "Pertempuran Midway menjadi puncak dari balas dendam Amerika Serikat. Intelijen Amerika Serikat, yang dipimpin oleh Layton, berhasil memecahkan kode Jepang, memberikan keuntungan taktis yang besar kepada pasukan Amerika Serikat. Sementara itu, Dick Best dan para penerbang tempur lainnya bersiap untuk menghadapi armada udara Jepang yang kuat.\n" +
                "\n" +
                "\n" +
                "Pertempuran epik ini melibatkan serangkaian serangan udara dan laut yang dramatis dan penuh tekanan. Kedua belah pihak mengalami kerugian besar, tetapi akhirnya Amerika Serikat keluar sebagai pemenang. Kemenangan ini membalikkan keadaan di Pasifik dan menjadi titik balik penting dalam Perang Dunia II.\n" +
                "\n" +
                "“Midway” tidak hanya menggambarkan pertempuran itu sendiri, tetapi juga menyoroti tekad, keberanian, dan pengorbanan para prajurit yang terlibat dalam konflik ini. Dengan efek khusus yang mengesankan dan skala produksi yang besar, film ini memberikan penghormatan kepada sejarah heroik Pertempuran Midway dan mereka yang terlibat dalam memenangkannya.","Sutradara: Roland Emmerich","Biaya: 100 Juta USD","Rilis: 8 November 2019", R.drawable.midway));
        movies.add(new Movie("Judul: Be With You","Sinopsis: Drama ini mengisahkan keluarga yang dulunya bahagia dengan Soo Ah, Woo Jin, dan putra mereka Ji Hoo. Setelah kematian Soo Ah, Woo Jin, sebagai orang tua tunggal, berjuang mengisi kekosongan itu. Ji Hoo, yang tidak menerima kepergian ibunya, percaya bahwa ibunya akan kembali sebagai ibu penguin saat musim hujan tiba. Meski Ayahnya berusaha meyakinkannya, Ji Hoo tetap menantikan kedatangan ibunya.\n" +
                "\n" +
                "Dalam perjalanan pulang, mereka menemukan seorang perempuan yang mirip Soo Ah pingsan di sebuah terowongan. Ji Hoo yakin itu ibunya kembali. Woo Jin membawa pulang perempuan itu yang mengalami amnesia, berharap bahwa kebahagiaan keluarganya akan kembali bersamanya. Ji Hoo senang, tapi Woo Jin merasa takut karena meragukan identitas perempuan itu.\n" +
                "\n" +
                "Meski berbagai hal aneh terjadi, termasuk kehilangan ingatan tentang keluarga dan pernikahan, perempuan itu tetap bersama Woo Jin untuk mengembalikan kebahagiaan keluarganya.","Sutradara: Lee Jang-Hoon","Biaya: 90 Juta USD","Rilis: 14 Maret 2018", R.drawable.bewithyou));
        movies.add(new Movie("Judul: Ditto","Sinopsis: Kim Yong, seorang mahasiswa senior jurusan teknik mesin tahun 1999, dan Kim Mu Nee, mahasiswi jurusan sosiologi tahun 2022, secara kebetulan bisa berkomunikasi melalui sebuah walkie talkie. Percakapan malam hari mereka membuat mereka menjadi sahabat yang akrab. Tanpa disadari, mereka menjadi mak comblang satu sama lain dalam urusan percintaan.\n" +
                "\n" +
                "Kim Yong menceritakan tentang gadis yang ditaksirnya, Seo Han Sol, kepada Kim Mu Nee, dan mendapatkan saran darinya untuk mendekati Han Sol. Sebaliknya, Kim Mu Nee juga mengungkapkan perasaannya terhadap sahabatnya, Oh Young Ji, kepada Kim Yong, yang juga memberikan saran agar Mu Nee menyatakan perasaannya kepada Young Ji.\n" +
                "\n" +
                "Premis persahabatan lintas zaman ini sederhana namun menggemaskan. Hangatnya persahabatan dan gejolak cinta masa muda mereka dapat disaksikan dalam drama ini mulai Rilis 16 November 2022, dengan Yeo Jin Go, Cho Yi Hyun, Kim Hye Yoon, dan Na In Woo sebagai pemeran utama.","Sutradara: Edward Berger","Biaya: 20 Juta USD","Rilis: 16 November 2022", R.drawable.ditto));
        movies.add(new Movie("Judul: Tune In For Love","Sinopsis: mengisahkan kisah cinta dua anak muda, Mi Soo (Kim Go Eun) dan Hyun Woo (Jung Hae In), yang terpaksa putus-nyambung karena keadaan. Awalnya, mereka bertemu di toko kue warisan ibu Mi Soo dan menjadi akrab karena keduanya yatim piatu. Namun, krisis ekonomi membuat toko kue Mi Soo harus ditutup, memaksa mereka berpisah. Beberapa tahun kemudian, Mi Soo telah menjadi penyiar radio dan menemui kembali Hyun Woo di toko kue lamanya. Mereka kembali dekat, tetapi harus berpisah lagi karena Hyun Woo harus menjalani wajib militer. Setelah dua tahun, Hyun Woo mencoba mengontak Mi Soo melalui email untuk memulai kembali hubungan mereka. Namun, pertanyaan tentang masa lalu Hyun Woo yang membuatnya pernah dipenjara tetap menjadi misteri. Bisakah kisah cinta mereka berlanjut kali ini?","Sutradara: Jung Ji-Woo","Biaya: 70,3 Juta USD","Rilis: 28 Agustus 2019", R.drawable.tuneinforlove));
        movies.add(new Movie("Judul: Dear Nathan","Sinopsis: Cerita dimulai dengan kedatangan Salma (Amanda Rawles) ke SMA Garuda, di mana ia terlambat pada hari pertamanya dan bertemu dengan Nathan (Jefri Nichol), seorang siswa berandalan.\n" +
                "\n" +
                "Awalnya, Salma mencoba menjauhi Nathan karena ia selektif dalam memilih teman. Namun, Nathan justru menunjukkan ketertarikannya pada Salma dan berusaha untuk mendekatinya.\n" +
                "\n" +
                "Salma mulai melunak saat melihat sisi baik Nathan. Meskipun kepribadian mereka bertolak belakang, Salma jatuh cinta pada Nathan.\n" +
                "\n" +
                "Dengan perjuangan, Salma berusaha mengubah Nathan menjadi lebih baik, dan Nathan juga bertekad untuk memperbaiki perilakunya demi Salma. Namun, hubungan mereka dihadapkan pada banyak rintangan, termasuk masalah Nathan dengan keluarganya dan kehadiran mantan Nathan, Aurora.\n" +
                "\n" +
                "Kisah cinta mereka menjadi semakin rumit. Bagaimana kelanjutan hubungan mereka akan berakhir?","Sutradara: Indra Gunawan","Biaya: 3 Juta USD","Rilis: 23 Maret 2017", R.drawable.dearnathan));
        movies.add(new Movie("Judul: La La La Land","Sinopsis: Berlatar di kemegahan Los Angeles yang penuh kemacetan, Mia (Emma Stone), seorang barista dengan ambisi menjadi artis terkenal, tanpa sengaja bertemu dengan Sebastian (Ryan Gosling). Pertemuan mereka tidak menyenangkan bagi Mia karena Sebastian mengganggunya saat berkendara.\n" +
                "\n" +
                "Sebastian, seorang pianis jazz terkenal yang mengalami kesulitan finansial, sedang berselisih dengan adiknya, Laura (Rosemarie DeWitt). Suatu malam, ia tampil di sebuah restoran, tetapi diminta untuk tidak memainkan musik jazz oleh pemilik restoran, Bill (J.K Simmons).\n" +
                "\n" +
                "Mia, terpukau dengan penampilan Sebastian, ingin memuji namun malah mendapat perlakuan buruk karena Sebastian kesal atas pemecatan dirinya. Setelah dipecat, Sebastian bermimpi membuka klub jazz.\n" +
                "\n" +
                "Tak disangka, Mia dan Sebastian bertemu lagi di klub jazz itu. Meskipun punya mimpi yang sama, mereka menyadari bahwa mengejarnya tidak mudah.","Sutradara: Alan Walker","Biaya: 10 Juta USD","Rilis: 9 Desember 2018", R.drawable.lalaland));
        movies.add(new Movie("Judul: Exorcist","Sinopsis: Kehidupan fotografer Victor (Leslie Odom Jr) semula terasa sempurna. Istrinya yang cantik, Sorenne (Tracey Graves), hamil anak pertama mereka. Liburan mereka ke Haiti pada 2010 pun terasa begitu menyenangkan.\n" +
                "\n" +
                "Namun gempa bumi hebat terjadi. Hotel yang sedang ditempati oleh Sorenne runtuh sementara Victor tengah berada di luar bangunan. Saat berhasil menemukan Sorenne, Victor menghadapi pilihan sulit menyelamatkan satu di antara dua nyawa: istrinya atau anak mereka, Angela.\n" +
                "\n" +
                "13 tahun berlalu. Angela (Lidya Jewett) tumbuh sebagai remaja yang bersemangat. Meski ia kerap kali merindukan ibunya dan hanya bisa memandang dari barang peninggalan mendiang, ia memiliki Victor yang tekun merawatnya dan posesif terhadapnya.\n" +
                "\n" +
                "Selain itu, di sekolah, Angela memiliki sahabat bernama Katherine (Olivia Marcum). Orang tua Katherine, Miranda (Jennifer Nettles) dan Tony (Norbert Leo Butz), sangat ketat soal agama dan aktif dalam kegiatan gereja.\n" +
                "\n" +
                "Pada hari itu, Angela sengaja meminta izin kepada Victor untuk bisa mengerjakan tugas bersama Katherine di rumah temannya itu. Victor semula enggan memberikan izin. Namun rasa sayangnya terhadap anak perempuan piatu itu mengalahkan kekhawatirannya.\n" +
                "\n" +
                "Di sekolah, Angela meminta temannya dan Katherine untuk mengarang cerita bila orang tua mereka menghubungi orang tuanya karena mencari kedua remaja itu. Selepas sekolah, Angela dan Katherine sengaja masuk ke hutan untuk melakukan rencana mereka.\n" +
                "\n" +
                "Hingga ketika malam tiba, Victor menemukan Angela belum pulang ke rumah. Ia kemudian menghubungi orang tua Katherine. Namun Victor tidak menemukan Angela di sana, dan anaknya bersama Katherine pun tak ditemukan di rumah teman mereka.\n" +
                "\n" +
                "Teman sekolah mereka mengatakan kepada Victor, Tony, dan Miranda, bahwa ia melihat Katherine dan Angela masuk ke hutan selepas pulang sekolah.\n" +
                "\n" +
                "Ketiganya pun mencari Katherine dan Angela ke hutan samping sekolah. Polisi pun dihubungi dan pencarian dilakukan dengan banyak personel. Namun mereka hanya menemukan barang-barang kedua anak tersebut, tanpa ada jejak di mana mereka berada.","Sutradara: William Friedkin","Biaya: 90,3 Juta USD","Rilis: 28 Agustus 1987", R.drawable.exorcist));
        movies.add(new Movie("Judul: Friday 13th","Sinopsis: Film pertama Friday the 13th berawal dengan latar waktu 1958, ketika sekelompok remaja tengah berkemah di Camp Crystal Lake. Ternyata, seorang anak kecil tenggelam di danau dekat tempat kemping tersebut satu tahun sebelumnya.\n" +
                "\n" +
                "Berniat untuk bersenang-senang, mereka tak menyadari ancaman besar yang sudah di depan mata. Ancaman pertama dihadapi Barry (Willie Adams) dan Claudette (Debra S. Hayes).\n" +
                "\n" +
                "Mereka memisahkan diri dari teman-temannya yang sedang berkumpul di api unggun. Keduanya pergi ke sebuah kabin. Ketika di kabin, keduanya malah bertemu seorang pembunuh yang menghabiskan nyawa mereka berdua.\n" +
                "\n" +
                "Film berlanjut ke Jumat, 13 Juni 1980. Annie Phillips (Robbi Morgan) memasuki tempat makan kecil dan menanyakan arah ke Camp Crystal Lake. Orang-orang di rumah makan itu bingung dan ketakutan.\n" +
                "\n" +
                "Enos (Rex Everhart), seorang sopir tempat makan itu, setuju untuk memberikannya tumpangan karena kebetulan akan melewati lokasi itu. Namun, ia memperingatkan Annie tentang keanehan-keanehan di tempat tersebut.\n" +
                "\n" +
                "Ia menceritakan banyak kisah, mulai dari seorang anak lelaki tenggelam di Crystal Lake di 1957, kemudian pembunuhan dua orang yang terjadi setahun setelahnya, hingga kebakaran dan air beracun.\n" +
                "\n" +
                "Setelah turun dari mobil itu, Enos mendapatkan tumpangan lagi dari seseorang yang tak begitu jelas terlihat dan berujung menghabisi nyawanya.\n" +
                "\n" +
                "Sementara itu, di tempat kamping, beberapa anak muda, yakni Ned (Mark Nelson), Jack (Kevin Bacon), Bill (Harry Crosby), Marcie (Jeannine Taylor), Brenda (Laurie Bartram), dan Alice (Adrienne King) tengah merenovasi fasilitas di sana bersama sang pemilik, Steve Christy (Peter Brouwer).\n" +
                "\n" +
                "Ketika malam tiba, mereka satu per satu mulai menghadapi ancaman menyeramkan, sama seperti yang terjadi bertahun-tahun yang lalu.\n" +
                "\n" +
                "Hingga akhirnya, Alice bertemu dengan Mrs. Voorhees (Betsy Palmer) yang mengaku bahwa ia adalah ibu dari Jason Voorhees, anak yang tenggelam pada 1957.\n" +
                "\n" +
                "Pertemuan tersebut menjadi kunci dari misteri banyak nyawa yang hilang di Camp Crystal Lake selama beberapa dekade. Tak hanya itu, Alice juga mengetahui fakta mengejutkan lainnya yang bisa membahayakan nyawanya.","Sutradara: Marcus Nispel","Biaya: 19 Juta USD","Rilis: 9 Februari 2009", R.drawable.friday));
        movies.add(new Movie("Judul: Paranormal Activities","Sinopsis: Pasangan muda, Katie dan Micah, pindah ke rumah baru dan Micah merekam aktivitas mereka di kamera videonya. Setelah kejadian aneh di malam hari, Katie mengakui saat masih kecil, dia pernah mengalami kehadiran hantu di kamarnya. Dia merasakan dan sekarang khawatir itu mungkin telah mengikutinya ke tempat baru mereka. Micah skeptis dan memasang kameranya di kamar mereka untuk merekam aktivitas semalam. Setelah beberapa hari, mereka melihat pintu kamar tidur mereka bergerak dan jelas ada kehadiran di rumah mereka. Dan itu semakin memburuk.","Sutradara: Oren Peli, Gregory Plotkin, William Eubank, Ariel Schulman, Tod Williams, Henry Joost, Christopher B. Landon","Biaya: 50 Juta USD","Rilis: 23 Maret 2007", R.drawable.paranormal));
        movies.add(new Movie("Judul: Rings","Sinopsis: The Ring mengawali kisah dari Rachel Keller (Naomi Watts). Sebelumnya ia sempat menonton sebuah rekaman video horor yang menyeramkan.\n" +
                "\n" +
                "Awalnya Rachel mengira video tersebut hanya rekaman biasa, namun siapa sangka bahwa setelah menonton itu mulai muncul kejadian-kejadian aneh dalam kesehariannya.\n" +
                "\n" +
                "Kejadian ganjil pertama adalah kematian Katie (Amber Tamblyn) yaitu keponakan Rachel yang tewas secara misterius. Tewasnya Katie ini berlangsung selang 7 hari dari waktu Rachel selesai menonton rekaman video horor.\n" +
                "\n" +
                "Dalam sinopsis The Ring dikisahkan bahwa selain Katie, beberapa teman Rachel lain pun ada yang secara tiba-tiba meninggal setelah menonton video yang sama dengannya.\n" +
                "\n" +
                "Yang lebih menakutkan adalah kematian teman-temannya itu berlangsung secara bersamaan bahkan tanpa sebab-sebab yang jelas.\n" +
                "\n" +
                "Rachel sendiri dibuat bingung dan ketakutan sehingga ia berniat mengusut tuntas apa yang sebenarnya terjadi dengan melakukan serangkaian investigasi.\n" +
                "\n" +
                "Video horor tersebut menampilkan beberapa rekaman menyeramkan dan mengerikan. Tapi dari sana Rachel memutuskan pergi ke Shelter Mountain Inn untuk mencari petunjuk.\n" +
                "\n" +
                "Setelah 7 hari berlalu, tiba saatnya Rachel yang merasakan sendiri teror menyeramkan. Bermula dari sebuah panggilan telepon misterius yang memberitahu bahwa ajal kematiannya akan tiba 7 hari lagi.\n" +
                "\n" +
                "Parahnya, Aidan (David Dorfman) yaitu putra Rachel secara tidak sengaja juga menonton video tersebut dan langsung mengalami kejadian ganjil.\n" +
                "\n" +
                "Serangkaian teror menyeramkan kini terus mengikuti keseharian Rachel. Terlebih ia diancam bahwa nyawanya dalam bahaya karena sebentar lagi dirinya bisa segera mati.","Sutradara: F. Javier Gutiérrez","Biaya: 40 Juta USD","Rilis: 1 Februari 2017", R.drawable.rings));
        movies.add(new Movie("Judul: Insidous","Sinopsis: Seorang guru Josh Lambert (Patrick Wilson) dan istrinya Renai (Rose Byrne) pindah bersama ketiga anak mereka, Dalton (Ty Simpkins), Foster (Andrew Astor), dan bayinya Cali, ke sebuah rumah besar. Ketika Dalton menjelajahi loteng, dia jatuh dari tangga dan kepalanya terbentur lantai. Keesokan paginya, Dalton tidak bangun dan tetap koma, tetapi dokter tidak dapat mendiagnosis masalahnya.\n" +
                "\n" +
                "Tiga bulan kemudian, hal-hal aneh terjadi di dalam rumah dan Renai melihat penampakan. Dia yakin rumah itu berhantu dan meyakinkan Josh untuk pindah ke rumah lain. Renai semakin sering melihat hantu di rumah baru itu, tetapi Josh tidak percaya pada istrinya. Namun ibunya, Lorraine Lambert (Barbara Hershey), justru mengatakan kepadanya bahwa dia juga mendapat penglihatan tentang iblis di kamar Dalton.\n" +
                "\n" +
                "Mereka lalu mengundang medium dan teman lama Lorraine, Elise Rainier (Lin Shaye), yang membawa tim Spek pemburu hantu dan Tucker (Angus Sampson) untuk menyelidiki fenomena supernatural tersebut. Elise menjelaskan bahwa Dalton adalah seorang musafir dengan kemampuan meninggalkan tubuh fisiknya dan melakukan perjalanan dalam proyeksi astral. Sekarang tubuh spiritualnya hilang di tempat yang dinamakan The More yang bukan untuk makhluk hidup, di sana para entitas berkumpul mencoba masuk ke dalam tubuh fisik Dalton yang kosong. Di antara entitas ini, ada iblis yang membutuhkan tubuh Dalton untuk menyebabkan rasa sakit bagi yang lain.\n" +
                "\n" +
                "Lebih lanjut, Lorraine mengungkapkan bahwa Josh juga seorang musafir berbakat dan harus mencari Dalton di alam The More serta membawanya kembali.","Sutradara: James Wann","Biaya: 1,5 Juta USD","Rilis: 14 September 2010", R.drawable.insidous));
    }
}