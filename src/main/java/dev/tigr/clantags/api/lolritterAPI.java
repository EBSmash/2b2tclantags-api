package dev.tigr.clantags.api;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import net.minecraftforge.fml.common.FMLLog;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/***
 * @author EBSmc built off of MojangAPI
 * @since 12/30/19
 */
public class lolritterAPI {
  public static String geStats(){
		try {
			URL url = new URL("https://api.2b2t.dev/stats?username=" + name);
			JSONObject jsonObject = new JSONObject(new JSONTokener(new InputStreamReader(url.openStream())));

			String stats = jsonObject.get("").toString();
			return stats;
		} catch(IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
