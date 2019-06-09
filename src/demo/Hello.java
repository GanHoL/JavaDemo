package demo;

import java.util.HashMap;

public class Hello {
    public static void main(String[] args) {
        System.out.println("hello java");
        HashMap<String, String> map = new HashMap<>();



        map.put("zhangsan","男");
        map.put("lisi","女");
        String sex = map.get("lisi");
        System.out.println("性别"+sex);

        map.remove("zhangsan");

        System.out.println();


    }





}

