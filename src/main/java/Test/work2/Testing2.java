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

public class Testing2 {

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

        String fromPubkey = "e7f59871a339fd34d13e9fd2889e87388334caceabb710bdb6a0b2d536ddc65e";
        String toPubkeyHash = "c4061e318e4ce23ae37b56568a0d2edbe8d394fe";
        String prikey = "0e0582d6514863120a4e056d14eed0e314a278254c5f39d13a8a77a89bb5f6c6";

        String fromPubkey2 = "9b540090f5df7cd2e950a98e66f95eda13ad6808b946e98a32b8512a66c8858e";

        String urlSendNonce = "http://192.168.1.40:19585/sendNonce";
        String params = "pubkeyhash="+ WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey);
        System.out.println("params:"+params);
        String result = sendPost(urlSendNonce,params);
        System.out.println("result:"+result);
        Integer nonce = (Integer) JSONObject.parseObject(result).get("data");


//        for (int i = 1;i <= 3 ; i++) {
//            // 1.23 申请孵化
//            nonce++;
//            String txInfoIncubate = (String) TxUtility.ClientToIncubateAccount(fromPubkey, WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey), BigDecimal.valueOf(300), prikey, "", 120, nonce.longValue()).get("message");
//            String txIncubate = (String) TxUtility.ClientToIncubateAccount(fromPubkey, WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey), BigDecimal.valueOf(300), prikey, "", 120, nonce.longValue()).get("data");
//            System.out.println("txInfoIncubate : " + txInfoIncubate);
//            System.out.println("txIncubate : " + txIncubate);
//            System.out.println("nonce:" + nonce);
//            sendTransaction(txInfoIncubate);
//
//        }

        // 1.16 转账
        String txInfo = (String) TxUtility.ClientToTransferAccount(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey2), BigDecimal.valueOf(100000),prikey, nonce.longValue()).get("message");
        String txHash = (String) TxUtility.ClientToTransferAccount(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey2), BigDecimal.valueOf(100000),prikey, nonce.longValue()).get("data");
        System.out.println("txInfo:" + txInfo);
        System.out.println("txHash:" + txHash);
        sendTransaction(txInfo);


    }

    private static void sendTransaction(String traninfo){
        String url = "http://192.168.1.40:19585/sendTransaction";
        String param = "traninfo=" + traninfo;
//        System.out.println("traninfo:"+traninfo);
        String result = sendPost(url, param);
        System.out.println("结果:"+result);
    }

}
