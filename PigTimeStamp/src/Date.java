import java.io.IOException;
import java.util.*;


import org.apache.pig.EvalFunc;
import org.apache.pig.data.DataBag;
import org.apache.pig.data.Tuple;


public class Date extends EvalFunc<Integer> {
	@Override
	public Integer exec(Tuple input) throws IOException {
				
		Object values = input.get(0);
		
		String timestamp = (String)values;//2013-03-17 00:43:54
		String date = timestamp.split(" ")[0];
		String time = timestamp.split(" ")[1];
		//String ts = date.split("-")[0]+date.split("-")[1]+date.split("-")[2]
		//		+ time.split(":")[0] + time.split(":")[1] + time.split(":")[2];
		String ts = date.split("-")[0]+date.split("-")[1]+date.split("-")[2];
		int Date = Integer.parseInt(ts);//20130317004354
		return Date;
		
		
	}
}
