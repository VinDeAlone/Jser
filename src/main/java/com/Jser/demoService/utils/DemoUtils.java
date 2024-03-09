package com.Jser.demoService.utils;

import java.util.ArrayList;
import java.util.List;

import com.Jser.demoService.dtos.Demo;

public class DemoUtils {
	
	private static List<Demo> demoList = new ArrayList<>();
	
	public static void mainDemo() {
			System.out.println(demoList.size());
	}
	
	public static List<Demo> getDemoList() {
		return demoList;
	}

	public static Demo getDemo(int id) {
		return demoList.get(id);
	}

	public static void setDemo(Demo d) {
		d.setId(getLastId());
		demoList.add(d);
	}

	private static int getLastId() {
		return demoList.size() + 1;
	}

}
