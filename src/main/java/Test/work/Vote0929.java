package test.work;

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

public class Vote0929 {

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

        String fromPubkey6 = "fded3c8de24ea81f10b7761cdb8d7991b396340b8f09988783d723516ff724bb";
        String toPubkeyHash6 = "2c04de0200ab247954d81eac9a26024d27add58c";
        String prikey6 = "e90369c836bff80dad748fa674f2606d77599db5580871356c0d20e3945073c7";

        String fromPubkey2 = "13be75229850374c692536c36d05dcd10a10206811996a3fb4d605acfefa5c4b";
        String fromPubkey3 = "64d4cbdd7d28234c62de2d487cf93342a911ca6290c675671f661eb91bd02e73";
        String fromPubkey4 = "06bf7c077fa375889ae04c214ef464613802e491d9adf8fbfd397f45be8b9557";
        String fromPubkey5 = "f8e77285d7a9d6facb01cf1298baeb8c7bf4d144806e88d3e7975429cabd5f32";

//        String toPubkeyHash2 = "d7cce761c3abe12d4650a952f4902cc3669de455";
//        String toPubkeyHash3 = "ece8b7fbdc2f73bf5c2a8d5b1b9cf9c4952778a1";
//        String toPubkeyHash4 = "a3ec8e79e7f37a9127ce4919c5957b24a42e0c5b";
//        String toPubkeyHash5 = "f47cf5ceb6dafc9071f19d6dc801113d4f519159";

        String urlSendNonce = "http://192.168.1.118:19585/sendNonce";
        String params = "pubkeyhash="+ WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey6);
        System.out.println("params:"+params);
        String result = sendPost(urlSendNonce,params);
        System.out.println("result:"+result);
        Integer nonce = (Integer) JSONObject.parseObject(result).get("data");



        //1.19 投票
