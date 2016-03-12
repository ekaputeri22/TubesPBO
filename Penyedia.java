/**
 *
 * @author 
 * Nama   : Eka Putri
 * NIM    : 1301144312
 * Kelas  : IF - 38 -02
 */

import java.util.Date;

class Penyedia {
	private Barang[] daftarBarang;
	private int numOfBarang;
	private Long id;
	private String pass;
	private String nama;
	
	public Penyedia(String nama, Long id) {
		this.nama = nama;
		this.id = id;
	}
	
	public void createBarang(String nb, String kb, int jum, boolean k, Date tglM, Date tglK) {
		daftarBarang[numOfBarang] = new Barang(nb, kb, jum, k, tglM, tglK);
		numOfBarang++;
		}
	
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public String getPass() {
		return pass;
	}
	
	public long getId() {
		return id;
	}
}