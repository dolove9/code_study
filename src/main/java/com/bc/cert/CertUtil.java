package com.bc.cert;

import org.apache.commons.io.FileUtils;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import java.io.File;
import java.security.cert.CertificateException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CRLException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509CRL;
import java.util.*;

public class CertUtil {
    public void certInfo(byte[] certByte){

    }
    public static X500Name reverseX500Name(X500Name x500Name) {
        List<RDN> rdns = Arrays.asList(x500Name.getRDNs());
        Collections.reverse(rdns);
        return new X500Name(rdns.toArray(new RDN[rdns.size()]));
    }

    /*
    public static X509CRL downloadCRLFromLDAP(String ldapURL) throws NamingException, CRLException, CertificateException {
        Map<String, String> env = new Hashtable<String, String>();
        env.put(Context.INITIAL_CONTEXT_FACTORY,
                "com.sun.jndi.ldap.LdapCtxFactory");
        env.put(Context.PROVIDER_URL, ldapURL);

        DirContext ctx = new InitialDirContext((Hashtable)env);
        Attributes avals = ctx.getAttributes("");
        Attribute aval = avals.get("certificateRevocationList;binary");
        byte[] val = (byte[]) aval.get();
        if ((val == null) || (val.length == 0)) {
            throw new CertificateException(
                    "Can not download CRL from: " + ldapURL);
        } else {
            InputStream inStream = new ByteArrayInputStream(val);
            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            return (X509CRL) cf.generateCRL(inStream);
        }
    }
     */

    /**
     * Downloads a CRL from given LDAP url, e.g.
     * ldap://ldap.infonotary.com/dc=identity-ca,dc=infonotary,dc=com
     */
    public static X509CRL downloadCRLFromLDAP(String ldapURL) throws NamingException, CRLException, CertificateException, IOException {
        Hashtable<String , String> env = new Hashtable<>();
        env.put(Context.INITIAL_CONTEXT_FACTORY,
                "com.sun.jndi.ldap.LdapCtxFactory");
        env.put(Context.PROVIDER_URL, ldapURL);

        DirContext ctx = new InitialDirContext(env);
        Attributes avals = ctx.getAttributes(ldapURL);
        Attribute aval = avals.get("certificateRevocationList;binary");
        byte[] val = (byte[])aval.get();
        File file = new File("/Users/dolove9/workspace/2021/study/Programers/data/cert/signgate.crl");
        FileUtils.writeByteArrayToFile(file, val);
        if ((val == null) || (val.length == 0)) {
            throw new CRLException(
                    "Can not download CRL from: " + ldapURL);
        } else {
            InputStream inStream = new ByteArrayInputStream(val);
            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            X509CRL crl = (X509CRL)cf.generateCRL(inStream);
            return crl;
        }
    }

}