//        String traninfo = (String) TxUtility.ClientToTransferVote(fromPubkey6,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey6), BigDecimal.valueOf(300),nonce.longValue(),prikey6).get("message");
//        String txHash = (String)TxUtility.ClientToTransferVote(fromPubkey6,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey6),BigDecimal.valueOf(300),nonce.longValue(),prikey6).get("data");
//        System.out.println("traninfo : " + traninfo);
//        System.out.println("txHash : " + txHash);
//        sendTransaction(traninfo);
//
//        nonce++;
//        String traninfo2 = (String) TxUtility.ClientToTransferVote(fromPubkey6,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey2), BigDecimal.valueOf(300),nonce.longValue(),prikey6).get("message");
//        String txHash2 = (String)TxUtility.ClientToTransferVote(fromPubkey6,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey2),BigDecimal.valueOf(300),nonce.longValue(),prikey6).get("data");
//        System.out.println("traninfo2 : " + traninfo2);
//        System.out.println("txHash2 : " + txHash2);
//        sendTransaction(traninfo2);
//
//        nonce++;
//        String traninfo3 = (String) TxUtility.ClientToTransferVote(fromPubkey6,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey3), BigDecimal.valueOf(300),nonce.longValue(),prikey6).get("message");
//        String txHash3 = (String)TxUtility.ClientToTransferVote(fromPubkey6,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey3),BigDecimal.valueOf(300),nonce.longValue(),prikey6).get("data");
//        System.out.println("traninfo3 : "+ traninfo3);
//        System.out.println("txHash3 : "+ txHash3);
//        sendTransaction(traninfo3);
//
//        nonce++;
//        String traninfo4 = (String) TxUtility.ClientToTransferVote(fromPubkey6,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey4), BigDecimal.valueOf(300),nonce.longValue(),prikey6).get("message");
//        String txHash4 = (String)TxUtility.ClientToTransferVote(fromPubkey6,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey4),BigDecimal.valueOf(300),nonce.longValue(),prikey6).get("data");
//        System.out.println("traninfo4 : " + traninfo4);
//        System.out.println("txHash4 : "+ txHash4);
//        sendTransaction(traninfo4);
//
//        nonce++;
//        String traninfo5 = (String) TxUtility.ClientToTransferVote(fromPubkey6,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey5), BigDecimal.valueOf(300),nonce.longValue(),prikey6).get("message");
//        String txHash5 = (String)TxUtility.ClientToTransferVote(fromPubkey6,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey5),BigDecimal.valueOf(300),nonce.longValue(),prikey6).get("data");
//        System.out.println("traninfo5 : " + traninfo5);
//        System.out.println("txHash5 : " + txHash5);
//        sendTransaction(traninfo5);




        String traninfo = (String)TxUtility.ClientToTransferVoteWithdraw(fromPubkey6,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey6),BigDecimal.valueOf(300),nonce.longValue(),prikey6,"bc7859a33bac87ac243e5430f996be20f0adae1e8e99880ec400c8bcc9cee617").get("message");
        String txHash = (String)TxUtility.ClientToTransferVoteWithdraw(fromPubkey6,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey6),BigDecimal.valueOf(300),nonce.longValue(),prikey6,"bc7859a33bac87ac243e5430f996be20f0adae1e8e99880ec400c8bcc9cee617").get("data");
        System.out.println("traninfo : " + traninfo);
        System.out.println("txHash : " + txHash);
        sendTransaction(traninfo);

        nonce++;
        String traninfo2 = (String)TxUtility.ClientToTransferVoteWithdraw(fromPubkey6,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey2),BigDecimal.valueOf(300),nonce.longValue(),prikey6,"990984665637f0b70d37194cd2173c9615e49de0102dc723e8339f2629cf8499").get("message");
        String txHash2 = (String)TxUtility.ClientToTransferVoteWithdraw(fromPubkey6,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey2),BigDecimal.valueOf(300),nonce.longValue(),prikey6,"990984665637f0b70d37194cd2173c9615e49de0102dc723e8339f2629cf8499").get("data");
        System.out.println("traninfo2 : " + traninfo2);
        System.out.println("txHash2 : " + txHash2);
        sendTransaction(traninfo2);

        nonce++;
        String traninfo3 = (String)TxUtility.ClientToTransferVoteWithdraw(fromPubkey6,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey3),BigDecimal.valueOf(300),nonce.longValue(),prikey6,"d8ff33cbb57f2a72c6f69887ac755f22b0f2cb59ded2255a6e8b9a86d4412885").get("message");
        String txHash3 = (String)TxUtility.ClientToTransferVoteWithdraw(fromPubkey6,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey3),BigDecimal.valueOf(300),nonce.longValue(),prikey6,"d8ff33cbb57f2a72c6f69887ac755f22b0f2cb59ded2255a6e8b9a86d4412885").get("data");
        System.out.println("traninfo3 : " + traninfo3);
        System.out.println("txHash3 : " + txHash3);
        sendTransaction(traninfo3);

        nonce++;
        String traninfo4 = (String)TxUtility.ClientToTransferVoteWithdraw(fromPubkey6,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey4),BigDecimal.valueOf(300),nonce.longValue(),prikey6,"d826d907b81aafc8556d4fb899f48036ec158818767611624a63bc391c258f0f").get("message");
        String txHash4 = (String)TxUtility.ClientToTransferVoteWithdraw(fromPubkey6,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey4),BigDecimal.valueOf(300),nonce.longValue(),prikey6,"d826d907b81aafc8556d4fb899f48036ec158818767611624a63bc391c258f0f").get("data");
        System.out.println("traninfo4 : " + traninfo4);
        System.out.println("txHash4 : " + txHash4);
        sendTransaction(traninfo4);

        nonce++;
        String traninfo5 = (String)TxUtility.ClientToTransferVoteWithdraw(fromPubkey6,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey5),BigDecimal.valueOf(300),nonce.longValue(),prikey6,"3ce1042fb4854fe59682bb36675fc3f11a0a191ecfd182e43c9ec38230678466").get("message");
        String txHash5 = (String)TxUtility.ClientToTransferVoteWithdraw(fromPubkey6,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey5),BigDecimal.valueOf(300),nonce.longValue(),prikey6,"3ce1042fb4854fe59682bb36675fc3f11a0a191ecfd182e43c9ec38230678466").get("data");
        System.out.println("traninfo5 : " + traninfo5);
        System.out.println("txHash5 : " + txHash5);
        sendTransaction(traninfo5);




    }

    private static void sendTransaction(String traninfo){
        String url = "http://192.168.1.118:19585/sendTransaction";
        String param = "traninfo=" + traninfo;
        String result = sendPost(url, param);
        System.out.println("结果："  + result);
    }

}
