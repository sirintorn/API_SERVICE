package ese.util.helper;

import ese.util.config.Config;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DevHelper extends Config{
    public static Date ConvertStringToDate(String oDate, String format) throws ParseException {
        Locale locale = Locale.ENGLISH;
        SimpleDateFormat sdf = new SimpleDateFormat(format, locale);

        Date tmp_date = sdf.parse(oDate);

        Calendar tmp_calendar = new GregorianCalendar();
        tmp_calendar.setTime(tmp_date);

        if (tmp_calendar.get(Calendar.YEAR) < 2000) {
            tmp_calendar.add(Calendar.YEAR, 543);
        }

        return tmp_calendar.getTime();
    }
    public static String DateFormat(String oDate, String input_format, String output_format) {
        if (oDate == null || oDate.equals("")) {
            return "";
        } else {
            Locale locale = Locale.ENGLISH;
            SimpleDateFormat date_format = new SimpleDateFormat(output_format, locale);

            try {
                Calendar calendar = new GregorianCalendar();
                calendar.setTime(ConvertStringToDate(oDate, input_format));

                String result = date_format.format(calendar.getTime());
                return result;
            } catch (Exception e) {
                return oDate;
            }
        }
    }
}
