import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Write {

    public void writerConfiguration() {
        JSONParser parser = new JSONParser();
        ServerConfiguration serverConfiguration = new ServerConfiguration();

        try {
            JSONObject jsonObject = (JSONObject) parser.parse(new FileReader("config.json"));
            serverConfiguration.setServer_name((String) jsonObject.get("server_name"));
            serverConfiguration.setServer_ip((String) jsonObject.get("server_ip"));
            serverConfiguration.setServer_password((String) jsonObject.get("server_password"));
            System.out.println(serverConfiguration.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
