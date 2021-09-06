import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateDifferentExample {
	
	public static long getDaysBetweenMin(Date d1, Date d2){
		return TimeUnit.MILLISECONDS.toMinutes(d2.getTime() - d1.getTime());
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dateStart = "01/15/2012 10:29:48";
		String dateStop = "01/15/2012 10:31:48";

		//HH converts hour in 24 hours format (0-23), day calculation
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

		Date d1 = null;
		Date d2 = null;

		try {
			d1 = format.parse(dateStart);
			d2 = format.parse(dateStop);

			//in milliseconds
			long diff = d2.getTime() - d1.getTime();

			long diffSeconds = diff / 1000 % 60;
			long diffMinutes = diff /  (60*1000);
			long diffHours = diff / (60 * 60 * 1000) % 24;
			long diffDays = diff / (24 * 60 * 60 * 1000);

			System.out.print(diffDays + " days, ");
			System.out.print(diffHours + " hours, ");
			System.out.print(diffMinutes + " minutes, ");
			System.out.print(diffSeconds + " seconds.");
			System.out.println();
			
			
			long test =TimeUnit.MILLISECONDS.toMinutes(d2.getTime() - d1.getTime());
			System.out.println("test123 :::"+test);

			System.out.println(getDaysBetweenMin(d1,d2));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	}


