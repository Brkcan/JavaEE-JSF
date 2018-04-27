package dao;

import model.MusteriKayit;

public interface MusteriKayitDAO {
	
	public MusteriKayit insertmusteriKayit(MusteriKayit musteriKayit);
	
	public MusteriKayit login(String mail,String password);

}
