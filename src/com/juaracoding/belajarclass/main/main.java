package com.juaracoding.belajarclass.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.juaracoding.belajarclass.bangunruang.BangunDuaDimensi;
import com.juaracoding.belajarclass.bangunruang.Kotak;
import com.juaracoding.belajarclass.bangunruang.Segitiga;
import com.juaracoding.belajarclass.binatang.Kucing;
import com.juaracoding.belajarclass.utility.Animation;
import com.juaracoding.belajarclass.utility.Utility;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
        
        Kotak kotak = new Kotak();
        kotak.setPanjang(10.0);
     //   kotak.tampilkanNilai();
        Segitiga segitiga = new Segitiga(10.0,3.0);
     //   segitiga.tampilkanNilai();
        
        Kucing kucing = new Kucing();
        
        
    /*    List<BangunDuaDimensi> listBangun = new ArrayList<BangunDuaDimensi>();
        listBangun.add(kotak);
        listBangun.add(segitiga);
        listBangun.add(kucing);
        
        for(int i = 0 ; i < listBangun.size();i++) {
        	
        	Utility.clearScreen();
        	listBangun.get(i).draw();
        	Utility.delay(1000);
        	
        	
        	
        }*/
        
        Animation anim = new Animation(kucing);
        
        for (int i = 0; i < 10; i++) {
        	Utility.clearScreen();
			anim.kanan();
			Utility.delay(100);
		}
        
        for (int i = 0; i < 5; i++) {
        	Utility.clearScreen();
			anim.kiri();
			Utility.delay(100);
		}
        
	}

}
