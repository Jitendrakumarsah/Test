package com.Util;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Page_Function {
	JSONArray array=null;
	JSONObject object,fr_country=null;
	public int number_WK_FrgnPlayer(JSONObject object, String key, String name) {
		array= (JSONArray)object.get("player");
		int count=0;
		for (int i=0; i<array.size();i++) {
			fr_country= (JSONObject)array.get(i);
			if(!fr_country.get(key).equals(name)) {
				count+=1;
			}
		}
		return count;
	}
}
