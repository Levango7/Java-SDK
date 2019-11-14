package Test.KeyStoreInfo;

import com.alibaba.fastjson.JSON;
import com.company.keystore.wallet.WalletUtility;

public class Test3 {
    public static void main(String[] args) {

        //{"address":"1NbfFrHmU55yNvMN5d4DvNmqYJYyBBTVzR","crypto":{"cipher":"aes-256-ctr","cipherparams":{"iv":"27c87c9bde5e921cb11595242276f7c9"},"ciphertext":"b52441d6f857b5be1af2a9d1cddae84a8c9cc0c6406f86a915f66e6c8baf635f"},"id":"6f7c4c3a-bc6c-4ab5-bff5-2133d224ff93","kdf":"argon2id","kdfparams":{"memoryCost":20480,"parallelism":2,"salt":"6bd391bf5714326f3463575c1e2675d5da854894f810ee56abbbc58e8100a481","timeCost":4},"mac":"e7afafda63d890266604774d3cbe49f41c8a3c2a886dc5ed5eb0e0735755470a","version":"1"}

//        JSON aa = WalletUtility.fromPassword("");
//        System.out.println(aa);


//        int bb = WalletUtility.verifyAddress("1NbfFrHmU55yNvMN5d4DvNmqYJYyBBTVzR");
//        System.out.println(bb);
//        //0


//        String cc = WalletUtility.addressToPubkeyHash("1NbfFrHmU55yNvMN5d4DvNmqYJYyBBTVzR");
//        System.out.println("公钥哈希 : " + cc);
//        //pubkeyHash:ece8b7fbdc2f73bf5c2a8d5b1b9cf9c4952778a1

//        String dd = WalletUtility.pubkeyHashToAddress("ece8b7fbdc2f73bf5c2a8d5b1b9cf9c4952778a1");
//        System.out.println("地址 : "+ dd);
//        //Address:

//        String ee = WalletUtility.keystoreToAddress("{\"address\":\"1NbfFrHmU55yNvMN5d4DvNmqYJYyBBTVzR\",\"crypto\":{\"cipher\":\"aes-256-ctr\",\"cipherparams\":{\"iv\":\"27c87c9bde5e921cb11595242276f7c9\"},\"ciphertext\":\"b52441d6f857b5be1af2a9d1cddae84a8c9cc0c6406f86a915f66e6c8baf635f\"},\"id\":\"6f7c4c3a-bc6c-4ab5-bff5-2133d224ff93\",\"kdf\":\"argon2id\",\"kdfparams\":{\"memoryCost\":20480,\"parallelism\":2,\"salt\":\"6bd391bf5714326f3463575c1e2675d5da854894f810ee56abbbc58e8100a481\",\"timeCost\":4},\"mac\":\"e7afafda63d890266604774d3cbe49f41c8a3c2a886dc5ed5eb0e0735755470a\",\"version\":\"1\"}\n","11112222");
//        System.out.println(ee);
//        //Address:1NbfFrHmU55yNvMN5d4DvNmqYJYyBBTVzR

//        String ff = WalletUtility.keystoreToPubkeyHash("{\"address\":\"1NbfFrHmU55yNvMN5d4DvNmqYJYyBBTVzR\",\"crypto\":{\"cipher\":\"aes-256-ctr\",\"cipherparams\":{\"iv\":\"27c87c9bde5e921cb11595242276f7c9\"},\"ciphertext\":\"b52441d6f857b5be1af2a9d1cddae84a8c9cc0c6406f86a915f66e6c8baf635f\"},\"id\":\"6f7c4c3a-bc6c-4ab5-bff5-2133d224ff93\",\"kdf\":\"argon2id\",\"kdfparams\":{\"memoryCost\":20480,\"parallelism\":2,\"salt\":\"6bd391bf5714326f3463575c1e2675d5da854894f810ee56abbbc58e8100a481\",\"timeCost\":4},\"mac\":\"e7afafda63d890266604774d3cbe49f41c8a3c2a886dc5ed5eb0e0735755470a\",\"version\":\"1\"}","11112222");
//        System.out.println(ff);
//        //PubkeyHash:ece8b7fbdc2f73bf5c2a8d5b1b9cf9c4952778a1

//        String gg = WalletUtility.obtainPrikey("{\"address\":\"1NbfFrHmU55yNvMN5d4DvNmqYJYyBBTVzR\",\"crypto\":{\"cipher\":\"aes-256-ctr\",\"cipherparams\":{\"iv\":\"27c87c9bde5e921cb11595242276f7c9\"},\"ciphertext\":\"b52441d6f857b5be1af2a9d1cddae84a8c9cc0c6406f86a915f66e6c8baf635f\"},\"id\":\"6f7c4c3a-bc6c-4ab5-bff5-2133d224ff93\",\"kdf\":\"argon2id\",\"kdfparams\":{\"memoryCost\":20480,\"parallelism\":2,\"salt\":\"6bd391bf5714326f3463575c1e2675d5da854894f810ee56abbbc58e8100a481\",\"timeCost\":4},\"mac\":\"e7afafda63d890266604774d3cbe49f41c8a3c2a886dc5ed5eb0e0735755470a\",\"version\":\"1\"}","11112222");
//        System.out.println(gg);
//        //Prikey:0ebde3b9cb886f9b8846d395dbc831cfc88401a475603e6343866f28ac17d0b2

//        String hh = WalletUtility.keystoreToPubkey("{\"address\":\"1NbfFrHmU55yNvMN5d4DvNmqYJYyBBTVzR\",\"crypto\":{\"cipher\":\"aes-256-ctr\",\"cipherparams\":{\"iv\":\"27c87c9bde5e921cb11595242276f7c9\"},\"ciphertext\":\"b52441d6f857b5be1af2a9d1cddae84a8c9cc0c6406f86a915f66e6c8baf635f\"},\"id\":\"6f7c4c3a-bc6c-4ab5-bff5-2133d224ff93\",\"kdf\":\"argon2id\",\"kdfparams\":{\"memoryCost\":20480,\"parallelism\":2,\"salt\":\"6bd391bf5714326f3463575c1e2675d5da854894f810ee56abbbc58e8100a481\",\"timeCost\":4},\"mac\":\"e7afafda63d890266604774d3cbe49f41c8a3c2a886dc5ed5eb0e0735755470a\",\"version\":\"1\"}","11112222");
//        System.out.println(hh);
        //Pubkey:64d4cbdd7d28234c62de2d487cf93342a911ca6290c675671f661eb91bd02e73

//        JSON ii = WalletUtility.modifyPassword("{\"address\":\"1L3zkde4kSpfd1L7NYmNYSBf1Bvh6fZLk\",\"crypto\":{\"cipher\":\"aes-256-ctr\",\"cipherparams\":{\"iv\":\"46982cf1f8ee00d62cd5306b7d5854c4\"},\"ciphertext\":\"86be0590d1f08e56aca44da27c2119f171e810ad78df43661358818f1e1feaa8\"},\"id\":\"4106ce3d-f3d0-49ab-bc98-57d04a7c2713\",\"kdf\":\"argon2id\",\"kdfparams\":{\"memoryCost\":20480,\"parallelism\":2,\"salt\":\"4f0fa9ee3b7e47234d6abc772391c6127fbfbaf7e7f2572dcc9c9a209d58c90f\",\"timeCost\":4},\"mac\":\"1ba9f680a08945d250fae63ec46037a31db7786292e5cde7ff2f5a0890146985\",\"version\":\"1\"}","1111111111","0000000000");
//        System.out.println(ii);

    }


}
