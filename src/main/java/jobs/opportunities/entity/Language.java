package jobs.opportunities.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Language {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@OneToMany(mappedBy="language")
	Set<SpokenLanguage> speaks = new HashSet<SpokenLanguage>();

	private String id1;

	private String id2;

	private String id3;

	private String nativ;

	private String eng;

	private String fra;

	private String spa;

	private String zho;

	private String rus;

	private String deu;

	private String icon;


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getId1() {
		return id1;
	}

	public void setId1(String id1) {
		this.id1 = id1;
	}

	public String getId2() {
		return id2;
	}

	public void setId2(String id2) {
		this.id2 = id2;
	}

	public String getId3() {
		return id3;
	}

	public void setId3(String id3) {
		this.id3 = id3;
	}

	public String getNativ() {
		return nativ;
	}

	public void setNativ(String nativ) {
		this.nativ = nativ;
	}

	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}

	public String getFra() {
		return fra;
	}

	public void setFra(String fra) {
		this.fra = fra;
	}

	public String getSpa() {
		return spa;
	}

	public void setSpa(String spa) {
		this.spa = spa;
	}

	public String getZho() {
		return zho;
	}

	public void setZho(String zho) {
		this.zho = zho;
	}

	public String getRus() {
		return rus;
	}

	public void setRus(String rus) {
		this.rus = rus;
	}

	public String getDeu() {
		return deu;
	}

	public void setDeu(String deu) {
		this.deu = deu;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
}

