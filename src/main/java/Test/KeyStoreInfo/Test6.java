package test.KeyStoreInfo;

import com.alibaba.fastjson.JSON;
import com.company.keystore.wallet.WalletUtility;

public class Test6 {

    public static void main(String[] args) {
        //{"address":"151kZd1JCQ2dQJob5yZuhaiCAc1QKjWWgR","kdfparams":{"salt":"9878176a3427fc5ecd726c5dc26f86e27e294dad3b527cc2da4a5004362d56dd","memoryCost":20480,"parallelism":2,"timeCost":4},"id":"47499286-39a7-46af-887d-9210056eeb70","kdf":"argon2id","version":"1","mac":"c5f781c3e2ff2fa46a54da88ab6817cbfd16f0d13f9af07d75e3e2b48259ff90","crypto":{"cipher":"aes-256-ctr","ciphertext":"3d66c1c0e583a2512f6990ea4d3f21b11467685a8e73e83709d9f393de5757d1","cipherparams":{"iv":"089c0c3d867f54278530d4b6b5a7733b"}}}

//        JSON keystore = WalletUtility.fromPassword("12345678");
//        System.out.println("keystore : " + keystore);
//        //keystore : {"address":"151kZd1JCQ2dQJob5yZuhaiCAc1QKjWWgR","kdfparams":{"salt":"9878176a3427fc5ecd726c5dc26f86e27e294dad3b527cc2da4a5004362d56dd","memoryCost":20480,"parallelism":2,"timeCost":4},"id":"47499286-39a7-46af-887d-9210056eeb70","kdf":"argon2id","version":"1","mac":"c5f781c3e2ff2fa46a54da88ab6817cbfd16f0d13f9af07d75e3e2b48259ff90","crypto":{"cipher":"aes-256-ctr","ciphertext":"3d66c1c0e583a2512f6990ea4d3f21b11467685a8e73e83709d9f393de5757d1","cipherparams":{"iv":"089c0c3d867f54278530d4b6b5a7733b"}}}

//        String Address = WalletUtility.keystoreToAddress("{\"address\":\"151kZd1JCQ2dQJob5yZuhaiCAc1QKjWWgR\",\"kdfparams\":{\"salt\":\"9878176a3427fc5ecd726c5dc26f86e27e294dad3b527cc2da4a5004362d56dd\",\"memoryCost\":20480,\"parallelism\":2,\"timeCost\":4},\"id\":\"47499286-39a7-46af-887d-9210056eeb70\",\"kdf\":\"argon2id\",\"version\":\"1\",\"mac\":\"c5f781c3e2ff2fa46a54da88ab6817cbfd16f0d13f9af07d75e3e2b48259ff90\",\"crypto\":{\"cipher\":\"aes-256-ctr\",\"ciphertext\":\"3d66c1c0e583a2512f6990ea4d3f21b11467685a8e73e83709d9f393de5757d1\",\"cipherparams\":{\"iv\":\"089c0c3d867f54278530d4b6b5a7733b\"}}}","12345678");
//        System.out.println("Address : " + Address);
//        //Address : 151kZd1JCQ2dQJob5yZuhaiCAc1QKjWWgR

//        String PubkeyHash = WalletUtility.addressToPubkeyHash("151kZd1JCQ2dQJob5yZuhaiCAc1QKjWWgR");
//        System.out.println("公钥哈希 ： " + PubkeyHash);
//        //公钥哈希 ： 2c04de0200ab247954d81eac9a26024d27add58c

//        String Prikey = WalletUtility. obtainPrikey("{\"address\":\"151kZd1JCQ2dQJob5yZuhaiCAc1QKjWWgR\",\"kdfparams\":{\"salt\":\"9878176a3427fc5ecd726c5dc26f86e27e294dad3b527cc2da4a5004362d56dd\",\"memoryCost\":20480,\"parallelism\":2,\"timeCost\":4},\"id\":\"47499286-39a7-46af-887d-9210056eeb70\",\"kdf\":\"argon2id\",\"version\":\"1\",\"mac\":\"c5f781c3e2ff2fa46a54da88ab6817cbfd16f0d13f9af07d75e3e2b48259ff90\",\"crypto\":{\"cipher\":\"aes-256-ctr\",\"ciphertext\":\"3d66c1c0e583a2512f6990ea4d3f21b11467685a8e73e83709d9f393de5757d1\",\"cipherparams\":{\"iv\":\"089c0c3d867f54278530d4b6b5a7733b\"}}}","12345678");
//        System.out.println("私钥 : " + Prikey);
//        //私钥 : e90369c836bff80dad748fa674f2606d77599db5580871356c0d20e3945073c7

//        String Pubkey = WalletUtility.keystoreToPubkey("{\"address\":\"151kZd1JCQ2dQJob5yZuhaiCAc1QKjWWgR\",\"kdfparams\":{\"salt\":\"9878176a3427fc5ecd726c5dc26f86e27e294dad3b527cc2da4a5004362d56dd\",\"memoryCost\":20480,\"parallelism\":2,\"timeCost\":4},\"id\":\"47499286-39a7-46af-887d-9210056eeb70\",\"kdf\":\"argon2id\",\"version\":\"1\",\"mac\":\"c5f781c3e2ff2fa46a54da88ab6817cbfd16f0d13f9af07d75e3e2b48259ff90\",\"crypto\":{\"cipher\":\"aes-256-ctr\",\"ciphertext\":\"3d66c1c0e583a2512f6990ea4d3f21b11467685a8e73e83709d9f393de5757d1\",\"cipherparams\":{\"iv\":\"089c0c3d867f54278530d4b6b5a7733b\"}}}","12345678");
//        System.out.println("公钥 : " + Pubkey);
//        //公钥 : fded3c8de24ea81f10b7761cdb8d7991b396340b8f09988783d723516ff724bb


    }

}
