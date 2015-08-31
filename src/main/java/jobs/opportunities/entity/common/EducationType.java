package jobs.opportunities.entity.common;

public enum EducationType {
	COLLEGE("College"),
	HIGH_SCHOOL("High school"),
	SECONDARY_SCHOOL("Secondary school"),
	UNIVERSITY("University");

	private String value;

	EducationType(String value) {
		this.value = value;
	}

	public static EducationType fromString(String strValue) {
		for (EducationType natEnum : values()) {
			if (natEnum.value.equals(strValue))
				return natEnum;
		}
		return null;
	}

	public String getValue() {
		return value;
	}

}
