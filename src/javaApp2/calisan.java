package javaApp2;

public class calisan {
	private int id;
	private String isim;
	private int maas;
	private String departman;
	
	public calisan(int id, String isim, int maas, String departman) {
		this.id = id;
		this.isim = isim;
		this.maas = maas;
		this.departman = departman;
	};
	
	public void showInfos(){
		System.out.println(this.isim +" bilgileri");
		System.out.println("id "+this.id);
		System.out.println("Maaþ "+this.maas);
		System.out.println("Departman "+this.departman);
	}
	
}
