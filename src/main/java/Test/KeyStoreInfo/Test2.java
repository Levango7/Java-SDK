package Test.KeyStoreInfo;

import com.company.keystore.wallet.WalletUtility;

public class Test2 {

    public static void main(String[] args) {
        //{"address":"1Lg3kDGu7uGPCH8C38sTJNAAYQCWBsuNCq","crypto":{"cipher":"aes-256-ctr","cipherparams":{"iv":"d7448e53b9c73090403681e493e81613"},"ciphertext":"7312c6d0a224c706f72ed1d362278f523396697592a275425fb5a98f64e1cd6b"},"id":"7297c8a5-4985-4f76-8449-33f0f68d7e93","kdf":"argon2id","kdfparams":{"memoryCost":20480,"parallelism":2,"salt":"dc2f85d4bf6e20984d5099fc52a02c4559e7640c479fd5cea470d6e3422afcc9","timeCost":4},"mac":"24cb2dd9625f6d1c52c9d7a3b50d263376267515f3854e802098f6d4c573d1a0","version":"1"}

        String cc = WalletUtility.addressToPubkeyHash("1Lg3kDGu7uGPCH8C38sTJNAAYQCWBsuNCq");
        System.out.println(cc);
        //pubkeyHash:d7cce761c3abe12d4650a952f4902cc3669de455

//        String dd = WalletUtility.pubkeyHashToAddress("d7cce761c3abe12d4650a952f4902cc3669de455");
//        System.out.println(dd);
//        //Address:1Lg3kDGu7uGPCH8C38sTJNAAYQCWBsuNCq

//        String ee = WalletUtility.keystoreToAddress("{\"address\":\"1Lg3kDGu7uGPCH8C38sTJNAAYQCWBsuNCq\",\"crypto\":{\"cipher\":\"aes-256-ctr\",\"cipherparams\":{\"iv\":\"d7448e53b9c73090403681e493e81613\"},\"ciphertext\":\"7312c6d0a224c706f72ed1d362278f523396697592a275425fb5a98f64e1cd6b\"},\"id\":\"7297c8a5-4985-4f76-8449-33f0f68d7e93\",\"kdf\":\"argon2id\",\"kdfparams\":{\"memoryCost\":20480,\"parallelism\":2,\"salt\":\"dc2f85d4bf6e20984d5099fc52a02c4559e7640c479fd5cea470d6e3422afcc9\",\"timeCost\":4},\"mac\":\"24cb2dd9625f6d1c52c9d7a3b50d263376267515f3854e802098f6d4c573d1a0\",\"version\":\"1\"}","1111111111");
//        System.out.println(ee);
//        //Address:1Lg3kDGu7uGPCH8C38sTJNAAYQCWBsuNCq

//        String ff = WalletUtility.keystoreToPubkeyHash("{\"address\":\"1Lg3kDGu7uGPCH8C38sTJNAAYQCWBsuNCq\",\"crypto\":{\"cipher\":\"aes-256-ctr\",\"cipherparams\":{\"iv\":\"d7448e53b9c73090403681e493e81613\"},\"ciphertext\":\"7312c6d0a224c706f72ed1d362278f523396697592a275425fb5a98f64e1cd6b\"},\"id\":\"7297c8a5-4985-4f76-8449-33f0f68d7e93\",\"kdf\":\"argon2id\",\"kdfparams\":{\"memoryCost\":20480,\"parallelism\":2,\"salt\":\"dc2f85d4bf6e20984d5099fc52a02c4559e7640c479fd5cea470d6e3422afcc9\",\"timeCost\":4},\"mac\":\"24cb2dd9625f6d1c52c9d7a3b50d263376267515f3854e802098f6d4c573d1a0\",\"version\":\"1\"}","1111111111");
//        System.out.println(ff);
//        //PubkeyHash:d7cce761c3abe12d4650a952f4902cc3669de455

//        String gg = WalletUtility.obtainPrikey("{\"address\":\"1Lg3kDGu7uGPCH8C38sTJNAAYQCWBsuNCq\",\"crypto\":{\"cipher\":\"aes-256-ctr\",\"cipherparams\":{\"iv\":\"d7448e53b9c73090403681e493e81613\"},\"ciphertext\":\"7312c6d0a224c706f72ed1d362278f523396697592a275425fb5a98f64e1cd6b\"},\"id\":\"7297c8a5-4985-4f76-8449-33f0f68d7e93\",\"kdf\":\"argon2id\",\"kdfparams\":{\"memoryCost\":20480,\"parallelism\":2,\"salt\":\"dc2f85d4bf6e20984d5099fc52a02c4559e7640c479fd5cea470d6e3422afcc9\",\"timeCost\":4},\"mac\":\"24cb2dd9625f6d1c52c9d7a3b50d263376267515f3854e802098f6d4c573d1a0\",\"version\":\"1\"}","1111111111");
//        System.out.println(gg);
//        //Prikey:e4e4f16175329e36560a3ae2615e32b3eb6dc9d0301a26910081d2f67fb3b5a2

//        String hh = WalletUtility.keystoreToPubkey("{\"address\":\"1Lg3kDGu7uGPCH8C38sTJNAAYQCWBsuNCq\",\"crypto\":{\"cipher\":\"aes-256-ctr\",\"cipherparams\":{\"iv\":\"d7448e53b9c73090403681e493e81613\"},\"ciphertext\":\"7312c6d0a224c706f72ed1d362278f523396697592a275425fb5a98f64e1cd6b\"},\"id\":\"7297c8a5-4985-4f76-8449-33f0f68d7e93\",\"kdf\":\"argon2id\",\"kdfparams\":{\"memoryCost\":20480,\"parallelism\":2,\"salt\":\"dc2f85d4bf6e20984d5099fc52a02c4559e7640c479fd5cea470d6e3422afcc9\",\"timeCost\":4},\"mac\":\"24cb2dd9625f6d1c52c9d7a3b50d263376267515f3854e802098f6d4c573d1a0\",\"version\":\"1\"}","1111111111");
//        System.out.println(hh);
//        //Pubkey:13be75229850374c692536c36d05dcd10a10206811996a3fb4d605acfefa5c4b

//        JSON ii = WalletUtility.modifyPassword("{\"address\":\"1Lg3kDGu7uGPCH8C38sTJNAAYQCWBsuNCq\",\"crypto\":{\"cipher\":\"aes-256-ctr\",\"cipherparams\":{\"iv\":\"d7448e53b9c73090403681e493e81613\"},\"ciphertext\":\"7312c6d0a224c706f72ed1d362278f523396697592a275425fb5a98f64e1cd6b\"},\"id\":\"7297c8a5-4985-4f76-8449-33f0f68d7e93\",\"kdf\":\"argon2id\",\"kdfparams\":{\"memoryCost\":20480,\"parallelism\":2,\"salt\":\"dc2f85d4bf6e20984d5099fc52a02c4559e7640c479fd5cea470d6e3422afcc9\",\"timeCost\":4},\"mac\":\"24cb2dd9625f6d1c52c9d7a3b50d263376267515f3854e802098f6d4c573d1a0\",\"version\":\"1\"}","1111111111","1111111111");
//        System.out.println(ii);
        //Keystore:{"address":"1Lg3kDGu7uGPCH8C38sTJNAAYQCWBsuNCq","kdfparams":{"salt":"76905d0393d7122d1607139308b77878b7cbf2fe6c028dbef457adcd640bafca","memoryCost":20480,"parallelism":2,"timeCost":4},"id":"c620c486-0d24-4cac-90c1-34b9b624dd17","kdf":"argon2id","version":"1","mac":"77f7d4eb643a7496cc766800458f0be715befab5edbd78a276287c761505a8a8","crypto":{"cipher":"aes-256-ctr","ciphertext":"0e3cc98ab413df8f275eb4de6f2c2d6c56e7c00baa165f7c8dfdad211b7eb1cb","cipherparams":{"iv":"d85fdb3f0c29216f60d96c6a092db31d"}}}




    }

}
