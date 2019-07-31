package cn.edu.nju.software.usermanager.utils;

import java.util.UUID;

public class VerifyCodeGeneratorUtil {

    public static String  generatorRandomLetters(int length){

        if(length>128|| length<=0){
            return null;
        }

        String s = UUID.randomUUID().toString();
        String code= s.substring(0,length);
        return code;
    }
}
