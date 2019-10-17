package test.KeyStoreInfo;

import com.alibaba.fastjson.JSON;
import com.company.keystore.wallet.WalletUtility;

public class Test7 {

    public static void main(String[] args) {

//        JSON aa = WalletUtility.fromPassword("87654321");
//        System.out.println(aa);
        //{"address":"1DjBbTrnf3jiDp4z8zucZc8E8rxhGmFXVz","kdfparams":{"salt":"a1502245efa68111a47e3e7da8cc91eb8759465ee2b78b1bf1951f8a97056427","memoryCost":20480,"parallelism":2,"timeCost":4},"id":"aead8eb9-9cde-4c97-a0fa-b1546c36e7b6","kdf":"argon2id","version":"1","mac":"a710d851ad8b32655d4c397f74acf4eef7da28e434462ecfa8ec59f5845c3956","crypto":{"cipher":"aes-256-ctr","ciphertext":"0c2246881767cfd729f03a67a80fd266d31d5e55957cc0a9baa9240afa68be6f","cipherparams":{"iv":"96e0f55501e111633e7b38c32e13286e"}}}

//        String cc = WalletUtility.addressToPubkeyHash("1DjBbTrnf3jiDp4z8zucZc8E8rxhGmFXVz");
//        System.out.println(cc);
        //8b9bd2c9685ba026c28a2f7b8d60eceb48d78ad4

//        String ff = WalletUtility.keystoreToPubkeyHash("{\"address\":\"1DjBbTrnf3jiDp4z8zucZc8E8rxhGmFXVz\",\"kdfparams\":{\"salt\":\"a1502245efa68111a47e3e7da8cc91eb8759465ee2b78b1bf1951f8a97056427\",\"memoryCost\":20480,\"parallelism\":2,\"timeCost\":4},\"id\":\"aead8eb9-9cde-4c97-a0fa-b1546c36e7b6\",\"kdf\":\"argon2id\",\"version\":\"1\",\"mac\":\"a710d851ad8b32655d4c397f74acf4eef7da28e434462ecfa8ec59f5845c3956\",\"crypto\":{\"cipher\":\"aes-256-ctr\",\"ciphertext\":\"0c2246881767cfd729f03a67a80fd266d31d5e55957cc0a9baa9240afa68be6f\",\"cipherparams\":{\"iv\":\"96e0f55501e111633e7b38c32e13286e\"}}}","87654321");
//        System.out.println(ff);
        //PubkeyHash:8b9bd2c9685ba026c28a2f7b8d60eceb48d78ad4

//        String gg = WalletUtility.obtainPrikey("{\"address\":\"1DjBbTrnf3jiDp4z8zucZc8E8rxhGmFXVz\",\"kdfparams\":{\"salt\":\"a1502245efa68111a47e3e7da8cc91eb8759465ee2b78b1bf1951f8a97056427\",\"memoryCost\":20480,\"parallelism\":2,\"timeCost\":4},\"id\":\"aead8eb9-9cde-4c97-a0fa-b1546c36e7b6\",\"kdf\":\"argon2id\",\"version\":\"1\",\"mac\":\"a710d851ad8b32655d4c397f74acf4eef7da28e434462ecfa8ec59f5845c3956\",\"crypto\":{\"cipher\":\"aes-256-ctr\",\"ciphertext\":\"0c2246881767cfd729f03a67a80fd266d31d5e55957cc0a9baa9240afa68be6f\",\"cipherparams\":{\"iv\":\"96e0f55501e111633e7b38c32e13286e\"}}}","87654321");
//        System.out.println(gg);
//        //Prikey:b866c78ab89230f820ea5b5b19d5c48f79f7b8ec539662b4622de5697d163c36

//        String hh = WalletUtility.keystoreToPubkey("{\"address\":\"1DjBbTrnf3jiDp4z8zucZc8E8rxhGmFXVz\",\"kdfparams\":{\"salt\":\"a1502245efa68111a47e3e7da8cc91eb8759465ee2b78b1bf1951f8a97056427\",\"memoryCost\":20480,\"parallelism\":2,\"timeCost\":4},\"id\":\"aead8eb9-9cde-4c97-a0fa-b1546c36e7b6\",\"kdf\":\"argon2id\",\"version\":\"1\",\"mac\":\"a710d851ad8b32655d4c397f74acf4eef7da28e434462ecfa8ec59f5845c3956\",\"crypto\":{\"cipher\":\"aes-256-ctr\",\"ciphertext\":\"0c2246881767cfd729f03a67a80fd266d31d5e55957cc0a9baa9240afa68be6f\",\"cipherparams\":{\"iv\":\"96e0f55501e111633e7b38c32e13286e\"}}}","87654321");
//        System.out.println(hh);
        //Pubkey:a8b02b4a49a18636afa61626c230a3bd9c3b457e65567ceeef42bf9ecc618e67

    }

}
