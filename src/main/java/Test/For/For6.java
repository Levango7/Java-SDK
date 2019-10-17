package test.For;

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

public class For6 {

    private static String ip;

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
        for (int i = 1;i <= 200;i++){

            String fromPubkey = "d0f1966cee219fcfdbcee698517fcf864f46817c30bc8218eb4889d02f312540";
            String toPubkeyHash = "039a676b65273eeca96af35e35c05e482650c979";
            String prikey = "9972e47b6f733a834bc6485085e5d39685401a515fd37932d17a8c0bcfac3e41";
            String fromPubkey2 = "13be75229850374c692536c36d05dcd10a10206811996a3fb4d605acfefa5c4b";

            byte[] f ="1221321".getBytes();

            String urlSendNonce = "http://192.168.1.118:19585/sendNonce";
            String params = "pubkeyhash = "+ WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey);
            System.out.println("params" + i + " : " + params);
            String result = sendPost(urlSendNonce,params);
            System.out.println("result" + i + " : " + result);
            Integer nonce = (Integer) JSONObject.parseObject(result).get("data");

            String traninfo = (String) TxUtility.ClientToTransferProve(fromPubkey,nonce.longValue(),f,prikey).get("message");
            String txHash = (String) TxUtility.ClientToTransferProve(fromPubkey,nonce.longValue(),f,prikey).get("data");
            System.out.println("traninfo" + i + " : " + traninfo);
            System.out.println("txHash" + i + " : " + txHash);
            sendTransaction(traninfo);

        }
    }

    private static void sendTransaction(String traninfo) {
        String url = "http://192.168.1.118:19585/sendTransaction";
        String param = "traninfo = " + traninfo;
        String result = sendPost(url, param);
        System.out.println("结果 ： "  + result);
    }


}
