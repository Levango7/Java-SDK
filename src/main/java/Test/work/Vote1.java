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

public class Vote1 {

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
        String fromPubkey3 = "64d4cbdd7d28234c62de2d487cf93342a911ca6290c675671f661eb91bd02e73";
        String fromPubkey4 = "06bf7c077fa375889ae04c214ef464613802e491d9adf8fbfd397f45be8b9557";
        String fromPubkey5 = "f8e77285d7a9d6facb01cf1298baeb8c7bf4d144806e88d3e7975429cabd5f32";

        String urlSendNonce = "http://192.168.1.118:19585/sendNonce";
        String params = "pubkeyhash="+ WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey);
        System.out.println("params:"+params);
        String result = sendPost(urlSendNonce,params);
        System.out.println("result:"+result);
        Integer nonce = (Integer) JSONObject.parseObject(result).get("data");


        //1.19 投票
//        String traninfo = (String) TxUtility.ClientToTransferVote(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey), BigDecimal.valueOf(300),nonce.longValue(),prikey).get("message");
//        String txHash = (String)TxUtility.ClientToTransferVote(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey),BigDecimal.valueOf(300),nonce.longValue(),prikey).get("data");
//        System.out.println("traninfo : " + traninfo);
//        System.out.println("txHash : " + txHash);
//        sendTransaction(traninfo);
//
//        String traninfo2 = (String) TxUtility.ClientToTransferVote(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey2), BigDecimal.valueOf(300),nonce.longValue(),prikey).get("message");
//        String txHash2 = (String)TxUtility.ClientToTransferVote(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey2),BigDecimal.valueOf(300),nonce.longValue(),prikey).get("data");
//        System.out.println("traninfo2 : " + traninfo2);
//        System.out.println("txHash2 : " + txHash2);
//        sendTransaction(traninfo2);
//
//        String traninfo3 = (String) TxUtility.ClientToTransferVote(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey3), BigDecimal.valueOf(300),nonce.longValue(),prikey).get("message");
//        String txHash3 = (String)TxUtility.ClientToTransferVote(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey3),BigDecimal.valueOf(300),nonce.longValue(),prikey).get("data");
//        System.out.println("traninfo3 : "+ traninfo3);
//        System.out.println("txHash3 : "+ txHash3);
//        sendTransaction(traninfo3);
//
//        String traninfo4 = (String) TxUtility.ClientToTransferVote(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey4), BigDecimal.valueOf(300),nonce.longValue(),prikey).get("message");
//        String txHash4 = (String)TxUtility.ClientToTransferVote(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey4),BigDecimal.valueOf(300),nonce.longValue(),prikey).get("data");
//        System.out.println("traninfo4 : " + traninfo4);
//        System.out.println("txHash4 : "+ txHash4);
//        sendTransaction(traninfo4);
//
//        String traninfo5 = (String) TxUtility.ClientToTransferVote(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey5), BigDecimal.valueOf(300),nonce.longValue(),prikey).get("message");
//        String txHash5 = (String)TxUtility.ClientToTransferVote(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey5),BigDecimal.valueOf(300),nonce.longValue(),prikey).get("data");
//        System.out.println("traninfo5 : " + traninfo);
//        System.out.println("txHash5 : " + txHash);
//        sendTransaction(traninfo5);

        String traninfo = (String)TxUtility.ClientToTransferVoteWithdraw(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey),BigDecimal.valueOf(300),nonce.longValue(),prikey,"e2fd515af2b8a2c13f8275d12700668175f4500c54178a731f0d824327c26025").get("message");
        String txHash = (String)TxUtility.ClientToTransferVoteWithdraw(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey),BigDecimal.valueOf(300),nonce.longValue(),prikey,"e2fd515af2b8a2c13f8275d12700668175f4500c54178a731f0d824327c26025").get("data");
        System.out.println("traninfo : " + traninfo);
        System.out.println("txHash : " + txHash);
        sendTransaction(traninfo);

        String traninfo2 = (String)TxUtility.ClientToTransferVoteWithdraw(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey),BigDecimal.valueOf(300),nonce.longValue(),prikey,"0dec3468ff6cab73a67d77666611855561e8833da6fcf4b5c4332634fc58ae70").get("message");
        String txHash2 = (String)TxUtility.ClientToTransferVoteWithdraw(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey),BigDecimal.valueOf(300),nonce.longValue(),prikey,"0dec3468ff6cab73a67d77666611855561e8833da6fcf4b5c4332634fc58ae70").get("data");
        System.out.println("traninfo2 : " + traninfo2);
        System.out.println("txHash2 : " + txHash2);
        sendTransaction(traninfo2);

        String traninfo3 = (String)TxUtility.ClientToTransferVoteWithdraw(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey),BigDecimal.valueOf(300),nonce.longValue(),prikey,"a4d087fec6e3a86744cf6df508a44e317c8f53920efbfa452e7c4cfbee88c084").get("message");
        String txHash3 = (String)TxUtility.ClientToTransferVoteWithdraw(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey),BigDecimal.valueOf(300),nonce.longValue(),prikey,"a4d087fec6e3a86744cf6df508a44e317c8f53920efbfa452e7c4cfbee88c084").get("data");
        System.out.println("traninfo3 : " + traninfo3);
        System.out.println("txHash3 : " + txHash3);
        sendTransaction(traninfo3);

        String traninfo4 = (String)TxUtility.ClientToTransferVoteWithdraw(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey),BigDecimal.valueOf(300),nonce.longValue(),prikey,"a7c5011a13a1cbb270c3fa98b2961463bf4c5c17341be6a59db76f2a1360b023").get("message");
        String txHash4 = (String)TxUtility.ClientToTransferVoteWithdraw(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey),BigDecimal.valueOf(300),nonce.longValue(),prikey,"a7c5011a13a1cbb270c3fa98b2961463bf4c5c17341be6a59db76f2a1360b023").get("data");
        System.out.println("traninfo4 : " + traninfo4);
        System.out.println("txHash4 : " + txHash4);
        sendTransaction(traninfo4);

        String traninfo5 = (String)TxUtility.ClientToTransferVoteWithdraw(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey),BigDecimal.valueOf(300),nonce.longValue(),prikey,"e2fd515af2b8a2c13f8275d12700668175f4500c54178a731f0d824327c26025").get("message");
        String txHash5 = (String)TxUtility.ClientToTransferVoteWithdraw(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey),BigDecimal.valueOf(300),nonce.longValue(),prikey,"e2fd515af2b8a2c13f8275d12700668175f4500c54178a731f0d824327c26025").get("data");
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
