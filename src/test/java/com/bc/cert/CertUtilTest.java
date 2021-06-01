package com.bc.cert;

import org.apache.commons.io.FileUtils;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.x509.*;
import org.junit.Before;
import org.junit.Test;

import javax.naming.NamingException;
import javax.security.cert.CertificateException;
import javax.security.cert.X509Certificate;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.Security;
import java.security.cert.CRLException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.util.Set;

public class CertUtilTest {
    X509Certificate cert;
    Certificate certificate;

    @Before
    public void setup() throws IOException, CertificateException {
        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());


        File file = new File("/Users/dolove9/workspace/2021/study/Programers/data/cert/pass_cert.der");
        byte[] cert_bytes = FileUtils.readFileToByteArray(file);
        certificate = Certificate.getInstance(cert_bytes);
        cert = X509Certificate.getInstance(cert_bytes);
    }

    @Test
    public void certInfo_getSubject() throws IOException {
        System.out.println(cert.getSubjectDN().getName());
        System.out.println(CertUtil.reverseX500Name(certificate.getSubject()));
    }

    @Test
    public void get_crl_test() throws IOException, NamingException, java.security.cert.CertificateException, CRLException {
        Extension extension = certificate.getTBSCertificate().getExtensions().getExtension(Extension.cRLDistributionPoints);
        CRLDistPoint crldp = CRLDistPoint.getInstance(extension.getParsedValue());
        DistributionPoint[] distributionPoints = crldp.getDistributionPoints();
        DistributionPoint kicaCrl = distributionPoints[0];
        DistributionPointName distributionPoint = kicaCrl.getDistributionPoint();
        GeneralName[] genNames = GeneralNames.getInstance(distributionPoint.getName()).getNames();
        String url = DERIA5String.getInstance(genNames[0].getName()).getString();
        System.out.println(url);
//        System.out.println(url);
//        String url2 = "ldap://dir.signkorea.com:389/ou=dp3p94,ou=AccreditedCA,o=SignKorea,c=KR";
        X509CRL x509CRL = CertUtil.downloadCRLFromLDAP(url);


        System.out.println(url);

    }

    @Test
    public void createCrlObj_test() throws IOException, java.security.cert.CertificateException, CRLException {
//        File crlFile = new File("/Users/dolove9/workspace/2021/study/Programers/data/cert/DigiCert.crl");
//        File crlFile = new File("/Users/dolove9/workspace/2021/study/Programers/data/cert/signgate.crl");
//        File crlFile = new File("/Users/dolove9/workspace/2021/study/Programers/data/cert/NaverCrl1.crl");
        File crlFile = new File("/Users/dolove9/workspace/2021/study/Programers/data/cert/temp_yes.crl");
//        File crlFile = new File("/Users/dolove9/workspace/2021/study/Programers/data/cert/ou=dp3p31,ou=crl,ou=AccreditedCA,o=Korea Information Certificate Authority,c=KR.crl");
        byte[] bytes = FileUtils.readFileToByteArray(crlFile);

        InputStream inStream = new ByteArrayInputStream(bytes);
        CertificateFactory cf = CertificateFactory.getInstance("X.509");
        X509CRL crl = (X509CRL)cf.generateCRL(inStream);

        Set<? extends X509CRLEntry> revokedCertificates = crl.getRevokedCertificates();
        System.out.println();
    }




}