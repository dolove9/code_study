package com.bc;

import org.bouncycastle.util.encoders.Hex;
import org.junit.Before;
import org.junit.Test;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.*;

public class SEEDCryptoTest {
    @Before
    public void setup(){
        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
    }

    @Test
    public void seedTest_1() throws NoSuchPaddingException, NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
        Key key;
        Cipher cipher;
        byte[] kek1 = Hex.decode("603deb1015ca71be2b73aef0857d7781");
        key = new SecretKeySpec(kek1, "SEED");

        cipher = Cipher.getInstance("SEED/CBC/PKCS5Padding", "BC");
//        cipher = Cipher.getInstance("AES/CBC/NoPadding", "BC");

        cipher.init(Cipher.ENCRYPT_MODE, key, new IvParameterSpec(Hex.decode("000102030405060708090A0B0C0D0E0F")));
//        byte[] doFinal = cipher.doFinal(Hex.decode("6bc1bee22e409f96e93d7e117393172a11"));
        byte[] doFinal = cipher.doFinal("test123!@#한글".getBytes(StandardCharsets.UTF_8));

        System.out.println(doFinal.length);
        System.out.println(Hex.toHexString(doFinal));

        Cipher cipher2;
        cipher2 = Cipher.getInstance("SEED/CBC/PKCS5Padding", "BC");
        cipher2.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(Hex.decode("000102030405060708090A0B0C0D0E0F")));
        System.out.println(new String(cipher2.doFinal(doFinal), "UTF-8"));
    }

    @Test
    public void seedTest_2() throws NoSuchPaddingException, NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
        Key key;
        Cipher cipher;
        byte[] kek1 = Hex.decode("00000000000000000000000000000000");
        key = new SecretKeySpec(kek1, "SEED");

        cipher = Cipher.getInstance("SEED/CBC/PKCS5Padding", "BC");
//        cipher = Cipher.getInstance("AES/CBC/NoPadding", "BC");

        cipher.init(Cipher.ENCRYPT_MODE, key, new IvParameterSpec(Hex.decode("00000000000000000000000000000000")));
        byte[] doFinal = cipher.doFinal(Hex.decode("000102030405060708090a0b0c0d0e0f"));
//        byte[] doFinal = cipher.doFinal("test123!@#한글".getBytes(StandardCharsets.UTF_8));

        System.out.println(doFinal.length);
        System.out.println(Hex.toHexString(doFinal));

        Cipher cipher2;
        cipher2 = Cipher.getInstance("SEED/CBC/PKCS5Padding", "BC");
        cipher2.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(Hex.decode("00000000000000000000000000000000")));
        System.out.println(new String(cipher2.doFinal(doFinal), "UTF-8"));
    }
}
