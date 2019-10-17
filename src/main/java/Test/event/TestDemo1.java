package test.event;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.company.keystore.wallet.TxUtility;
import com.company.keystore.wallet.WalletUtility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.net.URL;
import java.net.URLConnection;

public class TestDemo1 {

    private static String sendPost(String url, String param) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
//            System.out.println("发送 POST 请求出现异常！"+e);
//            e.printStackTrace();
            JSONObject jo = new JSONObject();
            jo.put("message", "Connection refused");
            jo.put("data", "");
            jo.put("code", "5000");
            return jo.toJSONString();
        }
        //使用finally块来关闭输出流、输入流
        finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }

    private static String sendGet(String url, String param) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
//            System.out.println("发送 POST 请求出现异常！"+e);
//            e.printStackTrace();
            JSONObject jo = new JSONObject();
            jo.put("message", "Connection refused");
            jo.put("data", "");
            jo.put("code", "5000");
            return jo.toJSONString();
        }
        //使用finally块来关闭输出流、输入流
        finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }






    //Pubkey:d0f1966cee219fcfdbcee698517fcf864f46817c30bc8218eb4889d02f312540
    //Prikey:9972e47b6f733a834bc6485085e5d39685401a515fd37932d17a8c0bcfac3e41
    //PubkeyHash:039a676b65273eeca96af35e35c05e482650c979
    //pubkeyHash2:d7cce761c3abe12d4650a952f4902cc3669de455
    String frompubkeystr = "d0f1966cee219fcfdbcee698517fcf864f46817c30bc8218eb4889d02f312540";
    String topubkeyhashstr = "039a676b65273eeca96af35e35c05e482650c979";
    String prikeystr = "9972e47b6f733a834bc6485085e5d39685401a515fd37932d17a8c0bcfac3e41";

    public static void main(String[] args) {

        BigDecimal aa = new BigDecimal(300);
        Integer cc = new Integer(120);
        BigDecimal oo = BigDecimal.valueOf(15.3756);


        String fromPubkey = "d0f1966cee219fcfdbcee698517fcf864f46817c30bc8218eb4889d02f312540";
        String toPubkeyHash = "039a676b65273eeca96af35e35c05e482650c979";
        String prikey = "9972e47b6f733a834bc6485085e5d39685401a515fd37932d17a8c0bcfac3e41";

        String urlSendNonce = "http://192.168.0.105:19585/sendNonce";
        String params = "pubkeyhash="+ WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey);
        System.out.println("params:"+params);
        String result = sendPost(urlSendNonce,params);
        System.out.println("result:"+result);
        Integer nonce = (Integer) JSONObject.parseObject(result).get("data");


        //发起转账申请
