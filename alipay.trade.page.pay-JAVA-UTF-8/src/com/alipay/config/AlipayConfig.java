package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016102900775660";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCP1ygOay+YXD0NCj5HhL2SgBsEHVo0HFPb+EjfuDV11QikaLOUfrQeI0m2itJJPzGtQ+g9ClNOB35HiqAxSmikhMY6CTZkYRursHT29+3LcXaZzF3OpWvjTIP6zsFmZSU0w17CYr7tbBAvpPqYmx22XclpAdT7Su0CxANMLgzajjEQ2yKitTXNXTqjOuQL3i2SmfNEn0XCCUvMBbRftE/JsFWztSXhyOG0MM2IZBLLTtuHzmZdpZAicTmssRiAs4eRvmjCDoCB1g0gRC9EfPNdGquqa3l1ItcdKbAT5St8R2AfDEB+u5qlR+HT+GurxK0KFIfoD5UDvBG2Ywm91iEnAgMBAAECggEAEB7sBVmr9uZ3jSuVuUw+NtoWrQphHrACEggsmq45h6A9nLeDUOQ2aZ5I16WNVdo4RhPzRkwO9BLQ61G1DHErcyzSTpTTvMJJaJ+ZLEizJPbtdOU7qjpN8iaUMBrWABTb66LtztlkTpWq5rwVvd68oMC4HwWuig9mqsWvHO2YUTItPjcSAf+3ZdaT9lXY7nkrPrLmqcO9NBqQF8sAM0xU8MSMD/GR8aNsr5/rDyayxZ32B9wASSCntoef6Xxvm/98Rb1PqvCYyFpqqKbfAIf8a6lkIHz86FQLq2eCL7pRzXQ8v/PAvioEkvXwxIhMGjSKKcEXp2poLVROvRT3/DB2oQKBgQDUn1EuPQRnPxHy8o/DXwHK5OfwVF1h+mvHHRzBCzj5BZWJ4/dsiJeZTDHtd4WdU7CPrj9TpXIEYguHxC/XLyacLnJ8XT5e7YXouoOWjK6h/GabhWETRJi7dDF9cUP7Gk5k137YXAk+W5ibEm4rXVJVHYWTmr5YvPR2A35kfRNy8QKBgQCtL4zODkmOebszuNSy4AXEPQsVs5AsElmDEUxsS+yR8a0eHmI8tFtXAhjsBK28dAC8OWfAzxotkhCi/KxLy1xS9w5AzPJMIyvTAwdBx2u39twDQMe12qB78el4DjSIHgGwF/WqJraWQAwQ9dpkd40z6PWnXMFfsmz8gjZ6wsillwKBgAT64kzh8vt0F7iIA+QAkqss513SrAlCc0nLncPLvn7eqZz8MOxi2qIljbnRJdkEf8stup/77Qq7PSfl6XTxzsazs8zD5lUU3SERVUmua9yxa7nSyu5Hmggx9YLJp1z3RcTI41iv9yt1u8JOETSE0AvcUCef5Ttw2Yz2EfzKjS0RAoGAbNzy+aPpgPHsRvrsWPSRK2XjzeRtwAZY1hbNn1Wqg6MTW1dmERqeP/dFizb1rvyMacT7/yswHW0voASMmahfhJdgEkPCGzIQnjfNHAArKhy2+CSEZT/kmYTbaWgkhVu3W+Xzut1S8OeZrh+dBIJR9Et//5BCzdDuyVtgu5ItZkkCgYB/9AYpUIhRd03Ju4H/OEbVQCOI7E0SArFpavz917z+QWnpJ1rIm2wXkjhq010uZkVvi+NZm4DW+EzMsgbbB5HSaOPE63LOOB5+zvScgHmZVtJS5IsPF6hXt3DjGHSM/y4w+N22dt3NQ7iVG3xQIZzO+lgNbO8KJYQSxZyY1gUQpg==";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAj9coDmsvmFw9DQo+R4S9koAbBB1aNBxT2/hI37g1ddUIpGizlH60HiNJtorSST8xrUPoPQpTTgd+R4qgMUpopITGOgk2ZGEbq7B09vfty3F2mcxdzqVr40yD+s7BZmUlNMNewmK+7WwQL6T6mJsdtl3JaQHU+0rtAsQDTC4M2o4xENsiorU1zV06ozrkC94tkpnzRJ9FwglLzAW0X7RPybBVs7Ul4cjhtDDNiGQSy07bh85mXaWQInE5rLEYgLOHkb5owg6AgdYNIEQvRHzzXRqrqmt5dSLXHSmwE+UrfEdgHwxAfruapUfh0/hrq8StChSH6A+VA7wRtmMJvdYhJwIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://192.168.5.1:8080/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://192.168.5.1:8080/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

