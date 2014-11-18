package jobs.opportunities.entity.common;

import java.util.Arrays;
import java.util.List;

public enum SearchConditionType {

	LOCATION, //need to track if continent, state or city was choses along with name of continent, resp. state, resp. city
	SKILL,          // need to track name of skill
	YEARS_OF_EXPS,  // need to track number of years, type of position(REGULAR, MANAGER, EXECUTIVE) and, manager years counts also as regular and so on inclusive...
	AGE,            // two values of min and max age
	SALARY,         // two values of min and max salary plus currency
	HOME_OFFICE("NOT_ALLOWED", "EXCEPTIONALLY_ALLOWED", "OCASSIONALLY_ALLOWED", "ALMOST_PERMANENT", "PERMANENT" ),    //
	TYPE_OF_CONTRACT("EMPLOYEE","CONTRACTOR","SMLOUVA_O_DILO" , "REQUEST_FOR_PROPOSAL" ),
	DISABLED("YES", "NO"),
	LANGUAGE, // need to track language and lagn level or year of exp from job positions
	AVAILABILITY, // ASAP or date
	DISTANCE_TO_WORK, // in KM plus gps of location - in interview you can specify also GPS as position of work
	WORK_FOR_BANK ("YES", "NO"),
	TRAVELLING ("NO_TRAVELLLING", "EXCEPTIONAL", "OCASSIONAL", "ALMOST_PERMANENT", "PERMANENT"),
	RELIGION (Religion.values().toString()),                    // TODO apply function .name to all values from enum !!! ALSO NEED TO KEEP BOOLEAN IF IT SHOULD BE THIS RELIGION OR SHOUND NOT BE THE RELIGON
	ORIENTATION(Orientation.values().toString()),               // TODO THE SAME FOR FOLLOWING CONDITIONS
	GENDRE ( Gender.values().toString()),
	NATIONALITY (Nationality.values().toString());

	private List<String> enumeration = null;

	SearchConditionType(String... enumeration) {
		this.enumeration = Arrays.asList(enumeration);
	}
}
