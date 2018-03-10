package interview_questions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDataType 
{
	public static Date toDate(String date, String pattern) throws ParseException 
	{
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
        return sdf.parse(date);
	}

}
