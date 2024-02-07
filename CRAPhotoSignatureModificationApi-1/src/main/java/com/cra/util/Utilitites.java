package com.cra.util;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

@Component
public class Utilitites {

	
	public static boolean isValidRequest( String requestJosnString ) {
		boolean validFlag = true;

		// JSONObject requestJosnObj = null;
		try {
			JSONObject requestJosnObj = new JSONObject(requestJosnString);
		} catch (JSONException e) {
			validFlag = false;
		} finally {
		//	requestJosnObj = null;
		}
		return validFlag;
	}
	
}
