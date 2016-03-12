/**
 *
 * @author 
 * Nama   : Eka Putri
 * NIM    : 1301144312
 * Kelas  : IF - 38 -02
 */

import java.util.Date;

class Barang {
	private String namaBarang;
	private String kodeBarang;
	private int jumlah;
	private boolean kondisiBagus;
	private Date tglMasuk;
	private Date tglKeluar;
	
	public Barang(String nb, String kb, int jum, boolean k, Date tglM, Date tglK) {
		namaBarang = nb;
		kodeBarang = kb;
		jumlah = jum;
		kondisiBagus = k;
		tglMasuk = tglM;
		tglKeluar = tglK;
	}
	
	public String getNamaBarang() {
		return namaBarang;
	}
	
	public int getJumlah() {
		return jumlah;
	}
	
	public boolean getKondisiBarang() {
		return kondisiBagus;
	}
	
	public Date getTglMasuk() {
		return tglMasuk;
	}
	
	public Date getTglKeluar() {
		return tglKeluar;
	}
}