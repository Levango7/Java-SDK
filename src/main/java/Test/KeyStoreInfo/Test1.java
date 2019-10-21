package Test.KeyStoreInfo;

import com.alibaba.fastjson.JSON;
import com.company.keystore.wallet.WalletUtility;

public class Test1 {

    public static void main(String[] args) {

        //{"address":"1L3zkde4kSpfd1L7NYmNYSBf1Bvh6fZLk","crypto":{"cipher":"aes-256-ctr","cipherparams":{"iv":"46982cf1f8ee00d62cd5306b7d5854c4"},"ciphertext":"86be0590d1f08e56aca44da27c2119f171e810ad78df43661358818f1e1feaa8"},"id":"4106ce3d-f3d0-49ab-bc98-57d04a7c2713","kdf":"argon2id","kdfparams":{"memoryCost":20480,"parallelism":2,"salt":"4f0fa9ee3b7e47234d6abc772391c6127fbfbaf7e7f2572dcc9c9a209d58c90f","timeCost":4},"mac":"1ba9f680a08945d250fae63ec46037a31db7786292e5cde7ff2f5a0890146985","version":"1"}

//        JSON aa = WalletUtility.fromPassword("");
//        System.out.println(aa);

//        int bb = WalletUtility.verifyAddress("1L3zkde4kSpfd1L7NYmNYSBf1Bvh6fZLk");
//        System.out.println(bb);
//        //0


//        String cc = WalletUtility.addressToPubkeyHash("1L3zkde4kSpfd1L7NYmNYSBf1Bvh6fZLk");
//        System.out.println(cc);
//        //pubkeyHash:039a676b65273eeca96af35e35c05e482650c979

//        String dd = WalletUtility.pubkeyHashToAddress("039a676b65273eeca96af35e35c05e482650c979");
//        System.out.println(dd);
//        //Address:1L3zkde4kSpfd1L7NYmNYSBf1Bvh6fZLk

//        String ee = WalletUtility.keystoreToAddress("{\"address\":\"1L3zkde4kSpfd1L7NYmNYSBf1Bvh6fZLk\",\"crypto\":{\"cipher\":\"aes-256-ctr\",\"cipherparams\":{\"iv\":\"46982cf1f8ee00d62cd5306b7d5854c4\"},\"ciphertext\":\"86be0590d1f08e56aca44da27c2119f171e810ad78df43661358818f1e1feaa8\"},\"id\":\"4106ce3d-f3d0-49ab-bc98-57d04a7c2713\",\"kdf\":\"argon2id\",\"kdfparams\":{\"memoryCost\":20480,\"parallelism\":2,\"salt\":\"4f0fa9ee3b7e47234d6abc772391c6127fbfbaf7e7f2572dcc9c9a209d58c90f\",\"timeCost\":4},\"mac\":\"1ba9f680a08945d250fae63ec46037a31db7786292e5cde7ff2f5a0890146985\",\"version\":\"1\"}","0000000000");
//        System.out.println(ee);
//        //Address:1L3zkde4kSpfd1L7NYmNYSBf1Bvh6fZLk

//        String ff = WalletUtility.keystoreToPubkeyHash("{\"address\":\"1L3zkde4kSpfd1L7NYmNYSBf1Bvh6fZLk\",\"crypto\":{\"cipher\":\"aes-256-ctr\",\"cipherparams\":{\"iv\":\"46982cf1f8ee00d62cd5306b7d5854c4\"},\"ciphertext\":\"86be0590d1f08e56aca44da27c2119f171e810ad78df43661358818f1e1feaa8\"},\"id\":\"4106ce3d-f3d0-49ab-bc98-57d04a7c2713\",\"kdf\":\"argon2id\",\"kdfparams\":{\"memoryCost\":20480,\"parallelism\":2,\"salt\":\"4f0fa9ee3b7e47234d6abc772391c6127fbfbaf7e7f2572dcc9c9a209d58c90f\",\"timeCost\":4},\"mac\":\"1ba9f680a08945d250fae63ec46037a31db7786292e5cde7ff2f5a0890146985\",\"version\":\"1\"}","1111111111");
//        System.out.println(ff);
//        //PubkeyHash:039a676b65273eeca96af35e35c05e482650c979

//        String gg = WalletUtility.obtainPrikey("{\"address\":\"1L3zkde4kSpfd1L7NYmNYSBf1Bvh6fZLk\",\"crypto\":{\"cipher\":\"aes-256-ctr\",\"cipherparams\":{\"iv\":\"46982cf1f8ee00d62cd5306b7d5854c4\"},\"ciphertext\":\"86be0590d1f08e56aca44da27c2119f171e810ad78df43661358818f1e1feaa8\"},\"id\":\"4106ce3d-f3d0-49ab-bc98-57d04a7c2713\",\"kdf\":\"argon2id\",\"kdfparams\":{\"memoryCost\":20480,\"parallelism\":2,\"salt\":\"4f0fa9ee3b7e47234d6abc772391c6127fbfbaf7e7f2572dcc9c9a209d58c90f\",\"timeCost\":4},\"mac\":\"1ba9f680a08945d250fae63ec46037a31db7786292e5cde7ff2f5a0890146985\",\"version\":\"1\"}","1111111111");
//        System.out.println(gg);
//        //Prikey:9972e47b6f733a834bc6485085e5d39685401a515fd37932d17a8c0bcfac3e41

//        String hh = WalletUtility.keystoreToPubkey("{\"address\":\"1L3zkde4kSpfd1L7NYmNYSBf1Bvh6fZLk\",\"crypto\":{\"cipher\":\"aes-256-ctr\",\"cipherparams\":{\"iv\":\"46982cf1f8ee00d62cd5306b7d5854c4\"},\"ciphertext\":\"86be0590d1f08e56aca44da27c2119f171e810ad78df43661358818f1e1feaa8\"},\"id\":\"4106ce3d-f3d0-49ab-bc98-57d04a7c2713\",\"kdf\":\"argon2id\",\"kdfparams\":{\"memoryCost\":20480,\"parallelism\":2,\"salt\":\"4f0fa9ee3b7e47234d6abc772391c6127fbfbaf7e7f2572dcc9c9a209d58c90f\",\"timeCost\":4},\"mac\":\"1ba9f680a08945d250fae63ec46037a31db7786292e5cde7ff2f5a0890146985\",\"version\":\"1\"}","1111111111");
//        System.out.println(hh);
        //Pubkey:d0f1966cee219fcfdbcee698517fcf864f46817c30bc8218eb4889d02f312540

//        JSON ii = WalletUtility.modifyPassword("{\"address\":\"1L3zkde4kSpfd1L7NYmNYSBf1Bvh6fZLk\",\"crypto\":{\"cipher\":\"aes-256-ctr\",\"cipherparams\":{\"iv\":\"46982cf1f8ee00d62cd5306b7d5854c4\"},\"ciphertext\":\"86be0590d1f08e56aca44da27c2119f171e810ad78df43661358818f1e1feaa8\"},\"id\":\"4106ce3d-f3d0-49ab-bc98-57d04a7c2713\",\"kdf\":\"argon2id\",\"kdfparams\":{\"memoryCost\":20480,\"parallelism\":2,\"salt\":\"4f0fa9ee3b7e47234d6abc772391c6127fbfbaf7e7f2572dcc9c9a209d58c90f\",\"timeCost\":4},\"mac\":\"1ba9f680a08945d250fae63ec46037a31db7786292e5cde7ff2f5a0890146985\",\"version\":\"1\"}","1111111111","0000000000");
//        System.out.println(ii);
        //


    }




}
