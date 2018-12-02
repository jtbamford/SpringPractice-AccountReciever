package com.qa.AccountReciever.Util;

import org.springframework.stereotype.Component;
import com.google.gson.Gson;

@Component
public class JSONUtil {
	
	private Gson gson;

	public JSONUtil() {
		this.gson = new Gson();
	}

	public String toJSON(Object obj) {
		return gson.toJson(obj);
	}

	public <T> T fromJSON(String jsonString, Class<T> clazz) {
		return gson.fromJson(jsonString, clazz);
	}

}