//        JSONObject AA = TxUtility.ClientToTransferAccount("d0f1966cee219fcfdbcee698517fcf864f46817c30bc8218eb4889d02f312540","d7cce761c3abe12d4650a952f4902cc3669de455",aa,"9972e47b6f733a834bc6485085e5d39685401a515fd37932d17a8c0bcfac3e41",nonce.longValue());
//        System.out.println(AA);
//        sendTransaction(AA.getString("message"));
        //params:pubkeyhash=039a676b65273eeca96af35e35c05e482650c979
        //result:{"message":"SUCCESS","data":0,"code":2000}
        //{"data":"a2767a56fabc127d686e0da13040631afe4c376a611138ba6b04c84816380f62",
        // "message":"01a2767a56fabc127d686e0da13040631afe4c376a611138ba6b04c84816380f62010000000000000001d0f1966cee219fcfdbcee698517fcf864f46817c30bc8218eb4889d02f312540000000000000000400000006fc23ac003ed775ace016063e1af1088a1f04edba570d6107b0c0243456521cef577a1f27176a0764f6358670135b8bf7e789e87aca74cee439a8af7d95a0c5972612cc03d7cce761c3abe12d4650a952f4902cc3669de45500000000",
        // "statusCode":0}
        //结果：{"message":"SUCCESS","data":{"transactionHash":"onZ6Vvq8En1obg2hMEBjGv5MN2phETi6awTISBY4D2I=","version":1,"type":1,"nonce":1,"from":"0PGWbO4hn8/bzuaYUX/Phk9GgXwwvIIY60iJ0C8xJUA=","gasPrice":4,"amount":30000000000,"payload":"","to":"18znYcOr4S1GUKlS9JAsw2ad5FU=","signature":"Ptd1rOAWBj4a8QiKHwTtulcNYQewwCQ0VlIc71d6HycXagdk9jWGcBNbi/fnieh6ynTO5Dmor32VoMWXJhLMAw==","blockHash":null,"fee":200000,"blockHeight":0},"code":2000}

        //params:pubkeyhash=039a676b65273eeca96af35e35c05e482650c979
        //result:{"message":"SUCCESS","data":5,"code":2000}
        //{"data":"1394b07e804915d9ac5702869487122a8c3f469b6c95254268dcbc793440d15f",
        // "message":"011394b07e804915d9ac5702869487122a8c3f469b6c95254268dcbc793440d15f010000000000000006d0f1966cee219fcfdbcee698517fcf864f46817c30bc8218eb4889d02f312540000000000000000400000006fc23ac0073c507ef51567d857eece9981026a643843345cc468eaa2c1a5dba036bef6590a836c5c1c1d437993b1aed835f3656ac62de498ef1294d30bac6d646370a960ad7cce761c3abe12d4650a952f4902cc3669de45500000000",
        // "statusCode":0}
        //结果：{"message":"SUCCESS","data":{"transactionHash":"E5SwfoBJFdmsVwKGlIcSKow/RptslSVCaNy8eTRA0V8=","version":1,"type":1,"nonce":6,"from":"0PGWbO4hn8/bzuaYUX/Phk9GgXwwvIIY60iJ0C8xJUA=","gasPrice":4,"amount":30000000000,"payload":"","to":"18znYcOr4S1GUKlS9JAsw2ad5FU=","signature":"c8UH71FWfYV+7OmYECamQ4QzRcxGjqosGl26A2vvZZCoNsXBwdQ3mTsa7YNfNlasYt5JjvEpTTC6xtZGNwqWCg==","blockHash":null,"fee":200000,"blockHeight":0},"code":2000}


        //发起孵化申请(孵化器)
//        JSONObject BB = TxUtility.ClientToIncubateAccount("d0f1966cee219fcfdbcee698517fcf864f46817c30bc8218eb4889d02f312540","039a676b65273eeca96af35e35c05e482650c979",aa,"9972e47b6f733a834bc6485085e5d39685401a515fd37932d17a8c0bcfac3e41","d7cce761c3abe12d4650a952f4902cc3669de455",cc,nonce.longValue());
//        System.out.println(BB);
//        sendTransaction(BB.getString("message"));
        //params:pubkeyhash=039a676b65273eeca96af35e35c05e482650c979
        //result:{"message":"SUCCESS","data":4,"code":2000}
        //{"data":"82d14638019a87de0b89f31f4f5c56bfbf9f67c393886817008f66038ac6b26d",
        // "message":"0182d14638019a87de0b89f31f4f5c56bfbf9f67c393886817008f66038ac6b26d090000000000000005d0f1966cee219fcfdbcee698517fcf864f46817c30bc8218eb4889d02f312540000000000000000200000006fc23ac005dcc408f09c2206efb6d01ffab6f02e524e91604033bb2d6e40f85de36591a235649173864b05e4d7e1b0fbd42620e6bb90fb65b8741af07bee976cf09e26a00039a676b65273eeca96af35e35c05e482650c9790000004e0a2000000000000000000000000000000000000000000000000000000000000000001228643763636537363163336162653132643436353061393532663439303263633336363964653435351878",
        // "statusCode":0}
        //结果：{"message":"SUCCESS","data":{"transactionHash":"gtFGOAGah94LifMfT1xWv7+fZ8OTiGgXAI9mA4rGsm0=","version":1,"type":9,"nonce":5,"from":"0PGWbO4hn8/bzuaYUX/Phk9GgXwwvIIY60iJ0C8xJUA=","gasPrice":2,"amount":30000000000,"payload":"CiAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABIoZDdjY2U3NjFjM2FiZTEyZDQ2NTBhOTUyZjQ5MDJjYzM2NjlkZTQ1NRh4","to":"A5pna2UnPuypavNeNcBeSCZQyXk=","signature":"XcxAjwnCIG77bQH/q28C5STpFgQDO7LW5A+F3jZZGiNWSRc4ZLBeTX4bD71CYg5ruQ+2W4dBrwe+6XbPCeJqAA==","blockHash":null,"fee":200000,"blockHeight":0},"code":2000}



        //提取收益(孵化器)
