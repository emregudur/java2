package javaApp2;

import java.util.ArrayList;

public class yonetici extends calisan {
	private ArrayList<Integer> calisanlar =new ArrayList<Integer>();
	private String isim_;
	public yonetici(int id, String isim, int maas, String departman, int calisan) {
		super(id, isim, maas, departman);
		isim_=isim;
		calisanlar.add(calisan);
	}
	public void calisanlariListele(){
		System.out.println(isim_+" çalýþanlarý...");
		for (Integer integer : calisanlar) {
			System.out.println(integer);
		}
	}
	@Override
	public void showInfos(){
		System.out.println("Yönetici bilgileri");
		super.showInfos();
		
	}

}
