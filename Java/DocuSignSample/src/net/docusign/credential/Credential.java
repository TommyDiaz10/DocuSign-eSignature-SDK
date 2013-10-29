/**
 * @copyright Copyright (C) DocuSign, Inc.  All rights reserved.
 *
 * This source code is intended only as a supplement to DocuSign SDK
 * and/or on-line documentation.
 * 
 * This sample is designed to demonstrate DocuSign features and is not intended
 * for production use. Code and policy for a production application must be
 * developed to meet the specific data and security requirements of the
 * application.
 *
 * THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY
 * KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR FITNESS FOR A
 * PARTICULAR PURPOSE.
 */

package net.docusign.credential;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.3.2
 * 2011-03-04T13:09:33.007-08:00
 * Generated source version: 2.3.2
 * 
 */


@WebServiceClient(name = "Credential", 
                  wsdlLocation = "https://www.docusign.net/api/3.0/credential.asmx?wsdl",
                  targetNamespace = "http://www.docusign.net/API/Credential") 
public class Credential extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.docusign.net/API/Credential", "Credential");
    public final static QName CredentialSoap = new QName("http://www.docusign.net/API/Credential", "CredentialSoap");
    public final static QName CredentialSoap12 = new QName("http://www.docusign.net/API/Credential", "CredentialSoap12");
    static {
        URL url = null;
        try {
            url = new URL("https://www.docusign.net/api/3.0/credential.asmx?wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from https://www.docusign.net/api/3.0/credential.asmx?wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public Credential(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Credential(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Credential() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     * 
     * @return
     *     returns CredentialSoap
     */
    @WebEndpoint(name = "CredentialSoap")
    public CredentialSoap getCredentialSoap() {
        return super.getPort(CredentialSoap, CredentialSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CredentialSoap
     */
    @WebEndpoint(name = "CredentialSoap")
    public CredentialSoap getCredentialSoap(WebServiceFeature... features) {
        return super.getPort(CredentialSoap, CredentialSoap.class, features);
    }
    /**
     * 
     * @return
     *     returns CredentialSoap
     */
    @WebEndpoint(name = "CredentialSoap12")
    public CredentialSoap getCredentialSoap12() {
        return super.getPort(CredentialSoap12, CredentialSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CredentialSoap
     */
    @WebEndpoint(name = "CredentialSoap12")
    public CredentialSoap getCredentialSoap12(WebServiceFeature... features) {
        return super.getPort(CredentialSoap12, CredentialSoap.class, features);
    }

}
