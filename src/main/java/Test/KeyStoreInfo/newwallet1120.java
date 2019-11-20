package Test.KeyStoreInfo;

import com.alibaba.fastjson.JSON;
import com.company.keystore.wallet.WalletUtility;

public class newwallet1120 {

    public static void main(String[] args) {
        //{"address":"1E4QVtGnrjhpqCouf6V8U4cKXTD7kYmXPS","kdfparams":{"salt":"91e58eaa672e32307724e3494e1430992d8f9248dbcbb10620739c1614aadf09","memoryCost":20480,"parallelism":2,"timeCost":4},"id":"26d88312-2f35-4b45-a8ae-97262dead486","kdf":"argon2id","version":"1","mac":"ef01a89b3c3e2cfd3537bbed2dc0921d2b5fdfd1adbb928591746890bc9b0a44","crypto":{"cipher":"aes-256-ctr","ciphertext":"86293e7619a468135ad845802a40e2eb44b96e77376becacece357ddaabf7d88","cipherparams":{"iv":"9503a8debc787f266190d8fa0ca44558"}}}

        String cc = WalletUtility.addressToPubkeyHash("1E4QVtGnrjhpqCouf6V8U4cKXTD7kYmXPS");
        System.out.println(cc);
        //PubkeyHash:8f3e7f8b285e7ff6f125b621b415de99e9a9d7ec

        String gg = WalletUtility.obtainPrikey("{\"address\":\"1E4QVtGnrjhpqCouf6V8U4cKXTD7kYmXPS\",\"kdfparams\":{\"salt\":\"91e58eaa672e32307724e3494e1430992d8f9248dbcbb10620739c1614aadf09\",\"memoryCost\":20480,\"parallelism\":2,\"timeCost\":4},\"id\":\"26d88312-2f35-4b45-a8ae-97262dead486\",\"kdf\":\"argon2id\",\"version\":\"1\",\"mac\":\"ef01a89b3c3e2cfd3537bbed2dc0921d2b5fdfd1adbb928591746890bc9b0a44\",\"crypto\":{\"cipher\":\"aes-256-ctr\",\"ciphertext\":\"86293e7619a468135ad845802a40e2eb44b96e77376becacece357ddaabf7d88\",\"cipherparams\":{\"iv\":\"9503a8debc787f266190d8fa0ca44558\"}}}","19951996lwg");
        System.out.println(gg);
        //Prikey:900bfabdb8111f7792e24e3e5860c9e4e2f01764d4629bd6a4f559ccbeb300de

        String hh = WalletUtility.keystoreToPubkey("{\"address\":\"1E4QVtGnrjhpqCouf6V8U4cKXTD7kYmXPS\",\"kdfparams\":{\"salt\":\"91e58eaa672e32307724e3494e1430992d8f9248dbcbb10620739c1614aadf09\",\"memoryCost\":20480,\"parallelism\":2,\"timeCost\":4},\"id\":\"26d88312-2f35-4b45-a8ae-97262dead486\",\"kdf\":\"argon2id\",\"version\":\"1\",\"mac\":\"ef01a89b3c3e2cfd3537bbed2dc0921d2b5fdfd1adbb928591746890bc9b0a44\",\"crypto\":{\"cipher\":\"aes-256-ctr\",\"ciphertext\":\"86293e7619a468135ad845802a40e2eb44b96e77376becacece357ddaabf7d88\",\"cipherparams\":{\"iv\":\"9503a8debc787f266190d8fa0ca44558\"}}}","19951996lwg");
        System.out.println(hh);
        //Pubkey:0b642efe6471fa89001e3eacee2b3f0ef0211d7350020064abdeeb0a0f09bbc1
    }

}
