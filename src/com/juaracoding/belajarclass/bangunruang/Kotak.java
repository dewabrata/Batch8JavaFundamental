package com.juaracoding.belajarclass.bangunruang;

public class Kotak extends BangunRuang implements BangunDuaDimensi{
	
	
	
	
	public Kotak(double panjang) {
	
		this.setPanjang(panjang);
	}
	
	public Kotak() {
		
	}
	
	@Override
	public double hitungLuas() {
		// TODO Auto-generated method stub
		
		return this.getPanjang()*this.getPanjang();
	}
	
	@Override
	public double hitungKeliling() {
		// TODO Auto-generated method stub
		return 4*this.getPanjang();
	}

	@Override
	public void tampilkanNilai() {
		// TODO Auto-generated method stub
		System.out.println("Nilai luas kotak adalah " + this.hitungLuas());
		System.out.println("Nilai keliling kotak adalah " + this.hitungKeliling());
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < this.getPanjang(); i++) {
			
			 for (int j = 0; j <this.getPanjang(); j++) {
				System.out.print("*");
			}
			
			 System.out.println("");
		}
		System.out.println("");
	}
	
	
	
	
	
	

}
