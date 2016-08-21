package org.pigeon.license.test;

import org.pigeon.license.verify.VerifyLicense;

/**
 * Created by charles on 16-8-21.
 */
public class licenseVerifyTest {
    public static void main(String[] args){
        VerifyLicense vLicense = new VerifyLicense();
        //获取参数
        // vLicense.setParam("/home/charles/Documents/IdeaProjects/LisenseDemo/param2.properties");
        vLicense.setParam("param2.properties");
        //验证证书
        try {
            vLicense.verify();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}