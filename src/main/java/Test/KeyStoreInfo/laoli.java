package Test.KeyStoreInfo;

import com.company.keystore.wallet.WalletUtility;

public class laoli {

    public static void main(String[] args) {

        //{"address":"1C8TQALeWjNQXu3Y2XHLdBnCfN8W2Dwo1b","kdfparams":{"salt":"8e51e5d7b919ea7814fd87863da5d87caef2b8ff241dbf73f1a14f8d3b2b2256","memoryCost":20480,"parallelism":2,"timeCost":4},"id":"7f246827-220d-495d-83a7-14ae911fc7f8","kdf":"argon2id","version":"1","mac":"0a508b5fb472e4aa7774801df7624bf40127df3287b4fa7f2e19c585d886ce3a","crypto":{"cipher":"aes-256-ctr","ciphertext":"7a5e4b4302f2a4a0dbd0248b900abf60c506bf6a9004c8c4d467204ceeb82804","cipherparams":{"iv":"8a356440cc6e1361966f5235dc384d1e"}}}

        String cc = WalletUtility.addressToPubkeyHash("1C8TQALeWjNQXu3Y2XHLdBnCfN8W2Dwo1b");
        System.out.println(cc);
        //PubkeyHash:7a1255185f7daff03a869d3d38de4be6cff5a386

        String gg = WalletUtility.obtainPrikey("{\"address\":\"1C8TQALeWjNQXu3Y2XHLdBnCfN8W2Dwo1b\",\"kdfparams\":{\"salt\":\"8e51e5d7b919ea7814fd87863da5d87caef2b8ff241dbf73f1a14f8d3b2b2256\",\"memoryCost\":20480,\"parallelism\":2,\"timeCost\":4},\"id\":\"7f246827-220d-495d-83a7-14ae911fc7f8\",\"kdf\":\"argon2id\",\"version\":\"1\",\"mac\":\"0a508b5fb472e4aa7774801df7624bf40127df3287b4fa7f2e19c585d886ce3a\",\"crypto\":{\"cipher\":\"aes-256-ctr\",\"ciphertext\":\"7a5e4b4302f2a4a0dbd0248b900abf60c506bf6a9004c8c4d467204ceeb82804\",\"cipherparams\":{\"iv\":\"8a356440cc6e1361966f5235dc384d1e\"}}}","lwg00000000");
        System.out.println(gg);
        //Prikey:a7d2b44ec585d53e713a9544b9a2edd1a90e4f55c341add853c0b1bf95b26e8f

        String hh = WalletUtility.keystoreToPubkey("{\"address\":\"1C8TQALeWjNQXu3Y2XHLdBnCfN8W2Dwo1b\",\"kdfparams\":{\"salt\":\"8e51e5d7b919ea7814fd87863da5d87caef2b8ff241dbf73f1a14f8d3b2b2256\",\"memoryCost\":20480,\"parallelism\":2,\"timeCost\":4},\"id\":\"7f246827-220d-495d-83a7-14ae911fc7f8\",\"kdf\":\"argon2id\",\"version\":\"1\",\"mac\":\"0a508b5fb472e4aa7774801df7624bf40127df3287b4fa7f2e19c585d886ce3a\",\"crypto\":{\"cipher\":\"aes-256-ctr\",\"ciphertext\":\"7a5e4b4302f2a4a0dbd0248b900abf60c506bf6a9004c8c4d467204ceeb82804\",\"cipherparams\":{\"iv\":\"8a356440cc6e1361966f5235dc384d1e\"}}}","lwg00000000");
        System.out.println(hh);
        //Pubkey:9b540090f5df7cd2e950a98e66f95eda13ad6808b946e98a32b8512a66c8858e


    }

}
