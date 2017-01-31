package eu.mikrosimage.xdmat.ebucore.adapters;

import java.util.Calendar;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * XML {@link Calendar} adpter. 
 * 
 * @author Guillaume Maucomble <gma@mikrosimage.eu>
 * @version 1.6.2
 * @since 1.6.2
 */
public class XmlCalendarAdapter extends XmlAdapter<String, Calendar>
{


    public Calendar unmarshal(String value) {
        return (javax.xml.bind.DatatypeConverter.parseDateTime(value));
    }

    public String marshal(Calendar value) {
        if (value == null) {
            return null;
        }
        return (javax.xml.bind.DatatypeConverter.printDateTime(value));
    }

}