//        JSONObject CC = TxUtility.ClientToIncubateProfit("d0f1966cee219fcfdbcee698517fcf864f46817c30bc8218eb4889d02f312540","039a676b65273eeca96af35e35c05e482650c979",oo,"9972e47b6f733a834bc6485085e5d39685401a515fd37932d17a8c0bcfac3e41","82d14638019a87de0b89f31f4f5c56bfbf9f67c393886817008f66038ac6b26d",nonce.longValue());
//        System.out.println(CC);
//        sendTransaction(CC.getString("message"));
        //params:pubkeyhash=039a676b65273eeca96af35e35c05e482650c979
        //result:{"message":"SUCCESS","data":5,"code":2000}
        //{"data":"7c88981d4295fbb6807337e2e9714600d890d9a19458ef2e2ce06e6c8e8317ee",
        // "message":"017c88981d4295fbb6807337e2e9714600d890d9a19458ef2e2ce06e6c8e8317ee0a0000000000000006d0f1966cee219fcfdbcee698517fcf864f46817c30bc8218eb4889d02f3125400000000000000002000000005ba54dc03e0930f50df01b4bf2b9ab0c4b37b08f63011e0b13cf474fa5b1f01ef0589a0757e444a1a44af6f20b214c09ba16a8ac6ae1f121c224a15c324d21345c9bc50a039a676b65273eeca96af35e35c05e482650c9790000002082d14638019a87de0b89f31f4f5c56bfbf9f67c393886817008f66038ac6b26d",
        // "statusCode":0}
        //结果：{"message":"SUCCESS","data":{"transactionHash":"fIiYHUKV+7aAczfi6XFGANiQ2aGUWO8uLOBubI6DF+4=","version":1,"type":10,"nonce":6,"from":"0PGWbO4hn8/bzuaYUX/Phk9GgXwwvIIY60iJ0C8xJUA=","gasPrice":2,"amount":1537560000,"payload":"gtFGOAGah94LifMfT1xWv7+fZ8OTiGgXAI9mA4rGsm0=","to":"A5pna2UnPuypavNeNcBeSCZQyXk=","signature":"Pgkw9Q3wG0vyuasMSzewj2MBHgsTz0dPpbHwHvBYmgdX5EShpEr28gshTAm6FqisauHxIcIkoVwyTSE0XJvFCg==","blockHash":null,"fee":200000,"blockHeight":0},"code":2000}




        //提取分享收益(孵化器)
//        JSONObject DD = TxUtility.ClientToIncubateShareProfit("d0f1966cee219fcfdbcee698517fcf864f46817c30bc8218eb4889d02f312540","039a676b65273eeca96af35e35c05e482650c979",aa,"9972e47b6f733a834bc6485085e5d39685401a515fd37932d17a8c0bcfac3e41","be946c0834a7d411e96bbb10638cf2d195674cc2434fc2a33d3db3a0e7450f72",nonce.longValue());
//        System.out.println(DD);
//        sendTransaction(DD.getString("message"));

        //

        //提取本金(孵化器)
//        JSONObject EE = TxUtility.ClientToIncubatePrincipal("d0f1966cee219fcfdbcee698517fcf864f46817c30bc8218eb4889d02f312540","039a676b65273eeca96af35e35c05e482650c979",aa,"9972e47b6f733a834bc6485085e5d39685401a515fd37932d17a8c0bcfac3e41","82d14638019a87de0b89f31f4f5c56bfbf9f67c393886817008f66038ac6b26d",nonce.longValue());
//        System.out.println(EE);
//        sendTransaction(EE.getString("message"));
        //




        //获取事务对象
//        JSONObject FF = TxUtility.byteToTransaction("");
//        System.out.println(FF);
//        sendTransaction(EE.getString("message"));


    }

    private static void sendTransaction(String traninfo){
        String url2 = "http://192.168.0.186:19585/sendTransaction";
        String param2 = "traninfo=" + traninfo;
        String result2 = sendPost(url2, param2);
        System.out.println("结果："  + result2);
    }


}
