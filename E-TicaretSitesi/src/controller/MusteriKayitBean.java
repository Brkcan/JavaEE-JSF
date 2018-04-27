package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.MusteriKayitDAO;
import dao.MusteriKayitDAOImpl;
import model.MusteriKayit;

@ManagedBean
@SessionScoped
public class MusteriKayitBean {

	private String isim;
	private String soyisim;
	private String password;
	private String adres;
	private String mail;
	private String telefon;

	public MusteriKayitBean() {
	}

	public MusteriKayitBean(String isim, String soyisim, String password, String adres, String mail, String telefon) {
		this.isim = isim;
		this.soyisim = soyisim;
		this.password = password;
		this.adres = adres;
		this.mail = mail;
		this.telefon = telefon;
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

	public String addMusteriKayit() {
		MusteriKayitDAO musteriKayitDAO = new MusteriKayitDAOImpl();
		MusteriKayit musteriKayit = new MusteriKayit(isim, soyisim, password, adres, mail, telefon);
		musteriKayitDAO.insertmusteriKayit(musteriKayit);

		if (isim != null) {
			return "success";
		}
		return isim;
	}
	public String login() {
		String flag = "failure";
		MusteriKayitDAO musteriKayitDAO = new MusteriKayitDAOImpl();
		MusteriKayit musteriKayit = new MusteriKayit();
		try {
			musteriKayit = musteriKayitDAO.login(mail, password);
			if(mail.equalsIgnoreCase(musteriKayit.getMail()) && password.equals(musteriKayit.getPassword())) {
				return "success";
			}
		} catch (Exception e) {
			return null;
		}
		return flag;
	}


}
