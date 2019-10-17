package test.KeyStoreInfo;

import com.company.keystore.wallet.WalletUtility;

public class Test5 {

    public static void main(String[] args) {

        //{"address":"1PHjaCAe5HWofHQL6Ksc5odbf6s4uqzC7Q","crypto":{"cipher":"aes-256-ctr","cipherparams":{"iv":"0486c30bd4282b9592b5625c694d10dc"},"ciphertext":"d783fa6503d2230d4972c6ddd5833607af39da5576f1f97848ec7c98476c02b6"},"id":"bdb18ea4-4617-450c-a8a2-84486b0e82dd","kdf":"argon2id","kdfparams":{"memoryCost":20480,"parallelism":2,"salt":"9beafef13714fb5b79e5af997b9805c8d459ef3d7ca102f82d303213c1f56e73","timeCost":4},"mac":"29d72f5edba9d7cdaa883185cc6ba1d2f4d6054c15f8fbbb4e6f37524b208345","version":"1"}

//        String PubkeyHash = WalletUtility.addressToPubkeyHash("1PHjaCAe5HWofHQL6Ksc5odbf6s4uqzC7Q");
//        System.out.println("公钥哈希 ： " + PubkeyHash);
//        //公钥哈希 ： f47cf5ceb6dafc9071f19d6dc801113d4f519159

//        String Prikey = WalletUtility. obtainPrikey("{\"address\":\"1PHjaCAe5HWofHQL6Ksc5odbf6s4uqzC7Q\",\"crypto\":{\"cipher\":\"aes-256-ctr\",\"cipherparams\":{\"iv\":\"0486c30bd4282b9592b5625c694d10dc\"},\"ciphertext\":\"d783fa6503d2230d4972c6ddd5833607af39da5576f1f97848ec7c98476c02b6\"},\"id\":\"bdb18ea4-4617-450c-a8a2-84486b0e82dd\",\"kdf\":\"argon2id\",\"kdfparams\":{\"memoryCost\":20480,\"parallelism\":2,\"salt\":\"9beafef13714fb5b79e5af997b9805c8d459ef3d7ca102f82d303213c1f56e73\",\"timeCost\":4},\"mac\":\"29d72f5edba9d7cdaa883185cc6ba1d2f4d6054c15f8fbbb4e6f37524b208345\",\"version\":\"1\"}","11223344");
//        System.out.println("私钥 : " + Prikey);
//        //私钥 : f45b692408a1d5a8bb9afce9e63f4ea99f1d7a353092af5e97704fbe1252b9d1

        String Pubkey = WalletUtility.keystoreToPubkey("{\"address\":\"1PHjaCAe5HWofHQL6Ksc5odbf6s4uqzC7Q\",\"crypto\":{\"cipher\":\"aes-256-ctr\",\"cipherparams\":{\"iv\":\"0486c30bd4282b9592b5625c694d10dc\"},\"ciphertext\":\"d783fa6503d2230d4972c6ddd5833607af39da5576f1f97848ec7c98476c02b6\"},\"id\":\"bdb18ea4-4617-450c-a8a2-84486b0e82dd\",\"kdf\":\"argon2id\",\"kdfparams\":{\"memoryCost\":20480,\"parallelism\":2,\"salt\":\"9beafef13714fb5b79e5af997b9805c8d459ef3d7ca102f82d303213c1f56e73\",\"timeCost\":4},\"mac\":\"29d72f5edba9d7cdaa883185cc6ba1d2f4d6054c15f8fbbb4e6f37524b208345\",\"version\":\"1\"}","11223344");
        System.out.println("公钥 : " + Pubkey);
//        //公钥 : f8e77285d7a9d6facb01cf1298baeb8c7bf4d144806e88d3e7975429cabd5f32


    }

}
