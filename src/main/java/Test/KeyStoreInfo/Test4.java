package Test.KeyStoreInfo;

import com.company.keystore.wallet.WalletUtility;

public class Test4 {

    public static void main(String[] args) {

        //{"address":"1FwkXWKHRU1Be7SqHb4TxZwyAUbRAammzo","crypto":{"cipher":"aes-256-ctr","cipherparams":{"iv":"42118311ef59ed799ee6e45d2ab7db65"},"ciphertext":"cff9a868778e3181dcf1500a1aee3aededc09e72ff41438ed57ac6447a54f42c"},"id":"17ede17b-d76f-4537-b5e2-8c28eec80c15","kdf":"argon2id","kdfparams":{"memoryCost":20480,"parallelism":2,"salt":"300cd190cc186aae0d7aaa15a6db37643370208267a7821ce76212ee701088a8","timeCost":4},"mac":"390097b5bd0e18c72e4dc6f5f418f1cb3864f6dddc1e5febdce4d85ea14f8700","version":"1"}

//        String PubkeyHash = WalletUtility.addressToPubkeyHash("1FwkXWKHRU1Be7SqHb4TxZwyAUbRAammzo");
//        System.out.println("公钥哈希 ： " + PubkeyHash);
//        //公钥哈希 ： a3ec8e79e7f37a9127ce4919c5957b24a42e0c5b

//        String Prikey = WalletUtility. obtainPrikey("{\"address\":\"1FwkXWKHRU1Be7SqHb4TxZwyAUbRAammzo\",\"crypto\":{\"cipher\":\"aes-256-ctr\",\"cipherparams\":{\"iv\":\"42118311ef59ed799ee6e45d2ab7db65\"},\"ciphertext\":\"cff9a868778e3181dcf1500a1aee3aededc09e72ff41438ed57ac6447a54f42c\"},\"id\":\"17ede17b-d76f-4537-b5e2-8c28eec80c15\",\"kdf\":\"argon2id\",\"kdfparams\":{\"memoryCost\":20480,\"parallelism\":2,\"salt\":\"300cd190cc186aae0d7aaa15a6db37643370208267a7821ce76212ee701088a8\",\"timeCost\":4},\"mac\":\"390097b5bd0e18c72e4dc6f5f418f1cb3864f6dddc1e5febdce4d85ea14f8700\",\"version\":\"1\"}","12341234");
//        System.out.println("私钥 : " + Prikey);
//        //私钥 : 92645e2b550afdbfafd4334b657f385f8b038a9997de132bb88f25225c9b7bc2

//        String Pubkey = WalletUtility.keystoreToPubkey("{\"address\":\"1FwkXWKHRU1Be7SqHb4TxZwyAUbRAammzo\",\"crypto\":{\"cipher\":\"aes-256-ctr\",\"cipherparams\":{\"iv\":\"42118311ef59ed799ee6e45d2ab7db65\"},\"ciphertext\":\"cff9a868778e3181dcf1500a1aee3aededc09e72ff41438ed57ac6447a54f42c\"},\"id\":\"17ede17b-d76f-4537-b5e2-8c28eec80c15\",\"kdf\":\"argon2id\",\"kdfparams\":{\"memoryCost\":20480,\"parallelism\":2,\"salt\":\"300cd190cc186aae0d7aaa15a6db37643370208267a7821ce76212ee701088a8\",\"timeCost\":4},\"mac\":\"390097b5bd0e18c72e4dc6f5f418f1cb3864f6dddc1e5febdce4d85ea14f8700\",\"version\":\"1\"}","12341234");
//        System.out.println("公钥 : " + Pubkey);
//        //公钥 : 06bf7c077fa375889ae04c214ef464613802e491d9adf8fbfd397f45be8b9557

    }

}
