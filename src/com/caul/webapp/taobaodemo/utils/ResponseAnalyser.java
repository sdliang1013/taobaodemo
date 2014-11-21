package com.caul.webapp.taobaodemo.utils;

import net.sf.json.JSONObject;

import com.taobao.api.TaobaoResponse;

public class ResponseAnalyser {

	public static JSONObject getBody(TaobaoResponse response){
		if(response != null){
			return JSONObject.fromObject(response.getBody());
		}
		return null;
	}
}
