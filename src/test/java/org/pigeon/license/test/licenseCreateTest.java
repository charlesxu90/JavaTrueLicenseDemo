package org.pigeon.license.test;

import org.pigeon.license.create.CreateLicense;

/**
 * Created by charles on 16-8-21.
 */
public class licenseCreateTest {
    public static void main(String[] args){
        CreateLicense cLicense = new CreateLicense();
        //获取参数
        //cLicense.setParam("/home/charles/Documents/IdeaProjects/LisenseDemo/param.properties");
        // cLicense.setParam("./cn/melina/license/param.properties");
        cLicense.setParam("param.properties");

        //生成证书
        cLicense.create();
    }
}
