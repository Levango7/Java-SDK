package Test.work;

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

public class Testing3 {

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
        String prikey = "9972e47b6f733a834bc6485085e5d39685401a515fd37932d17a8c0bcfac3e41";

        String fromPubkey2 = "13be75229850374c692536c36d05dcd10a10206811996a3fb4d605acfefa5c4b";

        String urlSendNonce = "http://192.168.1.40:19585/sendNonce";
        String params = "pubkeyhash="+ WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey);
        System.out.println("params:"+params);
        String result = sendPost(urlSendNonce,params);
        System.out.println("result:"+result);
        Integer nonce = (Integer) JSONObject.parseObject(result).get("data");

        for (int i = 1;i <= 3 ; i++){
            // 1.23 申请孵化
            nonce++;
            String txInfoIncubate = (String)TxUtility.ClientToIncubateAccount(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey), BigDecimal.valueOf(300),prikey,"" ,120,nonce.longValue()).get("message");
            String txIncubate = (String)TxUtility.ClientToIncubateAccount(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey), BigDecimal.valueOf(300),prikey,"" ,120,nonce.longValue()).get("data");
            System.out.println("txInfoIncubate:" + txInfoIncubate);
            System.out.println("txIncubate:" + txIncubate);
            System.out.println("nonce:"+nonce);
            sendTransaction(txInfoIncubate);
            // 1.24 提取收益（孵化器）
//            String incubateprofit = (String)TxUtility.ClientToIncubateProfit(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey),BigDecimal.valueOf(15.37560000),prikey,"c540fb3cb6fdf7d104952ffba5a48c1b80c0d02ba6ea8c95e151604936ec908f",nonce.longValue()).get("message");
//            String incubate = (String)TxUtility.ClientToIncubateProfit(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey),BigDecimal.valueOf(15.37560000),prikey,"c540fb3cb6fdf7d104952ffba5a48c1b80c0d02ba6ea8c95e151604936ec908f",nonce.longValue()).get("data");
//            System.out.println("incubate:"+incubate);
//            System.out.println("incubateprofit:"+incubateprofit);
//            System.out.println("nonce : " + nonce);
//            sendTransaction(incubateprofit);

            // 1.26 提取本金
//            String traninfo = (String) TxUtility.ClientToIncubatePrincipal(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey), BigDecimal.valueOf(300),prikey,"c540fb3cb6fdf7d104952ffba5a48c1b80c0d02ba6ea8c95e151604936ec908f", nonce.longValue()).get("message");
//            String txHash = (String) TxUtility.ClientToIncubatePrincipal(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey), BigDecimal.valueOf(300),prikey,"c540fb3cb6fdf7d104952ffba5a48c1b80c0d02ba6ea8c95e151604936ec908f", nonce.longValue()).get("data");
//            System.out.println("traninfo : "+traninfo);
//            System.out.println("txHash : "+txHash);
//            System.out.println("nonce : "+nonce);
//            sendTransaction(traninfo);

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