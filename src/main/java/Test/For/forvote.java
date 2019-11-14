package Test.For;

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

public class forvote {

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

            String fromPubkey = "fded3c8de24ea81f10b7761cdb8d7991b396340b8f09988783d723516ff724bb";
            String toPubkeyHash = "2c04de0200ab247954d81eac9a26024d27add58c";
            String prikey = "e90369c836bff80dad748fa674f2606d77599db5580871356c0d20e3945073c7";
            String fromPubkey6 = "13be75229850374c692536c36d05dcd10a10206811996a3fb4d605acfefa5c4b";

            String urlSendNonce = "http://192.168.1.40:19585/sendNonce";
            String params = "pubkeyhash="+ WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey);
            System.out.println("params" + ":"+params);
            String result = sendPost(urlSendNonce,params);
            System.out.println("result" + ":"+result);
            Integer nonce = (Integer) JSONObject.parseObject(result).get("data");

            //1.19 投票
//            String traninfo = (String)TxUtility.ClientToTransferVote(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey),BigDecimal.valueOf(300),nonce.longValue(),prikey).get("message");
//            String txHash = (String)TxUtility.ClientToTransferVote(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey),BigDecimal.valueOf(300),nonce.longValue(),prikey).get("data");
//            System.out.println("traninfo:"+traninfo);
//            System.out.println("txHash:"+txHash);
//            sendTransaction(traninfo);

            //1.20 撤回投票
            nonce++;
            String traninfo1 = (String)TxUtility.ClientToTransferVoteWithdraw(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey),BigDecimal.valueOf(300),nonce.longValue(),prikey,"affa3785e18bf310baa21bd6a8a97092669abbfc21573bed6d7c3b46b47fecda").get("message");
            String txHash1 = (String)TxUtility.ClientToTransferVoteWithdraw(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey),BigDecimal.valueOf(300),nonce.longValue(),prikey,"affa3785e18bf310baa21bd6a8a97092669abbfc21573bed6d7c3b46b47fecda").get("data");
            System.out.println("traninfo:" + traninfo1);
            System.out.println("txHash:"+ txHash1);
            sendTransaction(traninfo1);

            nonce++;
            String traninfo2 = (String)TxUtility.ClientToTransferVoteWithdraw(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey),BigDecimal.valueOf(300),nonce.longValue(),prikey,"11f868db533b43c137405535be13a0ea88f58a32b931af5abd5e27a726ab72ab").get("message");
            String txHash2 = (String)TxUtility.ClientToTransferVoteWithdraw(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey),BigDecimal.valueOf(300),nonce.longValue(),prikey,"11f868db533b43c137405535be13a0ea88f58a32b931af5abd5e27a726ab72ab").get("data");
            System.out.println("traninfo:" + traninfo2);
            System.out.println("txHash:"+ txHash2);
            sendTransaction(traninfo2);

            nonce++;
            String traninfo3 = (String)TxUtility.ClientToTransferVoteWithdraw(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey),BigDecimal.valueOf(300),nonce.longValue(),prikey,"05c17f54e63c0cd01003ad2fc1b44b09b68c1c1140b469b6fe4a0a025439c394").get("message");
            String txHash3 = (String)TxUtility.ClientToTransferVoteWithdraw(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey),BigDecimal.valueOf(300),nonce.longValue(),prikey,"05c17f54e63c0cd01003ad2fc1b44b09b68c1c1140b469b6fe4a0a025439c394").get("data");
            System.out.println("traninfo:" + traninfo3);
            System.out.println("txHash:"+ txHash3);
            sendTransaction(traninfo3);

            nonce++;
            String traninfo4 = (String)TxUtility.ClientToTransferVoteWithdraw(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey),BigDecimal.valueOf(300),nonce.longValue(),prikey,"1698a4b0d85548cf907c5d28b78b72383b8c712afeb0602e97e2b68c733d4044").get("message");
            String txHash4 = (String)TxUtility.ClientToTransferVoteWithdraw(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey),BigDecimal.valueOf(300),nonce.longValue(),prikey,"1698a4b0d85548cf907c5d28b78b72383b8c712afeb0602e97e2b68c733d4044").get("data");
            System.out.println("traninfo:" + traninfo4);
            System.out.println("txHash:"+ txHash4);
            sendTransaction(traninfo4);


//            String traninfo5 = (String)TxUtility.ClientToTransferVoteWithdraw(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey),BigDecimal.valueOf(300),nonce.longValue(),prikey,"d8ea46f345b31ec5ffd2a7bf6b22b5237a59e6f1796c7aa9ab747fbde3fc8599").get("message");
//            String txHash5 = (String)TxUtility.ClientToTransferVoteWithdraw(fromPubkey,WalletUtility.pubkeyStrToPubkeyHashStr(fromPubkey),BigDecimal.valueOf(300),nonce.longValue(),prikey,"d8ea46f345b31ec5ffd2a7bf6b22b5237a59e6f1796c7aa9ab747fbde3fc8599").get("data");
//            System.out.println("traninfo:" + traninfo5);
//            System.out.println("txHash:"+ txHash5);
//            sendTransaction(traninfo5);


    }

    private static void sendTransaction(String traninfo) {
        String url = "http://192.168.1.40:19585/sendTransaction";
        String param = "traninfo=" + traninfo;
        String result = sendPost(url, param);
        System.out.println("结果:" + result);
    }

}