//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.26 at 02:43:10 PM PDT 
//


package ca.bc.gov.courts.ccd_source_getdocument_ws.getdocument;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocumentRequest" type="{http://courts.gov.bc.ca/CCD.Source.GetDocument.ws:GetDocument}Document"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "documentRequest"
})
@XmlRootElement(name = "getDocument")
public class GetDocument {

    @XmlElement(name = "DocumentRequest", required = true)
    protected Document documentRequest;

    /**
     * Gets the value of the documentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Document }
     *     
     */
    public Document getDocumentRequest() {
        return documentRequest;
    }

    /**
     * Sets the value of the documentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Document }
     *     
     */
    public void setDocumentRequest(Document value) {
        this.documentRequest = value;
    }

}
