package com.bc;

import org.bouncycastle.util.encoders.Hex;
import org.junit.Before;
import org.junit.Test;
import sun.misc.HexDumpEncoder;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.*;

import static org.junit.Assert.*;

public class AESCryptoTest {

    @Before
    public void setup(){
        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
    }

    @Test
    public void aes256CBC_test() throws NoSuchPaddingException, NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
        Key key;
        Cipher cipher;
        byte[] kek1 = Hex.decode("603deb1015ca71be2b73aef0857d77811f352c073b6108d72d9810a30914dff4");
        key = new SecretKeySpec(kek1, "AES");

        cipher = Cipher.getInstance("AES/CBC/PKCS7Padding", "BC");
//        cipher = Cipher.getInstance("AES/CBC/NoPadding", "BC");

        cipher.init(Cipher.ENCRYPT_MODE, key, new IvParameterSpec(Hex.decode("000102030405060708090A0B0C0D0E0F")));
//        byte[] doFinal = cipher.doFinal(Hex.decode("6bc1bee22e409f96e93d7e117393172a11"));
        byte[] doFinal = cipher.doFinal("test123!@#한글".getBytes(StandardCharsets.UTF_8));

        System.out.println(doFinal.length);
        System.out.println(Hex.toHexString(doFinal));

        Cipher cipher2;
        cipher2 = Cipher.getInstance("AES/CBC/PKCS7Padding", "BC");
        cipher2.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(Hex.decode("000102030405060708090A0B0C0D0E0F")));
        System.out.println(new String(cipher2.doFinal(doFinal), "UTF-8"));
    }

    @Test
    public void aes128CBC_test() throws NoSuchPaddingException, NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
        Key key;
        Cipher cipher;
        byte[] kek1 = Hex.decode("603deb1015ca71be2b73aef0857d7781");
        key = new SecretKeySpec(kek1, "AES");

        cipher = Cipher.getInstance("AES/CBC/PKCS7Padding", "BC");
//        cipher = Cipher.getInstance("AES/CBC/NoPadding", "BC");

        cipher.init(Cipher.ENCRYPT_MODE, key, new IvParameterSpec(Hex.decode("000102030405060708090A0B0C0D0E0F")));
//        byte[] doFinal = cipher.doFinal(Hex.decode("6bc1bee22e409f96e93d7e117393172a11"));
        byte[] doFinal = cipher.doFinal("test123!@#한글".getBytes(StandardCharsets.UTF_8));

        System.out.println(doFinal.length);
        System.out.println(Hex.toHexString(doFinal));

        Cipher cipher2;
        cipher2 = Cipher.getInstance("AES/CBC/PKCS7Padding", "BC");
        cipher2.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(Hex.decode("000102030405060708090A0B0C0D0E0F")));
        System.out.println(new String(cipher2.doFinal(doFinal), "UTF-8"));
    }

}