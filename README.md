# JavaTrueLicenseDemo

## 这是一个Java程序添加license的样例.通过使用true license对程序添加license. 步骤分为如下几步:
+ 通过keytool创建license文件
- 创建license生成
+ license验证

## 下面将对其一一进行描述.

### 1. 通过keytool创建明密文库(store)文件
首先,需要用keytool生成公钥和私钥库.期间,需要设置苦密码,输入公司信息.
<p>keytool -genkey -alias privatekey -keystore privateKeys.store -validity 3650</p>
接下来,需要将公钥单独建库.首先导出公钥,
<P>keytool -export -alias privatekey -file certfile.cer -keystore privateKeys.store</P>
然后将到处的公钥,导入到新的keystore里面去.
<P>keytool -import -alias publiccert -file certfile.cer -keystore publicCerts.store</P>

### 2. 在程序负责人端通过create创建lic文件
首先,需要拷贝privatekey.store到代码中对应的文件夹下.
<P>cp privatekey.store src/main/java/org/pigeon/license/create</P>
然后依据license内容修改param.properties文件.修改后后,运行testCreateLicense,创建lic结尾的license文件.

### 3. 在客户端通过lic文件验证使用软件
创建好lic结尾的license文件后,将publicCerts.store拷贝到代码中对应的文件夹下.
<P>cp publicCerts.store  src/main/java/org/pigeon/license/verify</P>
然后修改param2.properties文件,使其与param.properties文件中的参数相对应.修改后运行testVerifyLicense.

