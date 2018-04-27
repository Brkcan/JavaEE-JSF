package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class MusteriKayit {

	@Id
	@TableGenerator(name = "MUSTERİ_ID")
	@GeneratedValue(generator = "MUSTERİ_ID")
	private int id;
	private String isim;
	private String soyisim;
	private String password;
	private String adres;
	private String mail;
	private String telefon;



	public MusteriKayit() {
	}

	public MusteriKayit(String isim, String soyisim, String password, String adres, String mail, String telefon) {
		this.isim = isim;
		this.soyisim = soyisim;
		this.password = password;
		this.adres = adres;
		this.mail = mail;
		this.telefon = telefon;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	/*
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; MusteriKayit other = (MusteriKayit) obj;
	 * 
	 * if (id != other.id) return false; if (isim == null) { if (other.isim != null)
	 * return false; } if (password == null) { if (other.password != null) return
	 * false; } else if (!password.equals(other.password)) return false;
	 * 
	 * return true; }
	 */
	@Override
	public String toString() {
		return "MusteriKayit [id=" + id + ", isim=" + isim + ", soyisim=" + soyisim + ", password=" + password
				+ ", adres=" + adres + ", mail=" + mail + ", telefon=" + telefon + "]";
	}

}
