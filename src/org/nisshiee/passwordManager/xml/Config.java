//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.03 at 01:21:51 �ߑO JST 
//


package org.nisshiee.passwordManager.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Config complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Config">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wordSetting" type="{http://www.nisshiee.org/password_manager/xml/3.2.xsd}WordSetting" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Config", propOrder = {
    "wordSetting"
})
public class Config {

    protected WordSetting wordSetting;

    /**
     * Gets the value of the wordSetting property.
     * 
     * @return
     *     possible object is
     *     {@link WordSetting }
     *     
     */
    public WordSetting getWordSetting() {
        return wordSetting;
    }

    /**
     * Sets the value of the wordSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link WordSetting }
     *     
     */
    public void setWordSetting(WordSetting value) {
        this.wordSetting = value;
    }

}
