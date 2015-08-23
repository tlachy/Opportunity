package jobs.opportunities.entity.person.attributes;


import jobs.opportunities.entity.Person;
import jobs.opportunities.entity.abstractentity.ValueEntity;

import javax.persistence.*;

@javax.persistence.Entity
public class Nationality extends ValueEntity<Nationality.NationalityEnum> {

	// z http://t2a.co/blog/index.php/normalising-nationalities-via-a-good-iso-3166-country-list/ - trochu modifikovane
	public static enum NationalityEnum {
		AFGHANI("Afghani"),
		ALANDIC("Ålandic"),
		ALBANIAN("Albanian"),
		ALGERIAN("Algerian"),
		AMERICAN("American"),
		ANDORRAN("Andorran"),
		ANGOLAN("Angolan"),
		ANGUILLAN("Anguillan"),
		ANTARCTIC("Antarctic"),
		ANTIGUAN("Antiguan"),
		ARGENTINE("Argentine"),
		ARMENIAN("Armenian"),
		ARUBIAN("Arubian"),
		AUSTRALIAN("Australian"),
		AUSTRIAN("Austrian"),
		AZERBAIJANI("Azerbaijani"),
		BAHAMEESE("Bahameese"),
		BAHRAINIAN("Bahrainian"),
		BANGLADESHI("Bangladeshi"),
		BARBADIAN("Barbadian"),
		BARTHÉLEMOIS("Barthélemois"),
		BELARUSIAN("Belarusian"),
		BELGIAN("Belgian"),
		BELIZEAN("Belizean"),
		BENINESE("Beninese"),
		BERMUDAN("Bermudan"),
		BHUTANESE("Bhutanese"),
		BOLIVIAN("Bolivian"),
		BOSNIAN("Bosnian"),
		BRAZILIAN("Brazilian"),
		BRITISH("British"),
		BRUNEIAN("Bruneian"),
		BULGARIAN("Bulgarian"),
		BURKINABE("Burkinabe"),
		BURUNDIAN("Burundian"),
		CAMBODIAN("Cambodian"),
		CAMEROONIAN("Cameroonian"),
		CANADIAN("Canadian"),
		CAPE_VERDEAN("Cape Verdean"),
		CAYMANIAN("Caymanian"),
		CENTRAL_AFRICAN("Central African"),
		CHADIAN("Chadian"),
		CHILEAN("Chilean"),
		CHINESE("Chinese"),
		CHRISTMAS_ISLANDER("Christmas Islander"),
		COCOSSIAN("Cocossian"),
		COLOMBIAN("Colombian"),
		COMORAN("Comoran"),
		CONGOLESE("Congolese"),
		COOK_ISLANDER("Cook Islander"),
		COSTA_RICAN("Costa Rican"),
		CROATIAN("Croatian"),
		CUBAN("Cuban"),
		CURAĒAOAN("Curaēaoan"),
		CYPRIOT("Cypriot"),
		CZECH("Czech"),
		DANISH("Danish"),
		DJIBOUTIAN("Djiboutian"),
		DOMINICAN("Dominican"),
		DUTCH("Dutch"),
		ECUADOREAN("Ecuadorean"),
		EGYPTIAN("Egyptian"),
		EMIRIAN("Emirian"),
		EQUATORIAL_GUINEAN("Equatorial Guinean"),
		ERITREAN("Eritrean"),
		ESTONIAN("Estonian"),
		ETHIOPIAN("Ethiopian"),
		FALKLAND_ISLANDER("Falkland Islander"),
		FAROESE("Faroese"),
		FIJIAN("Fijian"),
		FILIPINO("Filipino"),
		FINNISH("Finnish"),
		FRENCH("French"),
		FRENCH_GUIANESE("French Guianese"),
		FRENCH_POLYNESIAN("French Polynesian"),
		GABONESE("Gabonese"),
		GAMBIAN("Gambian"),
		GEORGIAN("Georgian"),
		GERMAN("German"),
		GHANAIAN("Ghanaian"),
		GIBRALTERIAN("Gibralterian"),
		GREEK("Greek"),
		GREENLANDER("Greenlander"),
		GRENADIAN("Grenadian"),
		GUADELOUPEAN("Guadeloupean"),
		GUAMANIAN("Guamanian"),
		GUINEAN("Guinean"),
		GUYANESE("Guyanese"),
		HAITIAN("Haitian"),
		HONDURAN("Honduran"),
		HONG_KONGER("Hong Konger"),
		HUNGARIAN("Hungarian"),
		I_Kiribati("I-Kiribati"),
		ICELANDER("Icelander"),
		INDIAN("Indian"),
		INDONESIAN("Indonesian"),
		IRANIAN("Iranian"),
		IRAQI("Iraqi"),
		IRISH("Irish"),
		ISLANDER("Islander"),
		ISRAELI("Israeli"),
		ITALIAN("Italian"),
		IVORIAN("Ivorian"),
		JAMAICAN("Jamaican"),
		JAPANESE("Japanese"),
		JORDANIAN("Jordanian"),
		KAZAKHSTANI("Kazakhstani"),
		KENYAN("Kenyan"),
		KITTIAN("Kittian"),
		KUWAITI("Kuwaiti"),
		KYRGYZSTANI("Kyrgyzstani"),
		LAOTIAN("Laotian"),
		LATVIAN("Latvian"),
		LEBANESE("Lebanese"),
		LIBERIAN("Liberian"),
		LIBYAN("Libyan"),
		LIECHTENSTEINER("Liechtensteiner"),
		LITHUNIAN("Lithunian"),
		LUXEMBOURGER("Luxembourger"),
		MACANESE("Macanese"),
		MACEDONIAN("Macedonian"),
		MAHORAN("Mahoran"),
		MALAGASY("Malagasy"),
		MALAWIAN("Malawian"),
		MALAYSIAN("Malaysian"),
		MALDIVAN("Maldivan"),
		MALIAN("Malian"),
		MALTESE("Maltese"),
		MANX("Manx"),
		MARSHALLESE("Marshallese"),
		MARTINICAN("Martinican"),
		MAURITANIAN("Mauritanian"),
		MAURITIAN("Mauritian"),
		MEXICAN("Mexican"),
		MICRONESIAN("Micronesian"),
		MOLDOVAN("Moldovan"),
		MONACAN("Monacan"),
		MONGOLIAN("Mongolian"),
		MONTENEGRIN("Montenegrin"),
		MONTSERRATIAN("Montserratian"),
		MOROCCAN("Moroccan"),
		MOSOTHO("Mosotho"),
		MOTSWANA("Motswana"),
		MOZAMBICAN("Mozambican"),
		MYANMARESE("Myanmarese"),
		NAMIBIAN("Namibian"),
		NAURUAN("Nauruan"),
		NEPALESE("Nepalese"),
		NEW_CALEDONIAN("New Caledonian"),
		NEW_ZEALANDER("New Zealander"),
		NICARAGUAN("Nicaraguan"),
		NIGERIAN("Nigerian"),
		NIGERIEN("Nigerien"),
		NIUEAN("Niuean"),
		NI_VANUATU("Ni-Vanuatu"),
		NORFOLK_ISLANDER("Norfolk Islander"),
		NORTHERN_MARIANA("Northern Mariana"),
		NORTH_KOREAN("North Korean"),
		NORWEGIAN("Norwegian"),
		OMANI("Omani"),
		PAKISTANI("Pakistani"),
		PALAUAN("Palauan"),
		PALESTINIAN("Palestinian"),
		PANAMANIAN("Panamanian"),
		PAPUA_NEW_GUINEAN("Papua New Guinean"),
		PARAGUAYAN("Paraguayan"),
		PERUVIAN("Peruvian"),
		PITCAIRN_ISLANDER("Pitcairn Islander"),
		POLISH("Polish"),
		PORTUGUESE("Portuguese"),
		PUERTO_RICAN("Puerto Rican"),
		QATARI("Qatari"),
		ROMANIAN("Romanian"),
		RUSSIAN("Russian"),
		RWANDAN("Rwandan"),
		SAINT_HELENIAN("Saint Helenian"),
		SAINT_LUCIAN("Saint Lucian"),
		SAINT_PIERRAIS("Saint-Pierrais"),
		SAINT_VINCENTIAN("Saint Vincentian"),
		SALVADOREAN("Salvadorean"),
		SAMOAN("Samoan"),
		SANMARINESE("Sanmarinese"),
		SAUDI_ARABIAN("Saudi Arabian"),
		SCO_TOMEAN("Sćo Tomean"),
		SENEGALESE("Senegalese"),
		SERBIAN("Serbian"),
		SEYCHELLOIS("Seychellois"),
		SIERRA_LEONEAN("Sierra Leonean"),
		SINGAPOREAN("Singaporean"),
		SLOVAKIAN("Slovakian"),
		SLOVENIAN("Slovenian"),
		SOLOMON_ISLANDER("Solomon Islander"),
		SOMALI("Somali"),
		SOUTH_AFRICAN("South African"),
		SOUTH_KOREAN("South Korean"),
		SPANISH("Spanish"),
		SRI_LANDAN("Sri Lankan"),
		SUDANESE("Sudanese"),
		SURINAMER("Surinamer"),
		SWAZI("Swazi"),
		SWEDISH("Swedish"),
		SWISS("Swiss"),
		SYRIAN("Syrian"),
		TAIWANESE("Taiwanese"),
		TAJIKISTANI("Tajikistani"),
		TANZANIAN("Tanzanian"),
		THAI("Thai"),
		TIMORESE("Timorese"),
		TOGOLESE("Togolese"),
		TOKELAUAN("Tokelauan"),
		TONGAN("Tongan"),
		TRINIDADIAN("Trinidadian"),
		TUNISIAN("Tunisian"),
		TURKISH("Turkish"),
		TURKMEN("Turkmen"),
		TURKS_AND_CAICOS_ISLANDER("Turks and Caicos Islander"),
		TUVALUAN("Tuvaluan"),
		UGANDAN("Ugandan"),
		UKRAINIAN("Ukrainian"),
		URUGUAYAN("Uruguayan"),
		UZBEKISTANI("Uzbekistani"),
		VENEZUELAN("Venezuelan"),
		VIETNAMESE("Vietnamese"),
		VIRGIN_ISLANDER("Virgin Islander"),
		WALLISIAN("Wallisian"),
		WESTERN_SAHARAN("Western Saharan"),
		YEMENI("Yemeni"),
		ZAMBIAN("Zambian"),
		ZIMBABWEA("Zimbabwea");

		private String value;

		NationalityEnum(String value) {
			this.value = value;
		}

		public static NationalityEnum fromString(String strValue) {
			for (NationalityEnum natEnum : values()) {
				if (natEnum.value.equals(strValue))
					return natEnum;
			}
			return null;
		}

		public static NationalityEnum fromIndex(int i) {
			if (i >= 0 && i < values().length) {
				return values()[i];
			}
			return null;
		}

		public String getValue() {
			return value;
		}
	}

	@OneToOne
	private Person person;


/*	@Enumerated(EnumType.STRING)
	@AttributeOverride(name = "value", column = @Column(name = "value"))
	private NationalityEnum value;*/

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	/*public NationalityEnum getValue() {
		return value;
	}

	public void setValue(NationalityEnum value) {
		this.value = value;
	}*/

}
