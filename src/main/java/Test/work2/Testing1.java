package Test.work2;

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

public class Testing1 {

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
        String fromPubkey = "fded3c8de24ea81f10b7761cdb8d7991b396340b8f09988783d723516ff724bb";
        String toPubkeyHash = "2c04de0200ab247954d81eac9a26024d27add58c";
        String prikey = "e90369c836bff80dad748fa674f2606d77599db5580871356c0d20e3945073c7";

        String fromPubkey2 = "13be75229850374c692536c36d05dcd10a10206811996a3fb4d605acfefa5c4b";
        String fromPubkey3 = "64d4cbdd7d28234c62de2d487cf93342a911ca6290c675671f661eb91bd02e73";
        String fromPubkey4 = "06bf7c077fa375889ae04c214ef464613802e491d9adf8fbfd397f45be8b9557";
        String fromPubkey5 = "f8e77285d7a9d6facb01cf1298baeb8c7bf4d144806e88d3e7975429cabd5f32";


        String urlSendNonce = "http://192.168.1.40:19585/sendNonce";
        String params = "pubkeyhash=" + WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey);
        System.out.println("params:" + params);
        String result = sendPost(urlSendNonce,params);
        System.out.println("result:" + result);
        Integer nonce = (Integer) JSONObject.parseObject(result).get("data");


        for (int i = 1;i <= 3 ; i++) {
            // 1.23 申请孵化
            nonce++;
            String txInfoIncubate = (String) TxUtility.ClientToIncubateAccount(fromPubkey, WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey), BigDecimal.valueOf(300), prikey, "", 120, nonce.longValue()).get("message");
            String txIncubate = (String) TxUtility.ClientToIncubateAccount(fromPubkey, WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey), BigDecimal.valueOf(300), prikey, "", 120, nonce.longValue()).get("data");
            System.out.println("txInfoIncubate:" + txInfoIncubate);
            System.out.println("txIncubate:" + txIncubate);
            System.out.println("nonce:" + nonce);
            sendTransaction(txInfoIncubate);
        }



    }

    private static void sendTransaction(String traninfo){
        String url = "http://192.168.1.40:19585/sendTransaction";
        String param = "traninfo=" + traninfo;
//        System.out.println("traninfo:"+traninfo);
        String result = sendPost(url, param);
        System.out.println("结果:" + result);
    }

}
