package Test.KeyStoreInfo;

import com.alibaba.fastjson.JSON;
import com.company.keystore.wallet.WalletUtility;

public class Test8 {

    public static void main(String[] args) {

//        JSON aa = WalletUtility.fromPassword("11111111");
//        System.out.println(aa);
        //{"address":"1JsUmgVgayY7QKYdDEVAWQVvJaAYWAgo5J","kdfparams":{"salt":"bf79eb951383e82170658293eed336d745c4e5fe0a94121ca57a14ff81b89a2a","memoryCost":20480,"parallelism":2,"timeCost":4},"id":"33ac7549-e16e-4dc2-9dea-5b2294119000","kdf":"argon2id","version":"1","mac":"4659a1c6d3073ba9dedeb1dfbe47b4b910750236e75e4d66a134f340c821e78a","crypto":{"cipher":"aes-256-ctr","ciphertext":"f8744c42c7443051cd180537f91de1d8403c732aaaef3d19a3b9b1addd6e36b2","cipherparams":{"iv":"a76678add34caa3be4b735151406df59"}}}

        String cc = WalletUtility.addressToPubkeyHash("1JsUmgVgayY7QKYdDEVAWQVvJaAYWAgo5J");
        System.out.println(cc);
        //PubkeyHash:c4061e318e4ce23ae37b56568a0d2edbe8d394fe

        String gg = WalletUtility.obtainPrikey("{\"address\":\"1JsUmgVgayY7QKYdDEVAWQVvJaAYWAgo5J\",\"kdfparams\":{\"salt\":\"bf79eb951383e82170658293eed336d745c4e5fe0a94121ca57a14ff81b89a2a\",\"memoryCost\":20480,\"parallelism\":2,\"timeCost\":4},\"id\":\"33ac7549-e16e-4dc2-9dea-5b2294119000\",\"kdf\":\"argon2id\",\"version\":\"1\",\"mac\":\"4659a1c6d3073ba9dedeb1dfbe47b4b910750236e75e4d66a134f340c821e78a\",\"crypto\":{\"cipher\":\"aes-256-ctr\",\"ciphertext\":\"f8744c42c7443051cd180537f91de1d8403c732aaaef3d19a3b9b1addd6e36b2\",\"cipherparams\":{\"iv\":\"a76678add34caa3be4b735151406df59\"}}}","11111111");
        System.out.println(gg);
        //Prikey:0e0582d6514863120a4e056d14eed0e314a278254c5f39d13a8a77a89bb5f6c6

        String hh = WalletUtility.keystoreToPubkey("{\"address\":\"1JsUmgVgayY7QKYdDEVAWQVvJaAYWAgo5J\",\"kdfparams\":{\"salt\":\"bf79eb951383e82170658293eed336d745c4e5fe0a94121ca57a14ff81b89a2a\",\"memoryCost\":20480,\"parallelism\":2,\"timeCost\":4},\"id\":\"33ac7549-e16e-4dc2-9dea-5b2294119000\",\"kdf\":\"argon2id\",\"version\":\"1\",\"mac\":\"4659a1c6d3073ba9dedeb1dfbe47b4b910750236e75e4d66a134f340c821e78a\",\"crypto\":{\"cipher\":\"aes-256-ctr\",\"ciphertext\":\"f8744c42c7443051cd180537f91de1d8403c732aaaef3d19a3b9b1addd6e36b2\",\"cipherparams\":{\"iv\":\"a76678add34caa3be4b735151406df59\"}}}","11111111");
        System.out.println(hh);
        //Pubkey:e7f59871a339fd34d13e9fd2889e87388334caceabb710bdb6a0b2d536ddc65e



    }

}
