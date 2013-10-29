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
package net.docusign.api_3_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FontColor.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FontColor">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Black"/>
 *     &lt;enumeration value="BrightBlue"/>
 *     &lt;enumeration value="BrightRed"/>
 *     &lt;enumeration value="DarkRed"/>
 *     &lt;enumeration value="DarkGreen"/>
 *     &lt;enumeration value="Gold"/>
 *     &lt;enumeration value="Green"/>
 *     &lt;enumeration value="NavyBlue"/>
 *     &lt;enumeration value="Purple"/>
 *     &lt;enumeration value="White"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FontColor")
@XmlEnum
public enum FontColor {

    @XmlEnumValue("Black")
    BLACK("Black"),
    @XmlEnumValue("BrightBlue")
    BRIGHT_BLUE("BrightBlue"),
    @XmlEnumValue("BrightRed")
    BRIGHT_RED("BrightRed"),
    @XmlEnumValue("DarkRed")
    DARK_RED("DarkRed"),
    @XmlEnumValue("DarkGreen")
    DARK_GREEN("DarkGreen"),
    @XmlEnumValue("Gold")
    GOLD("Gold"),
    @XmlEnumValue("Green")
    GREEN("Green"),
    @XmlEnumValue("NavyBlue")
    NAVY_BLUE("NavyBlue"),
    @XmlEnumValue("Purple")
    PURPLE("Purple"),
    @XmlEnumValue("White")
    WHITE("White");
    private final String value;

    FontColor(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FontColor fromValue(String v) {
        for (FontColor c: FontColor.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
