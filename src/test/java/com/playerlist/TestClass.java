package com.playerlist;

import java.io.File;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Util.CommonFunction;
import com.Util.Page_Function;

public class TestClass {
	CommonFunction common= new CommonFunction();
	Page_Function pg_function= new Page_Function();
	JSONObject object=null;
	@BeforeTest
	public void setup() {try {
			String file= System.getProperty("user.dir")+ "\\Resources\\PlayerList.JSON";
			object=common.jsonRead(file);
			System.out.println(object);
		}catch(Exception e) {
			System.out.println("File not found");
		}   
		
	}
	@Test
	public void checkForeignPlayer_Count() {
		int foreignplayer_count= pg_function.number_WK_FrgnPlayer(object, "country", "India");
		if(foreignplayer_count==4) {
			System.out.println("Team has only four foreign playes");
		}else {
			System.out.println("Team has not exact four foreign playes"+foreignplayer_count);
		}
	}
	
	@Test
	public void checkWicketKeeperCount() {
		int wicketkeeper_Count= pg_function.number_WK_FrgnPlayer(object, "role", "Wicket-keeper");
		if(wicketkeeper_Count!=0) {
			System.out.println("Team has at least a wicket keeper");
		}else {
			System.out.println("Team doesn't have any wicket keeper");
		}
	}
}
