package continuum.cucumber.pages;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.jcraft.jsch.Channel;

public class Registration_Installation {

	/* Created by - Shivendra Singh
	 * Method to read data from remote machine
	 */
		public static String readChannelOutput(Channel channel) {

			byte[] buffer = new byte[1024];
			String line = "";

			try {
				InputStream in = channel.getInputStream();
				BufferedReader reader = new BufferedReader(new InputStreamReader(in));
				while (line!= null) {
					line=reader.readLine();
					if(line.endsWith(",")) break;				
				}
				
			} catch (Exception e) {
				System.out.println("Error while reading channel output: " + e);
			}

			
			return line;
		}

}
