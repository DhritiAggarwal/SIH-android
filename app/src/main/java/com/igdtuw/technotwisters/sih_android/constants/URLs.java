package com.igdtuw.technotwisters.sih_android.constants;

/**
 * Created by megha on 10/03/17.
 */

public interface URLs {

    String BASE_URL = "http://shikshakarohan.herokuapp.com";

    String LOGIN_URL = "/api/login/";
    String LOGOUT_URL = "/api/logout/";
    String SIGN_UP_URL = "/api/signup/";

    String ADD_SCHOOL_URL = "/api/addschool/";
    String GET_LAT_LONG = "/api/latlong/";
    String IS_SCHOOL_ADDED_URL = "api/isschooladded/";

    String MARK_ATTENDANCE_URL = "/api/markattendance/";

    String PARAM_USERNAME = "username";
    String PARAM_PASSWORD = "password";
    String PARAM_ACCESS_TOKEN = "access_token";
    String PARAM_NAME = "name";
    String PARAM_EMAIL = "email";
    String PARAM_AGE = "age";
    String PARAM_CONTACT_NUMBER = "contact_num";
    String PARAM_EXPERTISE = "area_of_expertise";
    String PARAM_ADDRESS = "address";
    String PARAM_CITY = "city";
    String PARAM_STATE = "state";
    String PARAM_PREFERRED_LOCATION = "preferred_location";
    String PARAM_QUALIFICATION = "qualification";
    String PARAM_TEACHING_EXPERIENCE = "teaching_experience";

    String PARAM_TEACHER_USERNAME = "teacher_username";

    String PARAM_SCHOOL_USERNAME = "school_username";
    String PARAM_DATE = "date";
    String PARAM_LATITUDE = "latitude";
    String PARAM_LONGITUDE = "longitude";
    String PARAM_ACCURACY = "accuracy";
    String PARAM_PRESENCE = "presence";

}
