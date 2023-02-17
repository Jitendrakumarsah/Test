package com.Util;

import java.io.File;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class CommonFunction {
	JSONObject object = null;
	public JSONObject jsonRead(String file) {
		JSONParser parser = new JSONParser();
		try {
			FileReader reader= new FileReader(file);
			Object obj= parser.parse(reader);
			object= (JSONObject)obj;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return object;
	}

}
