package test.testinfo;

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

public class test2 {

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

    public static void main(String[] args) {
        String fromPubkey = "d0f1966cee219fcfdbcee698517fcf864f46817c30bc8218eb4889d02f312540";
        String toPubkeyHash = "039a676b65273eeca96af35e35c05e482650c979";
        //PubkeyHash:d7cce761c3abe12d4650a952f4902cc3669de455
        String prikey = "9972e47b6f733a834bc6485085e5d39685401a515fd37932d17a8c0bcfac3e41";


        String urlSendNonce = "http://192.168.0.105:19585/sendNonce";
        String params = "pubkeyhash = " + WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey);
        System.out.println("params : " + params);
        String result = sendPost(urlSendNonce,params);
        System.out.println("result : " + result);
        Integer nonce = (Integer) JSONObject.parseObject(result).get("data");


        // 转账
//        String txInfo = (String) TxUtility.ClientToTransferAccount(fromPubkey,toPubkeyHash, BigDecimal.valueOf(0.1),prikey, nonce.longValue()).get("message");
//        System.out.println("txInfo:"+txInfo);
//        sendTransaction(txInfo);

        //params:pubkeyhash=039a676b65273eeca96af35e35c05e482650c979
        //result:{"message":"SUCCESS","data":6,"code":2000}
        //txInfo:01b9266be3de3dcdc6f110370ecff4889024dde713d07331402f21ccd569abccce010000000000000007d0f1966cee219fcfdbcee698517fcf864f46817c30bc8218eb4889d02f3125400000000000000004000000000098968045f804aa9826a205edd32eeace2ea672ad300962aad8e87ab242963e147c0f07cee2c67a197ee26f3c7a8c67de69017a7805c1055cb2d5eb82f1f1de2f69ce04039a676b65273eeca96af35e35c05e482650c97900000000
        //结果：{"message":"SUCCESS","data":{"transactionHash":"uSZr4949zcbxEDcOz/SIkCTd5xPQczFALyHM1WmrzM4=","version":1,"type":1,"nonce":7,"from":"0PGWbO4hn8/bzuaYUX/Phk9GgXwwvIIY60iJ0C8xJUA=","gasPrice":4,"amount":10000000,"payload":"","to":"A5pna2UnPuypavNeNcBeSCZQyXk=","signature":"RfgEqpgmogXt0y7qzi6mcq0wCWKq2Oh6skKWPhR8DwfO4sZ6GX7ibzx6jGfeaQF6eAXBBVyy1euC8fHeL2nOBA==","blockHash":null,"fee":200000,"blockHeight":0},"code":2000}


        // 申请孵化
        String txInfoIncubate = (String)TxUtility.ClientToIncubateAccount(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey), BigDecimal.valueOf(300),prikey,"" ,120,nonce.longValue()).get("message");
        String txIncubate = (String)TxUtility.ClientToIncubateAccount(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey), BigDecimal.valueOf(300),prikey,"" ,120,nonce.longValue()).get("data");
        System.out.println("txIncubate:"+txIncubate);
        sendTransaction(txInfoIncubate);

        //params:pubkeyhash=039a676b65273eeca96af35e35c05e482650c979
        //result:{"message":"SUCCESS","data":10,"code":2000}
        //txIncubate:606f26549f5dfb73ae614f4bbf78852f7e8d1aa1ed9282eb848d4b6fc072c2ce
        //结果：{"message":"SUCCESS","data":{"transactionHash":"YG8mVJ9d+3OuYU9Lv3iFL36NGqHtkoLrhI1Lb8Byws4=","version":1,"type":9,"nonce":11,"from":"0PGWbO4hn8/bzuaYUX/Phk9GgXwwvIIY60iJ0C8xJUA=","gasPrice":2,"amount":30000000000,"payload":"CiAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABh4","to":"A5pna2UnPuypavNeNcBeSCZQyXk=","signature":"Usj/5MizDPWBHpXAllXXMwhTawWsV41R6ZKHXvc8hfQjHKpXO6mFS0bQodJ1rPBtj+PYEU8WpPgSiVaRgITCCQ==","blockHash":null,"fee":200000,"blockHeight":0},"code":2000}

        // 提取收益（孵化器）
//        String incubateprofit = (String) TxUtility.ClientToIncubateProfit(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey), BigDecimal.valueOf(15.3756),prikey,"a1fa9e43eb8b17fa77d81cda1c9c3f8c7187e5af2972626afe6b18d6fb03b2d2",nonce.longValue()).get("message");
//        String incubate = (String)TxUtility.ClientToIncubateProfit(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey),BigDecimal.valueOf(15.3756),prikey,"a1fa9e43eb8b17fa77d81cda1c9c3f8c7187e5af2972626afe6b18d6fb03b2d2",nonce.longValue()).get("data");
//        System.out.println("incubate:"+incubate);
//        sendTransaction(incubateprofit);

        //params:pubkeyhash=039a676b65273eeca96af35e35c05e482650c979
        //result:{"message":"SUCCESS","data":10,"code":2000}
        //incubate:ca09f18cae092deea8f32d92f2bda06877f3b19746362dc483f6c5ee59c0b45f
        //结果：{"message":"SUCCESS","data":{"transactionHash":"ygnxjK4JLe6o8y2S8r2gaHfzsZdGNi3Eg/bF7lnAtF8=","version":1,"type":10,"nonce":11,"from":"0PGWbO4hn8/bzuaYUX/Phk9GgXwwvIIY60iJ0C8xJUA=","gasPrice":2,"amount":1537560000,"payload":"ofqeQ+uLF/p32BzaHJw/jHGH5a8pcmJq/msY1vsDstI=","to":"A5pna2UnPuypavNeNcBeSCZQyXk=","signature":"AMHcQ9nLg4qxt/AA7dLDV+0Y9B1ZdnyH7xYmeJXPrYfveS4/FYlRHTp8BF5FyaJdSOu8EvU/+Lyl8qTbW2r6DA==","blockHash":null,"fee":200000,"blockHeight":0},"code":2000}

        // 提取本金
//        String txInfo = (String) TxUtility.ClientToIncubatePrincipal(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey), BigDecimal.valueOf(300),prikey,"a1fa9e43eb8b17fa77d81cda1c9c3f8c7187e5af2972626afe6b18d6fb03b2d2", nonce.longValue()).get("message");
//        sendTransaction(txInfo);

        //params:pubkeyhash=039a676b65273eeca96af35e35c05e482650c979
        //result:{"message":"SUCCESS","data":11,"code":2000}
        //结果：{"message":"SUCCESS","data":{"transactionHash":"GkANAXDnua0W54i6ySsU+Y+EVsLEwUKwRhM5FCP/7tA=","version":1,"type":12,"nonce":12,"from":"0PGWbO4hn8/bzuaYUX/Phk9GgXwwvIIY60iJ0C8xJUA=","gasPrice":2,"amount":30000000000,"payload":"ofqeQ+uLF/p32BzaHJw/jHGH5a8pcmJq/msY1vsDstI=","to":"A5pna2UnPuypavNeNcBeSCZQyXk=","signature":"B9r4+CK0S428b4xdEuy6CF2eCAHnMUmB+eN5jm8cOY+a6tFCtMIJ2mAQAYzMEa/9OrxQlnushIHFIAIHuufGCA==","blockHash":null,"fee":200000,"blockHeight":0},"code":2000}

    }

    private static void sendTransaction(String traninfo){
        String url2 = "http://192.168.0.105:19585/sendTransaction";
        String param2 = "traninfo = " + traninfo;
        String result2 = sendPost(url2, param2);
        System.out.println("结果 ： "  + result2);
    }

}
