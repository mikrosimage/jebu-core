package eu.mikrosimage.xdmat.ebucore.adapters;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * XML {@link Date} adapter.
 * 
 * @author Guillaume Maucomble <gma@mikrosimage.eu>
 * @version 1.6.2
 * @since 1.6.2
 */
public class XmlDateAdapter extends XmlAdapter<String, Date>
{

	private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public String marshal(Date v) throws Exception {
    	if(v==null) {
    		return "";
    	}
        synchronized (dateFormat) {
            return dateFormat.format(v);
        }
    }

    @Override
    public Date unmarshal(String v) throws Exception {
        synchronized (dateFormat) {
            return dateFormat.parse(v);
        }
    }

}
